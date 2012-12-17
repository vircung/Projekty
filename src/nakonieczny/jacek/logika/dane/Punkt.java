/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.logika.dane;

import java.util.Random;

/**
 *
 * @author Jacek
 */
public class Punkt {

    private int x;
    private int y;
    private static Random r = new Random(System.currentTimeMillis());

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {
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

    public void losuj(int x_max, int y_max) {
        x = r.nextInt(x_max);
        y = r.nextInt(y_max);
    }
}
