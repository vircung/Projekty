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

    // Wyświetlać informacje o blokadach locków ??
    static boolean DEBUG_LOCKS = false;
    // Wyświetlać informacje o zmianach stanów locków ??
    static boolean DEBUG_LOCKS_DETAILS_LOCKED = false;
    static boolean DEBUG_LOCKS_DETAILS_LOCK = false;
    static boolean DEBUG_LOCKS_DETAILS_UNLOCK = false;
    // Wyświetlać informacje o braku liczb w kolejce ??
    static boolean DEBUG_NO_NUMBERS_IN_LIST = false;
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
