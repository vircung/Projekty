package nakonieczny.jacek.Budynki;

/**
 *
 * @author Jacek
 */
public abstract class Budynek {


	protected int ilosc_pieter;
    protected int ilosc_drzwi;
    protected int ilosc_okien;
    protected int ilosc_rodzin;
    public static int ilosc_budynkow = 0;

    public abstract int getIlosc_pieter();

    public abstract void setIlosc_pieter(int ilosc_pieter);

    public abstract int getIlosc_drzwi();

    public abstract void setIlosc_drzwi(int ilosc_drzwi);

    public abstract int getIlosc_okien();

    public abstract void setIlosc_okien(int ilosc_okien);

    public abstract int getIlosc_rodzin();

    public abstract void setIlosc_rodzin(int ilosc_rodzin);
    
    public abstract void rysuj() throws MojWyjatek;
}
