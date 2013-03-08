package nakonieczny.jacek.semestr1.parking;

/**
 * Klasa s�u��ca do obs�ugi samochodu.
 *
 * @author Jacek
 *
 */
public abstract class Samochod {

    private String marka;
    private String model;
    private String kolor;
    private String nrRejestracyjny;
    private int rok;
    private int kola;
    private TypSamochodu typ;

    /**
     *
     * @return Typ Samochodu
     */
    public TypSamochodu getTyp() {
        return typ;
    }

    /**
     *
     * @param Typ Samochodu
     */
    public void setTyp(TypSamochodu typ) {
        this.typ = typ;
    }

    /**
     *
     * @return Marka samochodu
     */
    public String getMarka() {
        return marka;
    }

    /**
     *
     * @return Model samochodu
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @return Kolor samochodu
     */
    public String getKolor() {
        return kolor;
    }

    /**
     *
     * @return Numer rejestracujny samochodu
     */
    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    /**
     *
     * @return Rok produkcji samochodu
     */
    public int getRok() {
        return rok;
    }

    /**
     *
     * @return Ilo�� k� w samochodzie
     */
    public int getKola() {
        return kola;
    }

    /**
     * Konstruktor
     *
     * @param marka - Marka samochodu
     * @param model - Model samochodu
     * @param kolor - Kolor samochodu
     * @param nrRejestracyjny - Nr rejestracyjny samochodu
     * @param rok - Rok produkcji samochodu
     * @param kola - Liczba k� w samochodzie
     */
    public Samochod(String marka, String model, String kolor, String nrRejestracyjny, int rok, int kola, TypSamochodu typ) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.nrRejestracyjny = nrRejestracyjny;
        this.rok = rok;
        this.kola = kola;
        this.typ = typ;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setKola(int kola) {
        this.kola = kola;
    }

    public String toString() {
        return "\tMarka: " + marka + "\n"
                + "\tModel: " + model + "\n"
                + "\tNr rej: " + nrRejestracyjny + "\n"
                + "\tKolor: " + kolor + "\n"
                + "\tRok: " + rok + "\n";
    }

    public void Wyswietl() {
    }
}