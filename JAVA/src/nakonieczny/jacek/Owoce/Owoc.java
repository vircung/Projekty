package nakonieczny.jacek.Owoce;

public abstract class Owoc {

    protected String smak;
    protected String kolor;

    public String getSmak() {
        return smak;
    }

    public String getKolor() {
        return kolor;
    }
    public static int ile_owocow = 0;

    public void setSmak(String smak) {
        this.smak = smak;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public abstract String jem1();

    public abstract void jem2();

    public static void jedz() {
    }
}
