/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.Budynki;

public class Start {

    public static void main(String[] args) {

        Budynek bd01 = new Dom(3, 1, 2, 1, true, true, false);
        Budynek bd02 = new Dom(13, 2, 3, 1, true, true, true);
        Budynek bd03 = new Dom(5, 1, 2, 2, true, true, false);
        Budynek bb01 = new Blok(24, 1, 4, 8, true, true, false);
        Budynek bb02 = new Blok(15, 1, 4, 4, true, true, false);
        Budynek bb03 = new Blok(49, 1, 10, 20, true, true, true);

        Ulica ul1 = new Ulica("Konstantynów", 5);
        try {
            ul1.addBudynek(bb01);
            ul1.addBudynek(bd01);
            ul1.addBudynek(bb02);
            ul1.addBudynek(bd02);
            ul1.addBudynek(bb03);
            ul1.addBudynek(bd03);
        } catch (MojWyjatek e) {
            System.out.println(e.getMessage());
        }
        System.out.println(ul1);

        try {
            bb01.rysuj();
        } catch (MojWyjatek e) {
            System.out.println(e.getMessage());
        }
    }
}
