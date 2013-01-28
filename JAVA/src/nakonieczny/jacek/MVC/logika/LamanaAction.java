/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.MVC.logika;

import nakonieczny.jacek.MVC.dane.Lamana;
import nakonieczny.jacek.MVC.dane.Punkt;

/**
 *
 * @author student
 */
//w tej klasie wszystkie operacje beda wykonywane
public class LamanaAction {

    private Lamana lamana;

    public LamanaAction() {
    }

    public void TworzLamana() {
        this.lamana = new Lamana();
    }

    public Lamana getLamana() {
        return lamana;
    }

    public double getDlugosc() {
        return lamana.getDlugosc();
    }

    public void losujLamana(int ilosc, int xmax, int ymax) {
        TworzLamana();
        Punkt p;
        for (int i = 0; i < ilosc; i++) {
            p = new Punkt(0, 0);
            p.losuj(xmax, ymax);
            this.lamana.dodajPunkt(p);
        }
    }
}
