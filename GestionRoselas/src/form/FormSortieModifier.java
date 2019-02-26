/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author RANDRIAMANANTSOA
 */
public final class FormSortieModifier extends javax.swing.JFrame {

    Connecter con = new Connecter();
    Statement stm;
    ResultSet Rs;
    Statement stm1;
    ResultSet Rs1;

    public FormSortieModifier() {
        initComponents();
        Mitady_client();
        Mitady_produit();
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
        btn_ModifierSortieAnnuler = new javax.swing.JButton();
        btn_ModifierSortieValider = new javax.swing.JButton();
        txt_ModifierSortieId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dt_ModifierSortie = new com.toedter.calendar.JDateChooser();
        cbx_produitSortieModifier = new javax.swing.JComboBox<>();
        cbx_clientSortieModifier = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txt_ModifierSortieQte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(86, 115, 154));
        jPanel1.setMaximumSize(new java.awt.Dimension(430, 442));
        jPanel1.setMinimumSize(new java.awt.Dimension(430, 442));
        jPanel1.setPreferredSize(new java.awt.Dimension(430, 442));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Castellar", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SORTIE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantité sortie :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 130, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nom Client :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 110, 30));

        btn_ModifierSortieAnnuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cancel_35px.png"))); // NOI18N
        btn_ModifierSortieAnnuler.setText("ANNULER");
        btn_ModifierSortieAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifierSortieAnnulerActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ModifierSortieAnnuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 130, 50));

        btn_ModifierSortieValider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Checkmark_35px.png"))); // NOI18N
        btn_ModifierSortieValider.setText("VALIDER");
        btn_ModifierSortieValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModifierSortieValiderActionPerformed(evt);
            }
        });
        jPanel1.add(btn_ModifierSortieValider, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 50));

        txt_ModifierSortieId.setEnabled(false);
        jPanel1.add(txt_ModifierSortieId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 210, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom produit :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 30));

        dt_ModifierSortie.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(dt_ModifierSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 210, 30));

        jPanel1.add(cbx_produitSortieModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 210, 30));

        jPanel1.add(cbx_clientSortieModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 210, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 110, 30));
        jPanel1.add(txt_ModifierSortieQte, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ModifierSortieValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifierSortieValiderActionPerformed
        String dateSortie = ((JTextField) dt_ModifierSortie.getDateEditor().getUiComponent()).getText();
        String idSortie = txt_ModifierSortieId.getText();
        String nomCli = cbx_clientSortieModifier.getSelectedItem().toString();
        String nomProd = cbx_produitSortieModifier.getSelectedItem().toString();
        String qte = txt_ModifierSortieQte.getText();
        try {
            stm = con.obtenirConnexion().createStatement();
            if (JOptionPane.showConfirmDialog(null, "Vous voulez vraiment modifier", "modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE sortie SET dateSortie='" + dateSortie + "',nomClient='" + nomCli + "',designProduit='" + nomProd + "', qteSortie='" + qte + "' WHERE idSortie=" + idSortie);
                stm1.executeUpdate(" UPDATE produit set stock = stock + (select qteSortie from sortie where idSortie='" + idSortie + "')- '" + qte + "' WHERE designProduit='" + nomProd + "'");

                ((JTextField) dt_ModifierSortie.getDateEditor().getUiComponent()).setText("");
                cbx_produitSortieModifier.getSelectedItem().toString();
                cbx_clientSortieModifier.getSelectedItem().toString();
                txt_ModifierSortieQte.setText("");
                txt_ModifierSortieId.setText("");
                this.setVisible(false);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Erreur de modification !" + e.getMessage());
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_ModifierSortieValiderActionPerformed

    private void btn_ModifierSortieAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModifierSortieAnnulerActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_ModifierSortieAnnulerActionPerformed
    public void Mitady_client() {

        try {

            stm = con.obtenirConnexion().createStatement();
            Rs = stm.executeQuery("select * from client");
            while (Rs.next()) {
                String NomClient = Rs.getString("nomClient");
                cbx_clientSortieModifier.addItem(NomClient);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FormEntree.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void Mitady_produit() {

        try {

            stm1 = con.obtenirConnexion().createStatement();
            Rs1 = stm1.executeQuery("select * from produit");
            while (Rs1.next()) {
                String NumProduit = Rs1.getString("designProduit");
                cbx_produitSortieModifier.addItem(NumProduit);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FormEntree.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

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
            java.util.logging.Logger.getLogger(FormSortieModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSortieModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSortieModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSortieModifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSortieModifier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ModifierSortieAnnuler;
    private javax.swing.JButton btn_ModifierSortieValider;
    public static javax.swing.JComboBox<String> cbx_clientSortieModifier;
    public static javax.swing.JComboBox<String> cbx_produitSortieModifier;
    public static com.toedter.calendar.JDateChooser dt_ModifierSortie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txt_ModifierSortieId;
    public static javax.swing.JTextField txt_ModifierSortieQte;
    // End of variables declaration//GEN-END:variables
}
