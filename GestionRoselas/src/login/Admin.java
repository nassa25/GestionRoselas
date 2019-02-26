/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import gestion.Client;
import gestion.Entree;
import gestion.Etat;
import gestion.Produit;
import gestion.Sortie;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author RANDRIAMANANTSOA
 */
public class Admin extends javax.swing.JFrame {

    Connecter con = new Connecter();
    Statement stm;
    ResultSet Rs;
    DefaultTableModel model = new DefaultTableModel();

    public Admin() {
        initComponents();
        model.addColumn("Id");
        model.addColumn("Nom d'utilisateur");
        model.addColumn("Mot de passe");

        try {
            stm = con.obtenirConnexion().createStatement();
            ResultSet Rs = stm.executeQuery("select * from login");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("idUser"), Rs.getString("nomUser"), Rs.getString("mdpUser")});
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        tblUser.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuEtat = new javax.swing.JLabel();
        menuEntree = new javax.swing.JLabel();
        menuSortie = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btn_user_ajouter1 = new javax.swing.JButton();
        btn_user_supprimer = new javax.swing.JButton();
        txtRecherche = new javax.swing.JTextField();
        lbl_rechercheUser = new javax.swing.JLabel();
        btn_user_modifier = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtMdp = new javax.swing.JTextField();
        txtNomUs = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_user_annuler = new javax.swing.JButton();
        btn_user_ok = new javax.swing.JButton();
        lbl_IDUser = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menuClient = new javax.swing.JLabel();
        menuProduit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(121, 45, 49));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuEtat.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuEtat.setForeground(new java.awt.Color(255, 255, 255));
        menuEtat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Sales Performance_50px.png"))); // NOI18N
        menuEtat.setText("ETAT");
        menuEtat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEtatMouseClicked(evt);
            }
        });
        jPanel1.add(menuEtat, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, -1));

        menuEntree.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuEntree.setForeground(new java.awt.Color(255, 255, 255));
        menuEntree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Jog Forward_48px.png"))); // NOI18N
        menuEntree.setText("ENTREE");
        menuEntree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEntreeMouseClicked(evt);
            }
        });
        jPanel1.add(menuEntree, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, -1));

        menuSortie.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuSortie.setForeground(new java.awt.Color(255, 255, 255));
        menuSortie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Jog Reverse_48px.png"))); // NOI18N
        menuSortie.setText("SORTIE");
        menuSortie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSortieMouseClicked(evt);
            }
        });
        jPanel1.add(menuSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 140, 380));

        jPanel2.setBackground(new java.awt.Color(176, 143, 135));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Shutdown_100px.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 100, 100));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Male User_100px.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 100));

        jLabel7.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMINISTER VOTRE COMPTE D'UTILISATEUR");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 410, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 100));

        jPanel3.setBackground(new java.awt.Color(246, 144, 42));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(500, 200));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.black, java.awt.Color.white, java.awt.Color.orange));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nom Utilisateur", "Mot de Passe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUser);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 270));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 630, 270));

        btn_user_ajouter1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_user_ajouter1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Plus_35px.png"))); // NOI18N
        btn_user_ajouter1.setText("NOUVEAU");
        btn_user_ajouter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_ajouter1ActionPerformed(evt);
            }
        });
        jPanel3.add(btn_user_ajouter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, 40));

        btn_user_supprimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_user_supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete_35px.png"))); // NOI18N
        btn_user_supprimer.setText("SUPPRIMER");
        btn_user_supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_supprimerActionPerformed(evt);
            }
        });
        jPanel3.add(btn_user_supprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 150, 40));

        txtRecherche.setToolTipText("");
        jPanel3.add(txtRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 221, 30));

        lbl_rechercheUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Search_35px.png"))); // NOI18N
        lbl_rechercheUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_rechercheUserMouseClicked(evt);
            }
        });
        jPanel3.add(lbl_rechercheUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 30));

        btn_user_modifier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_user_modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit_35px.png"))); // NOI18N
        btn_user_modifier.setText("MODIFIER");
        btn_user_modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_modifierActionPerformed(evt);
            }
        });
        jPanel3.add(btn_user_modifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 650, 380));

        jPanel4.setBackground(new java.awt.Color(176, 143, 135));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMdpActionPerformed(evt);
            }
        });
        jPanel4.add(txtMdp, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 176, 33));
        jPanel4.add(txtNomUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 176, 33));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nom d'utilisateur");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 33));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mot de passe");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, 33));

        btn_user_annuler.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_user_annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Cancel_35px.png"))); // NOI18N
        btn_user_annuler.setText("Annuler");
        btn_user_annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_annulerActionPerformed(evt);
            }
        });
        jPanel4.add(btn_user_annuler, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 130, 40));

        btn_user_ok.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_user_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Checkmark_35px.png"))); // NOI18N
        btn_user_ok.setText("Valider");
        btn_user_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_user_okActionPerformed(evt);
            }
        });
        jPanel4.add(btn_user_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 120, 40));

        lbl_IDUser.setText("ID");
        jPanel4.add(lbl_IDUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 930, 120));

        jPanel5.setBackground(new java.awt.Color(121, 45, 49));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer_50px.png"))); // NOI18N
        jLabel3.setText("COMPTE");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 110, -1));

        menuClient.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuClient.setForeground(new java.awt.Color(255, 255, 255));
        menuClient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hard Working_48px.png"))); // NOI18N
        menuClient.setText("CLIENT");
        menuClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClientMouseClicked(evt);
            }
        });
        jPanel5.add(menuClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        menuProduit.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuProduit.setForeground(new java.awt.Color(255, 255, 255));
        menuProduit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Buying_48px.png"))); // NOI18N
        menuProduit.setText("PRODUIT");
        menuProduit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProduitMouseClicked(evt);
            }
        });
        jPanel5.add(menuProduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 130, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void affiche() {
        try {
            model.setRowCount(0);
            stm = con.obtenirConnexion().createStatement();
            ResultSet Rs = stm.executeQuery("select * from login");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("idUser"), Rs.getString("nomUser"), Rs.getString("mdpUser")});
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        tblUser.setModel(model);
    }
    private void menuProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProduitMouseClicked
        new Produit().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuProduitMouseClicked

    private void menuClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientMouseClicked
        new Client().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuClientMouseClicked

    private void menuEntreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEntreeMouseClicked
        new Entree().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEntreeMouseClicked

    private void menuSortieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSortieMouseClicked
        new Sortie().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuSortieMouseClicked

    private void menuEtatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEtatMouseClicked
        new Etat().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEtatMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Authentification().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void btn_user_supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_supprimerActionPerformed
        TableModel model1 = tblUser.getModel();
        int indexs[] = tblUser.getSelectedRows();
        String id, nom;
        Object[] row = new Object[1];

        for (int i = 0; i < indexs.length; i++) {
            id = (String) model1.getValueAt(indexs[i], 0);
            nom = (String) model1.getValueAt(indexs[i], 1);

            try {
                stm = con.obtenirConnexion().createStatement();
                if (JOptionPane.showConfirmDialog(null, "Vous voulez vraiment supprimer", "suppression",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    if (id.length() != 0) {
                        stm.executeUpdate("DELETE from login WHERE idUser=" + id);
                        affiche();
                    } else {
                        JOptionPane.showConfirmDialog(null, "Veuillez remplir le champ id");
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erreur de suppression !" + e.getMessage());
                System.err.println(e);
            }
        }

    }//GEN-LAST:event_btn_user_supprimerActionPerformed

    private void btn_user_ajouter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_ajouter1ActionPerformed

        String nom = txtNomUs.getText();
        String idUser = "0";
        String mdp = txtMdp.getText();

        if (nom.equals("") && mdp.equals("")) {
            JOptionPane.showMessageDialog(null, "Veuillez completer tous les champs svp!");
        } else {
            String requete = "INSERT INTO login(idUser,nomUser,mdpUser) VALUES ('" + idUser + "','" + nom + "','" + mdp + "')";

            try {
                stm = con.obtenirConnexion().createStatement();
                stm.executeUpdate(requete);
                JOptionPane.showMessageDialog(null, "Ajoute avec succes");

                txtNomUs.setText("");
                txtMdp.setText("");

                affiche();
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }
    }//GEN-LAST:event_btn_user_ajouter1ActionPerformed

    private void txtMdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMdpActionPerformed

    private void btn_user_modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_modifierActionPerformed
        TableModel model1 = tblUser.getModel();
        int indexs[] = tblUser.getSelectedRows();

        Object[] row = new Object[1];

        for (int i = 0; i < indexs.length; i++) {
            txtNomUs.setText((String) model1.getValueAt(indexs[i], 1));
            lbl_IDUser.setText((String) model1.getValueAt(indexs[i], 0));
            txtMdp.setText((String) model1.getValueAt(indexs[i], 2));

        }
    }//GEN-LAST:event_btn_user_modifierActionPerformed

    private void btn_user_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_okActionPerformed
        try {
            stm = con.obtenirConnexion().createStatement();
            if (JOptionPane.showConfirmDialog(null, "Vous voulez vraiment modifier", "modification",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {

                stm.executeUpdate("UPDATE login SET nomUser='" + txtNomUs.getText() + "',mdpUser='" + txtMdp.getText() + "' WHERE idUser=" + lbl_IDUser.getText());
                txtNomUs.setText("");
                txtMdp.setText("");
                lbl_IDUser.setText("");
                affiche();

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de modification !" + e.getMessage());
            System.err.println(e);
        }
    }//GEN-LAST:event_btn_user_okActionPerformed

    private void lbl_rechercheUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_rechercheUserMouseClicked
        try {
            model.setRowCount(0);
            {
                Rs = stm.executeQuery("SELECT * from login WHERE nomUser LIKE '%" + txtRecherche.getText() + "%' OR mdpUser LIKE '%" + txtRecherche.getText() + "%' ");
                txtRecherche.setText("");
            }
            while (Rs.next()) {
                Object[] login = {Rs.getString("idUser"), Rs.getString("nomUser"), Rs.getString("mdpUser")};
                model.addRow(login);
                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Aucun client correspond!");
                }
            }
        } catch (Exception e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_lbl_rechercheUserMouseClicked

    private void btn_user_annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_user_annulerActionPerformed
        txtNomUs.setText("");
        txtMdp.setText("");
        lbl_IDUser.setText("");
    }//GEN-LAST:event_btn_user_annulerActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_user_ajouter1;
    private javax.swing.JButton btn_user_annuler;
    private javax.swing.JButton btn_user_modifier;
    private javax.swing.JButton btn_user_ok;
    private javax.swing.JButton btn_user_supprimer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_IDUser;
    private javax.swing.JLabel lbl_rechercheUser;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menuClient;
    private javax.swing.JLabel menuEntree;
    private javax.swing.JLabel menuEtat;
    private javax.swing.JLabel menuProduit;
    private javax.swing.JLabel menuSortie;
    private javax.swing.JTable tblUser;
    private javax.swing.JTextField txtMdp;
    private javax.swing.JTextField txtNomUs;
    private javax.swing.JTextField txtRecherche;
    // End of variables declaration//GEN-END:variables
}
