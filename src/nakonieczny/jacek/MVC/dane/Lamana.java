/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.MVC.dane;

import java.util.ArrayList;

/**
 *
 * @author Jacek
 */
public class Lamana {

    private ArrayList<Punkt> punkty;

    public Lamana() {
        punkty = new ArrayList<>();
    }

    public void dodajPunkt(Punkt p) {
        punkty.add(p);
    }

    public int rozmiar() {
        return punkty.size();
    }

    public Punkt[] punkty() {
        return punkty.toArray(new Punkt[0]);
    }

    public double getDlugosc() {
        double len = 0.0;
        for (int i = 1; i < punkty.size(); i++) {
            len += punkty.get(i).odleglosc(punkty.get(i - 1));
        }
        return len;
    }
}
