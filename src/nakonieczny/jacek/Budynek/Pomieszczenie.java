/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.Budynek;

/**
 *
 * @author Jacek
 */
public abstract class Pomieszczenie {
    private int nr;
    private double pow;
    private int ileOsob;
    private double mNaOs;

    public double getmNaOs() {
        return mNaOs;
    }

    public void setmNaOs(double mNaOs) {
        this.mNaOs = mNaOs;
    }

    public Pomieszczenie(int nr, double pow, int ileOsob) {
        this.nr = nr;
        this.pow = pow;
        this.ileOsob = ileOsob;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public int getIleOsob() {
        return ileOsob;
    }

    public void setIleOsob(int ileOsob) {
        this.ileOsob = ileOsob;
    }
    
    public boolean SprawdzPowierzchnie()
    {
        return (double) pow / (double) ileOsob < mNaOs;
    }
    
    public boolean SprawdzPowierzchnie(int osoby)
    {
        return (double) pow / (double) osoby < mNaOs;
    }
}
