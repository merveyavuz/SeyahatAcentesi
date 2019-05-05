/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seyahatacentesi;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author myavuz
 */
public class UlasimSec extends javax.swing.JFrame {

    /**
     * Creates new form UlasimSec
     */
    public UlasimSec() {
        initComponents();
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        jRadioButton_gidis.setEnabled(false);
        jRadioButton_gidisDonus.setEnabled(false);
        jComboBox_firmalar.setEnabled(false);
        jComboBox_nereden.setEnabled(false);
        jComboBox_nereye.setEnabled(false);
        jSpinner_kisiSayisi.setEnabled(false);
        jDateChooser_donus.setEnabled(false);
        jDateChooser_gidis.setEnabled(false);
        btn_ileri.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        radiobtn_otobus = new javax.swing.JRadioButton();
        radiobtn_havayolu = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_firmalar = new javax.swing.JComboBox<>();
        jRadioButton_gidis = new javax.swing.JRadioButton();
        jRadioButton_gidisDonus = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser_gidis = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser_donus = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox_nereden = new javax.swing.JComboBox<>();
        jComboBox_nereye = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSpinner_kisiSayisi = new javax.swing.JSpinner();
        btn_ileri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 102, 204));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SEYAHAT ACENTESİ");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BİLET-TATİL SİSTEMİ");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seyahatacentesi/images/icon.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seyahatacentesi/images/back.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(799, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 110));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        buttonGroup1.add(radiobtn_otobus);
        radiobtn_otobus.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        radiobtn_otobus.setForeground(new java.awt.Color(0, 51, 153));
        radiobtn_otobus.setText("OTOBÜS");
        radiobtn_otobus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_otobusActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiobtn_havayolu);
        radiobtn_havayolu.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        radiobtn_havayolu.setForeground(new java.awt.Color(0, 51, 153));
        radiobtn_havayolu.setText("HAVAYOLU");
        radiobtn_havayolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiobtn_havayoluActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("ULAŞIM TÜRÜNÜ SEÇİNİZ.");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("FİRMA");

        jComboBox_firmalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_firmalarActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton_gidis);
        jRadioButton_gidis.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton_gidis.setForeground(new java.awt.Color(0, 51, 153));
        jRadioButton_gidis.setText("GİDİŞ");
        jRadioButton_gidis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_gidisActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton_gidisDonus);
        jRadioButton_gidisDonus.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jRadioButton_gidisDonus.setForeground(new java.awt.Color(0, 51, 153));
        jRadioButton_gidisDonus.setText("GİDİŞ-DÖNÜŞ");
        jRadioButton_gidisDonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_gidisDonusActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("GİDİŞ TARİHİ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("DÖNÜŞ TARİHİ");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("NEREDEN");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("NEREYE");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("KİŞİ SAYISI");

        btn_ileri.setBackground(new java.awt.Color(0, 51, 153));
        btn_ileri.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btn_ileri.setForeground(new java.awt.Color(255, 255, 255));
        btn_ileri.setText("İLERİ");
        btn_ileri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ileriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_ileri, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser_donus, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox_firmalar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(radiobtn_otobus)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radiobtn_havayolu))
                                .addComponent(jLabel1))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinner_kisiSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser_gidis, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(29, 29, 29)
                                .addComponent(jComboBox_nereden, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_nereye, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jRadioButton_gidis)
                                .addGap(41, 41, 41)
                                .addComponent(jRadioButton_gidisDonus)))
                        .addGap(0, 202, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtn_otobus)
                    .addComponent(radiobtn_havayolu))
                .addGap(34, 34, 34)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox_firmalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_gidis)
                    .addComponent(jRadioButton_gidisDonus))
                .addGap(45, 45, 45)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser_gidis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jComboBox_nereden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jComboBox_nereye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jDateChooser_donus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinner_kisiSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btn_ileri, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1040, 590));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        setVisible(false); //you can't see me!
        dispose();
        new IslemSec().setVisible(true);
    }//GEN-LAST:event_jLabel12MousePressed

    private void radiobtn_otobusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_otobusActionPerformed
        buttonGroup2.clearSelection();
        jComboBox_firmalar.removeAllItems();
        jComboBox_firmalar.setEnabled(true);
        jRadioButton_gidis.setEnabled(true);

        jRadioButton_gidisDonus.setEnabled(true);

        if (radiobtn_otobus.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT *FROM SEFER WHERE SEFER_TIPI='OTOBUS'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String value = rs.getString("FIRMA");
                    jComboBox_firmalar.addItem(value);

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jComboBox_firmalar.setEnabled(false);
            jRadioButton_gidis.setEnabled(false);
            jRadioButton_gidisDonus.setEnabled(false);

        }

    }//GEN-LAST:event_radiobtn_otobusActionPerformed

    private void radiobtn_havayoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiobtn_havayoluActionPerformed
        buttonGroup2.clearSelection();
        jComboBox_firmalar.removeAllItems();
        jComboBox_firmalar.setEnabled(true);
        jRadioButton_gidis.setEnabled(true);

        jRadioButton_gidisDonus.setEnabled(true);

        if (radiobtn_havayolu.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT *FROM SEFER WHERE SEFER_TIPI='UCAK'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String value = rs.getString("FIRMA");
                    jComboBox_firmalar.addItem(value);

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jComboBox_firmalar.setEnabled(false);
            jRadioButton_gidis.setEnabled(false);
            jRadioButton_gidisDonus.setEnabled(false);

        }
    }//GEN-LAST:event_radiobtn_havayoluActionPerformed

    private void jRadioButton_gidisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_gidisActionPerformed
        jComboBox_nereden.setEnabled(true);
        btn_ileri.setEnabled(true);
        jDateChooser_gidis.setEnabled(true);
        jComboBox_nereye.setEnabled(true);
        jSpinner_kisiSayisi.setEnabled(true);
        jDateChooser_donus.setEnabled(false);
        jComboBox_nereden.removeAllItems();
        if (jRadioButton_gidis.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT * FROM SEFER WHERE YON='GIDIS'  AND FIRMA='" + jComboBox_firmalar.getSelectedItem().toString() + "'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String value = rs.getString("NEREDEN");
                    jComboBox_nereden.addItem(value);
                    String value2 = rs.getString("NEREYE");
                    jComboBox_nereye.addItem(value2);

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jComboBox_firmalar.setEnabled(false);
            jRadioButton_gidis.setEnabled(false);
            jRadioButton_gidisDonus.setEnabled(false);

        }
    }//GEN-LAST:event_jRadioButton_gidisActionPerformed

    private void jRadioButton_gidisDonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_gidisDonusActionPerformed
        jComboBox_nereden.removeAllItems();
        jComboBox_nereden.setEnabled(true);
        jComboBox_nereye.setEnabled(true);
        jDateChooser_gidis.setEnabled(true);
        jDateChooser_donus.setEnabled(true);
        jSpinner_kisiSayisi.setEnabled(true);
        btn_ileri.setEnabled(true);

        if (jRadioButton_gidisDonus.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT * FROM SEFER WHERE YON='GIDIS-DONUS' AND FIRMA='" + jComboBox_firmalar.getSelectedItem().toString() + "'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String value = rs.getString("NEREYE");

                    jComboBox_nereye.addItem(value);

                    String value2 = rs.getString("NEREDEN");
                    jComboBox_nereden.addItem(value2);

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            jComboBox_firmalar.setEnabled(false);
            jRadioButton_gidis.setEnabled(false);
            jRadioButton_gidisDonus.setEnabled(false);

        }
    }//GEN-LAST:event_jRadioButton_gidisDonusActionPerformed

    private void btn_ileriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ileriActionPerformed

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        String gidisTarihi = sdf.format(jDateChooser_gidis.getDate());
        String donusTarihi = "";
        boolean seferVarMi = false;

        if (jRadioButton_gidisDonus.isSelected()) {
            donusTarihi = sdf.format(jDateChooser_donus.getDate());
        }

        
        if (jRadioButton_gidisDonus.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT * FROM SEFER WHERE YON='GIDIS-DONUS' AND FIRMA='" + jComboBox_firmalar.getSelectedItem().toString()
                        + "' AND GIDIS_TARIHI='" + gidisTarihi + "' AND DONUS_TARIHI='" + donusTarihi + "'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    seferVarMi = true;

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (jRadioButton_gidis.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT * FROM SEFER WHERE YON='GIDIS' AND FIRMA='" + jComboBox_firmalar.getSelectedItem().toString()
                        + "' AND GIDIS_TARIHI='" + gidisTarihi + "'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    seferVarMi = true;

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (seferVarMi) {

            String info[]=new String[7];  
            info[0]=jComboBox_firmalar.getSelectedItem().toString();
            if (jRadioButton_gidis.isSelected()) {
                info[1]="GIDIS";
                info[4]=gidisTarihi;
            }
            else if (jRadioButton_gidisDonus.isSelected()) {
                info[1]="GIDIS-DONUS";
                info[4]=gidisTarihi;
                info[5]=donusTarihi;
            }
            info[2]=jComboBox_nereden.getSelectedItem().toString();
            info[3]=jComboBox_nereye.getSelectedItem().toString();
            info[6]=jSpinner_kisiSayisi.getValue().toString();
            
            SonuclariListele.getInfo(info);
            
            
//            int kisiSayisi = (Integer)jSpinner_kisiSayisi.getValue();
//            KayitYap.getInfo(kisiSayisi);
                    
            setVisible(false);
            dispose();
            
            new SonuclariListele().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Aradığınız Özelliklerde Sefer Bulunmamaktadır.");
        }

    }//GEN-LAST:event_btn_ileriActionPerformed

    private void jComboBox_firmalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_firmalarActionPerformed
        jComboBox_nereden.removeAllItems();
        jComboBox_nereye.removeAllItems();
        if (jRadioButton_gidis.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT * FROM SEFER WHERE YON='GIDIS' AND FIRMA='" + jComboBox_firmalar.getSelectedItem().toString() + "'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String value = rs.getString("NEREDEN");
                    jComboBox_nereden.addItem(value);
                    String value2 = rs.getString("NEREYE");
                    jComboBox_nereye.addItem(value2);

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        if (jRadioButton_gidisDonus.isSelected()) {
            try {

                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/SeyahatAcentesiDB", "sa", "as");
                String sorgu = "SELECT * FROM SEFER WHERE YON='GIDIS-DONUS' AND FIRMA='" + jComboBox_firmalar.getSelectedItem().toString() + "'";

                PreparedStatement stmt = con.prepareStatement(sorgu);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {

                    String value = rs.getString("NEREYE");
                    jComboBox_nereye.addItem(value);

                    String value2 = rs.getString("NEREDEN");
                    jComboBox_nereden.addItem(value2);

                }

            } catch (SQLException ex) {
                Logger.getLogger(GirisYap.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jComboBox_firmalarActionPerformed

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
            java.util.logging.Logger.getLogger(UlasimSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UlasimSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UlasimSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UlasimSec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UlasimSec().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ileri;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> jComboBox_firmalar;
    private javax.swing.JComboBox<String> jComboBox_nereden;
    private javax.swing.JComboBox<String> jComboBox_nereye;
    private com.toedter.calendar.JDateChooser jDateChooser_donus;
    private com.toedter.calendar.JDateChooser jDateChooser_gidis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton_gidis;
    private javax.swing.JRadioButton jRadioButton_gidisDonus;
    private javax.swing.JSpinner jSpinner_kisiSayisi;
    private javax.swing.JRadioButton radiobtn_havayolu;
    private javax.swing.JRadioButton radiobtn_otobus;
    // End of variables declaration//GEN-END:variables
}
