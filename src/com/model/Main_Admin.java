/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.util.*;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JTextFieldDateEditor;
import com.koneksi.Konek;
import static com.model.Main.tabel_nasabah;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import sun.awt.X11.XConstants;

/**
 *
 * @author artawgn
 *
 */
class Main_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
//    public Konek con = new Konek();
//    public Connection konek = con.getKonek();
    public Konek con = new Konek();
    public Connection konek = con.getKonek();

    int[] tab = new int[10];
    Suara suara;
    Date date = new Date();
    String tglFrom, tglUntil;
    JasperDesign jasperDesign;
    JasperReport jasperReport;
    JasperPrint jasperPrint;
    Map<String, Object> param = new HashMap<String, Object>();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public Main_Admin() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //Menubar
        setColor(btn_1);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_7});

        Fungsi.Tabel_petugas("");
        Fungsi.Tabel_admin_setoran("");
//        Petugas_tambah.txt_id.setText(Fungsi.extraeIDMax());
        

//        //isi
//        Fungsi.Tabel_nasabah("");
//        Fungsi.Tabel_sampah("");
//        Fungsi.Tabel_Simpanan("");
//        Fungsi.Tabel_penarikan("");
//        Fungsi.Tabel_Penjualan("");
//        
//        Fungsi.Tabel_laporan_tabungan("");
//        Fungsi.jumlahNasbah();
//        txt_button_datang.setSelected(true);
////        laporan_date_dari.setDateFormatString("yyyy-MM-dd");
////        laporan_date_sampai.setDateFormatString("yyyy-MM-dd");
////        tglFrom = format.format(laporan_date_dari.getDate());
////        tglUntil = format.format(laporan_date_sampai.getDate());
//
//        //Menampilkan Jumlah transaksi, jumlah total sampah,jumlah nasabah di menu home
////        labelSampah.setText(Float.toString(totalSampah()));
////        labelNasabah.setText(Integer.toString(jumlahNasabah()));
////        labelTransaksi.setText(Integer.toString(jumlahtransaksi()));
//        txt_date.setDate(date);
//        txt_date1.setDate(date);
//        laporan_date_dari.setDate(date);
//        laporan_date_dari2.setDate(date);
        txt_date_penjualan.setDate(date);

//        tabel_nasabah.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent evt) {
//                if (evt.getClickCount() == 2) {
//                    Point pnt = evt.getPoint();
//                    int row = tabel_nasabah.rowAtPoint(pnt);
//
//                    try {
//                        int baris = tabel_nasabah.getSelectedRow();
//
//                        tampil_detail_nasabah();
//
//                    } catch (Exception e) {
//                        System.out.println(e);
//
//                    }
//                    //do something
//                } else {
//                    //do something else
//                }
//            }
//
//        });
//        tabel_sampah.addMouseListener(new MouseAdapter() {
//            public void mouseClicked(MouseEvent evt) {
//                if (evt.getClickCount() == 2) {
//                    Point pnt = evt.getPoint();
//                    int row = tabel_sampah.rowAtPoint(pnt);
//
//                    try {
//                        int baris = tabel_sampah.getSelectedRow();
//
//                        tampil_detail_sampah();
//
//                    } catch (Exception e) {
//                        System.out.println(e);
//
//                    }
//                    //do something
//                } else {
//                    //do something else
//                }
//            }
//
//        });
        //Disabel
//        tabung_nama_nasabah.setEnabled(false);
//        tabung_jenis_sampah.setEnabled(false);
//        tabung_total.setEnabled(false);
    }

