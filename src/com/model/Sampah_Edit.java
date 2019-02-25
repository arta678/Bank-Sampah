/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author artawgn
 */
public class Sampah_Edit extends javax.swing.JDialog {

    /**
     * Creates new form Nas_tambah
     */
    public Sampah_Edit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edit_kode_sampah = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edit_jenis_sampah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        edit_harga1_sampah = new javax.swing.JTextField();
        btn_simpan_sampah = new java.awt.Button();
        btn_tutup = new java.awt.Button();
        txt_id_edit_sampah = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edit_harga2_sampah = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        edit_hargar_pengepul_sampah = new javax.swing.JTextField();
        edit_kategori_sampah = new javax.swing.JComboBox();
        edit_stok = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jPanel2.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setBackground(new java.awt.Color(0, 112, 192));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EDIT DATA SAMPAH");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/icons8_Multiply_25px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel2.setText("Kode Sampah");

        edit_kode_sampah.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        edit_kode_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_kode_sampahActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel3.setText("Kategori");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel4.setText("Jenis Sampah");

        edit_jenis_sampah.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        edit_jenis_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_jenis_sampahActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel5.setText("Harga DHS1");

        edit_harga1_sampah.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        edit_harga1_sampah.setToolTipText("DHS1 = harga jika sampah diwaba oleh nasabah");
        edit_harga1_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_harga1_sampahActionPerformed(evt);
            }
        });

        btn_simpan_sampah.setBackground(new java.awt.Color(0, 112, 192));
        btn_simpan_sampah.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btn_simpan_sampah.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan_sampah.setLabel("Simpan");
        btn_simpan_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpan_sampahActionPerformed(evt);
            }
        });

        btn_tutup.setBackground(new java.awt.Color(255, 51, 0));
        btn_tutup.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btn_tutup.setForeground(new java.awt.Color(255, 255, 255));
        btn_tutup.setLabel("Tutup");
        btn_tutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tutupActionPerformed(evt);
            }
        });

        txt_id_edit_sampah.setBackground(new java.awt.Color(255, 255, 255));
        txt_id_edit_sampah.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_edit_sampah.setText("jLabel7");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel6.setText("Harga DHS2");

        edit_harga2_sampah.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        edit_harga2_sampah.setToolTipText("DHS2 = Harga jika sampah dijemput oleh bank sampah");
        edit_harga2_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_harga2_sampahActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel7.setText("Harga ke Pengepul");

        edit_hargar_pengepul_sampah.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        edit_hargar_pengepul_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_hargar_pengepul_sampahActionPerformed(evt);
            }
        });

        edit_kategori_sampah.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        edit_kategori_sampah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Plastik", "Kertas", "Logam", " " }));

        edit_stok.setBackground(new java.awt.Color(255, 255, 255));
        edit_stok.setForeground(new java.awt.Color(255, 255, 255));
        edit_stok.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_simpan_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(edit_kategori_sampah, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(edit_jenis_sampah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edit_harga1_sampah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edit_harga2_sampah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(edit_hargar_pengepul_sampah, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edit_kode_sampah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_id_edit_sampah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(edit_stok)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_kode_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_kategori_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_jenis_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_harga1_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_harga2_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edit_hargar_pengepul_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_edit_sampah)
                    .addComponent(edit_stok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_simpan_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_tutup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btn_simpan_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpan_sampahActionPerformed

        String kategori = null;
        int i = edit_kategori_sampah.getSelectedIndex();
        switch (i) {
            case 0:
                kategori = "Plastik";

                break;
            case 1:
                kategori = "Kertas";

                break;
            case 2:
                kategori = "Logam";

                break;
            case 3:
                kategori = "Tembaga";

                break;

        }

        if (this.edit_kode_sampah.getText().length() == 0
                || this.edit_kode_sampah.getText().length() == 0
                || this.edit_jenis_sampah.getText().length() == 0
                || this.edit_harga1_sampah.getText().length() == 0) {

            JOptionPane.showMessageDialog(this,
                    "Semua harus diisi", "INFO", JOptionPane.WARNING_MESSAGE);

        } else {

            Query s = new Query();
            s.setId_samp(this.txt_id_edit_sampah.getText());
            s.setKode_samp(this.edit_kode_sampah.getText());
            s.setKategori(kategori);
            s.setNama_samp(this.edit_jenis_sampah.getText());
            s.setHarga_1(this.edit_harga1_sampah.getText());
            s.setHarga_2(this.edit_harga2_sampah.getText());
            s.setHarga_pgul(this.edit_hargar_pengepul_sampah.getText());
            s.setStok(this.edit_stok.getText());
            

    
            if (Fungsi.updateSampah(s)) {
                Fungsi.Tabel_sampah("");
                JOptionPane.showMessageDialog(this,
                        "Data sampah sudah diperbaharui !", "SUKSES", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this,
                        "Data sampah gagal diperbaharui !", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
        this.dispose();
    }//GEN-LAST:event_btn_simpan_sampahActionPerformed

    private void edit_kode_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_kode_sampahActionPerformed
//        txt_nama.requestFocus();
    }//GEN-LAST:event_edit_kode_sampahActionPerformed

    private void edit_jenis_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_jenis_sampahActionPerformed
        edit_harga1_sampah.requestFocus();
    }//GEN-LAST:event_edit_jenis_sampahActionPerformed

    private void edit_harga1_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_harga1_sampahActionPerformed
        btn_simpan_sampah.requestFocus();
    }//GEN-LAST:event_edit_harga1_sampahActionPerformed

    private void btn_tutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tutupActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_tutupActionPerformed

    private void edit_harga2_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_harga2_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_harga2_sampahActionPerformed

    private void edit_hargar_pengepul_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_hargar_pengepul_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edit_hargar_pengepul_sampahActionPerformed

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
            java.util.logging.Logger.getLogger(Sampah_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sampah_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sampah_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sampah_Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sampah_Edit dialog = new Sampah_Edit(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_simpan_sampah;
    private java.awt.Button btn_tutup;
    private javax.swing.ButtonGroup buttonGroup1;
    public static javax.swing.JTextField edit_harga1_sampah;
    public static javax.swing.JTextField edit_harga2_sampah;
    public static javax.swing.JTextField edit_hargar_pengepul_sampah;
    public static javax.swing.JTextField edit_jenis_sampah;
    public static javax.swing.JComboBox edit_kategori_sampah;
    public static javax.swing.JTextField edit_kode_sampah;
    public static javax.swing.JLabel edit_stok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel txt_id_edit_sampah;
    // End of variables declaration//GEN-END:variables
}
