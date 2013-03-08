/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.semestr2.formatki2.view;

import java.awt.Color;
import java.awt.Graphics;
import nakonieczny.jacek.semestr2.formatki2.logic.ShapeType;

/**
 *
 * @author Jacek
 */
public class MainPanel extends javax.swing.JPanel {

    private int bmargin = 0, tmargin = 0, lmargin = 0, rmargin = 0;
    private Color bgColor, drawColor;
    private ShapeType shape = ShapeType.nothing;

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();
        bgColor = Color.DARK_GRAY;
        drawColor = Color.BLACK;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(bgColor);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(drawColor);

        switch (shape) {
            case drawOval:
                g.drawOval(lmargin, tmargin, getWidth() - lmargin - rmargin - 1, getHeight() - tmargin - bmargin - 1);
                break;
            case fillOval:
                g.fillOval(lmargin, tmargin, getWidth() - lmargin - rmargin - 1, getHeight() - tmargin - bmargin - 1);
                break;
            case drawRect:
                g.drawRect(lmargin, tmargin, getWidth() - lmargin - rmargin - 1, getHeight() - tmargin - bmargin - 1);
                break;
            case fillRect:
                g.fillRect(lmargin, tmargin, getWidth() - lmargin - rmargin - 1, getHeight() - tmargin - bmargin - 1);
                break;
            case drawRoundRect:
                g.drawRoundRect(lmargin, tmargin, getWidth() - lmargin - rmargin - 1, getHeight() - tmargin - bmargin - 1, 30, 30);
                break;
            case fillRoundRect:
                g.fillRoundRect(lmargin, tmargin, getWidth() - lmargin - rmargin - 1, getHeight() - tmargin - bmargin - 1, 30, 30);
                break;
            default:
                break;

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    public ShapeType getShape() {
        return shape;
    }

    public void setShape(ShapeType shape) {
        this.shape = shape;
        repaint();
    }

    public Color getDrawColor() {
        return drawColor;
    }

    public void setDrawColor(Color drawColor) {
        this.drawColor = drawColor;
        repaint();
    }

    public void setMargins(int l, int r, int t, int b) {
        this.lmargin = Math.max(l, 0);
        this.rmargin = Math.max(r, 0);
        this.tmargin = Math.max(t, 0);
        this.bmargin = Math.max(b, 0);
        repaint();
    }
}
