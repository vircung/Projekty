package nakonieczny.jacek.parking;

/**
 * Klasa symuluj�ca prac� prostego parkingu
 * 
 * @author Jacek
 *
 */
public class Parking {
	public String adres;
    public Samochod[] samochody;
    public int pojemnosc;
    private int idx = 0;

    /**
     * Konstruktor
     * 
     * @param adres - adres parkingu
     * @param pojemnosc - maksymalna ilo�� samochod�w 
     */
    public Parking(String adres, int pojemnosc) {
        this.adres = adres;
        this.samochody = new Samochod[pojemnosc];
        this.pojemnosc = pojemnosc;
    }

    /**
     * Metoda dodaj�ca samoch�d do parkingu
     * 
     * @param samochod - samoch�d, kt�ry ma zosta� dodany
     */
    public void DodajSamochod(Samochod samochod) {
        if (idx < pojemnosc) {
            samochody[idx++] = samochod;
        } else {
            System.out.println("Parking pelny");
        }
    }

    /**
     * Metoda usuwaj�ca samoch�d z parkingu
     */
    public void UsunSamochod() {
        if (idx > 0) {
            idx--;
        } else {
            System.out.println("Parking pusty");
        }
    }

    /**
     * Metoda wy�wietlaj�ca adres parkingu oraz list� samochod�w
     */
    public void Wyswietl() {
        System.out.println("Parking " + adres);
        for (int i = 0; i < idx; i++) {
            samochody[i].Wyswietl();
        }
    }
}
