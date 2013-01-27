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
    private static final ReentrantLock waitLock = new ReentrantLock();
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

    /**
     * Funkcja pobiera pierwszą liczbę z kolejki.
     */
    public void pop() {
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

    /**
     * Funkcja usypia wątek na pewien okres czasu.
     */
    public void sleep() {
        if (waitLock.tryLock()) {
            waitFor("czekanie", resolution);
        }
        if (waitLock.isHeldByCurrentThread()) {
            waitLock.unlock();
        }
    }

    /**
     * Funkcja usypiająca wątek i wyświetlająca wiadomość
     *
     * @param msg - wiadomość do wyświetlenia
     * @param res - skala czasu podana w ms
     */
    private void waitFor(String msg, int res) {
        int waitTime = 1 + r.nextInt(times + times) * res;

        if (msg != "" && Main.DEBUS_DETAILS) {
            System.err.println(name + ": blokuje " + msg + " : " + waitTime + " ms");
        }

        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(Osoba.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (msg != "" && Main.DEBUS_DETAILS) {
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
