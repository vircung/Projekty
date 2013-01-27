/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekty.Watki;

import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jacek
 */
public class Osoba implements Runnable {

    private String name;
    private int times;
    private int resolution = 100;
    private static LinkedList<Integer> numbers = new LinkedList<>();
    private static Random r = new Random(System.currentTimeMillis());
    private static int number = 0;

    Osoba(String name, int ile) {
        this.name = name;
        this.times = ile;
    }

    public int NewNumber() {
        return number++;
    }

    public synchronized void push() throws InterruptedException {
        waitFor("nowa liczba za", resolution);
        int newNumber = NewNumber();
        System.err.println(name + ": znalazł nowa liczbe " + newNumber);
        numbers.add(newNumber);
    }

    public synchronized void pop() throws InterruptedException {
        while (numbers.size() <= 0) {
            waitFor("czekam na liczbę przez", resolution / 10);
        }
        System.err.println(name + ": pobrał liczbę " + numbers.pop());
    }

    public void sleep() throws InterruptedException {
        waitFor("idę spać na", resolution * 10);
    }

    public void waitFor(String msg, int res) throws InterruptedException {
        int waitTime = 1 + r.nextInt(times + times) * res;
        System.err.println(name + ": " + msg + " " + waitTime + " ms");
        Thread.sleep(waitTime);
    }

    public void Change() {
        try {
            push();
            sleep();
            pop();
        } catch (InterruptedException ex) {
            Logger.getLogger(Osoba.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void run() {
        System.err.println("Watek " + name + " zaczyna prace");
        for (int i = 0; i < times; i++) {
            Change();
        }
        System.err.println("Watek " + name + " konczy prace");
    }
}
