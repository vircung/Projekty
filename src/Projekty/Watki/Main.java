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

    public static void main(String[] args) {
        System.out.println("Hello");
        new Thread(new Osoba("Jacek", 10)).start();
        new Thread(new Osoba("Grześ", 10)).start();
        new Thread(new Osoba("Krzyś", 10)).start();
        new Thread(new Osoba("Karol", 10)).start();
    }
}
