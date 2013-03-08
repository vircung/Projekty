package nakonieczny.jacek.semestr1.parking;

/**
 * Klasa s�u��ca do obs�ugi samochod�w osobowych
 *
 * @author Jacek
 *
 */
public class SamochodOsobowy extends Samochod {

    public SamochodOsobowy(String marka, String model, String kolor, String nrRejestracyjny, int rok, int kola) throws IllegalArgumentException {
        super(marka, model, kolor, nrRejestracyjny, rok, kola, TypSamochodu.Osobowy);
        if (kola != 4) {
            throw new IllegalArgumentException("Niepoprawna ilosc kol");
        }
    }

    public void setKola(int kola) throws IllegalArgumentException {
        if (kola == 4) {
            setKola(kola);
        } else {
            throw new IllegalArgumentException("Niepoprawna ilosc kol");
        }
    }

    public String toString() {
        return "Samochód osobowy \n"
                + super.toString();
    }

    public void Wyswietl() {
        System.out.println("Samochod osobowy " + getMarka() + " " + getModel() + " " + getKolor() + " " + getRok());
    }
}
