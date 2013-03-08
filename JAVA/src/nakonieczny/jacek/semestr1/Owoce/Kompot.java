package nakonieczny.jacek.semestr1.Owoce;

public class Kompot {

    private Owoc[] owoce;
    private int idx;

    public Kompot(int ile_owocow) {
        owoce = new Owoc[ile_owocow];
        idx = 0;
        System.out.println("Robię kompot, ilość owoców " + ile_owocow);
    }

    public boolean addOwoc(Owoc o) {
        if (idx == owoce.length) {
            System.out.println("Nie ma już miejsca");
            return false;
        }
        System.out.println("Dodaję owoc: " + o);
        owoce[idx++] = o;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder w = new StringBuilder("W kompocie mam:\r\n");
        for (int i = 0; i < idx; i++) {
            w.append("owoc ").append(i + 1).append(" ").append(owoce[i].getSmak()).append("\r\n");
        }
        return w.toString();
    }
}
