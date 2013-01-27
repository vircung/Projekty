/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekty.Watki;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Osoba implements Runnable {

    private static final ReentrantLock pushLock = new ReentrantLock();
    private static final ReentrantLock popLock = new ReentrantLock();
    private static final ReentrantLock waitLock = new ReentrantLock();
    private String name;
    private int times;
    private int left;
    private boolean got, gave;
    private int resolution = 100;
    private static LinkedList<Integer> numbers = new LinkedList<>();
    private static Random r = new Random(System.currentTimeMillis());
    private static int number = 0;

    Osoba(String name, int ile) {
        this.name = name;
        this.left = ile;
        this.times = ile;
        got = false;
        gave = false;
    }

    public int NewNumber() {
        return number++;
    }

    public void push() throws InterruptedException {
        if (got) {
            return;
        }
        if (pushLock.tryLock()) {

            waitFor("zapis", resolution);

            int newNumber = NewNumber();
            got = true;
            if (Main.DEBUG) {
                System.err.println(name + ": znalazł nowa liczbe " + newNumber);
            }
            numbers.add(newNumber);
        }

        if (pushLock.isHeldByCurrentThread()) {
            pushLock.unlock();
        }
    }

    public void pop() throws InterruptedException {
        if (gave) {
            return;
        }
        if (popLock.tryLock()) {
            if (numbers.size() > 0) {
                gave = true;
                System.err.println(name + ": pobrał liczbę " + numbers.pop());
            } else {
                if (Main.DEBUG_NO_NUMBERS) {
                    System.err.println(name + ": brak liczb do pobrania !!!!!!!!");
                }
            }

        }

        if (popLock.isHeldByCurrentThread()) {
            popLock.unlock();
        }
    }

    public void sleep() throws InterruptedException {
        if (waitLock.tryLock()) {
            waitFor("czekanie", resolution);
        }
        if (waitLock.isHeldByCurrentThread()) {
            waitLock.unlock();
        }
    }

    public void waitFor(String msg, int res) throws InterruptedException {
        int waitTime = 1 + r.nextInt(times + times) * res;

        if (msg != "" && Main.DEBUS_DETAILS) {
            System.err.println(name + ": blokuje " + msg + " : " + waitTime + " ms");
        }

        Thread.sleep(waitTime);

        if (msg != "" && Main.DEBUS_DETAILS) {
            System.err.println(name + ": zwalniam " + msg);
        }
    }

    public void Change() {
        try {
            push();
            sleep();
            pop();
            if (got && gave) {
                left--;
                got = gave = false;
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Osoba.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        System.err.println("-------> Watek " + name + " zaczyna prace");
        while (left > 0) {
            Change();
        }

        System.err.println("<------- Watek " + name + " konczy prace");
    }
}
