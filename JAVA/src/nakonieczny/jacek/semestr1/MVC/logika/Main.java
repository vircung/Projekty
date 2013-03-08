/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.semestr1.MVC.logika;

import javax.swing.JFrame;
import nakonieczny.jacek.semestr1.MVC.dane.Punkt;
import nakonieczny.jacek.semestr1.MVC.widok.LamanaPanel;
import nakonieczny.jacek.semestr1.MVC.widok.MainFrame;

public class Main {

    private static MainFrame mf;
    private static LamanaPanel lp;

    public static void main(String[] args) {

        LamanaAction act = new LamanaAction();

        //Wyswietlamy formatke
        mf = new MainFrame();
        mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mf.setAct(act);
        mf.setVisible(true);

        Punkt p = new Punkt(2, 3);
        p.losuj(100, 100);
        System.out.println(p.getX() + " " + p.getY());
        
    }
}
