package nakonieczny.jacek.semestr1.Budynki;

public class Ulica {

    private Budynek budynki[];
    private String nazwa;
    private int idx;

    public Ulica(String nazwa, int ile_budynkow) {
        this.nazwa = nazwa;
        this.idx = 0;
        this.budynki = new Budynek[ile_budynkow];
        System.out.println("Została zbudowana ulica z miejscem na "
                + ile_budynkow + " budynków");
    }

    public void addBudynek(Budynek b) throws MojWyjatek {
        if (idx >= budynki.length) {
            throw new MojWyjatek("Brak miejsca na nowy budynek!");
        }
        budynki[idx++] = b;
    }

    @Override
    public String toString() {
        StringBuilder w = new StringBuilder("\r\nUlica " + this.nazwa + "\r\n");
        for (int i = 0; i < idx; i++) {
            w.append(i + 1).append(". ").append(budynki[i].toString()).append("\r\n");
        }
        return w.toString();
    }
}
