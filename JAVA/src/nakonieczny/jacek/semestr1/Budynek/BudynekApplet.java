/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nakonieczny.jacek.semestr1.Budynek;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Jacek
 */
public class BudynekApplet extends javax.swing.JApplet {

    ArrayList<Pomieszczenie> pomieszczenia;

    /**
     * Initializes the applet BudynekApplet
     */
    @Override
    public void init() {
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
            java.util.logging.Logger.getLogger(BudynekApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BudynekApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BudynekApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BudynekApplet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the applet */
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                    pomieszczenia = new ArrayList<>();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * This method is called from within the init() method to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panel_pokoj = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_p_nr = new javax.swing.JTextField();
        txt_p_pow = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_p_osob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btn_dodaj_pokoj = new javax.swing.JButton();
        txt_p_wlascicie = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        panel_sala = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txt_s_osob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_dodaj_sala = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txt_s_nr = new javax.swing.JTextField();
        txt_s_pow = new javax.swing.JTextField();
        panel_zmien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_zmien = new javax.swing.JButton();
        btn_sprawdz = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_nr = new javax.swing.JTextField();
        txt_osoby = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_pokoje = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_sale = new javax.swing.JTextArea();
        btn_odswiez = new javax.swing.JButton();

        jLabel4.setText("Nr");

        jLabel5.setText("Powierzchnia");

        jLabel6.setText("Ile osób");

        btn_dodaj_pokoj.setText("Dodaj pokój");
        btn_dodaj_pokoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dodaj_pokojActionPerformed(evt);
            }
        });

        jLabel7.setText("Właściciel");

        javax.swing.GroupLayout panel_pokojLayout = new javax.swing.GroupLayout(panel_pokoj);
        panel_pokoj.setLayout(panel_pokojLayout);
        panel_pokojLayout.setHorizontalGroup(
            panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pokojLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dodaj_pokoj, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(panel_pokojLayout.createSequentialGroup()
                        .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_p_nr, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txt_p_pow)
                            .addComponent(txt_p_osob)
                            .addComponent(txt_p_wlascicie))))
                .addContainerGap())
        );
        panel_pokojLayout.setVerticalGroup(
            panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_pokojLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_p_nr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_p_pow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_p_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_pokojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_p_wlascicie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dodaj_pokoj)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pokoj", panel_pokoj);

        jLabel8.setText("Ile osób");

        jLabel9.setText("Powierzchnia");

        btn_dodaj_sala.setText("Dodaj salę");
        btn_dodaj_sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dodaj_salaActionPerformed(evt);
            }
        });

        jLabel11.setText("Nr");

        javax.swing.GroupLayout panel_salaLayout = new javax.swing.GroupLayout(panel_sala);
        panel_sala.setLayout(panel_salaLayout);
        panel_salaLayout.setHorizontalGroup(
            panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_dodaj_sala, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addGroup(panel_salaLayout.createSequentialGroup()
                        .addGroup(panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_s_nr, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(txt_s_pow)
                            .addComponent(txt_s_osob))))
                .addContainerGap())
        );
        panel_salaLayout.setVerticalGroup(
            panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_salaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_s_nr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_s_pow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_salaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_s_osob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dodaj_sala)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sala", panel_sala);

        jLabel1.setText("Nr");

        jLabel2.setText("Ilość osób");

        btn_zmien.setText("Zmien");
        btn_zmien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_zmienActionPerformed(evt);
            }
        });

        btn_sprawdz.setText("Sprawdź powierzchnie");
        btn_sprawdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sprawdzActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_zmienLayout = new javax.swing.GroupLayout(panel_zmien);
        panel_zmien.setLayout(panel_zmienLayout);
        panel_zmienLayout.setHorizontalGroup(
            panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_zmienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_sprawdz, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                    .addComponent(btn_zmien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_zmienLayout.createSequentialGroup()
                        .addGroup(panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_osoby, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nr))))
                .addContainerGap())
        );
        panel_zmienLayout.setVerticalGroup(
            panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_zmienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nr)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_zmienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_osoby)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(btn_zmien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_sprawdz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Zmien", panel_zmien);

        jta_pokoje.setEditable(false);
        jta_pokoje.setColumns(20);
        jta_pokoje.setRows(5);
        jScrollPane1.setViewportView(jta_pokoje);

        jta_sale.setEditable(false);
        jta_sale.setColumns(20);
        jta_sale.setRows(5);
        jScrollPane2.setViewportView(jta_sale);

        btn_odswiez.setText("Odśwież");
        btn_odswiez.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_odswiezActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(btn_odswiez, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_odswiez))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dodaj_pokojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dodaj_pokojActionPerformed
        // TODO add your handling code here:
        int nr;
        double pow;
        int ileOs;
        String wlasciciel;

        if ("".equals(txt_p_nr.getText())
                || "".equals(txt_p_osob.getText())
                || "".equals(txt_p_pow.getText())
                || "".equals(txt_p_wlascicie.getText())) {
            JOptionPane.showMessageDialog(this, "Uzupełnij wszystkie pola");
            return;
        }

        nr = Integer.parseInt(txt_p_nr.getText());
        pow = Double.parseDouble(txt_p_pow.getText());
        ileOs = Integer.parseInt(txt_p_osob.getText());
        wlasciciel = txt_p_wlascicie.getText();



        try {
            Pokoj p = new Pokoj(nr, pow, ileOs, wlasciciel);
            pomieszczenia.add(p);
            txt_p_nr.setText("");
            txt_p_osob.setText("");
            txt_p_pow.setText("");
            txt_p_wlascicie.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Wpisz poprawną liczbę w odpowiednie pole");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        JOptionPane.showMessageDialog(this, "Dodałem");
    }//GEN-LAST:event_btn_dodaj_pokojActionPerformed

    private void btn_dodaj_salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dodaj_salaActionPerformed
        // TODO add your handling code here:
        int nr;
        double pow;
        int ileOs;


        if ("".equals(txt_s_nr.getText())
                || "".equals(txt_s_osob.getText())
                || "".equals(txt_s_pow.getText())) {
            JOptionPane.showMessageDialog(this, "Uzupełnij wszystkie pola");
            return;
        }

        nr = Integer.parseInt(txt_s_nr.getText());
        pow = Double.parseDouble(txt_s_pow.getText());
        ileOs = Integer.parseInt(txt_s_osob.getText());



        try {
            Sala s = new Sala(nr, pow, ileOs);
            pomieszczenia.add(s);
            txt_s_nr.setText("");
            txt_s_osob.setText("");
            txt_s_pow.setText("");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Wpisz poprawną liczbę w odpowiednie pole");
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

        JOptionPane.showMessageDialog(this, "Dodałem");
    }//GEN-LAST:event_btn_dodaj_salaActionPerformed

    private void btn_odswiezActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_odswiezActionPerformed
        // TODO add your handling code here:

        jta_pokoje.setText("");
        jta_sale.setText("");

        for (int i = 0; i < pomieszczenia.size(); i++) {
            if (pomieszczenia.get(i) instanceof Pokoj) {
                jta_pokoje.append("[" + i + "] " + pomieszczenia.get(i).toString() + "\n");
            } else if (pomieszczenia.get(i) instanceof Sala) {
                jta_sale.append("[" + i + "] " + pomieszczenia.get(i).toString() + "\n");
            }
        }
    }//GEN-LAST:event_btn_odswiezActionPerformed

    private void btn_sprawdzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sprawdzActionPerformed
        // TODO add your handling code here:
        int idx = Integer.parseInt(txt_nr.getText());
        int osoby;

        if (idx < 0 || idx >= pomieszczenia.size()) {
            JOptionPane.showMessageDialog(this, "Niepoprawny index pomieszczenia");
            return;
        }

        osoby = Integer.parseInt(txt_osoby.getText());

        Pomieszczenie p = pomieszczenia.get(idx);

        if (!p.SprawdzPowierzchnie(osoby)) {
            JOptionPane.showMessageDialog(this, "Zbyt duża ilośc osób");
            return;
        } else {
            JOptionPane.showMessageDialog(this, "Jest OK");
        }

        p.setIleOsob(osoby);
    }//GEN-LAST:event_btn_sprawdzActionPerformed

    private void btn_zmienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_zmienActionPerformed
        // TODO add your handling code here:
        int idx = Integer.parseInt(txt_nr.getText());
        int osoby;

        if (idx < 0 || idx >= pomieszczenia.size()) {
            JOptionPane.showMessageDialog(this, "Niepoprawny index pomieszczenia");
            return;
        }

        osoby = Integer.parseInt(txt_osoby.getText());

        Pomieszczenie p = pomieszczenia.get(idx);

        if (!p.SprawdzPowierzchnie(osoby)) {
            JOptionPane.showMessageDialog(this, "Zbyt duża ilośc osób");
            return;
        }

        txt_nr.setText("");
        txt_osoby.setText("");

        p.setIleOsob(osoby);

        JOptionPane.showMessageDialog(this, "Zmieniłem");
    }//GEN-LAST:event_btn_zmienActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dodaj_pokoj;
    private javax.swing.JButton btn_dodaj_sala;
    private javax.swing.JButton btn_odswiez;
    private javax.swing.JButton btn_sprawdz;
    private javax.swing.JButton btn_zmien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jta_pokoje;
    private javax.swing.JTextArea jta_sale;
    private javax.swing.JPanel panel_pokoj;
    private javax.swing.JPanel panel_sala;
    private javax.swing.JPanel panel_zmien;
    private javax.swing.JTextField txt_nr;
    private javax.swing.JTextField txt_osoby;
    private javax.swing.JTextField txt_p_nr;
    private javax.swing.JTextField txt_p_osob;
    private javax.swing.JTextField txt_p_pow;
    private javax.swing.JTextField txt_p_wlascicie;
    private javax.swing.JTextField txt_s_nr;
    private javax.swing.JTextField txt_s_osob;
    private javax.swing.JTextField txt_s_pow;
    // End of variables declaration//GEN-END:variables
}
