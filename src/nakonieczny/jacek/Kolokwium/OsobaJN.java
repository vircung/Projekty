/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.Kolokwium;

/**
 *
 * @author Jacek
 */
public abstract class OsobaJN {

    private String imieJN;
    private String nazwiskoJN;
    private String emailJN;

    public void setEmailJN(String email) {
        this.emailJN = email;
    }

    public String getImieJN() {
        return imieJN;
    }

    public void setImieJN(String imie) {
        this.imieJN = imie;
    }

    public String getNazwiskoJN() {
        return nazwiskoJN;
    }

    public void setNazwiskoJN(String nazwisko) {
        this.nazwiskoJN = nazwisko;
    }

    public String getEmailJN() {
        return emailJN;
    }

    @Override
    public String toString() {
        return nazwiskoJN + ' ' + imieJN + ' ' + emailJN;
    }
}