//    public float totalSampah() {
//        float jumlahBaris = tabel_sampah.getRowCount();
//        float sum = 0;
//        for (float i = 0; i < jumlahBaris; i++) {
//            sum = sum + Float.parseFloat(tabel_sampah.getValueAt((int) i, 3).toString());
//
//        }
//        return sum;
//
//    }
//    public int jumlahNasabah() {
//        int jumlahbaris = tabel_nasabah.getRowCount();
//        return jumlahbaris;
//    }
    public int jumlahtransaksi() {
        int jumlahbaris = tabel_admin_setoran.getRowCount();
        return jumlahbaris;
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
        backgound = new javax.swing.JPanel();
        menubar = new javax.swing.JPanel();
        btn_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btn_8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tabpane = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        pane_home = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelTransaksi = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        labelNasabah = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        labelSampah = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nama_user = new javax.swing.JLabel();
        main_id_user = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        rSButtonHover11 = new rojerusan.RSButtonHover();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        penjualan_id_pengepul = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        penjualan_id_sampah = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        penjualan_nama_sampah = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        penjualan_harga_sampah = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        penjualan_stok_sampah = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        penjualan_jumlah_sampah = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        txt_date_penjualan = new com.toedter.calendar.JDateChooser();
        penjualan_total_penjualan_sampah = new javax.swing.JLabel();
        txt_simpan_tabungan2 = new rojerusan.RSButtonHover();
        txt_id_sim2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabel_penjualan = new rojerusan.RSTableMetro();
        jLabel85 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        rSButtonHover34 = new rojerusan.RSButtonHover();
        rSButtonHover36 = new rojerusan.RSButtonHover();
        jPanel22 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_admin_setoran = new rojerusan.RSTableMetro();
        jLabel63 = new javax.swing.JLabel();
        rSButtonHover4 = new rojerusan.RSButtonHover();
        rSButtonHover5 = new rojerusan.RSButtonHover();
        jPanel53 = new javax.swing.JPanel();
        main_password_confirmasi = new javax.swing.JPasswordField();
        main_admin_nama_ganti_password = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_petugas = new rojerusan.RSTableMetro();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        rSButtonHover3 = new rojerusan.RSButtonHover();
        jLabel5 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        backgound.setBackground(new java.awt.Color(35, 45, 59));
        backgound.setPreferredSize(new java.awt.Dimension(1000, 859));

        menubar.setBackground(new java.awt.Color(35, 45, 59));

        btn_1.setBackground(new java.awt.Color(35, 45, 59));
        btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_1MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/home (1).png"))); // NOI18N
        jLabel1.setText(" Home");

        javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
        btn_1.setLayout(btn_1Layout);
        btn_1Layout.setHorizontalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(0, 115, Short.MAX_VALUE))
        );
        btn_1Layout.setVerticalGroup(
            btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_2.setBackground(new java.awt.Color(35, 45, 59));
        btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_2MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_2MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/garbage2.png"))); // NOI18N
        jLabel2.setText(" Setoran");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        btn_2Layout.setVerticalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_3.setBackground(new java.awt.Color(35, 45, 59));
        btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_3MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_3MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/truk2.png"))); // NOI18N
        jLabel3.setText(" Penjualan");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        btn_3Layout.setVerticalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_4.setBackground(new java.awt.Color(35, 45, 59));
        btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_4MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_4MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/user.png"))); // NOI18N
        jLabel4.setText("Petugas");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(0, 104, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/banksampah.png"))); // NOI18N

        btn_7.setBackground(new java.awt.Color(35, 45, 59));
        btn_7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_7MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_7MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/setting.png"))); // NOI18N
        jLabel16.setText(" Password");

        javax.swing.GroupLayout btn_7Layout = new javax.swing.GroupLayout(btn_7);
        btn_7.setLayout(btn_7Layout);
        btn_7Layout.setHorizontalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel16)
                .addGap(0, 64, Short.MAX_VALUE))
        );
        btn_7Layout.setVerticalGroup(
            btn_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        btn_8.setBackground(new java.awt.Color(35, 45, 59));
        btn_8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_8MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_8MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_8MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/logout.png"))); // NOI18N
        jLabel17.setText(" Keluar");

        javax.swing.GroupLayout btn_8Layout = new javax.swing.GroupLayout(btn_8);
        btn_8.setLayout(btn_8Layout);
        btn_8Layout.setHorizontalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addGap(0, 111, Short.MAX_VALUE))
        );
        btn_8Layout.setVerticalGroup(
            btn_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bank Sampah Bali Kumara");

        Tabpane.setBackground(new java.awt.Color(35, 45, 59));
        Tabpane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Tabpane.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        pane_home.setBackground(new java.awt.Color(35, 45, 59));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/hacking(2).png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("KELOLA");

        jPanel6.setBackground(new java.awt.Color(20, 32, 134));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel6MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Lihat Transaksi");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TRANSAKSI");

        labelTransaksi.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        labelTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        labelTransaksi.setText("1");

        jLabel19.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("X");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19))
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(jLabel19)))
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(255, 204, 51));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/networking.png"))); // NOI18N

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("DATA");

        labelNasabah.setFont(new java.awt.Font("Times New Roman", 1, 55)); // NOI18N
        labelNasabah.setForeground(new java.awt.Color(255, 255, 255));
        labelNasabah.setText("1");

        jPanel17.setBackground(new java.awt.Color(255, 102, 0));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel17MousePressed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Edit Petugas");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        jLabel115.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("Orang");

        jLabel116.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("PETUGAS");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(labelNasabah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel115))
                            .addComponent(jLabel114)
                            .addComponent(jLabel116))
                        .addGap(0, 66, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel114)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel116)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNasabah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel115)))
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(255, 83, 83));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/garbage.png"))); // NOI18N

        jPanel30.setBackground(new java.awt.Color(204, 0, 0));
        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel30MousePressed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Lihat Sampah");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel110.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Total Berat");

        jLabel111.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Sampah");

        labelSampah.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        labelSampah.setForeground(new java.awt.Color(255, 255, 255));
        labelSampah.setText("1");

        jLabel42.setFont(new java.awt.Font("DejaVu Sans", 1, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Kg");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111)
                    .addComponent(jLabel110)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(labelSampah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelSampah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel42)))
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/icons8_Multiply_25px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(206, 206, 206))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel9))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Selamat Datang,");

        nama_user.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        nama_user.setForeground(new java.awt.Color(255, 255, 255));
        nama_user.setText("ADMIN");

        main_id_user.setForeground(new java.awt.Color(35, 45, 59));
        main_id_user.setText("id_user");

        javax.swing.GroupLayout pane_homeLayout = new javax.swing.GroupLayout(pane_home);
        pane_home.setLayout(pane_homeLayout);
        pane_homeLayout.setHorizontalGroup(
            pane_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pane_homeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nama_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main_id_user)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pane_homeLayout.setVerticalGroup(
            pane_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pane_homeLayout.createSequentialGroup()
                .addGroup(pane_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pane_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(nama_user))
                    .addComponent(main_id_user, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pane_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        Tabpane.addTab(".", jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 992, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabpane.addTab("setoran", jPanel9);

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonHover11.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover11.setText("<< KEMBALI");
        rSButtonHover11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover11MouseClicked(evt);
            }
        });
        rSButtonHover11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover11ActionPerformed(evt);
            }
        });

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel39.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel39AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel40.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );

        jPanel41.setBackground(new java.awt.Color(204, 204, 255));

        jLabel78.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel78.setText("Nama Pengepul");

        penjualan_id_pengepul.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        penjualan_id_pengepul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualan_id_pengepulActionPerformed(evt);
            }
        });
        penjualan_id_pengepul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                penjualan_id_pengepulKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                penjualan_id_pengepulKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                penjualan_id_pengepulKeyReleased(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(136, 135, 135));
        jLabel79.setText("ID Sampah");

        penjualan_id_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penjualan_id_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualan_id_sampahActionPerformed(evt);
            }
        });

        jLabel80.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(136, 135, 135));
        jLabel80.setText("Jenis Sampah");

        penjualan_nama_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penjualan_nama_sampah.setEnabled(false);
        penjualan_nama_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualan_nama_sampahActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(136, 135, 135));
        jLabel81.setText("Harga Sampah");

        penjualan_harga_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penjualan_harga_sampah.setEnabled(false);
        penjualan_harga_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualan_harga_sampahActionPerformed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(136, 135, 135));
        jLabel82.setText("Stok (Kg)");

        penjualan_stok_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penjualan_stok_sampah.setEnabled(false);
        penjualan_stok_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualan_stok_sampahActionPerformed(evt);
            }
        });

        jLabel83.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(136, 135, 135));
        jLabel83.setText("Jumlah Jual Kg");

        penjualan_jumlah_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penjualan_jumlah_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjualan_jumlah_sampahActionPerformed(evt);
            }
        });
        penjualan_jumlah_sampah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                penjualan_jumlah_sampahKeyTyped(evt);
            }
        });

        jButton1.setText("Lihat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(penjualan_jumlah_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel79)
                        .addComponent(penjualan_nama_sampah, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(penjualan_harga_sampah)
                        .addComponent(penjualan_id_pengepul)
                        .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(penjualan_stok_sampah)
                        .addComponent(jLabel81)
                        .addGroup(jPanel41Layout.createSequentialGroup()
                            .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(penjualan_id_sampah, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel82))
                    .addComponent(jLabel83))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penjualan_id_pengepul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penjualan_id_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penjualan_nama_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penjualan_harga_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penjualan_stok_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penjualan_jumlah_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel42.setBackground(new java.awt.Color(204, 204, 255));

        jLabel84.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel84.setText("Tanggal");

        txt_date_penjualan.setBackground(new java.awt.Color(255, 255, 255));
        txt_date_penjualan.setDateFormatString("yyyy-MM-dd");
        txt_date_penjualan.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        penjualan_total_penjualan_sampah.setForeground(new java.awt.Color(204, 204, 255));
        penjualan_total_penjualan_sampah.setText("jLabel72");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addGap(31, 31, 31)
                        .addComponent(penjualan_total_penjualan_sampah)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txt_date_penjualan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(217, 217, 217))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(penjualan_total_penjualan_sampah))
                .addGap(3, 3, 3)
                .addComponent(txt_date_penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txt_simpan_tabungan2.setBackground(new java.awt.Color(115, 125, 206));
        txt_simpan_tabungan2.setText("Proses Jual");
        txt_simpan_tabungan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_simpan_tabungan2MouseClicked(evt);
            }
        });
        txt_simpan_tabungan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_simpan_tabungan2ActionPerformed(evt);
            }
        });

        txt_id_sim2.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sim2.setText("id_label");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_simpan_tabungan2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_sim2)
                            .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id_sim2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_simpan_tabungan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        tabel_penjualan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Pengepul", "Sampah", "Harga", "Kg", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_penjualan.setAltoHead(30);
        tabel_penjualan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_penjualan.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tabel_penjualan.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tabel_penjualan.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_penjualan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_penjualan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_penjualan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_penjualan.setRowHeight(23);
        jScrollPane5.setViewportView(tabel_penjualan);
        if (tabel_penjualan.getColumnModel().getColumnCount() > 0) {
            tabel_penjualan.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_penjualan.getColumnModel().getColumn(0).setMaxWidth(100);
            tabel_penjualan.getColumnModel().getColumn(4).setMinWidth(50);
            tabel_penjualan.getColumnModel().getColumn(4).setMaxWidth(50);
            tabel_penjualan.getColumnModel().getColumn(5).setMinWidth(60);
            tabel_penjualan.getColumnModel().getColumn(5).setMaxWidth(60);
        }

        jLabel85.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel85.setText("Histori Penjualan Sampah");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE))
                .addGap(9, 9, 9))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabpane.addTab("penjualan", jPanel12);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel61.setBackground(new java.awt.Color(248, 248, 248));
        jPanel61.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        rSButtonHover34.setBackground(new java.awt.Color(0, 0, 255));
        rSButtonHover34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/icons8_Lock_25px.png"))); // NOI18N
        rSButtonHover34.setText("Ganti Password");
        rSButtonHover34.setColorHover(new java.awt.Color(49, 49, 252));
        rSButtonHover34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover34ActionPerformed(evt);
            }
        });

        rSButtonHover36.setBackground(new java.awt.Color(0, 204, 0));
        rSButtonHover36.setText("PENGATURAN PENGGUNA APLIKASI");
        rSButtonHover36.setToolTipText("");
        rSButtonHover36.setColorHover(new java.awt.Color(134, 131, 131));
        rSButtonHover36.setEnabled(false);
        rSButtonHover36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover36, javax.swing.GroupLayout.DEFAULT_SIZE, 964, Short.MAX_VALUE)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(rSButtonHover34, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSButtonHover36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonHover34, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(575, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tabpane.addTab("gantipassword", jPanel1);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(116, 116, 116), 2));

        tabel_admin_setoran.setForeground(new java.awt.Color(0, 0, 0));
        tabel_admin_setoran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Setoran", "Tanggal", "ID Nas", "Sampah", "Harga ", "kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_admin_setoran.setToolTipText("");
        tabel_admin_setoran.setAltoHead(30);
        tabel_admin_setoran.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_admin_setoran.setColorBordeFilas(new java.awt.Color(172, 172, 172));
        tabel_admin_setoran.setColorBordeHead(new java.awt.Color(172, 172, 172));
        tabel_admin_setoran.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_admin_setoran.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_admin_setoran.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_admin_setoran.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_admin_setoran.setRowHeight(23);
        jScrollPane4.setViewportView(tabel_admin_setoran);
        if (tabel_admin_setoran.getColumnModel().getColumnCount() > 0) {
            tabel_admin_setoran.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_admin_setoran.getColumnModel().getColumn(0).setMaxWidth(100);
            tabel_admin_setoran.getColumnModel().getColumn(2).setMinWidth(75);
            tabel_admin_setoran.getColumnModel().getColumn(2).setMaxWidth(75);
            tabel_admin_setoran.getColumnModel().getColumn(4).setMinWidth(65);
            tabel_admin_setoran.getColumnModel().getColumn(4).setMaxWidth(65);
            tabel_admin_setoran.getColumnModel().getColumn(5).setMinWidth(50);
            tabel_admin_setoran.getColumnModel().getColumn(5).setMaxWidth(50);
            tabel_admin_setoran.getColumnModel().getColumn(6).setMinWidth(75);
            tabel_admin_setoran.getColumnModel().getColumn(6).setMaxWidth(75);
        }

        jLabel63.setFont(new java.awt.Font("Arial", 1, 40)); // NOI18N
        jLabel63.setText("DATA SETORAN");

        rSButtonHover4.setBackground(new java.awt.Color(255, 153, 0));
        rSButtonHover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/edit-document.png"))); // NOI18N
        rSButtonHover4.setText("EDIT");
        rSButtonHover4.setColorHover(new java.awt.Color(255, 102, 51));
        rSButtonHover4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        rSButtonHover4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonHover4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover4MouseClicked(evt);
            }
        });
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });

        rSButtonHover5.setBackground(new java.awt.Color(255, 0, 0));
        rSButtonHover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/rubbish-bin.png"))); // NOI18N
        rSButtonHover5.setText("HAPUS");
        rSButtonHover5.setColorHover(new java.awt.Color(255, 68, 68));
        rSButtonHover5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        rSButtonHover5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButtonHover5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover5MouseClicked(evt);
            }
        });
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                            .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Tabpane.addTab("setoran", jPanel22);

        main_password_confirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_password_confirmasiActionPerformed(evt);
            }
        });

        main_admin_nama_ganti_password.setText("jTextField1");

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(main_admin_nama_ganti_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(698, Short.MAX_VALUE))
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(414, 414, 414)
                    .addComponent(main_password_confirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(408, Short.MAX_VALUE)))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel53Layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(main_admin_nama_ganti_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(448, Short.MAX_VALUE))
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(351, 351, 351)
                    .addComponent(main_password_confirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );

        Tabpane.addTab("tab14", jPanel53);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabel_petugas.setForeground(new java.awt.Color(0, 0, 0));
        tabel_petugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nama", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_petugas.setToolTipText("klik 2x untuk melihat detil nasabah");
        tabel_petugas.setAltoHead(30);
        tabel_petugas.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_petugas.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tabel_petugas.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tabel_petugas.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_petugas.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_petugas.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_petugas.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_petugas.setRowHeight(23);
        jScrollPane1.setViewportView(tabel_petugas);
        if (tabel_petugas.getColumnModel().getColumnCount() > 0) {
            tabel_petugas.getColumnModel().getColumn(0).setMinWidth(50);
            tabel_petugas.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/user1.png"))); // NOI18N
        rSButtonHover1.setText("ADD");
        rSButtonHover1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover1MouseClicked(evt);
            }
        });
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        rSButtonHover2.setBackground(new java.awt.Color(255, 102, 0));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/edit-document.png"))); // NOI18N
        rSButtonHover2.setText("EDIT");
        rSButtonHover2.setColorHover(new java.awt.Color(243, 148, 84));
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        rSButtonHover3.setBackground(new java.awt.Color(255, 0, 0));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/rubbish-bin.png"))); // NOI18N
        rSButtonHover3.setText("DELETE");
        rSButtonHover3.setColorHover(new java.awt.Color(255, 77, 77));
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("DejaVu Sans", 1, 40)); // NOI18N
        jLabel5.setText("DATA PETUGAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        Tabpane.addTab("tab7", jPanel2);

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menubarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        menubarLayout.setVerticalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btn_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menubarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tabpane, javax.swing.GroupLayout.PREFERRED_SIZE, 761, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        jPanel15.setBackground(new java.awt.Color(35, 45, 59));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sistem Informasi Bank Sampah Bali Kumara");

        jPanel35.setBackground(new java.awt.Color(255, 51, 51));
        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel35MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("X");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel49))
        );

        jPanel36.setBackground(new java.awt.Color(0, 204, 0));
        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel36MouseClicked(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        jLabel50.setText("_");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(0, 7, Short.MAX_VALUE)
                .addComponent(jLabel50))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgoundLayout = new javax.swing.GroupLayout(backgound);
        backgound.setLayout(backgoundLayout);
        backgoundLayout.setHorizontalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backgoundLayout.setVerticalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menubar, javax.swing.GroupLayout.PREFERRED_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseClicked
        Tabpane.setSelectedIndex(0);
        setColor(btn_1);
