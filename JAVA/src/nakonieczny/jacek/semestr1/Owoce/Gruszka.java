package nakonieczny.jacek.semestr1.Owoce;
/**
 * 
 * @author Jacek
 */
public class Gruszka extends Owoc {

    public static int ile_gruszek = 0;

    /**
     * @param kolor - kolor gruszki
     * @param smak - smak gruszki
     */
    public Gruszka(String kolor, String smak) {
        super();
        this.kolor = kolor;
        this.smak = smak;
        ile_gruszek++;
        ile_owocow++;
    }

    @Override
    public String toString() {
        return "To jest gruszka kolor " + kolor + ", smak " + smak;
    }

    @Override
    public String jem1() {
        return "Suer";
    }

    @Override
    public void jem2() {
        System.out.println("Super");
    }

    public void jem() {
        if (ile_gruszek < 0) {
            System.out.println("Nie ma już gruszek");
        } else {
            System.out.println("Jem puyszną gruszkę");
            ile_owocow--;
            ile_gruszek--;
        }
    }
}
