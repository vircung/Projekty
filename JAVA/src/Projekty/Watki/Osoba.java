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

    // Locki odpowiedzialne za blokowanie odpowiednich funkcji
    private static final ReentrantLock pushLock = new ReentrantLock();
    private static final ReentrantLock popLock = new ReentrantLock();
    private static final ReentrantLock sleepLock = new ReentrantLock();
    // Nazwa wątku
    private String name;
    // Licznik pamiętający początkową liczbę wywołań
    private int times;
    // Licznik zliczający pozostałą liczbę wywołań
    private int left;
    // Flagi odpowiedzialne za kontrolowanie ilości wywołań odpowiednich funkcji
    private boolean got, gave;
    // Domyślna skala czasu wykorzystywana do usypiania wątków, domyślnie 100
    private int resolution = 100;
    // Kolejnka liczb dostępna dla wszystkich obiektów klasy
    private static LinkedList<Integer> numbers = new LinkedList<>();
    // Zmienna losująca dostępna dla wszystkich obiektów klasy
    private static Random r = new Random(System.currentTimeMillis());
    // Ostatnia pobrana liczba całkowita
    private static int number = 0;

    Osoba(String name, int ile) {
        this.name = name;
        this.left = ile;
        this.times = ile;
        got = false;
        gave = false;
    }

    /**
     * Funkcja zwracająca kolejną liczbę całkowitą dla wszystkich instancji
     * klasy.
     *
     * @return nextInt
     */
    public int NewNumber() {
        return number++;
    }

    /**
     * Funkcja pobiera kolejną liczbę całkowitą oraz dodaje ją na koniec
     * kolejnki.
     */
    public void push() {
        if (got) {
            return;
        }
        if (pushLock.tryLock()) {

            if (Main.DEBUG_LOCKS_DETAILS_LOCK) {
                System.err.println(name + ": zamknałem pushLock");
            }
            waitFor("zapis", resolution / 2);

            int newNumber = NewNumber();
            got = true;
            System.err.println(name + ": liczba odłożona --->> " + newNumber);

            numbers.add(newNumber);
        } else {
            if (Main.DEBUG_LOCKS_DETAILS_LOCKED) {
                System.err.println(name + ": niedostępny pushLock");
            }
        }

        if (pushLock.isHeldByCurrentThread()) {
            if (Main.DEBUG_LOCKS_DETAILS_UNLOCK) {
                System.err.println(name + ": otworzyłem pushLock");
            }
            pushLock.unlock();
        }
    }

    /**
     * Funkcja pobiera pierwszą liczbę z kolejki.
     */
    public void pop() {
        if (gave) {
            return;
        }
        if (popLock.tryLock()) {
            if (Main.DEBUG_LOCKS_DETAILS_LOCK) {
                System.err.println(name + ": zamknałem popLock");
            }
            if (numbers.size() > 0) {
                gave = true;
                waitFor("odczyt", resolution * 2);
                System.err.println(name + ": liczba zdjęta   --->> " + numbers.pop());
            } else {
                if (Main.DEBUG_NO_NUMBERS_IN_LIST) {
                    System.err.println(name + ": brak liczb do pobrania !!!!!!!!");
                }
            }

        } else {

            if (Main.DEBUG_LOCKS_DETAILS_LOCKED) {
                System.err.println(name + ": niedostępny pushLock");
            }
        }

        if (popLock.isHeldByCurrentThread()) {
            if (Main.DEBUG_LOCKS_DETAILS_UNLOCK) {
                System.err.println(name + ": otworzyłem popLock");
            }
            popLock.unlock();
        }
    }

    /**
     * Funkcja usypia wątek na pewien okres czasu.
     */
    public void sleep() {
        if (sleepLock.tryLock()) {
            if (Main.DEBUG_LOCKS_DETAILS_LOCK) {
                System.err.println(name + ": zamknałem sleepLock");
            }
            waitFor("czekanie", resolution);
        } else {

            if (Main.DEBUG_LOCKS_DETAILS_LOCKED) {
                System.err.println(name + ": niedostępny pushLock");
            }
        }
        if (sleepLock.isHeldByCurrentThread()) {
            if (Main.DEBUG_LOCKS_DETAILS_UNLOCK) {
                System.err.println(name + ": otworzyłem sleepLock");
            }
            sleepLock.unlock();
        }
    }

    /**
     * Funkcja usypiająca wątek i wyświetlająca wiadomość
     *
     * @param msg - wiadomość do wyświetlenia
     * @param res - skala czasu podana w ms
     */
    private void waitFor(String msg, int res) {
        int waitTime = 1 + r.nextInt(times * res) + times * res;

        if (!"".equals(msg) && Main.DEBUG_LOCKS) {
            System.err.println(name + ": blokuje " + msg + " : " + waitTime + " ms");
        }

        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(Osoba.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!"".equals(msg) && Main.DEBUG_LOCKS) {
            System.err.println(name + ": zwalniam " + msg);
        }
    }

    /**
     * Logika działania klasy
     */
    public void Change() {
        // Odłóż liczbę całkowitą do kolejki
        push();
        // Domyślne uśpienie wątku
        sleep();
        // Wyświetl i usuń liczbę z początku kolejki
        pop();

        // Jeżeli pobrałeś i wyświetliłeś liczbę, wykonałeś jedną pętlę logiki
        if (got && gave) {
            // Zmniejsz liczbę pozostałuch obrótów pętli o 1
            left--;
            // Zeruj flagi
            got = gave = false;
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
