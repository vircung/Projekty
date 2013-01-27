/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekty.Watki;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Jacek
 */
public class Osoba implements Runnable{

    private String name;
    private int times;
    private static LinkedList<Integer> numbers = new LinkedList<>();
    private static Random r = new Random(System.currentTimeMillis());
    private static int id = 0;
    
    Osoba(String name, int ile)
    {
        this.name = name;
        this.times = ile;
    }
    
    public int GetId()
    {
        return id++;
    }
    
    public synchronized void push()
    {
        numbers.add(GetId());
    }
    
    public synchronized int pop()
    {
        return numbers.pop();
    }
    
    public void Change()
    {
        push();
        System.out.println(pop() + " Watek " + name);
    }
    
    @Override
    public void run() {
        System.out.println("Watek " + name + " zaczyna prace");
        for(int i = 0; i < times; i++)
        {
            Change();
        }
        System.out.println("Watek " + name + " konczy prace");
    }
    
}