//        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_7, btn_8});
        Fungsi.Tabel_sampah("");
        Fungsi.Tabel_nasabah("");
//        labelSampah.setText(Float.toString(totalSampah()));
//        labelNasabah.setText(Integer.toString(jumlahNasabah()));
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited

    }//GEN-LAST:event_btn_1MouseExited

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        Tabpane.setSelectedIndex(4);
        setColor(btn_2);
//        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_7});
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        Tabpane.setSelectedIndex(2);
        setColor(btn_3);
//        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_1, btn_4, btn_7, btn_8});
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        Tabpane.setSelectedIndex(6);
        setColor(btn_4);
//        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_7, btn_8});
        Fungsi.Tabel_petugas("");
    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed

    }//GEN-LAST:event_btn_2MousePressed

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked

        dialogPasswordAdmin dp = new dialogPasswordAdmin(this, true);
        dialogPasswordAdmin.confirmasi_password_jpassword.requestFocus();
        dp.setVisible(true);


    }//GEN-LAST:event_btn_7MouseClicked

    private void btn_7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_7MouseExited

    private void btn_1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MousePressed

    }//GEN-LAST:event_btn_1MousePressed

    private void btn_3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MousePressed

    }//GEN-LAST:event_btn_3MousePressed

    private void btn_4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MousePressed

    }//GEN-LAST:event_btn_4MousePressed

    private void btn_7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MousePressed
