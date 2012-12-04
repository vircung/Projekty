/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.Kolokwium;

public class StudentJN extends OsobaJN {

    private float sredniaJN;

    public StudentJN(String imie, String nazwisko, float srednia) throws StudentWyjatekJN{
        setImieJN(imie);
        setNazwiskoJN(nazwisko);
        if (2.0 <= srednia && srednia <= 5.0) {
            setSredniaJN(srednia);
        } else {
            throw new StudentWyjatekJN("Niepoprawna średnia.");
        }
        setEmailJN(getEmailJN());
    }

    public float getSredniaJN() {
        return sredniaJN;
    }

    public void setSredniaJN(float srednia) {
        this.sredniaJN = srednia;
    }

    @Override
    public String getEmailJN() {
        return getImieJN().toLowerCase() + '.' + getNazwiskoJN().toLowerCase() + "@student.uczelnia.pl";
    }
}
