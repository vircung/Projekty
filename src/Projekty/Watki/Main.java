/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Projekty.Watki;

/**
 *
 * @author Jacek
 */
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello");
        new Thread(new Osoba("Jacek", 7)).start();
    }
}
