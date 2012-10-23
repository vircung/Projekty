/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Applets;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Jacek
 */
public class Labs extends JApplet {

    static int starts = 0;
    static int stops = 0;
    static int inits = 0;
    private String[] properties = {"java.version", "java.home",
        "java.class.path", "os.name", "os.arch", "os.version",
        "file.encoding", "user.name", "user.home", "java.vendor"};
    private String[] comments = {"Wersja JAVY", "Katalog z JAVĄ",
        "Ścieżka do apletu", "System operacyjny", "Architektura systemu",
        "Wersja systemu", "Kodowanie", "Użytkownik", "Katalog domowy", "Autor"};

    @Override
    public void init() {
        super.init();
        inits++;
        setSize(600, 400);
        System.out.println("Inits : " + inits);
    }

    @Override
    public void start() {
        super.start();
        starts++;
        System.out.println("Starts : " + starts);
    }

    @Override
    public void stop() {
        super.stop();
        stops++;
        System.out.println("Stop : " + stops);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.BLACK);
        g.drawString("Dzisiaj mamy: " + new java.util.Date().toString(), 10,
                10);
        g.drawString("Dzisiaj mamy: "
                + new java.util.Date().toLocaleString(), 10, 25);
        for (int i = 0; i < comments.length; i++) {
            g.drawString(comments[i] + ": "
                    + System.getProperty(properties[i]), 10, 40 + i * 15);
        }
    }
}
