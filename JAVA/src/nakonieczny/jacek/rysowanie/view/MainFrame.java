/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.rysowanie.view;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Jacek
 */
public class MainFrame extends javax.swing.JFrame {
    
    Graphics g = null;
    Color color = Color.CYAN;
    int padding = 10;
    int arcWidth = 20;
    int arcHeight = 20;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        g = jPanel1.getGraphics();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_rect = new javax.swing.JButton();
        btn_roundrect = new javax.swing.JButton();
        btn_oval = new javax.swing.JButton();
        btn_filloval = new javax.swing.JButton();
        btn_fillroundrect = new javax.swing.JButton();
        btn_fillrect = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_rect.setText("Prostokąt");
        btn_rect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rectActionPerformed(evt);
            }
        });

        btn_roundrect.setText("ZaokrProstokąt");
        btn_roundrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roundrectActionPerformed(evt);
            }
        });

        btn_oval.setText("Elipsa");
        btn_oval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ovalActionPerformed(evt);
            }
        });

        btn_filloval.setText("Elipsa");
        btn_filloval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fillovalActionPerformed(evt);
            }
        });

        btn_fillroundrect.setText("ZaokrProstokąt");
        btn_fillroundrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fillroundrectActionPerformed(evt);
            }
        });

        btn_fillrect.setText("Prostokąt");
        btn_fillrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fillrectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_rect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_roundrect, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(btn_oval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_fillrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_fillroundrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_filloval, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_rect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_roundrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_oval)
                .addGap(18, 18, 18)
                .addComponent(btn_fillrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_fillroundrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_filloval)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rectActionPerformed
        // TODO add your handling code here:
        g.setColor(Color.BLACK);
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        g.drawRect(padding, padding, jPanel1.getWidth() - padding * 2, jPanel1.getHeight() - padding * 2);
    }//GEN-LAST:event_btn_rectActionPerformed

    private void btn_fillrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fillrectActionPerformed
        g.setColor(color);
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        g.fillRect(padding, padding, jPanel1.getWidth() - padding * 2, jPanel1.getHeight() - padding * 2);
    }//GEN-LAST:event_btn_fillrectActionPerformed

    private void btn_roundrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_roundrectActionPerformed
        g.setColor(Color.BLACK);
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        g.drawRoundRect(padding, padding, jPanel1.getWidth() - padding * 2, jPanel1.getHeight() - padding * 2, arcWidth, arcHeight);
    }//GEN-LAST:event_btn_roundrectActionPerformed

    private void btn_ovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ovalActionPerformed
        g.setColor(Color.BLACK);
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        g.drawOval(padding, padding, jPanel1.getWidth() - padding * 2, jPanel1.getHeight() - padding * 2);
    }//GEN-LAST:event_btn_ovalActionPerformed

    private void btn_fillroundrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fillroundrectActionPerformed
        g.setColor(color);
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        g.fillRoundRect(padding, padding, jPanel1.getWidth() - padding * 2, jPanel1.getHeight() - padding * 2, arcWidth, arcHeight);
    }//GEN-LAST:event_btn_fillroundrectActionPerformed

    private void btn_fillovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fillovalActionPerformed
        g.setColor(color);
        g.clearRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        g.fillOval(padding, padding, jPanel1.getWidth() - padding * 2, jPanel1.getHeight() - padding * 2);
    }//GEN-LAST:event_btn_fillovalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_filloval;
    private javax.swing.JButton btn_fillrect;
    private javax.swing.JButton btn_fillroundrect;
    private javax.swing.JButton btn_oval;
    private javax.swing.JButton btn_rect;
    private javax.swing.JButton btn_roundrect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}