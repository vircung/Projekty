package nakonieczny.jacek.parking;

/**
 * Klasa s�u��ca do obs�ugi samochod�w ci�arowych
 *
 * @author Jacek
 *
 */
public class SamochodCiezarowy extends Samochod {

    private int wartoscLadunku;

    public SamochodCiezarowy(String marka, String model, String kolor, String nrRejestracyjny, int rok, int kola, int wartosc) throws IllegalArgumentException {
        super(marka, model, kolor, nrRejestracyjny, rok, kola, TypSamochodu.Ciezarowy);

        this.wartoscLadunku = wartosc;

        if (kola < 4 || kola % 2 != 0) {
            throw new IllegalArgumentException("Niepoprawna ilosc kol");
        }
    }

    public int getWartoscLadunku() {
        return wartoscLadunku;
    }

    public void setWartoscLadunku(int wartoscLadunku) {
        this.wartoscLadunku = wartoscLadunku;
    }

    public String toString() {
        return "Samochód ciężarowy \n"
                + super.toString()
                + "\tWartość: " + wartoscLadunku + "\n";
    }

    public void Wyswietl() {
        System.out.println("Samochod ciezarowy " + getMarka() + " " + getModel() + " " + getKolor() + " " + getRok() + " " + getWartoscLadunku());
    }
}
