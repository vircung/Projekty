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

    static boolean DEBUG = true;
    static boolean DEBUS_DETAILS = false;
    static boolean DEBUG_NO_NUMBERS = false;
    /*
     * Problem typu producent-konsument.
     * 
     * Mamy do dyspozycji klasę która jest na przemian producentem i konsumentem.
     * Wszystkie obiekty klasy mają do dyspozycji kolejkę do której są odkładane i zdejmowane liczby.
     * Każdy obiekt podczas odkładania i zdejmowania z kolejki blokuje na chwilę tę funkcjonalność.
     */
    public static void main(String[] args) {
        System.out.println("Hello");
        new Thread(new Osoba("AAA", 5)).start();
        new Thread(new Osoba("BBB", 5)).start();
        new Thread(new Osoba("CCC", 5)).start();
        new Thread(new Osoba("DDD", 5)).start();
        new Thread(new Osoba("EEE", 5)).start();
        new Thread(new Osoba("FFF", 5)).start();
    }
}
