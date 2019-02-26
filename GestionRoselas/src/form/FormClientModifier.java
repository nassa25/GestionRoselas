/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import gestion.Client;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author RANDRIAMANANTSOA
 */
public class FormClientModifier extends javax.swing.JFrame {

    Connecter con = new Connecter();
    Statement stm;
    ResultSet Rs;
    Client cli = new Client();

    public FormClientModifier() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_cliAnnulModifier = new javax.swing.JButton();
        btn_climodifier = new javax.swing.JButton();
        txt_cliAdresseModifier = new javax.swing.JTextField();
        txt_cliNomModifier = new javax.swing.JTextField();
        txt_cliContactModifier = new javax.swing.JTextField();
        txt_cliIdModifier = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(134, 23, 70));
        jPanel1.setMaximumSize(new java.awt.Dimension(430, 442));
        jPanel1.setMinimumSize(new java.awt.Dimension(430, 442));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 442));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CLIENT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Adresse :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 80, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contact :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 80, 30));

        btn_cliAnnulModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cancel_35px.png"))); // NOI18N
        btn_cliAnnulModifier.setText("ANNULER");
        btn_cliAnnulModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cliAnnulModifierActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cliAnnulModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 130, 50));

        btn_climodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Checkmark_35px.png"))); // NOI18N
        btn_climodifier.setText("VALIDER");
        btn_climodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_climodifierActionPerformed(evt);
            }
        });
        jPanel1.add(btn_climodifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 120, 50));
        jPanel1.add(txt_cliAdresseModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 230, 30));
        jPanel1.add(txt_cliNomModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 230, 30));
        jPanel1.add(txt_cliContactModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, 30));

        txt_cliIdModifier.setEditable(false);
        txt_cliIdModifier.setEnabled(false);
        jPanel1.add(txt_cliIdModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_climodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_climodifierActionPerformed
        try {
            stm = con.obtenirConnexion().createStatement();
            if (JOptionPane.showConfirmDialog(null, "Vous voulez vraiment modifier", "modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE client SET nomClient='" + txt_cliNomModifier.getText() + "',addresse='" + txt_cliAdresseModifier.getText() + "',contact='" + txt_cliContactModifier.getText() + "' WHERE idClient=" + txt_cliIdModifier.getText());
                txt_cliNomModifier.setText("");
                txt_cliAdresseModifier.setText("");
                txt_cliContactModifier.setText("");
                txt_cliIdModifier.setText("");
                cli.affiche();
                this.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de modification !" + e.getMessage());
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_climodifierActionPerformed

    private void btn_cliAnnulModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cliAnnulModifierActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_cliAnnulModifierActionPerformed

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
            java.util.logging.Logger.getLogger(FormClientModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormClientModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormClientModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormClientModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormClientModifier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cliAnnulModifier;
    private javax.swing.JButton btn_climodifier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txt_cliAdresseModifier;
    public static javax.swing.JTextField txt_cliContactModifier;
    public static javax.swing.JTextField txt_cliIdModifier;
    public static javax.swing.JTextField txt_cliNomModifier;
    // End of variables declaration//GEN-END:variables
}
