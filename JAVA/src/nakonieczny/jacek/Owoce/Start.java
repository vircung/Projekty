package nakonieczny.jacek.Owoce;

class Start {

    public static void main(String[] args) {
        Jablko j1 = new Jablko("zielony", "kwaśny");
        podsumowanie();
        System.out.println(j1);
        System.out.println(j1.jem1());
        j1.setSmak("słodki");
        System.out.println(j1);
        Jablko.jedz();
        podsumowanie();
        Jablko j2 = new Jablko("czerwony", "słodki");
        System.out.println(j2);
        podsumowanie();
        Jablko j3 = new Jablko("czerwony", "kwaśny");
        System.out.println(j3);
        podsumowanie();
        System.out.println();
        Owoc o1 = new Gruszka("zielony", "słodki");
        System.out.println(o1);
        podsumowanie();
        Owoc o2 = new Gruszka("żółty", "słodki");
        System.out.println(o2);
        podsumowanie();
        Gruszka.jedz();
        podsumowanie();
        Gruszka.jedz();
        podsumowanie();
        Gruszka.jedz();
        System.out.println();
        Kompot k = new Kompot(3);
        k.addOwoc(j1);
        k.addOwoc(o1);
        k.addOwoc(j3);
        k.addOwoc(o2);
        System.out.println(k);
    }

    private static void podsumowanie() {
        System.out.println(" Ilość owoców " + Owoc.ile_owocow);
        System.out.println(" Ilość jabłek " + Jablko.ile_jablek);
        System.out.println(" Ilość gruszek " + Gruszka.ile_gruszek);
    }
}