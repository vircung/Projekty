/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.semestr1.Budynek;

public class Pokoj extends Pomieszczenie {

    private String wlasciciel;

    public String getWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public Pokoj(int nr, double pow, int ileOsob, String wlasciciel) {
        super(nr, pow, ileOsob);
        this.wlasciciel = wlasciciel;
        setmNaOs(4.0);
        
        if (ileOsob > 4) {
            throw new IllegalArgumentException("W pokoju nie może mieszkać więcej niż 4 osoby");
        }
        if (SprawdzPowierzchnie()) {
            throw new IllegalArgumentException("Powierzchnia na 1 osobę nie może być mniejsza niż 4 m2");
        }
    }
}
