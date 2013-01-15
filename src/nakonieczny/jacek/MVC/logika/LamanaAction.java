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
    
    public LamanaAction()
    {
        
    }
    
    public void TworzLamana()
    {
        this.lamana=new Lamana();
    }
    public Lamana getLamana()
    {
        return lamana;
    }
    public double getDlugosc()
    {
        return lamana.getDlugosc();
    }
    public void losujLamana(int ilosc,int xmax,int ymax)
    {
        TworzLamana();
        Punkt p;
        for(int i=0;i<ilosc;i++)
        {
            p=new Punkt(0,0);
            p.losuj(xmax,ymax);
            this.lamana.dodajPunkt(p);
        }
    }
    
    public void bonus()
    {
        TworzLamana();
        this.lamana.dodajPunkt(new Punkt(80,300));
        this.lamana.dodajPunkt(new Punkt(60,280));
        this.lamana.dodajPunkt(new Punkt(80,260));
        this.lamana.dodajPunkt(new Punkt(100,260));
        this.lamana.dodajPunkt(new Punkt(120,280));
        this.lamana.dodajPunkt(new Punkt(120,100));
        this.lamana.dodajPunkt(new Punkt(100,80));
        this.lamana.dodajPunkt(new Punkt(140,60));
        this.lamana.dodajPunkt(new Punkt(180,80));
        this.lamana.dodajPunkt(new Punkt(160,100));
        this.lamana.dodajPunkt(new Punkt(160,280));
        this.lamana.dodajPunkt(new Punkt(180,260));
        this.lamana.dodajPunkt(new Punkt(200,260));
        this.lamana.dodajPunkt(new Punkt(220,280));
        this.lamana.dodajPunkt(new Punkt(200,300));
    
    }
    
}
