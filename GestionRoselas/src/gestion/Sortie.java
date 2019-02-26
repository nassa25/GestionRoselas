/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import form.FormSortie;
import form.FormSortieModifier;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import login.Admin;
import login.Authentification;

/**
 *
 * @author RANDRIAMANANTSOA
 */
public class Sortie extends javax.swing.JFrame {

    Connecter con = new Connecter();
    Statement stm, stm1;
    ResultSet Rs;
    DefaultTableModel model = new DefaultTableModel();

    public Sortie() {
        initComponents();
        model.addColumn("Id");
        model.addColumn("Date");
        model.addColumn("Nom client");
        model.addColumn("Nom produit");
        model.addColumn("Quantité sortie");

        try {
            stm = con.obtenirConnexion().createStatement();
            ResultSet Rs = stm.executeQuery("select * from sortie");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("idSortie"), Rs.getString("dateSortie"), Rs.getString("nomClient"), Rs.getString("designProduit"), Rs.getString("qteSortie")});
            }

        } catch (SQLException e) {
            System.err.println(e);
        }

        tblSortie.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuEtat = new javax.swing.JLabel();
        menuEntree = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSortie = new javax.swing.JTable();
        btn_sortieAjouter = new javax.swing.JButton();
        btn_sortieModifier = new javax.swing.JButton();
        btn_sortieSupprimer = new javax.swing.JButton();
        txt_rechercheSortie = new javax.swing.JTextField();
        dt_sortieRecherche2 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dt_sortieRecherche3 = new com.toedter.calendar.JDateChooser();
        btn_sortieRecherche = new javax.swing.JButton();
        btn_clientActualiser = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        menuAdmin = new javax.swing.JLabel();
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
        jPanel1.add(menuEtat, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 100, 50));

        menuEntree.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuEntree.setForeground(new java.awt.Color(255, 255, 255));
        menuEntree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Jog Forward_48px.png"))); // NOI18N
        menuEntree.setText("ENTREE");
        menuEntree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEntreeMouseClicked(evt);
            }
        });
        jPanel1.add(menuEntree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Jog Reverse_48px.png"))); // NOI18N
        jLabel5.setText("SORTIE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 140, 380));

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

        jLabel9.setFont(new java.awt.Font("Impact", 0, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("LES SORTIES");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 240, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 930, 100));

        jPanel3.setBackground(new java.awt.Color(246, 144, 42));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSortie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblSortie);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 640, 240));

        btn_sortieAjouter.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_sortieAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Plus_35px.png"))); // NOI18N
        btn_sortieAjouter.setText("NOUVEAU");
        btn_sortieAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortieAjouterActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sortieAjouter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 40));

        btn_sortieModifier.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_sortieModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit_35px.png"))); // NOI18N
        btn_sortieModifier.setText("MODIFIER");
        btn_sortieModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortieModifierActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sortieModifier, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 160, 40));

        btn_sortieSupprimer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_sortieSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Delete_35px.png"))); // NOI18N
        btn_sortieSupprimer.setText("SUPPRIMER");
        btn_sortieSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortieSupprimerActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sortieSupprimer, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 150, 40));

        txt_rechercheSortie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_rechercheSortieMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_rechercheSortieMouseExited(evt);
            }
        });
        jPanel3.add(txt_rechercheSortie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 30));

        dt_sortieRecherche2.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(dt_sortieRecherche2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 30));

        jLabel1.setText("OU");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel2.setText("et");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 10, -1));

        dt_sortieRecherche3.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(dt_sortieRecherche3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 120, 30));

        btn_sortieRecherche.setText("Rechercher");
        btn_sortieRecherche.setMaximumSize(new java.awt.Dimension(87, 50));
        btn_sortieRecherche.setPreferredSize(new java.awt.Dimension(90, 45));
        btn_sortieRecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortieRechercheActionPerformed(evt);
            }
        });
        jPanel3.add(btn_sortieRecherche, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 120, 30));

        btn_clientActualiser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_clientActualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Synchronize_48px.png"))); // NOI18N
        btn_clientActualiser.setText("ACTUALISER");
        btn_clientActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientActualiserActionPerformed(evt);
            }
        });
        jPanel3.add(btn_clientActualiser, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 660, 380));

        jPanel4.setBackground(new java.awt.Color(176, 143, 135));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 926, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 479, 930, 100));

        jPanel5.setBackground(new java.awt.Color(121, 45, 49));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuAdmin.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        menuAdmin.setForeground(new java.awt.Color(255, 255, 255));
        menuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Customer_50px.png"))); // NOI18N
        menuAdmin.setText("COMPTE");
        menuAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuAdminMouseClicked(evt);
            }
        });
        jPanel5.add(menuAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

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
        jPanel5.add(menuProduit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 110, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 99, 130, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void affiche() {
        try {
            model.setRowCount(0);
            stm = con.obtenirConnexion().createStatement();
            ResultSet Rs = stm.executeQuery("select * from sortie");
            while (Rs.next()) {
                model.addRow(new Object[]{Rs.getString("idSortie"), Rs.getString("dateSortie"), Rs.getString("nomClient"), Rs.getString("designProduit"), Rs.getString("qteSortie")});
            }

        } catch (Exception e) {
            System.err.println(e);
        }

        tblSortie.setModel(model);
    }
    private void menuAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuAdminMouseClicked
        new Admin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuAdminMouseClicked

    private void menuClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClientMouseClicked
        new Client().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuClientMouseClicked

    private void menuProduitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProduitMouseClicked
        new Produit().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuProduitMouseClicked

    private void menuEntreeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEntreeMouseClicked
        new Entree().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEntreeMouseClicked

    private void menuEtatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEtatMouseClicked
        new Etat().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuEtatMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Authentification().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_logoutMouseClicked

    private void btn_sortieAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortieAjouterActionPerformed
        new FormSortie().setVisible(true);
    }//GEN-LAST:event_btn_sortieAjouterActionPerformed

    private void btn_sortieModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortieModifierActionPerformed
        TableModel model1 = tblSortie.getModel();
        int indexs[] = tblSortie.getSelectedRows();

        Object[] row = new Object[1];
        FormSortieModifier frm2 = new FormSortieModifier();
        for (int i = 0; i < indexs.length; i++) {
            FormSortieModifier.txt_ModifierSortieId.setText((String) model1.getValueAt(indexs[i], 0));
            ((JTextField) FormSortieModifier.dt_ModifierSortie.getDateEditor().getUiComponent()).setText(model.getValueAt(i, 1).toString());
            FormSortieModifier.cbx_clientSortieModifier.setSelectedItem((String) model1.getValueAt(indexs[i], 2));
            FormSortieModifier.cbx_produitSortieModifier.setSelectedItem((String) model1.getValueAt(indexs[i], 3));
            FormSortieModifier.txt_ModifierSortieQte.setText((String) model1.getValueAt(indexs[i], 4));
        }
        frm2.setVisible(true);
    }//GEN-LAST:event_btn_sortieModifierActionPerformed

    private void btn_sortieSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortieSupprimerActionPerformed
        TableModel model1 = tblSortie.getModel();
        int indexs[] = tblSortie.getSelectedRows();
        String id, prod;
        Object[] row = new Object[1];

        for (int i = 0; i < indexs.length; i++) {
            id = (String) model1.getValueAt(indexs[i], 0);
            prod = (String) model1.getValueAt(indexs[i], 3);
            try {
                stm1.executeUpdate(" UPDATE produit set stock = stock + (select qteSortie from sortie where idSortie='" + id + "') WHERE designProduit='" + prod + "'");
                stm = con.obtenirConnexion().createStatement();
                if (JOptionPane.showConfirmDialog(null, "Vous voulez vraiment supprimer", "suppression",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION) {
                    if (id.length() != 0) {
                        stm.executeUpdate("DELETE from produit WHERE idProduit=" + id);
                        affiche();
                    } else {
                        JOptionPane.showConfirmDialog(null, "Veuillez remplir le champ id");
                    }
                }
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Erreur de suppression !" + e.getMessage());
                System.err.println(e);
            }
        }
    }//GEN-LAST:event_btn_sortieSupprimerActionPerformed

    private void txt_rechercheSortieMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_rechercheSortieMouseEntered

    }//GEN-LAST:event_txt_rechercheSortieMouseEntered

    private void txt_rechercheSortieMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_rechercheSortieMouseExited

    }//GEN-LAST:event_txt_rechercheSortieMouseExited

    private void btn_sortieRechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortieRechercheActionPerformed

        String recherche1 = txt_rechercheSortie.getText();
        String date1 = ((JTextField) dt_sortieRecherche3.getDateEditor().getUiComponent()).getText();
        String date2 = ((JTextField) dt_sortieRecherche2.getDateEditor().getUiComponent()).getText();
        try {
            model.setRowCount(0);
            {
                Rs = stm.executeQuery("SELECT * from sortie WHERE nomClient LIKE '%" + recherche1 + "%' OR designProduit LIKE '%" + recherche1 + "%' OR qteSortie LIKE '%" + recherche1 + "%' AND dateSortie BETWEEN '" + date1 + "' AND '" + date2 + "' ");
                txt_rechercheSortie.setText("");
                ((JTextField) dt_sortieRecherche2.getDateEditor().getUiComponent()).setText("");
                ((JTextField) dt_sortieRecherche3.getDateEditor().getUiComponent()).setText("");
            }
            while (Rs.next()) {
                Object[] sortie = {Rs.getString("idSortie"), Rs.getString("dateSortie"), Rs.getString("nomClient"), Rs.getString("designProduit"), Rs.getString("qteSortie")};
                model.addRow(sortie);
                if (model.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Aucun sortie correspond !");
                }
            }
        } catch (HeadlessException | SQLException e) {
            System.err.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }//GEN-LAST:event_btn_sortieRechercheActionPerformed

    private void btn_clientActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientActualiserActionPerformed
        affiche();
    }//GEN-LAST:event_btn_clientActualiserActionPerformed

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
            java.util.logging.Logger.getLogger(Sortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sortie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sortie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clientActualiser;
    private javax.swing.JButton btn_sortieAjouter;
    private javax.swing.JButton btn_sortieModifier;
    private javax.swing.JButton btn_sortieRecherche;
    private javax.swing.JButton btn_sortieSupprimer;
    public static com.toedter.calendar.JDateChooser dt_sortieRecherche2;
    public static com.toedter.calendar.JDateChooser dt_sortieRecherche3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menuAdmin;
    private javax.swing.JLabel menuClient;
    private javax.swing.JLabel menuEntree;
    private javax.swing.JLabel menuEtat;
    private javax.swing.JLabel menuProduit;
    private javax.swing.JTable tblSortie;
    private javax.swing.JTextField txt_rechercheSortie;
    // End of variables declaration//GEN-END:variables
}