//        Tabpane.setSelectedIndex(6);

//        setColor(btn_7);
////        ind_4.setOpaque(true);
//        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_5, btn_4, btn_6, btn_8});
//        JOptionPane.showMessageDialog(this, "Maaf Fitur Pengaturan Hanya Untuk Admin !");
    }//GEN-LAST:event_btn_7MousePressed

    private void btn_8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MousePressed


    }//GEN-LAST:event_btn_8MousePressed

    private void btn_8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseClicked
//        Dialog_keluar keluar = new Dialog_keluar(this, true);
//        keluar.setVisible(true);

        setColor(btn_8);

        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_1, btn_7});
        int pesankeluar = JOptionPane.showOptionDialog(this, "Apakah Benar Ingin Keluar?", "Keluar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (pesankeluar == JOptionPane.YES_OPTION) {
            this.dispose();
            Login_user show = new Login_user(this, true);

            show.setVisible(true);
            Login_user.login_user_username.requestFocus();

        }


    }//GEN-LAST:event_btn_8MouseClicked

    private void btn_8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_8MouseExited

    private void jPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseClicked
        int pesankeluar = JOptionPane.showOptionDialog(this, "Apakah Benar Ingin Keluar?", "Keluar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (pesankeluar == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
    }//GEN-LAST:event_jPanel35MouseClicked

    private void jPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jPanel36MouseClicked

    private void jPanel39AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel39AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel39AncestorAdded

    private void txt_simpan_tabungan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_simpan_tabungan2ActionPerformed
        //        int pesankeluar = JOptionPane.showOptionDialog(this, "Apakah data-data sudah benar ?", "Konfirmasi menabung", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (this.penjualan_id_pengepul.getText().length() == 0
                || this.penjualan_id_sampah.getText().length() == 0
                || this.penjualan_jumlah_sampah.getText().length() == 0) {

            JOptionPane.showMessageDialog(this,
                    "Inputan ada yang kosong !", "Informasi", JOptionPane.WARNING_MESSAGE);

        } else {
            //            String hargaSampah = this.penjualan_harga_sampah.getText();
            //            String beratSampah = this.penjualan_jumlah_sampah.getText();

//            int harga = Integer.parseInt(penjualan_harga_sampah.getText());
//            int berat = Integer.parseInt(penjualan_jumlah_sampah.getText());
//            int hasil;
//            hasil = harga * berat;
//            String hasilString = String.valueOf(hasil);
            double harga = Double.valueOf(penjualan_harga_sampah.getText());
            double berat = Double.valueOf(penjualan_jumlah_sampah.getText());
            double hasil;
            hasil = harga * berat;
            String hasilString = String.valueOf(hasil);

            //            penjualan_total_penjualan_sampah.setText(hasilString);
            String nama_pengepul = penjualan_id_pengepul.getText();
            String nama_sampah = penjualan_nama_sampah.getText();
            String harga_sampah = penjualan_harga_sampah.getText();
            String stok_sampah = penjualan_stok_sampah.getText();
            String jumlah_jual = penjualan_jumlah_sampah.getText();
            //            String total_penjualan= penjualan_total_penjualan_sampah.getText();

            int pesankeluar = JOptionPane.showOptionDialog(this, "Apakah Data sudah benar ?"
                    + "\n"
                    + "\nPengepul   : " + nama_pengepul
                    + "\nSampah     : " + nama_sampah
                    + "\nHarga      : " + harga_sampah
                    + "\nKg         : " + jumlah_jual
                    + "\nTotal Penjualan : " + hasilString
                    + "\n"
                    + "\nKlik yes untuk proses penjualan", "Konfirmasi Penjualan", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
            if (pesankeluar == JOptionPane.YES_OPTION) {

                tampahPenjualan();
                //                clean_penjualan();

            }

        }

    }//GEN-LAST:event_txt_simpan_tabungan2ActionPerformed

    private void txt_simpan_tabungan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_simpan_tabungan2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_simpan_tabungan2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tabpane.setSelectedIndex(3);
        setColor(btn_4);
        //        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_7});
    }//GEN-LAST:event_jButton1ActionPerformed

    private void penjualan_jumlah_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualan_jumlah_sampahActionPerformed
        txt_simpan_tabungan2ActionPerformed(evt);
    }//GEN-LAST:event_penjualan_jumlah_sampahActionPerformed

    private void penjualan_stok_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualan_stok_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penjualan_stok_sampahActionPerformed

    private void penjualan_harga_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualan_harga_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penjualan_harga_sampahActionPerformed

    private void penjualan_nama_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualan_nama_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penjualan_nama_sampahActionPerformed

    private void penjualan_id_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualan_id_sampahActionPerformed
        try {

            Connection konek = con.getKonek();
            String sql = "SELECT * FROM sampah WHERE kode_samp = '" + penjualan_id_sampah.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                penjualan_nama_sampah.setText(rs.getString("nama_samp"));
                penjualan_harga_sampah.setText(rs.getString("harga_pgul"));
                penjualan_stok_sampah.setText(rs.getString("stok"));
                penjualan_jumlah_sampah.setText(rs.getString("stok"));
                //                                txt_alamat_nasabah.setText(rs.getString("username"));
                //                txt_noHp.setText(rs.getString("password"));

            }

            penjualan_jumlah_sampah.requestFocus();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_penjualan_id_sampahActionPerformed

    private void penjualan_id_pengepulKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penjualan_id_pengepulKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_penjualan_id_pengepulKeyReleased

    private void penjualan_id_pengepulKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penjualan_id_pengepulKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_penjualan_id_pengepulKeyPressed

    private void penjualan_id_pengepulKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penjualan_id_pengepulKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_penjualan_id_pengepulKeyTyped

    private void penjualan_id_pengepulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjualan_id_pengepulActionPerformed
        penjualan_id_sampah.requestFocus();
    }//GEN-LAST:event_penjualan_id_pengepulActionPerformed

    private void rSButtonHover11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover11ActionPerformed
        Tabpane.setSelectedIndex(0);
        setColor(btn_1);
        //        ind_1.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_7});        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11ActionPerformed

    private void rSButtonHover11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int pesankeluar = JOptionPane.showOptionDialog(this, "Apakah Benar Ingin Keluar?", "Keluar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (pesankeluar == JOptionPane.YES_OPTION) {
            System.exit(0);

        }
        //        Dialog_keluar keluar = new Dialog_keluar(this, true);
        //        keluar.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MousePressed
        Tabpane.setSelectedIndex(3);

        setColor(btn_4);
        //        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_7});
    }//GEN-LAST:event_jPanel30MousePressed

    private void jPanel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MousePressed
        Tabpane.setSelectedIndex(2);
        setColor(btn_3);
        //        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_1, btn_4, btn_7});
    }//GEN-LAST:event_jPanel17MousePressed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        Tabpane.setSelectedIndex(1);
        setColor(btn_2);
        //        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_7});
    }//GEN-LAST:event_jPanel6MousePressed

    private void rSButtonHover34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover34ActionPerformed
        gantiPasswordAdmin gp = new gantiPasswordAdmin(this, true);
        gantiPasswordAdmin.gantipassword_id_user.setText(Main_Admin.main_id_user.getText());
        gantiPasswordAdmin.gantipassword_username_admin.setText(Main_Admin.nama_user.getText());
