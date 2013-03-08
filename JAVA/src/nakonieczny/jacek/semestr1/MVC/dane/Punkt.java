/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.semestr1.MVC.dane;

import java.util.Random;

/**
 *
 * @author Jacek
 */
public class Punkt {

    private int x, y;

    public Punkt(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void losuj(int xmax, int ymax) {
        Random rd = new Random();
        x = rd.nextInt(xmax);
        y = rd.nextInt(ymax);
    }

    public double odleglosc(Punkt p) {
        double rx, ry, sum;
        rx = this.x - p.x;
        ry = this.y - p.y;
        sum = rx * rx + ry * ry;
        return Math.sqrt(sum);
    }
}
