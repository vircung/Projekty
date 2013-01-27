/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekty.Watki;

import java.util.LinkedList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.print.resources.serviceui;

/**
 *
 * @author Jacek
 */
public class Osoba implements Runnable {

    private String name;
    private int times;
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

    public synchronized void push() {
        int newNumber = NewNumber();
        System.err.println("Nowa liczba " + newNumber);
        numbers.add(newNumber);
    }

    public synchronized void pop() {
        System.err.println(name + " znalazł liczbę " + numbers.pop());
    }

    public void sleep() throws InterruptedException {
        int sleepTime = (r.nextInt(times) + 1) * 100;
        System.err.println(name + " ide spac na " + sleepTime + " ms");
        Thread.sleep(sleepTime);
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
