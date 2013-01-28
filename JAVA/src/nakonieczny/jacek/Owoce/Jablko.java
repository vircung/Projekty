package nakonieczny.jacek.Owoce;

public class Jablko extends Owoc {

    public static int ile_jablek = 0;

    public Jablko(String kolor, String smak) {
        super();
        this.kolor = kolor;
        this.smak = smak;
        ile_owocow++;
        ile_jablek++;
        System.out.println("Zrywam jabłko.");
    }

    @Override
    public String toString() {
        return "To jest Jabłko kolor " + kolor + ", smak " + smak;
    }

    @Override
    public String jem1() {
        return "Pycha";
    }

    @Override
    public void jem2() {
        System.out.println("Pycha");
    }

    public void jem() {
        if (ile_jablek < 0) {
            System.out.println("Nie ma już jabłek");
        } else {
            ile_jablek--;
            ile_owocow--;
            System.out.println("Jem pyszne jabłko");
        }
    }
}
