package nakonieczny.jacek.Budynki;

import java.util.Random;

public class Blok extends Budynek {

    private boolean winda;
    private boolean zsyp;
    private boolean strych;
    public static int ilosc_blokow = 0;

    @Override
    public int getIlosc_drzwi() {
        return this.ilosc_drzwi;
    }

    @Override
    public int getIlosc_okien() {
        return this.ilosc_okien;
    }

    @Override
    public int getIlosc_pieter() {
        return this.ilosc_pieter;
    }

    @Override
    public int getIlosc_rodzin() {
        return this.ilosc_rodzin;
    }

    @Override
    public void setIlosc_drzwi(int ilosc_drzwi) {
        this.ilosc_drzwi = ilosc_drzwi;
    }

    @Override
    public void setIlosc_okien(int ilosc_okien) {
        this.ilosc_okien = ilosc_okien;
    }

    @Override
    public void setIlosc_pieter(int ilosc_pieter) {
        this.ilosc_pieter = ilosc_pieter;
    }

    @Override
    public void setIlosc_rodzin(int ilosc_rodzin) {
        this.ilosc_rodzin = ilosc_rodzin;
    }

    public boolean isWinda() {
        return winda;
    }

    public boolean isZsyp() {
        return zsyp;
    }

    public boolean isStrych() {
        return strych;
    }

    public void setWinda(boolean winda) {
        this.winda = winda;
    }

    public void setZsyp(boolean zsyp) {
        this.zsyp = zsyp;
    }

    public void setStrych(boolean strych) {
        this.strych = strych;
    }

    public Blok(int ilosc_okien, int ilosc_drzwi, int ilosc_pieter,
            int ilosc_rodzin, boolean winda, boolean zsyp, boolean strych) {
        setIlosc_drzwi(ilosc_drzwi);
        setIlosc_okien(ilosc_okien);
        setIlosc_pieter(ilosc_pieter);
        setIlosc_rodzin(ilosc_rodzin);
        setWinda(winda);
        setZsyp(zsyp);
        setStrych(strych);
        ilosc_budynkow++;
        ilosc_blokow++;
    }

    @Override
    public String toString() {
        StringBuilder w = new StringBuilder("To jest Blok.\r\n\tIlo�� pi�ter "
                + ilosc_pieter + ", ilo�� rodzin " + ilosc_rodzin);
        if (winda) {
            w.append(", ma wind�");
        }
        if (zsyp) {
            w.append(", ma zsyp");
        }
        if (strych) {
            w.append(", ma strych");
        }
        return w.toString();
    }

    @Override
    public void rysuj() throws MojWyjatek {
        if ((ilosc_drzwi + ilosc_okien) % (ilosc_pieter + 1) != 0) {
            throw new MojWyjatek("Za ilo�� okien i drzwi!");
        }
        int il_kol = (ilosc_drzwi + ilosc_okien) / (ilosc_pieter + 1);
        Random rand = new Random();
        int idx_drzwi = rand.nextInt(il_kol);
        rysujDach(il_kol);
        rysujStrop(il_kol, -1);
        for (int i = 0; i < ilosc_pieter; i++) {
            rysujPietro(il_kol, -1);
        }
        rysujPietro(il_kol, idx_drzwi);
        rysujStrop(il_kol, idx_drzwi);
    }

    private void rysujDach(int il_kol) {
        System.out.print(" +");
        for (int i = 0; i < il_kol; i++) {
            System.out.print("-----");
        }
        System.out.println("+");
    }

    private void rysujStrop(int il_kol, int poz_drzwi) {
        System.out.print("+-");
        for (int i = 0; i < il_kol; i++) {
            if (poz_drzwi >= 0 && i == poz_drzwi) {
                System.out.print("-+-+-");
            } else {
                System.out.print("-----");
            }
        }
        System.out.println("-+");
    }

    private void rysujPietro(int il_kol, int poz_drzwi) {
        System.out.print("| ");
        for (int i = 0; i < il_kol; i++) {
            System.out.print(" +-+ ");
        }
        System.out.println(" |");

        System.out.print("| ");
        for (int i = 0; i < il_kol; i++) {
            if (poz_drzwi >= 0 && i == poz_drzwi) {
                System.out.print(" | | ");
            } else {
                System.out.print(" +-+ ");
            }
        }
        System.out.println(" |");

        System.out.print("| ");
        for (int i = 0; i < il_kol; i++) {
            if (poz_drzwi >= 0 && i == poz_drzwi) {
                System.out.print(" | | ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println(" |");
    }
}