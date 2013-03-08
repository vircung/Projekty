/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.semestr1.Budynek;

public class Sala extends Pomieszczenie {

    public Sala(int nr, double pow, int ileOsob) {
        super(nr, pow, ileOsob);
        setmNaOs(2.5);

        if (ileOsob < 10) {
            throw new IllegalArgumentException("Sala mieści co najmniej 10 osób");
        }
        if (SprawdzPowierzchnie()) {
            throw new IllegalArgumentException("Powierzchnia na 1 osobę nie może być mniejsza niż 2.5 m2");
        }
    }
}