//gantiPasswordAdmin.gantipassword_nama_admin.setText(Main_Admin.nama_user.getText());
        gantiPasswordAdmin.gantipassword_nama_admin.setText(Main_Admin.main_admin_nama_ganti_password.getText());

        gantiPasswordAdmin.gantipassword_baru_admin.requestFocus();
        gp.setVisible(true);

    }//GEN-LAST:event_rSButtonHover34ActionPerformed

    private void rSButtonHover36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover36ActionPerformed

    private void main_password_confirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_password_confirmasiActionPerformed

    }//GEN-LAST:event_main_password_confirmasiActionPerformed

    private void penjualan_jumlah_sampahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penjualan_jumlah_sampahKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE || (karakter == KeyEvent.VK_ENTER))))) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Hanya Boleh Memasukkan Angka !");

        }
    }//GEN-LAST:event_penjualan_jumlah_sampahKeyTyped

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        //        suara.clickLogin();
        //        Nas_tambah tambah = new Nas_tambah(this, true);
        //        tambah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover1MouseClicked

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        //        this.suara.clickLogin();
        Petugas_tambah tambah = new Petugas_tambah(this, true);
        tambah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed

        proses_penampilan_edit_petugas();
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        try {
            int baris = tabel_petugas.getSelectedRow();

            Query s = new Query();
            s.setId_user(tabel_petugas.getValueAt(baris, 0).toString());
//            ts.clickWarning();
            if (JOptionPane.showConfirmDialog(this, "Apakah Benar Ingin Menggapus?", "",
                    JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {

                if (Fungsi.hapus_Petugas(s)) {
//                    ts.clickGo();
//                Fungsi.setDaftarNasabah_2("");
                   Fungsi.Tabel_petugas("");
                    JOptionPane.showMessageDialog(this,
                            "Data Nasabah Berhasil Dihapus", "INFO", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Gagal Menghapus", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                //            this.dispose();

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void rSButtonHover4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover4MouseClicked
        //        suara.clickLogin();
        //        Nas_tambah tambah = new Nas_tambah(this, true);
        //        tambah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover4MouseClicked

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        //        this.suara.clickLogin();
        Nas_tambah tambah = new Nas_tambah(this, true);
        tambah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5MouseClicked

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane Tabpane;
    private javax.swing.JPanel backgound;
    public static javax.swing.JPanel btn_1;
    public static javax.swing.JPanel btn_2;
    public static javax.swing.JPanel btn_3;
    public static javax.swing.JPanel btn_4;
    public static javax.swing.JPanel btn_7;
    public static javax.swing.JPanel btn_8;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelNasabah;
    private javax.swing.JLabel labelSampah;
    private javax.swing.JLabel labelTransaksi;
    public static javax.swing.JTextField main_admin_nama_ganti_password;
    public static javax.swing.JLabel main_id_user;
    public static javax.swing.JPasswordField main_password_confirmasi;
    private javax.swing.JPanel menubar;
    public static javax.swing.JLabel nama_user;
    private javax.swing.JPanel pane_home;
    private javax.swing.JTextField penjualan_harga_sampah;
    private javax.swing.JTextField penjualan_id_pengepul;
    private javax.swing.JTextField penjualan_id_sampah;
    private javax.swing.JTextField penjualan_jumlah_sampah;
    private javax.swing.JTextField penjualan_nama_sampah;
    private javax.swing.JTextField penjualan_stok_sampah;
    private javax.swing.JLabel penjualan_total_penjualan_sampah;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSButtonHover rSButtonHover11;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSButtonHover rSButtonHover3;
    private rojerusan.RSButtonHover rSButtonHover34;
    private rojerusan.RSButtonHover rSButtonHover36;
    private rojerusan.RSButtonHover rSButtonHover4;
    private rojerusan.RSButtonHover rSButtonHover5;
    public static rojerusan.RSTableMetro tabel_admin_setoran;
    public static rojerusan.RSTableMetro tabel_penjualan;
    public static rojerusan.RSTableMetro tabel_petugas;
    private com.toedter.calendar.JDateChooser txt_date_penjualan;
    private javax.swing.JLabel txt_id_sim2;
    private rojerusan.RSButtonHover txt_simpan_tabungan2;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel pane) {
//        pane.setBackground(new Color(69, 85, 107));
        pane.setBackground(new Color(108, 120, 136));
    }

    private void resetColor(JPanel[] pane) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(35, 45, 59));

        }
    }

    private void clean_tabungan() {
//        tabung_banyak_sampah.setText("");
//        tabung_harga_sampah.setText("");
//        tabung_id_nasabah.setText("");
//        tabung_id_sampah.setText("");
//        tabung_nama_nasabah.setText("");
//        tabung_total.setText("");
//        tabung_jenis_sampah.setText("");
//        tabung_id_nasabah.requestFocus();
    }

    private void tambahSimpanan() {
//        try {
//
//            String hargaSampah = this.tabung_harga_sampah.getText();
//            String beratSampah = this.tabung_banyak_sampah.getText();
//
////            int harga = Integer.parseInt(tabung_harga_sampah.getText());
////            int berat = Integer.parseInt(tabung_banyak_sampah.getText());
////            int hasil;
////            hasil = harga * berat;
////            String hasilString = String.valueOf(hasil);
//            double harga = Double.valueOf(tabung_harga_sampah.getText());
//            double berat = Double.valueOf(tabung_banyak_sampah.getText());
//            double hasil;
//            hasil = harga * berat;
//            String hasilString = String.valueOf(hasil);
//
//            tabung_total.setText(hasilString);
//
////                String date = ((JTextField) txt_tanggal.getDateEditor().getUiComponent()).getText();
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String startDateString = dateFormat.format(txt_date.getDate());
////            kk
//
//            Query s = new Query();
////                s.setId_sim(this.txt_id_sim.getText());
//            s.setTgl_sim(startDateString);
//            s.setKode_nas(this.tabung_id_nasabah.getText());
//            s.setKode_samp(this.tabung_id_sampah.getText());
//            s.setNama_samp(this.tabung_jenis_sampah.getText());
//            s.setHarga_samp(this.tabung_harga_sampah.getText());
//            s.setQty_samp(this.tabung_banyak_sampah.getText());
//            s.setTotal_samp(hasilString);
//
//            if (Fungsi.createSimpanan(s)) {
////                    setClean();
//                Fungsi.Tabel_nasabah("");
//                Fungsi.Tabel_sampah("");
//                Fungsi.Tabel_Simpanan("");
////                    ts.clickGo();
//                JOptionPane.showMessageDialog(this,
//                        "Menabung Sukses !", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
//
//            } else {
//                JOptionPane.showMessageDialog(this,
//                        "PENAMBAHAN GAGAL", "ERROR", JOptionPane.ERROR_MESSAGE);
//            }
////                TabPane.setSelectedIndex(3);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    private void tambahpenarikan() {
//        try {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String startDateString = dateFormat.format(txt_date1.getDate());
//
//            Query s = new Query();
////                s.setId_sim(this.txt_id_sim.getText());
//
//            s.setKode_nas(this.penarikan_id_nas.getText());
//            s.setTgl_pen(startDateString);
//            s.setSaldo_nas(this.penarikan_isi_penarikan.getText());
//
//            if (Fungsi.createPenarikan(s)) {
////                    setClean();
//                Fungsi.Tabel_nasabah("");
//                Fungsi.Tabel_penarikan("");
//
//                JOptionPane.showMessageDialog(this,
//                        "Penarikan Saldo Sukses !", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
//
//            } else {
//                JOptionPane.showMessageDialog(this,
//                        "penarikan Saldo Gagal !", "ERROR", JOptionPane.ERROR_MESSAGE);
//            }
////                TabPane.setSelectedIndex(3);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    private void clean_penarikan() {
//        penarikan_id_nas.setText("");
//        penarikan_nama_nas.setText("");
//        penarikan_alamat_nas.setText("");
//        penarikan_hp_nas.setText("");
//        penarikan_total_saldo_nas.setText("");
//        penarikan_jumlah_penarikan_saldo.setText("");
//        penarikan_isi_saldo.setText("xxxxxxx");
//        penarikan_isi_penarikan.setText("xxxxxxx");
//        penarikan_isi_sisa_saldo.setText("xxxxxxx");
//        penarikan_id_nas.requestFocus();

    }

    private void perhitunganpenarikansaldo() {
//        try {
//            String sql = "SELECT * FROM nasabah WHERE kode_nas = '" + penarikan_id_nas.getText() + "'";
//            Statement st = konek.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//
//            while (rs.next()) {
//                penarikan_isi_saldo.setText(rs.getString("saldo_nas"));
//                penarikan_isi_penarikan.setText(this.penarikan_jumlah_penarikan_saldo.getText());
//
//            }
//            String hargaSampah = this.penarikan_isi_saldo.getText();
//            String beratSampah = this.penarikan_isi_penarikan.getText();
//
//            int harga = Integer.parseInt(penarikan_isi_saldo.getText());
//            int berat = Integer.parseInt(penarikan_isi_penarikan.getText());
//            int hasil;
//            hasil = harga - berat;
//            String hasilString = String.valueOf(hasil);
//            penarikan_isi_sisa_saldo.setText(hasilString);
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }

    private void proses_penampilan_edit_nasabah() {
        try {

            int baris = tabel_petugas.getSelectedRow();
            Nas_Edit detail = new Nas_Edit(this, true);
//            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
            detail.txt_id.setText(tabel_petugas.getValueAt(baris, 0).toString());

            try {

//                Connection konek = con.getKonek();
                String sql = "SELECT * FROM nasabah WHERE id_nas = '" + Nas_Edit.txt_id.getText() + "'";
                Statement st = konek.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    Nas_Edit.txt_kode.setText(rs.getString("kode_nas"));
                    Nas_Edit.txt_nama.setText(rs.getString("nama_nas"));
                    Nas_Edit.txt_alamat.setText(rs.getString("alamat_nas"));
                    Nas_Edit.txt_hp.setText(rs.getString("hp_nas"));
                    Nas_Detail.det_saldo.setText(rs.getString("saldo_nas"));

                }

            } catch (Exception e) {
                System.out.println(e);
            }

            detail.setVisible(true);

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private void tampil_detail_nasabah() {
//        try {
//
//            int baris = tabel_petugas.getSelectedRow();
////            Nas_Detail detail = new Nas_Detail(this, true);
//////            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
//            this.detail_id.setText(tabel_petugas.getValueAt(baris, 0).toString());
//
//            try {
//
////                Connection konek = con.getKonek();
//                String sql = "SELECT * FROM nasabah WHERE id_nas = '" + this.detail_id.getText() + "'";
//                Statement st = konek.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//
//                while (rs.next()) {
//                    this.detail_kode_nas.setText(rs.getString("kode_nas"));
//                    this.detail_nama_nas.setText(rs.getString("nama_nas"));
//                    this.detail_alamat_nas.setText(rs.getString("alamat_nas"));
//                    this.detail_hp.setText(rs.getString("hp_nas"));
//                    this.detail_saldo_nas.setText(rs.getString("saldo_nas"));
//
//                }
////                while (rs.next()) {
////                    Nas_Detail.det_kode.setText(rs.getString("kode_nas"));
////                    Nas_Detail.det_nama.setText(rs.getString("nama_nas"));
////                    Nas_Detail.det_alamat.setText(rs.getString("alamat_nas"));
////                    Nas_Detail.det_hp.setText(rs.getString("hp_nas"));
////                    Nas_Detail.det_saldo.setText(rs.getString("saldo_nas"));
////
////                }
//
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//
////            detail.setVisible(true);
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
    }

    private void tampil_detail_sampah() {
//        try {
//
//            int baris = tabel_sampah.getSelectedRow();
////            Nas_Detail detail = new Nas_Detail(this, true);
//////            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
//            this.detail_id_sampah.setText(tabel_sampah.getValueAt(baris, 0).toString());
//
//            try {
//
////                Connection konek = con.getKonek();
//                String sql = "SELECT * FROM sampah WHERE id_samp = '" + this.detail_id_sampah.getText() + "'";
//                Statement st = konek.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//
//                while (rs.next()) {
//                    this.detail_kode_samp.setText(rs.getString("kode_samp"));
//                    this.detail_kategori_sampah.setText(rs.getString("kategori"));
//                    this.detail_jenis_sampah.setText(rs.getString("nama_samp"));
//                    this.detail_harga1.setText(rs.getString("harga_1"));
//                    this.detail_harga2.setText(rs.getString("harga_2"));
//                    this.detail_harga_pengepul.setText(rs.getString("harga_pgul"));
//                    this.detail_stok.setText(rs.getString("stok"));
//
//                }
////                while (rs.next()) {
////                    Nas_Detail.det_kode.setText(rs.getString("kode_nas"));
////                    Nas_Detail.det_nama.setText(rs.getString("nama_nas"));
////                    Nas_Detail.det_alamat.setText(rs.getString("alamat_nas"));
////                    Nas_Detail.det_hp.setText(rs.getString("hp_nas"));
////                    Nas_Detail.det_saldo.setText(rs.getString("saldo_nas"));
////
////                }
//
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//
////            detail.setVisible(true);
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
    }

    private void proses_penampilan_edit_sampah() {
//        try {
//
//            int baris = tabel_sampah.getSelectedRow();
//            Sampah_Edit detail = new Sampah_Edit(this, true);
////            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
//            detail.txt_id_edit_sampah.setText(tabel_sampah.getValueAt(baris, 0).toString());
//
//            try {
//
////                Connection konek = con.getKonek();
//                String sql = "SELECT * FROM sampah WHERE id_samp = '" + Sampah_Edit.txt_id_edit_sampah.getText() + "'";
//                Statement st = konek.createStatement();
//                ResultSet rs = st.executeQuery(sql);
//
//                while (rs.next()) {
//
//                    Sampah_Edit.edit_kode_sampah.setText(rs.getString("kode_samp"));
////                    Sampah_Edit.edit_kategori_sampah.
//                    Sampah_Edit.edit_jenis_sampah.setText(rs.getString("nama_samp"));
//                    Sampah_Edit.edit_harga1_sampah.setText(rs.getString("harga_1"));
//                    Sampah_Edit.edit_harga2_sampah.setText(rs.getString("harga_2"));
//                    Sampah_Edit.edit_hargar_pengepul_sampah.setText(rs.getString("harga_pgul"));
//                    Sampah_Edit.edit_stok.setText(rs.getString("stok"));
//                }
//
//            } catch (Exception e) {
//                System.out.println(e);
//            }
//
//            detail.setVisible(true);
//
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
    }

    private void tampahPenjualan() {
        try {
//            String hargaSampah = this.penjualan_harga_sampah.getText();
//            String beratSampah = this.penjualan_jumlah_sampah.getText();

//            int harga = Integer.parseInt(penjualan_harga_sampah.getText());
//            int berat = Integer.parseInt(penjualan_jumlah_sampah.getText());
//            int hasil;
//            hasil = harga * berat;
//            String hasilString = String.valueOf(hasil);
            double harga = Double.valueOf(penjualan_harga_sampah.getText());
            double berat = Double.valueOf(penjualan_jumlah_sampah.getText());
            double hasil;
            hasil = harga * berat;
            String hasilString = String.valueOf(hasil);

//            int hasilInt = Integer.parseInt(hasilString);
//            penjualan_total_penjualan_sampah.setText(hasilString);
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String startDateString = dateFormat.format(txt_date_penjualan.getDate());

            Query s = new Query();
            s.setTgl_jual(startDateString);
            s.setNama_pengepul(this.penjualan_id_pengepul.getText());
            s.setKode_samp(this.penjualan_id_sampah.getText());
            s.setNama_samp(this.penjualan_nama_sampah.getText());
            s.setHarga_samp(this.penjualan_harga_sampah.getText());
            s.setBerat(this.penjualan_jumlah_sampah.getText());
            s.setTotal_harga(hasilString);

            if (Fungsi.createPenjualan(s)) {
//                    setClean();
//                Fungsi.Tabel_nasabah("");
                Fungsi.Tabel_sampah("");
                Fungsi.Tabel_Penjualan("");

//                Fungsi.Tabel_Simpanan("");
//                    ts.clickGo();
                JOptionPane.showMessageDialog(this,
                        "Penjualan Sampah Sukses !", "SUKSES....", JOptionPane.INFORMATION_MESSAGE);
                int penjualanKembali = JOptionPane.showOptionDialog(this, "Tekan ya untuk proses penjualan kembali", "Ingin Tambah Penjualan ?", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (penjualanKembali == JOptionPane.YES_OPTION) {

                    penjualanKembali();

                } else {
                    clearPenjualan();
                }

            } else {
                JOptionPane.showMessageDialog(this,
                        "Penjualan Sampah Gagal !", "ERROR.....", JOptionPane.ERROR_MESSAGE);
            }
//                TabPane.setSelectedIndex(3);

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void clean_penjualan() {
        penjualan_id_pengepul.setText("");
        penjualan_id_sampah.setText("");
        penjualan_jumlah_sampah.setText("");
        penjualan_nama_sampah.setText("");
        penjualan_stok_sampah.setText("");
        penjualan_harga_sampah.setText("");

    }

    private void penjualanKembali() {
        penjualan_id_sampah.setText("");
        penjualan_nama_sampah.setText("");
        penjualan_harga_sampah.setText("");
        penjualan_stok_sampah.setText("");
        penjualan_jumlah_sampah.setText("");
        penjualan_id_sampah.requestFocus();
    }

    private void clearPenjualan() {
        penjualan_id_pengepul.setText("");
        penjualan_id_sampah.setText("");
        penjualan_nama_sampah.setText("");
        penjualan_harga_sampah.setText("");
        penjualan_stok_sampah.setText("");
        penjualan_jumlah_sampah.setText("");
        penjualan_id_pengepul.requestFocus();
    }

    private void proses_penampilan_edit_petugas() {
        try {

            int baris = tabel_petugas.getSelectedRow();
            Petugas_Edit detail = new Petugas_Edit(this, true);
//            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
            detail.txt_id.setText(tabel_petugas.getValueAt(baris, 0).toString());

            try {

//                Connection konek = con.getKonek();
                String sql = "SELECT * FROM user WHERE id_user = '" + Petugas_Edit.txt_id.getText() + "'";
                Statement st = konek.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
//                    Petugas_Edit.txt_kode.setText(rs.getString("kode_nas"));
                    Petugas_Edit.txt_nama.setText(rs.getString("nama"));
                    Petugas_Edit.txt_username.setText(rs.getString("username"));
                    Petugas_Edit.txt_password.setText(rs.getString("password"));
//                    Petugas_Edit.det_saldo.setText(rs.getString("saldo_nas"));

                }

            } catch (Exception e) {
                System.out.println(e);
            }

            detail.setVisible(true);

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private void resetnomerPetugas() {
        
        Petugas_tambah.txt_id.setText(Fungsi.extraeIDMax());
        
    }

}
