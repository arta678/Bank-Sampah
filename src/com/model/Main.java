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
class Main extends javax.swing.JFrame {

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

    public Main() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        //Menubar
        setColor(btn_1);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_7, btn_6});
        Fungsi.Tabel_nasabah("");
        Fungsi.Tabel_sampah("");
        Fungsi.Tabel_Simpanan("");
        Fungsi.Tabel_penarikan("");
        Fungsi.Tabel_Penjualan("");
//        Fungsi.Tabel_laporan_tabungan("");
//        Fungsi.jumlahNasbah();

        txt_button_datang.setSelected(true);
        laporan_date_dari.setDateFormatString("yyyy-MM-dd");
        laporan_date_sampai.setDateFormatString("yyyy-MM-dd");
//        tglFrom = format.format(laporan_date_dari.getDate());
//        tglUntil = format.format(laporan_date_sampai.getDate());

        //Menampilkan Jumlah transaksi, jumlah total sampah,jumlah nasabah di menu home
        labelSampah.setText(Float.toString(totalSampah()));
        labelNasabah.setText(Integer.toString(jumlahNasabah()));
        labelTransaksi.setText(Integer.toString(jumlahtransaksi()));
        txt_date.setDate(date);
        txt_date1.setDate(date);
//        laporan_date_dari.setDate(date);
//        laporan_date_dari2.setDate(date);
        txt_date_penjualan.setDate(date);

        tabel_nasabah.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    Point pnt = evt.getPoint();
                    int row = tabel_nasabah.rowAtPoint(pnt);

                    try {
                        int baris = tabel_nasabah.getSelectedRow();

                        tampil_detail_nasabah();

                    } catch (Exception e) {
                        System.out.println(e);

                    }
                    //do something
                } else {
                    //do something else
                }
            }

        });
        tabel_sampah.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if (evt.getClickCount() == 2) {
                    Point pnt = evt.getPoint();
                    int row = tabel_sampah.rowAtPoint(pnt);

                    try {
                        int baris = tabel_sampah.getSelectedRow();

                        tampil_detail_sampah();

                    } catch (Exception e) {
                        System.out.println(e);

                    }
                    //do something
                } else {
                    //do something else
                }
            }

        });

        //Disabel
//        tabung_nama_nasabah.setEnabled(false);
//        tabung_jenis_sampah.setEnabled(false);
//        tabung_total.setEnabled(false);
    }

    public float totalSampah() {
        float jumlahBaris = tabel_sampah.getRowCount();
        float sum = 0;
        for (float i = 0; i < jumlahBaris; i++) {
            sum = sum + Float.parseFloat(tabel_sampah.getValueAt((int) i, 3).toString());

        }
        return sum;

    }

    public int jumlahNasabah() {
        int jumlahbaris = tabel_nasabah.getRowCount();
        return jumlahbaris;
    }

    public int jumlahtransaksi() {
        int jumlahbaris = tabel_tabungan.getRowCount();
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
        btn_5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        labelNasabah = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
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
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        rSButtonHover1 = new rojerusan.RSButtonHover();
        rSButtonHover2 = new rojerusan.RSButtonHover();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_nasabah = new rojerusan.RSTableMetro();
        txt_search_nasabah = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        rSButtonHover3 = new rojerusan.RSButtonHover();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        detail_kode_nas = new javax.swing.JLabel();
        detail_nama_nas = new javax.swing.JLabel();
        detail_alamat_nas = new javax.swing.JLabel();
        detail_hp = new javax.swing.JLabel();
        detail_saldo_nas = new javax.swing.JLabel();
        detail_id = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        rSButtonHover12 = new rojerusan.RSButtonHover();
        rSButtonHover10 = new rojerusan.RSButtonHover();
        rSButtonHover16 = new rojerusan.RSButtonHover();
        jPanel11 = new javax.swing.JPanel();
        rSButtonHover4 = new rojerusan.RSButtonHover();
        rSButtonHover5 = new rojerusan.RSButtonHover();
        rSButtonHover6 = new rojerusan.RSButtonHover();
        txt_search_sampah = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabel_sampah = new rojerusan.RSTableMetro();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        detail_kode_samp = new javax.swing.JLabel();
        detail_kategori_sampah = new javax.swing.JLabel();
        detail_jenis_sampah = new javax.swing.JLabel();
        detail_harga1 = new javax.swing.JLabel();
        detail_harga2 = new javax.swing.JLabel();
        detail_id_sampah = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        detail_harga_pengepul = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        detail_stok = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        rSButtonHover13 = new rojerusan.RSButtonHover();
        rSButtonHover15 = new rojerusan.RSButtonHover();
        rSButtonHover17 = new rojerusan.RSButtonHover();
        jLabel112 = new javax.swing.JLabel();
        rb_plastik = new javax.swing.JRadioButton();
        rb_kertas = new javax.swing.JRadioButton();
        rb_logam = new javax.swing.JRadioButton();
        rb_botol_kaca = new javax.swing.JRadioButton();
        br_lainnya = new javax.swing.JRadioButton();
        rSButtonHover20 = new rojerusan.RSButtonHover();
        rSButtonHover33 = new rojerusan.RSButtonHover();
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
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        laporan_date_dari = new com.toedter.calendar.JDateChooser();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        laporan_date_sampai = new com.toedter.calendar.JDateChooser();
        rSButtonHover18 = new rojerusan.RSButtonHover();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabel_laporan_tabungan = new rojerusan.RSTableMetro();
        rSButtonHover19 = new rojerusan.RSButtonHover();
        jPanel45 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel61 = new javax.swing.JPanel();
        rSButtonHover34 = new rojerusan.RSButtonHover();
        rSButtonHover36 = new rojerusan.RSButtonHover();
        jPanel22 = new javax.swing.JPanel();
        rSButtonHover7 = new rojerusan.RSButtonHover();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        tabung_nama_nasabah = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tabung_jenis_sampah = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tabung_total = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        tabung_harga_sampah = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        tabung_id_nasabah = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tabung_id_sampah = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_button_datang = new javax.swing.JRadioButton();
        txt_button_jemput = new javax.swing.JRadioButton();
        jLabel34 = new javax.swing.JLabel();
        tabung_banyak_sampah = new javax.swing.JTextField();
        jPanel28 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_simpan_tabungan = new rojerusan.RSButtonHover();
        rSButtonHover8 = new rojerusan.RSButtonHover();
        txt_id_sim = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel_tabungan = new rojerusan.RSTableMetro();
        jLabel63 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabel_buku_tabungan = new rojerusan.RSTableMetro();
        jLabel103 = new javax.swing.JLabel();
        buku_tabungan_nama_nasabah = new javax.swing.JLabel();
        buku_tabungan_saldo = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        rSButtonHover14 = new rojerusan.RSButtonHover();
        buku_tabungan_id_nasabah = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        rSButtonHover9 = new rojerusan.RSButtonHover();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        penarikan_isi_saldo = new javax.swing.JLabel();
        penarikan_isi_penarikan = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        penarikan_isi_sisa_saldo = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        penarikan_id_nas = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        penarikan_nama_nas = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        penarikan_alamat_nas = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        penarikan_hp_nas = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        penarikan_total_saldo_nas = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        penarikan_jumlah_penarikan_saldo = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        txt_date1 = new com.toedter.calendar.JDateChooser();
        txt_simpan_tabungan1 = new rojerusan.RSButtonHover();
        txt_id_sim1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel_penarikan = new rojerusan.RSTableMetro();
        jLabel51 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        laporan_date_setoran_dari = new com.toedter.calendar.JDateChooser();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        laporan_date_setoran_sampai = new com.toedter.calendar.JDateChooser();
        rSButtonHover21 = new rojerusan.RSButtonHover();
        jScrollPane8 = new javax.swing.JScrollPane();
        tabel_laporan_setoran = new rojerusan.RSTableMetro();
        rSButtonHover22 = new rojerusan.RSButtonHover();
        rSButtonHover23 = new rojerusan.RSButtonHover();
        rSButtonHover30 = new rojerusan.RSButtonHover();
        jPanel50 = new javax.swing.JPanel();
        jPanel56 = new javax.swing.JPanel();
        laporan_date_penarikan_dari = new com.toedter.calendar.JDateChooser();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        laporan_date_penarikan_sampai = new com.toedter.calendar.JDateChooser();
        rSButtonHover24 = new rojerusan.RSButtonHover();
        jScrollPane9 = new javax.swing.JScrollPane();
        tabel_laporan_penarikan = new rojerusan.RSTableMetro();
        rSButtonHover25 = new rojerusan.RSButtonHover();
        rSButtonHover26 = new rojerusan.RSButtonHover();
        rSButtonHover31 = new rojerusan.RSButtonHover();
        jPanel51 = new javax.swing.JPanel();
        jPanel60 = new javax.swing.JPanel();
        laporan_date_penjualan_dari = new com.toedter.calendar.JDateChooser();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        laporan_date_pejualan_sampai = new com.toedter.calendar.JDateChooser();
        rSButtonHover27 = new rojerusan.RSButtonHover();
        jScrollPane10 = new javax.swing.JScrollPane();
        tabel_laporan_penjualan = new rojerusan.RSTableMetro();
        rSButtonHover28 = new rojerusan.RSButtonHover();
        rSButtonHover29 = new rojerusan.RSButtonHover();
        rSButtonHover32 = new rojerusan.RSButtonHover();
        jPanel53 = new javax.swing.JPanel();
        main_password_confirmasi = new javax.swing.JPasswordField();
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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/shopping-cart.png"))); // NOI18N
        jLabel2.setText(" Transaksi");

        javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
        btn_2.setLayout(btn_2Layout);
        btn_2Layout.setHorizontalGroup(
            btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(0, 87, Short.MAX_VALUE))
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
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/user.png"))); // NOI18N
        jLabel3.setText(" Nasabah");

        javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
        btn_3.setLayout(btn_3Layout);
        btn_3Layout.setHorizontalGroup(
            btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(0, 91, Short.MAX_VALUE))
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
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/trash.png"))); // NOI18N
        jLabel4.setText(" Sampah");

        javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
        btn_4.setLayout(btn_4Layout);
        btn_4Layout.setHorizontalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        btn_4Layout.setVerticalGroup(
            btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_5.setBackground(new java.awt.Color(35, 45, 59));
        btn_5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_5MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_5MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/truk2.png"))); // NOI18N
        jLabel5.setText(" Jual");

        javax.swing.GroupLayout btn_5Layout = new javax.swing.GroupLayout(btn_5);
        btn_5.setLayout(btn_5Layout);
        btn_5Layout.setHorizontalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(0, 135, Short.MAX_VALUE))
        );
        btn_5Layout.setVerticalGroup(
            btn_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        btn_6.setBackground(new java.awt.Color(108, 120, 136));
        btn_6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_6MousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_6MouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("NanumGothic", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/report.png"))); // NOI18N
        jLabel6.setText(" Laporan");

        javax.swing.GroupLayout btn_6Layout = new javax.swing.GroupLayout(btn_6);
        btn_6.setLayout(btn_6Layout);
        btn_6Layout.setHorizontalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(0, 96, Short.MAX_VALUE))
        );
        btn_6Layout.setVerticalGroup(
            btn_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
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
        jLabel11.setText("Jumlah");

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
        jLabel13.setText("Transaksi");

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
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(labelTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addContainerGap(79, Short.MAX_VALUE))
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

        jLabel113.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("Jumlah");

        jLabel114.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Nasabah");

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
        jLabel21.setText("Lihat Nasabah");

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
                            .addComponent(jLabel113)
                            .addComponent(jLabel114)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(labelNasabah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel115)))
                        .addGap(0, 90, Short.MAX_VALUE))
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
                        .addComponent(jLabel113)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel114)
                        .addGap(3, 3, 3)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
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

        jPanel18.setBackground(new java.awt.Color(204, 204, 255));
        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel18MouseClicked(evt);
            }
        });

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/sampah.png"))); // NOI18N

        jPanel19.setBackground(new java.awt.Color(102, 0, 255));

        jLabel23.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Menabung");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/sampah2.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Klik disini untuk melakukan ");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("prose menabung sampah");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel26))
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel28))
                                .addComponent(jLabel27)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel20.setBackground(new java.awt.Color(255, 153, 153));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/penarikan.png"))); // NOI18N

        jPanel21.setBackground(new java.awt.Color(204, 0, 0));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Penarikan");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(74, 74, 74))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        jLabel30.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("prose penarikan saldo");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Klik disini untuk melakukan ");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(31, 31, 31))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addGap(49, 49, 49))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(280, Short.MAX_VALUE))
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

        Tabpane.addTab(".", jPanel9);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonHover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/user.png"))); // NOI18N
        rSButtonHover1.setText("Tambah");
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

        rSButtonHover2.setBackground(new java.awt.Color(255, 51, 0));
        rSButtonHover2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/edit.png"))); // NOI18N
        rSButtonHover2.setText("Edit");
        rSButtonHover2.setColorHover(new java.awt.Color(251, 90, 50));
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        tabel_nasabah.setForeground(new java.awt.Color(0, 0, 0));
        tabel_nasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "P001", "Arta Wiguna"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No.", "ID Nas", "Nama"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_nasabah.setToolTipText("klik 2x untuk melihat detil nasabah");
        tabel_nasabah.setAltoHead(30);
        tabel_nasabah.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_nasabah.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tabel_nasabah.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tabel_nasabah.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_nasabah.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_nasabah.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_nasabah.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_nasabah.setRowHeight(23);
        jScrollPane1.setViewportView(tabel_nasabah);
        if (tabel_nasabah.getColumnModel().getColumnCount() > 0) {
            tabel_nasabah.getColumnModel().getColumn(0).setMinWidth(50);
            tabel_nasabah.getColumnModel().getColumn(0).setMaxWidth(50);
            tabel_nasabah.getColumnModel().getColumn(1).setMinWidth(100);
            tabel_nasabah.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        txt_search_nasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_nasabahActionPerformed(evt);
            }
        });
        txt_search_nasabah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_nasabahKeyReleased(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/search.png"))); // NOI18N

        rSButtonHover3.setBackground(new java.awt.Color(0, 153, 51));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/eye.png"))); // NOI18N
        rSButtonHover3.setText("Detil");
        rSButtonHover3.setColorHover(new java.awt.Color(48, 226, 48));
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jPanel38.setBackground(new java.awt.Color(0, 0, 0));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Detil Nasabah");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59)
                .addContainerGap(277, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel60.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel60.setText("ID");

        jLabel61.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel61.setText("Nama");

        jLabel64.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel64.setText("Alamat");

        jLabel65.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel65.setText("Hp");

        jLabel66.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel66.setText("Saldo");

        jLabel67.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel67.setText(":");

        jLabel68.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel68.setText(":");

        jLabel69.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel69.setText(":");

        jLabel70.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel70.setText(":");

        jLabel71.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel71.setText(":");

        detail_kode_nas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_kode_nas.setText("-");

        detail_nama_nas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_nama_nas.setText("-");

        detail_alamat_nas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_alamat_nas.setText("-");

        detail_hp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_hp.setText("-");

        detail_saldo_nas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_saldo_nas.setText("-");

        detail_id.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        detail_id.setForeground(new java.awt.Color(255, 255, 255));
        detail_id.setText("detail_id");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator5)
                    .addComponent(jSeparator6)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65)
                            .addComponent(jLabel60)
                            .addComponent(jLabel66))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_saldo_nas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_kode_nas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_nama_nas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_alamat_nas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_hp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(detail_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_kode_nas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel60)
                        .addComponent(jLabel67)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(jLabel68)
                    .addComponent(detail_nama_nas, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_alamat_nas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel64)
                        .addComponent(jLabel70)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_hp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel65)
                        .addComponent(jLabel69)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_saldo_nas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel66)
                        .addComponent(jLabel71)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(detail_id)
                .addGap(118, 118, 118))
        );

        jLabel101.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Note :");

        jLabel102.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("Untuk melihat detil nasabah klik 2x pada baris tabel");

        rSButtonHover12.setBackground(new java.awt.Color(51, 0, 255));
        rSButtonHover12.setText("Input > Tabungan");
        rSButtonHover12.setColorHover(new java.awt.Color(84, 42, 251));
        rSButtonHover12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover12ActionPerformed(evt);
            }
        });

        rSButtonHover10.setBackground(new java.awt.Color(0, 153, 51));
        rSButtonHover10.setText("Transaksi");
        rSButtonHover10.setColorHover(new java.awt.Color(3, 171, 59));
        rSButtonHover10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover10ActionPerformed(evt);
            }
        });

        rSButtonHover16.setBackground(new java.awt.Color(153, 51, 255));
        rSButtonHover16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/Print-24.png"))); // NOI18N
        rSButtonHover16.setText("  Print");
        rSButtonHover16.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel102))
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(rSButtonHover12, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonHover10, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonHover16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabpane.addTab(".", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonHover4.setBackground(new java.awt.Color(255, 51, 0));
        rSButtonHover4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/edit.png"))); // NOI18N
        rSButtonHover4.setText("Edit");
        rSButtonHover4.setToolTipText("Edit data Sampah");
        rSButtonHover4.setColorHover(new java.awt.Color(251, 90, 50));
        rSButtonHover4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover4ActionPerformed(evt);
            }
        });

        rSButtonHover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/trash.png"))); // NOI18N
        rSButtonHover5.setText("Tambah");
        rSButtonHover5.setToolTipText("Tambah Data Sampah");
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

        rSButtonHover6.setBackground(new java.awt.Color(0, 204, 0));
        rSButtonHover6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/eye.png"))); // NOI18N
        rSButtonHover6.setText("Detil");
        rSButtonHover6.setColorHover(new java.awt.Color(48, 226, 48));
        rSButtonHover6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover6ActionPerformed(evt);
            }
        });

        txt_search_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_search_sampahActionPerformed(evt);
            }
        });
        txt_search_sampah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_sampahKeyReleased(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/search.png"))); // NOI18N

        tabel_sampah.setForeground(new java.awt.Color(0, 0, 0));
        tabel_sampah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "P001", "Arta Wiguna", "Aktif"},
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
                "No.", "Kode", "Jenis Sampah", "Stok (Kg)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_sampah.setAltoHead(30);
        tabel_sampah.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_sampah.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tabel_sampah.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tabel_sampah.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_sampah.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_sampah.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_sampah.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_sampah.setRowHeight(23);
        jScrollPane2.setViewportView(tabel_sampah);
        if (tabel_sampah.getColumnModel().getColumnCount() > 0) {
            tabel_sampah.getColumnModel().getColumn(0).setMinWidth(50);
            tabel_sampah.getColumnModel().getColumn(0).setMaxWidth(50);
            tabel_sampah.getColumnModel().getColumn(1).setMinWidth(100);
            tabel_sampah.getColumnModel().getColumn(1).setMaxWidth(100);
            tabel_sampah.getColumnModel().getColumn(3).setMinWidth(100);
            tabel_sampah.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));

        jPanel44.setBackground(new java.awt.Color(0, 0, 0));

        jLabel86.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Detil Sampah");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel87.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel87.setText("Kode");

        jLabel88.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel88.setText("Kategori");

        jLabel89.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel89.setText("Jenis");

        jLabel90.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel90.setText("Harga Dhs1");

        jLabel91.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel91.setText("Harga Dhs2");

        jLabel92.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel92.setText(":");

        jLabel93.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel93.setText(":");

        jLabel94.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel94.setText(":");

        jLabel95.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel95.setText(":");

        jLabel96.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel96.setText(":");

        detail_kode_samp.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_kode_samp.setText("-");

        detail_kategori_sampah.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_kategori_sampah.setText("-");

        detail_jenis_sampah.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_jenis_sampah.setText("-");

        detail_harga1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_harga1.setText("-");

        detail_harga2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_harga2.setText("-");

        detail_id_sampah.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        detail_id_sampah.setForeground(new java.awt.Color(255, 255, 255));
        detail_id_sampah.setText("detail_id");

        jLabel97.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel97.setText("Harga Pgul");

        jLabel98.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel98.setText(":");

        detail_harga_pengepul.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_harga_pengepul.setText("-");

        jLabel99.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel99.setText("Stok");

        jLabel100.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel100.setText(":");

        detail_stok.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detail_stok.setText("-");

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addComponent(jSeparator9)
                    .addComponent(jSeparator10)
                    .addComponent(jSeparator11)
                    .addComponent(jSeparator12)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel99)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detail_stok, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel43Layout.createSequentialGroup()
                        .addComponent(jLabel97)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detail_harga_pengepul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator13)
                    .addComponent(jSeparator14)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel88)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90)
                            .addComponent(jLabel87)
                            .addComponent(jLabel91))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_harga2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_kode_samp, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_kategori_sampah, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_jenis_sampah, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                            .addGroup(jPanel43Layout.createSequentialGroup()
                                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detail_harga1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))))
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(detail_id_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 386, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_kode_samp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel87)
                        .addComponent(jLabel92)))
                .addGap(5, 5, 5)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(detail_kategori_sampah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel88)
                        .addComponent(jLabel93)))
                .addGap(1, 1, 1)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_jenis_sampah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel89)
                        .addComponent(jLabel95)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_harga1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel90)
                        .addComponent(jLabel94)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detail_harga2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel91)
                        .addComponent(jLabel96)))
                .addGap(2, 2, 2)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(detail_harga_pengepul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel98)
                    .addComponent(jLabel97))
                .addGap(3, 3, 3)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(detail_stok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel100)
                        .addComponent(jLabel99)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(detail_id_sampah)
                .addGap(17, 17, 17))
        );

        rSButtonHover13.setBackground(new java.awt.Color(51, 0, 255));
        rSButtonHover13.setText("Input > Tabungan");
        rSButtonHover13.setColorHover(new java.awt.Color(65, 21, 241));
        rSButtonHover13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover13ActionPerformed(evt);
            }
        });

        rSButtonHover15.setBackground(new java.awt.Color(255, 102, 51));
        rSButtonHover15.setText("Input > Penjualan");
        rSButtonHover15.setColorHover(new java.awt.Color(245, 116, 74));
        rSButtonHover15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover15ActionPerformed(evt);
            }
        });

        rSButtonHover17.setBackground(new java.awt.Color(153, 51, 255));
        rSButtonHover17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/Print-24.png"))); // NOI18N
        rSButtonHover17.setText("  Print");
        rSButtonHover17.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover17ActionPerformed(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel112.setText("Filter :");

        buttonGroup2.add(rb_plastik);
        rb_plastik.setText("Plastik");
        rb_plastik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_plastikActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_kertas);
        rb_kertas.setText("Kertas");
        rb_kertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_kertasActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_logam);
        rb_logam.setText("Logam");
        rb_logam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_logamActionPerformed(evt);
            }
        });

        buttonGroup2.add(rb_botol_kaca);
        rb_botol_kaca.setText("Botol Kaca");
        rb_botol_kaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_botol_kacaActionPerformed(evt);
            }
        });

        buttonGroup2.add(br_lainnya);
        br_lainnya.setText("Lainnya");
        br_lainnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                br_lainnyaActionPerformed(evt);
            }
        });

        rSButtonHover20.setBackground(new java.awt.Color(204, 0, 0));
        rSButtonHover20.setText("Apply");
        rSButtonHover20.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover20ActionPerformed(evt);
            }
        });

        rSButtonHover33.setBackground(new java.awt.Color(153, 153, 153));
        rSButtonHover33.setText("Refresh");
        rSButtonHover33.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_search_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(rSButtonHover13, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rSButtonHover15, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel112)
                    .addComponent(rb_plastik)
                    .addComponent(rb_kertas)
                    .addComponent(rb_logam)
                    .addComponent(rb_botol_kaca)
                    .addComponent(br_lainnya)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(rSButtonHover20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover33, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonHover17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel31)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel112)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_plastik)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_kertas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_logam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_botol_kaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(br_lainnya)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rSButtonHover20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonHover33, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        Tabpane.addTab("sampah", jPanel11);

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
                    .addComponent(jScrollPane5))
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel49.setBackground(new java.awt.Color(248, 248, 248));
        jPanel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        laporan_date_dari.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_dari.setDateFormatString("dd-MM-yyyy");
        laporan_date_dari.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_dariPropertyChange(evt);
            }
        });

        jLabel72.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel72.setText("DARI");

        jLabel73.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel73.setText("SAMPAI");

        laporan_date_sampai.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_sampai.setDateFormatString("dd-MM-yyyy");
        laporan_date_sampai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_sampaiPropertyChange(evt);
            }
        });

        rSButtonHover18.setBackground(new java.awt.Color(153, 51, 255));
        rSButtonHover18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/Print-24.png"))); // NOI18N
        rSButtonHover18.setText("PRINT");
        rSButtonHover18.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover18ActionPerformed(evt);
            }
        });

        tabel_laporan_tabungan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_laporan_tabungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Kode", "Nasabah", "Sampah", "Kode Sampah", "Harga", "Kg", "Setoran", "Penarikan", "Penjualan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_laporan_tabungan.setToolTipText("");
        tabel_laporan_tabungan.setAltoHead(30);
        tabel_laporan_tabungan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_laporan_tabungan.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tabel_laporan_tabungan.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tabel_laporan_tabungan.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabel_laporan_tabungan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_laporan_tabungan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_laporan_tabungan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_laporan_tabungan.setRowHeight(23);
        tabel_laporan_tabungan.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tabel_laporan_tabungan);
        if (tabel_laporan_tabungan.getColumnModel().getColumnCount() > 0) {
            tabel_laporan_tabungan.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_laporan_tabungan.getColumnModel().getColumn(0).setMaxWidth(100);
            tabel_laporan_tabungan.getColumnModel().getColumn(6).setMinWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(6).setMaxWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(7).setMinWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(7).setMaxWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(8).setMinWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(8).setMaxWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(9).setMinWidth(90);
            tabel_laporan_tabungan.getColumnModel().getColumn(9).setMaxWidth(90);
        }

        rSButtonHover19.setBackground(new java.awt.Color(0, 0, 255));
        rSButtonHover19.setText("TAMPILKAN");
        rSButtonHover19.setColorHover(new java.awt.Color(49, 49, 252));
        rSButtonHover19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover19ActionPerformed(evt);
            }
        });

        jPanel45.setBackground(new java.awt.Color(102, 153, 255));
        jPanel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel45MousePressed(evt);
            }
        });

        jLabel104.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("LAPORAN SIMPANAN");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel104)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel74.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel74.setText("Ket Kode :");

        jLabel75.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel75.setText("1: Setoran");

        jLabel76.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel76.setText("2: Penarikan");

        jLabel77.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel77.setText("3: Penjualan");

        jPanel46.setBackground(new java.awt.Color(255, 102, 102));
        jPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel46MousePressed(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("LAPORAN PENARIKAN");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel47.setBackground(new java.awt.Color(0, 204, 0));
        jPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel47MousePressed(evt);
            }
        });

        jLabel107.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("LAPORAN PENJUALAN");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addComponent(laporan_date_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(laporan_date_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonHover19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonHover18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel73))
                            .addGroup(jPanel49Layout.createSequentialGroup()
                                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74)
                                    .addComponent(jLabel75)
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel77))
                                .addGap(41, 41, 41)
                                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laporan_date_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(laporan_date_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel77)
                        .addGap(28, 28, 28))
                    .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Tabpane.addTab("laporan", jPanel8);

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
                    .addComponent(rSButtonHover36, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
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

        Tabpane.addTab(".", jPanel1);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonHover7.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover7.setText("<< KEMBALI");
        rSButtonHover7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover7MouseClicked(evt);
            }
        });
        rSButtonHover7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover7ActionPerformed(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        jPanel26.setBackground(new java.awt.Color(204, 204, 255));

        jLabel38.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(136, 135, 135));
        jLabel38.setText("Nama Nasabah");

        tabung_nama_nasabah.setBackground(new java.awt.Color(230, 232, 235));
        tabung_nama_nasabah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tabung_nama_nasabah.setEnabled(false);
        tabung_nama_nasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_nama_nasabahActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(136, 135, 135));
        jLabel37.setText("Jenis Sampah");

        tabung_jenis_sampah.setBackground(new java.awt.Color(230, 232, 235));
        tabung_jenis_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tabung_jenis_sampah.setEnabled(false);
        tabung_jenis_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_jenis_sampahActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(136, 135, 135));
        jLabel36.setText("Total");

        tabung_total.setBackground(new java.awt.Color(230, 232, 235));
        tabung_total.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        tabung_total.setEnabled(false);
        tabung_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_totalActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(136, 135, 135));
        jLabel39.setText("Harga/Kg");

        tabung_harga_sampah.setBackground(new java.awt.Color(230, 232, 235));
        tabung_harga_sampah.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tabung_harga_sampah.setEnabled(false);
        tabung_harga_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_harga_sampahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tabung_total, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(tabung_harga_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(tabung_nama_nasabah)
                            .addComponent(tabung_jenis_sampah)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel36)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabung_nama_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabung_jenis_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabung_harga_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabung_total, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel27.setBackground(new java.awt.Color(204, 204, 255));

        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setText("ID Nasabah");

        tabung_id_nasabah.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tabung_id_nasabah.setToolTipText("input Id nasabah");
        tabung_id_nasabah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_id_nasabahActionPerformed(evt);
            }
        });
        tabung_id_nasabah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tabung_id_nasabahKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabung_id_nasabahKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabung_id_nasabahKeyReleased(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setText("ID Sampah");

        tabung_id_sampah.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tabung_id_sampah.setToolTipText("input id sampah");
        tabung_id_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_id_sampahActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel35.setText("Jenis Menabung");

        buttonGroup1.add(txt_button_datang);
        txt_button_datang.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_button_datang.setText("Datang");
        txt_button_datang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_button_datangActionPerformed(evt);
            }
        });

        buttonGroup1.add(txt_button_jemput);
        txt_button_jemput.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_button_jemput.setText("Jemput Sampah");
        txt_button_jemput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_button_jemputActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setText("Berat Sampah (Kg)");

        tabung_banyak_sampah.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tabung_banyak_sampah.setToolTipText("gunakan . (titik) untuk angka desimal");
        tabung_banyak_sampah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabung_banyak_sampahActionPerformed(evt);
            }
        });
        tabung_banyak_sampah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tabung_banyak_sampahKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_button_datang)
                    .addComponent(txt_button_jemput)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabung_id_nasabah, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabung_id_sampah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tabung_banyak_sampah, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabung_id_nasabah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabung_id_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_button_datang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_button_jemput, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabung_banyak_sampah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(204, 204, 255));

        jLabel40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel40.setText("Tanggal");

        txt_date.setBackground(new java.awt.Color(255, 255, 255));
        txt_date.setDateFormatString("yyyy-MM-dd");
        txt_date.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(txt_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(217, 217, 217))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(3, 3, 3)
                .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txt_simpan_tabungan.setBackground(new java.awt.Color(115, 125, 206));
        txt_simpan_tabungan.setText("SIMPAN");
        txt_simpan_tabungan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_simpan_tabunganMouseClicked(evt);
            }
        });
        txt_simpan_tabungan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_simpan_tabunganActionPerformed(evt);
            }
        });

        rSButtonHover8.setBackground(new java.awt.Color(255, 102, 51));
        rSButtonHover8.setText("HAPUS");
        rSButtonHover8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover8MouseClicked(evt);
            }
        });
        rSButtonHover8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover8ActionPerformed(evt);
            }
        });

        txt_id_sim.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sim.setText("id_label");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_id_sim)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(rSButtonHover8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_simpan_tabungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_simpan_tabungan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(txt_id_sim)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        tabel_tabungan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_tabungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "15/05/2009", "Arta Wiguna", null, null, "10000"}
            },
            new String [] {
                "Tanggal", "ID Nas", "Sampah", "Harga ", "kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_tabungan.setToolTipText("");
        tabel_tabungan.setAltoHead(30);
        tabel_tabungan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_tabungan.setColorBordeFilas(new java.awt.Color(172, 172, 172));
        tabel_tabungan.setColorBordeHead(new java.awt.Color(172, 172, 172));
        tabel_tabungan.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_tabungan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_tabungan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_tabungan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_tabungan.setRowHeight(23);
        jScrollPane4.setViewportView(tabel_tabungan);
        if (tabel_tabungan.getColumnModel().getColumnCount() > 0) {
            tabel_tabungan.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_tabungan.getColumnModel().getColumn(0).setMaxWidth(100);
            tabel_tabungan.getColumnModel().getColumn(1).setMinWidth(75);
            tabel_tabungan.getColumnModel().getColumn(1).setMaxWidth(75);
            tabel_tabungan.getColumnModel().getColumn(3).setMinWidth(65);
            tabel_tabungan.getColumnModel().getColumn(3).setMaxWidth(65);
            tabel_tabungan.getColumnModel().getColumn(4).setMinWidth(50);
            tabel_tabungan.getColumnModel().getColumn(4).setMaxWidth(50);
            tabel_tabungan.getColumnModel().getColumn(5).setMinWidth(75);
            tabel_tabungan.getColumnModel().getColumn(5).setMaxWidth(75);
        }

        jLabel63.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel63.setText("Histori Tabungan");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSButtonHover7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        Tabpane.addTab("setoran", jPanel22);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        tabel_buku_tabungan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_buku_tabungan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Tanggal", "Jenis Sampah", "Harga", "Berat", "Setoran", "Penarikan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_buku_tabungan.setAltoHead(30);
        tabel_buku_tabungan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_buku_tabungan.setColorBordeFilas(new java.awt.Color(172, 172, 172));
        tabel_buku_tabungan.setColorBordeHead(new java.awt.Color(172, 172, 172));
        tabel_buku_tabungan.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabel_buku_tabungan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_buku_tabungan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_buku_tabungan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_buku_tabungan.setRowHeight(23);
        jScrollPane6.setViewportView(tabel_buku_tabungan);
        if (tabel_buku_tabungan.getColumnModel().getColumnCount() > 0) {
            tabel_buku_tabungan.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_buku_tabungan.getColumnModel().getColumn(0).setMaxWidth(100);
            tabel_buku_tabungan.getColumnModel().getColumn(2).setMinWidth(75);
            tabel_buku_tabungan.getColumnModel().getColumn(2).setMaxWidth(75);
            tabel_buku_tabungan.getColumnModel().getColumn(3).setMinWidth(50);
            tabel_buku_tabungan.getColumnModel().getColumn(3).setMaxWidth(50);
            tabel_buku_tabungan.getColumnModel().getColumn(4).setMinWidth(90);
            tabel_buku_tabungan.getColumnModel().getColumn(4).setMaxWidth(90);
            tabel_buku_tabungan.getColumnModel().getColumn(5).setMinWidth(90);
            tabel_buku_tabungan.getColumnModel().getColumn(5).setMaxWidth(90);
        }

        jLabel103.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel103.setText("Informasi Tabungan");

        buku_tabungan_nama_nasabah.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        buku_tabungan_nama_nasabah.setText("Nasabah");

        buku_tabungan_saldo.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        buku_tabungan_saldo.setForeground(new java.awt.Color(255, 0, 0));
        buku_tabungan_saldo.setText("50000");

        jLabel106.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel106.setText("Sisa Saldo");

        rSButtonHover14.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover14.setText("<< KEMBALI");
        rSButtonHover14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover14MouseClicked(evt);
            }
        });
        rSButtonHover14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover14ActionPerformed(evt);
            }
        });

        buku_tabungan_id_nasabah.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        buku_tabungan_id_nasabah.setForeground(new java.awt.Color(255, 255, 255));
        buku_tabungan_id_nasabah.setText("0");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(rSButtonHover14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buku_tabungan_id_nasabah))
                            .addComponent(buku_tabungan_nama_nasabah)
                            .addComponent(jLabel103))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buku_tabungan_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel106)))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 385, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buku_tabungan_id_nasabah))
                    .addComponent(rSButtonHover14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buku_tabungan_nama_nasabah))
                    .addComponent(buku_tabungan_saldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        Tabpane.addTab("bukuTABUNGAN", jPanel24);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonHover9.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover9.setText("<< KEMBALI");
        rSButtonHover9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover9MouseClicked(evt);
            }
        });
        rSButtonHover9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover9ActionPerformed(evt);
            }
        });

        jPanel31.setBackground(new java.awt.Color(255, 255, 255));
        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        jPanel31.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanel31AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel32.setBackground(new java.awt.Color(204, 204, 255));

        jLabel46.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(136, 135, 135));
        jLabel46.setText("Rincian Penarikan");

        jLabel55.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(136, 135, 135));
        jLabel55.setText("Saldo");

        jLabel56.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(136, 135, 135));
        jLabel56.setText("Penarikan");

        jLabel57.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(136, 135, 135));
        jLabel57.setText(":");

        jLabel58.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(136, 135, 135));
        jLabel58.setText(":");

        penarikan_isi_saldo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        penarikan_isi_saldo.setForeground(new java.awt.Color(136, 135, 135));
        penarikan_isi_saldo.setText("xxxxxxx");

        penarikan_isi_penarikan.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        penarikan_isi_penarikan.setForeground(new java.awt.Color(136, 135, 135));
        penarikan_isi_penarikan.setText("xxxxxxx");

        penarikan_isi_sisa_saldo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        penarikan_isi_sisa_saldo.setForeground(new java.awt.Color(136, 135, 135));
        penarikan_isi_sisa_saldo.setText("xxxxxxx");

        jLabel62.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(136, 135, 135));
        jLabel62.setText("Sisa saldo");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel46))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel62)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel55))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(penarikan_isi_sisa_saldo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(penarikan_isi_saldo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(penarikan_isi_penarikan, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46)
                .addGap(32, 32, 32)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel57)
                    .addComponent(penarikan_isi_saldo))
                .addGap(18, 18, 18)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jLabel58)
                    .addComponent(penarikan_isi_penarikan))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(penarikan_isi_sisa_saldo)
                    .addComponent(jLabel62))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(204, 204, 255));

        jLabel48.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel48.setText("ID Nasabah");

        penarikan_id_nas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        penarikan_id_nas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikan_id_nasActionPerformed(evt);
            }
        });
        penarikan_id_nas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                penarikan_id_nasKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                penarikan_id_nasKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                penarikan_id_nasKeyReleased(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(136, 135, 135));
        jLabel44.setText("Nama Nasabah");

        penarikan_nama_nas.setBackground(new java.awt.Color(230, 232, 235));
        penarikan_nama_nas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penarikan_nama_nas.setEnabled(false);
        penarikan_nama_nas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikan_nama_nasActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(136, 135, 135));
        jLabel45.setText("Alamat");

        penarikan_alamat_nas.setBackground(new java.awt.Color(230, 232, 235));
        penarikan_alamat_nas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penarikan_alamat_nas.setEnabled(false);
        penarikan_alamat_nas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikan_alamat_nasActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(136, 135, 135));
        jLabel47.setText("No-Hp");

        penarikan_hp_nas.setBackground(new java.awt.Color(230, 232, 235));
        penarikan_hp_nas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penarikan_hp_nas.setEnabled(false);
        penarikan_hp_nas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikan_hp_nasActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(136, 135, 135));
        jLabel53.setText("Total Saldo");

        penarikan_total_saldo_nas.setBackground(new java.awt.Color(230, 232, 235));
        penarikan_total_saldo_nas.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penarikan_total_saldo_nas.setEnabled(false);
        penarikan_total_saldo_nas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikan_total_saldo_nasActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(136, 135, 135));
        jLabel54.setText("Jumlah Penarikan");

        penarikan_jumlah_penarikan_saldo.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        penarikan_jumlah_penarikan_saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penarikan_jumlah_penarikan_saldoActionPerformed(evt);
            }
        });
        penarikan_jumlah_penarikan_saldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                penarikan_jumlah_penarikan_saldoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(penarikan_jumlah_penarikan_saldo, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                        .addComponent(jLabel54))
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44)
                        .addComponent(jLabel45)
                        .addComponent(penarikan_nama_nas)
                        .addComponent(penarikan_alamat_nas, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(penarikan_hp_nas)
                        .addComponent(penarikan_id_nas)
                        .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(penarikan_total_saldo_nas)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penarikan_id_nas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penarikan_nama_nas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penarikan_alamat_nas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penarikan_hp_nas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penarikan_total_saldo_nas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(penarikan_jumlah_penarikan_saldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(204, 204, 255));

        jLabel52.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel52.setText("Tanggal");

        txt_date1.setBackground(new java.awt.Color(255, 255, 255));
        txt_date1.setDateFormatString("yyyy-MM-dd");
        txt_date1.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addComponent(txt_date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(217, 217, 217))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addGap(3, 3, 3)
                .addComponent(txt_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txt_simpan_tabungan1.setBackground(new java.awt.Color(115, 125, 206));
        txt_simpan_tabungan1.setText("Tarik Saldo");
        txt_simpan_tabungan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_simpan_tabungan1MouseClicked(evt);
            }
        });
        txt_simpan_tabungan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_simpan_tabungan1ActionPerformed(evt);
            }
        });

        txt_id_sim1.setForeground(new java.awt.Color(255, 255, 255));
        txt_id_sim1.setText("id_label");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_simpan_tabungan1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id_sim1)
                            .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id_sim1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_simpan_tabungan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tabel_penarikan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_penarikan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "15/05/2009", "Arta Wiguna", "10000"}
            },
            new String [] {
                "No.", "Tanggal", "Id Nas", "Penarikan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_penarikan.setAltoHead(30);
        tabel_penarikan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_penarikan.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tabel_penarikan.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tabel_penarikan.setColorFilasBackgound2(new java.awt.Color(244, 244, 244));
        tabel_penarikan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_penarikan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_penarikan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_penarikan.setRowHeight(23);
        jScrollPane3.setViewportView(tabel_penarikan);
        if (tabel_penarikan.getColumnModel().getColumnCount() > 0) {
            tabel_penarikan.getColumnModel().getColumn(0).setMinWidth(50);
            tabel_penarikan.getColumnModel().getColumn(0).setMaxWidth(50);
            tabel_penarikan.getColumnModel().getColumn(1).setMinWidth(100);
            tabel_penarikan.getColumnModel().getColumn(1).setMaxWidth(100);
            tabel_penarikan.getColumnModel().getColumn(3).setMinWidth(100);
            tabel_penarikan.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        jLabel51.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel51.setText("Histori Penarikan");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonHover9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(12, 12, 12)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Tabpane.addTab("penarikan", jPanel23);

        jPanel48.setBackground(new java.awt.Color(255, 255, 255));

        jPanel52.setBackground(new java.awt.Color(248, 248, 248));
        jPanel52.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        laporan_date_setoran_dari.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_setoran_dari.setDateFormatString("dd-MM-yyyy");
        laporan_date_setoran_dari.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_setoran_dariPropertyChange(evt);
            }
        });

        jLabel108.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel108.setText("DARI");

        jLabel109.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel109.setText("SAMPAI");

        laporan_date_setoran_sampai.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_setoran_sampai.setDateFormatString("dd-MM-yyyy");
        laporan_date_setoran_sampai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_setoran_sampaiPropertyChange(evt);
            }
        });

        rSButtonHover21.setBackground(new java.awt.Color(153, 51, 255));
        rSButtonHover21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/Print-24.png"))); // NOI18N
        rSButtonHover21.setText("PRINT");
        rSButtonHover21.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover21ActionPerformed(evt);
            }
        });

        tabel_laporan_setoran.setForeground(new java.awt.Color(0, 0, 0));
        tabel_laporan_setoran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "ID Nasabah", "Sampah", "Harga", "Kg", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_laporan_setoran.setToolTipText("klik 2x untuk melihat detil nasabah");
        tabel_laporan_setoran.setAltoHead(30);
        tabel_laporan_setoran.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_laporan_setoran.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tabel_laporan_setoran.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tabel_laporan_setoran.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabel_laporan_setoran.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_laporan_setoran.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_laporan_setoran.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_laporan_setoran.setRowHeight(23);
        tabel_laporan_setoran.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(tabel_laporan_setoran);
        if (tabel_laporan_setoran.getColumnModel().getColumnCount() > 0) {
            tabel_laporan_setoran.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_laporan_setoran.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        rSButtonHover22.setBackground(new java.awt.Color(0, 0, 255));
        rSButtonHover22.setText("TAMPILKAN");
        rSButtonHover22.setColorHover(new java.awt.Color(49, 49, 252));
        rSButtonHover22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover22ActionPerformed(evt);
            }
        });

        rSButtonHover23.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover23.setText("<< KEMBALI");
        rSButtonHover23.setColorHover(new java.awt.Color(134, 131, 131));
        rSButtonHover23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover23ActionPerformed(evt);
            }
        });

        rSButtonHover30.setBackground(new java.awt.Color(102, 153, 255));
        rSButtonHover30.setText("LAPORAN SETORAN");
        rSButtonHover30.setColorHover(new java.awt.Color(134, 131, 131));
        rSButtonHover30.setEnabled(false);
        rSButtonHover30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(laporan_date_setoran_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(laporan_date_setoran_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonHover22, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonHover21, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel52Layout.createSequentialGroup()
                                .addComponent(jLabel108)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel109)))
                        .addGap(0, 276, Short.MAX_VALUE))
                    .addGroup(jPanel52Layout.createSequentialGroup()
                        .addComponent(rSButtonHover23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel52Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonHover23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laporan_date_setoran_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(laporan_date_setoran_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tabpane.addTab("laporan_setoran", jPanel48);

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));

        jPanel56.setBackground(new java.awt.Color(248, 248, 248));
        jPanel56.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        laporan_date_penarikan_dari.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_penarikan_dari.setDateFormatString("dd-MM-yyyy");
        laporan_date_penarikan_dari.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_penarikan_dariPropertyChange(evt);
            }
        });

        jLabel117.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel117.setText("DARI");

        jLabel118.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel118.setText("SAMPAI");

        laporan_date_penarikan_sampai.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_penarikan_sampai.setDateFormatString("dd-MM-yyyy");
        laporan_date_penarikan_sampai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_penarikan_sampaiPropertyChange(evt);
            }
        });

        rSButtonHover24.setBackground(new java.awt.Color(153, 51, 255));
        rSButtonHover24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/Print-24.png"))); // NOI18N
        rSButtonHover24.setText("PRINT");
        rSButtonHover24.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover24ActionPerformed(evt);
            }
        });

        tabel_laporan_penarikan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_laporan_penarikan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Kode Nasabah", "Jumlah Penarikan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_laporan_penarikan.setToolTipText("klik 2x untuk melihat detil nasabah");
        tabel_laporan_penarikan.setAltoHead(30);
        tabel_laporan_penarikan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_laporan_penarikan.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tabel_laporan_penarikan.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tabel_laporan_penarikan.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabel_laporan_penarikan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_laporan_penarikan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_laporan_penarikan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_laporan_penarikan.setRowHeight(23);
        jScrollPane9.setViewportView(tabel_laporan_penarikan);
        if (tabel_laporan_penarikan.getColumnModel().getColumnCount() > 0) {
            tabel_laporan_penarikan.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_laporan_penarikan.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        rSButtonHover25.setBackground(new java.awt.Color(0, 0, 255));
        rSButtonHover25.setText("TAMPILKAN");
        rSButtonHover25.setColorHover(new java.awt.Color(49, 49, 252));
        rSButtonHover25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover25ActionPerformed(evt);
            }
        });

        rSButtonHover26.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover26.setText("<< KEMBALI");
        rSButtonHover26.setColorHover(new java.awt.Color(134, 131, 131));
        rSButtonHover26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover26ActionPerformed(evt);
            }
        });

        rSButtonHover31.setBackground(new java.awt.Color(255, 102, 102));
        rSButtonHover31.setText("LAPORAN PENARIKAN");
        rSButtonHover31.setColorHover(new java.awt.Color(255, 102, 102));
        rSButtonHover31.setEnabled(false);
        rSButtonHover31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addComponent(laporan_date_penarikan_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(laporan_date_penarikan_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonHover25, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonHover24, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel56Layout.createSequentialGroup()
                                .addComponent(jLabel117)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel118)))
                        .addGap(0, 276, Short.MAX_VALUE))
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(rSButtonHover26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonHover26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118)
                    .addComponent(jLabel117))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laporan_date_penarikan_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(laporan_date_penarikan_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel50Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tabpane.addTab("lap_penarikan", jPanel50);

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));

        jPanel60.setBackground(new java.awt.Color(248, 248, 248));
        jPanel60.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        laporan_date_penjualan_dari.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_penjualan_dari.setDateFormatString("dd-MM-yyyy");
        laporan_date_penjualan_dari.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_penjualan_dariPropertyChange(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel126.setText("DARI");

        jLabel127.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel127.setText("SAMPAI");

        laporan_date_pejualan_sampai.setBackground(new java.awt.Color(248, 248, 248));
        laporan_date_pejualan_sampai.setDateFormatString("dd-MM-yyyy");
        laporan_date_pejualan_sampai.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                laporan_date_pejualan_sampaiPropertyChange(evt);
            }
        });

        rSButtonHover27.setBackground(new java.awt.Color(153, 51, 255));
        rSButtonHover27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gambar/Print-24.png"))); // NOI18N
        rSButtonHover27.setText("PRINT");
        rSButtonHover27.setColorHover(new java.awt.Color(171, 103, 240));
        rSButtonHover27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover27ActionPerformed(evt);
            }
        });

        tabel_laporan_penjualan.setForeground(new java.awt.Color(0, 0, 0));
        tabel_laporan_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tanggal", "Pengepul", "Sampah", "Harga", "Kg", "Jumlah Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_laporan_penjualan.setToolTipText("klik 2x untuk melihat detil nasabah");
        tabel_laporan_penjualan.setAltoHead(30);
        tabel_laporan_penjualan.setColorBackgoundHead(new java.awt.Color(51, 51, 51));
        tabel_laporan_penjualan.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        tabel_laporan_penjualan.setColorBordeHead(new java.awt.Color(153, 153, 153));
        tabel_laporan_penjualan.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tabel_laporan_penjualan.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        tabel_laporan_penjualan.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        tabel_laporan_penjualan.setGridColor(new java.awt.Color(255, 255, 255));
        tabel_laporan_penjualan.setRowHeight(23);
        jScrollPane10.setViewportView(tabel_laporan_penjualan);
        if (tabel_laporan_penjualan.getColumnModel().getColumnCount() > 0) {
            tabel_laporan_penjualan.getColumnModel().getColumn(0).setMinWidth(100);
            tabel_laporan_penjualan.getColumnModel().getColumn(0).setMaxWidth(100);
            tabel_laporan_penjualan.getColumnModel().getColumn(2).setHeaderValue("Sampah");
            tabel_laporan_penjualan.getColumnModel().getColumn(3).setHeaderValue("Harga");
            tabel_laporan_penjualan.getColumnModel().getColumn(4).setHeaderValue("Kg");
            tabel_laporan_penjualan.getColumnModel().getColumn(5).setHeaderValue("Jumlah Total");
        }

        rSButtonHover28.setBackground(new java.awt.Color(0, 0, 255));
        rSButtonHover28.setText("TAMPILKAN");
        rSButtonHover28.setColorHover(new java.awt.Color(49, 49, 252));
        rSButtonHover28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover28ActionPerformed(evt);
            }
        });

        rSButtonHover29.setBackground(new java.awt.Color(102, 102, 102));
        rSButtonHover29.setText("<< KEMBALI");
        rSButtonHover29.setColorHover(new java.awt.Color(134, 131, 131));
        rSButtonHover29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover29ActionPerformed(evt);
            }
        });

        rSButtonHover32.setBackground(new java.awt.Color(0, 204, 0));
        rSButtonHover32.setText("LAPORAN PENJUALAN SAMPAH");
        rSButtonHover32.setToolTipText("");
        rSButtonHover32.setColorHover(new java.awt.Color(134, 131, 131));
        rSButtonHover32.setEnabled(false);
        rSButtonHover32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel60Layout.createSequentialGroup()
                                .addComponent(laporan_date_penjualan_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(laporan_date_pejualan_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rSButtonHover28, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rSButtonHover27, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel60Layout.createSequentialGroup()
                                .addComponent(jLabel126)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel127)))
                        .addGap(0, 276, Short.MAX_VALUE))
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(rSButtonHover29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSButtonHover32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonHover29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127)
                    .addComponent(jLabel126))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(laporan_date_pejualan_sampai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rSButtonHover27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonHover28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(laporan_date_penjualan_dari, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel51Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Tabpane.addTab("lap_penjualann", jPanel51);

        main_password_confirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                main_password_confirmasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 999, Short.MAX_VALUE)
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(414, 414, 414)
                    .addComponent(main_password_confirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(415, Short.MAX_VALUE)))
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel53Layout.createSequentialGroup()
                    .addGap(351, 351, 351)
                    .addComponent(main_password_confirmasi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(351, Short.MAX_VALUE)))
        );

        Tabpane.addTab("tab14", jPanel53);

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_7, btn_6, btn_8});
        Fungsi.Tabel_sampah("");
        Fungsi.Tabel_nasabah("");
        labelSampah.setText(Float.toString(totalSampah()));
        labelNasabah.setText(Integer.toString(jumlahNasabah()));
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_1MouseClicked

    private void btn_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_1MouseExited

    }//GEN-LAST:event_btn_1MouseExited

    private void btn_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseClicked
        Tabpane.setSelectedIndex(1);
        setColor(btn_2);
//        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_7, btn_6});
    }//GEN-LAST:event_btn_2MouseClicked

    private void btn_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_2MouseExited

    private void btn_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseClicked
        Tabpane.setSelectedIndex(2);
        setColor(btn_3);
//        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_1, btn_4, btn_5, btn_7, btn_6, btn_8});
    }//GEN-LAST:event_btn_3MouseClicked

    private void btn_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_3MouseExited

    private void btn_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseClicked
        Tabpane.setSelectedIndex(3);
        setColor(btn_4);
//        ind_4.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_5, btn_7, btn_6, btn_8});
    }//GEN-LAST:event_btn_4MouseClicked

    private void btn_4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_4MouseExited

    private void btn_5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseClicked
        Tabpane.setSelectedIndex(4);
        setColor(btn_5);
//        ind_5.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_1, btn_7, btn_6, btn_8});
        this.penjualan_id_pengepul.requestFocus();
    }//GEN-LAST:event_btn_5MouseClicked

    private void btn_5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_5MouseExited

    private void btn_6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseClicked
        Tabpane.setSelectedIndex(5);
        setColor(btn_6);
//        ind_6.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_7, btn_1, btn_8});
    }//GEN-LAST:event_btn_6MouseClicked

    private void btn_6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_6MouseExited

    private void btn_2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_2MousePressed

    }//GEN-LAST:event_btn_2MousePressed

    private void btn_7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_7MouseClicked

        dialogPassword dp = new dialogPassword(this, true);
        dialogPassword.confirmasi_password_jpassword.requestFocus();
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

    private void btn_5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_5MousePressed


    }//GEN-LAST:event_btn_5MousePressed

    private void btn_6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_6MousePressed

    }//GEN-LAST:event_btn_6MousePressed

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

        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_1, btn_6, btn_7});
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

    private void rSButtonHover29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover29ActionPerformed
        Tabpane.setSelectedIndex(5);
    }//GEN-LAST:event_rSButtonHover29ActionPerformed

    private void rSButtonHover28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover28ActionPerformed
        Fungsi.Tabel_laporan_penjualan("");
    }//GEN-LAST:event_rSButtonHover28ActionPerformed

    private void rSButtonHover27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover27ActionPerformed
        try {
            param.put("tglDari", tglFrom);
            param.put("tglSampai", tglUntil);
            //            File file = new File("src/com/laporan/lp.jrxml");
            InputStream file = getClass().getResourceAsStream("/com/laporan/lp_penjualan.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, konek);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_rSButtonHover27ActionPerformed

    private void laporan_date_pejualan_sampaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_pejualan_sampaiPropertyChange
        if (laporan_date_pejualan_sampai.getDate() != null) {
            tglUntil = format.format(laporan_date_pejualan_sampai.getDate());

        }
    }//GEN-LAST:event_laporan_date_pejualan_sampaiPropertyChange

    private void laporan_date_penjualan_dariPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_penjualan_dariPropertyChange
        if (laporan_date_penjualan_dari.getDate() != null) {
            tglFrom = format.format(laporan_date_penjualan_dari.getDate());

        }
    }//GEN-LAST:event_laporan_date_penjualan_dariPropertyChange

    private void rSButtonHover26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover26ActionPerformed
        Tabpane.setSelectedIndex(5);
    }//GEN-LAST:event_rSButtonHover26ActionPerformed

    private void rSButtonHover25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover25ActionPerformed
        Fungsi.Tabel_laporan_penarikan("");
    }//GEN-LAST:event_rSButtonHover25ActionPerformed

    private void rSButtonHover24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover24ActionPerformed
        try {
            param.put("tglDari", tglFrom);
            param.put("tglSampai", tglUntil);
            //            File file = new File("src/com/laporan/lp.jrxml");
            InputStream file = getClass().getResourceAsStream("/com/laporan/lp_penarikan.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, konek);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_rSButtonHover24ActionPerformed

    private void laporan_date_penarikan_sampaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_penarikan_sampaiPropertyChange
        if (laporan_date_penarikan_sampai.getDate() != null) {
            tglUntil = format.format(laporan_date_penarikan_sampai.getDate());

        }
    }//GEN-LAST:event_laporan_date_penarikan_sampaiPropertyChange

    private void laporan_date_penarikan_dariPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_penarikan_dariPropertyChange
        if (laporan_date_penarikan_dari.getDate() != null) {
            tglFrom = format.format(laporan_date_penarikan_dari.getDate());

        }
    }//GEN-LAST:event_laporan_date_penarikan_dariPropertyChange

    private void rSButtonHover23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover23ActionPerformed
        Tabpane.setSelectedIndex(5);
    }//GEN-LAST:event_rSButtonHover23ActionPerformed

    private void rSButtonHover22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover22ActionPerformed
        Fungsi.Tabel_laporan_setoran("");
    }//GEN-LAST:event_rSButtonHover22ActionPerformed

    private void rSButtonHover21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover21ActionPerformed
        try {
            param.put("tglDari", tglFrom);
            param.put("tglSampai", tglUntil);
            //            File file = new File("src/com/laporan/lp.jrxml");
            InputStream file = getClass().getResourceAsStream("/com/laporan/lp_setoran.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, konek);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);

        }
    }//GEN-LAST:event_rSButtonHover21ActionPerformed

    private void laporan_date_setoran_sampaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_setoran_sampaiPropertyChange
        if (laporan_date_setoran_sampai.getDate() != null) {
            tglUntil = format.format(laporan_date_setoran_sampai.getDate());

        }
    }//GEN-LAST:event_laporan_date_setoran_sampaiPropertyChange

    private void laporan_date_setoran_dariPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_setoran_dariPropertyChange
        if (laporan_date_setoran_dari.getDate() != null) {
            tglFrom = format.format(laporan_date_setoran_dari.getDate());

        }
    }//GEN-LAST:event_laporan_date_setoran_dariPropertyChange

    private void jPanel31AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel31AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel31AncestorAdded

    private void txt_simpan_tabungan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_simpan_tabungan1ActionPerformed
        int pesankeluar = JOptionPane.showOptionDialog(this, "apakah anda yakin ingin menarik saldo tabungan ? " + "\nSetelah menekan ya proses tidak bisa dibatalkan", "Konfirmasi penarikan", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (pesankeluar == JOptionPane.YES_OPTION) {
            if (this.penarikan_id_nas.getText().length() == 0
                    || this.penarikan_jumlah_penarikan_saldo.getText().length() == 0) {
                //            /       || /this.txtERROR.setText("SEMUA HARUS DIISI");
                JOptionPane.showMessageDialog(this,
                        "SEMUA HARUS DIISI", "INFORMASI", JOptionPane.WARNING_MESSAGE);

            } else {
                //                tambahpenarikan();
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String startDateString = dateFormat.format(txt_date1.getDate());

                    Query s = new Query();
                    //                s.setId_sim(this.txt_id_sim.getText());

                    s.setKode_nas(penarikan_id_nas.getText());
                    s.setTgl_pen(startDateString);
                    s.setSaldo_penarikan(penarikan_isi_penarikan.getText());

                    if (Fungsi.createPenarikan(s)) {
                        //                    setClean();
                        Fungsi.Tabel_nasabah("");
                        Fungsi.Tabel_penarikan("");

                        JOptionPane.showMessageDialog(this,
                                "Penarikan Saldo Sukses !", "SUKSES", JOptionPane.INFORMATION_MESSAGE);

                    } else {
                        JOptionPane.showMessageDialog(this,
                                "penarikan Saldo Gagal !", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    //                TabPane.setSelectedIndex(3);
                    clean_penarikan();

                } catch (Exception e) {
                    System.out.println(e);
                }

            }

        }
    }//GEN-LAST:event_txt_simpan_tabungan1ActionPerformed

    private void txt_simpan_tabungan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_simpan_tabungan1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_simpan_tabungan1MouseClicked

    private void penarikan_jumlah_penarikan_saldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikan_jumlah_penarikan_saldoActionPerformed
        try {
            int totalsaldo = Integer.parseInt(this.penarikan_total_saldo_nas.getText());
            int penarikan = Integer.parseInt(this.penarikan_jumlah_penarikan_saldo.getText());
            if (totalsaldo >= penarikan) {
                if (penarikan_jumlah_penarikan_saldo.getText().equals("")) {

                }

                perhitunganpenarikansaldo();

            } else {
                JOptionPane.showMessageDialog(this, "jumlah penarikan lebih besar dari jumlah saldo nasabah, silakan periksa lagi !");
            }

        } catch (Exception e) {
        }


    }//GEN-LAST:event_penarikan_jumlah_penarikan_saldoActionPerformed

    private void penarikan_total_saldo_nasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikan_total_saldo_nasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_total_saldo_nasActionPerformed

    private void penarikan_hp_nasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikan_hp_nasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_hp_nasActionPerformed

    private void penarikan_alamat_nasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikan_alamat_nasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_alamat_nasActionPerformed

    private void penarikan_nama_nasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikan_nama_nasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_nama_nasActionPerformed

    private void penarikan_id_nasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penarikan_id_nasKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_id_nasKeyReleased

    private void penarikan_id_nasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penarikan_id_nasKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_id_nasKeyPressed

    private void penarikan_id_nasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penarikan_id_nasKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_penarikan_id_nasKeyTyped

    private void penarikan_id_nasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penarikan_id_nasActionPerformed
        try {
            //            connection.Konek con = new Konek();
            //            //    private static final Connection konek = con.getKonek();
            //            //        PreparedStatement ps = null;
            //            Connection konek = con.getKonek();
            String sql = "SELECT * FROM nasabah WHERE kode_nas = '" + penarikan_id_nas.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                penarikan_nama_nas.setText(rs.getString("nama_nas"));
                penarikan_alamat_nas.setText(rs.getString("alamat_nas"));
                penarikan_hp_nas.setText(rs.getString("hp_nas"));
                penarikan_total_saldo_nas.setText(rs.getString("saldo_nas"));
                //                penarikan_isi_id_nas.setText(rs.getString("kode_nas"));
                //                txt_alamat_nasabah.setText(rs.getString("username"));
                //                txt_noHp.setText(rs.getString("password"));

            }

            penarikan_jumlah_penarikan_saldo.requestFocus();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_penarikan_id_nasActionPerformed

    private void rSButtonHover9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover9ActionPerformed

    private void rSButtonHover9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover9MouseClicked
        Tabpane.setSelectedIndex(1);
    }//GEN-LAST:event_rSButtonHover9MouseClicked

    private void rSButtonHover14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover14ActionPerformed

    private void rSButtonHover14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover14MouseClicked
        Tabpane.setSelectedIndex(2);
        setColor(btn_3);
        //        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_1, btn_4, btn_5, btn_7, btn_6});
    }//GEN-LAST:event_rSButtonHover14MouseClicked

    private void rSButtonHover8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover8ActionPerformed
        clean_tabungan();
    }//GEN-LAST:event_rSButtonHover8ActionPerformed

    private void rSButtonHover8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover8MouseClicked

    private void txt_simpan_tabunganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_simpan_tabunganActionPerformed
        int pesankeluar = JOptionPane.showOptionDialog(this, "Apakah data-data sudah benar ?", "Konfirmasi menabung", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

        if (pesankeluar == JOptionPane.YES_OPTION) {
            if (this.tabung_nama_nasabah.getText().length() == 0
                    || this.tabung_id_nasabah.getText().length() == 0
                    || this.tabung_jenis_sampah.getText().length() == 0
                    || this.tabung_banyak_sampah.getText().length() == 0) {
                //            /       || /this.txtERROR.setText("SEMUA HARUS DIISI");
                JOptionPane.showMessageDialog(this,
                        "Ups, input data salah", "INFO", JOptionPane.WARNING_MESSAGE);

            } else {
                tambahSimpanan();
                clean_tabungan();

            }

        }

    }//GEN-LAST:event_txt_simpan_tabunganActionPerformed

    private void txt_simpan_tabunganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_simpan_tabunganMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_simpan_tabunganMouseClicked

    private void tabung_banyak_sampahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabung_banyak_sampahKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE || (karakter == KeyEvent.VK_ENTER))))) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Hanya Boleh Memasukkan Angka !");

        }
    }//GEN-LAST:event_tabung_banyak_sampahKeyTyped

    private void tabung_banyak_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_banyak_sampahActionPerformed
//        try {
        String hargaSampah = this.tabung_harga_sampah.getText();
        String beratSampah = this.tabung_banyak_sampah.getText();

//            int harga = Integer.parseInt(tabung_harga_sampah.getText());
//            int berat = Integer.parseInt(tabung_banyak_sampah.getText());
//            int hasil;
        double harga = Double.valueOf(tabung_harga_sampah.getText());
        double berat = Double.valueOf(tabung_banyak_sampah.getText());
        double hasil;
        hasil = harga * berat;
        String hasilString = String.valueOf(hasil);

        //        int a = Integer.parseInt(this.fd_panjang.getText());
        tabung_total.setText(hasilString);

        //            fd_panjang.requestFocus();
        txt_simpan_tabungan.requestFocus();
//        } catch (Exception e) {
//
//        }
    }//GEN-LAST:event_tabung_banyak_sampahActionPerformed

    private void txt_button_jemputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_button_jemputActionPerformed
        try {

            Connection konek = con.getKonek();
            String sql = "SELECT * FROM sampah WHERE kode_samp = '" + tabung_id_sampah.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                tabung_harga_sampah.setText(rs.getString("harga_2"));
                //                txt_alamat_nasabah.setText(rs.getString("username"));
                //                txt_noHp.setText(rs.getString("password"));

            }

            txt_button_datang.requestFocus();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_button_jemputActionPerformed

    private void txt_button_datangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_button_datangActionPerformed
        try {

            Connection konek = con.getKonek();
            String sql = "SELECT * FROM sampah WHERE kode_samp = '" + tabung_id_sampah.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                tabung_harga_sampah.setText(rs.getString("harga_1"));
                //                txt_alamat_nasabah.setText(rs.getString("username"));
                //                txt_noHp.setText(rs.getString("password"));

            }

            txt_button_datang.requestFocus();

        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_txt_button_datangActionPerformed

    private void tabung_id_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_id_sampahActionPerformed

        try {

            Connection konek = con.getKonek();
            String sql = "SELECT * FROM sampah WHERE kode_samp = '" + tabung_id_sampah.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                tabung_jenis_sampah.setText(rs.getString("nama_samp"));
                tabung_harga_sampah.setText(rs.getString("harga_1"));
                //                txt_alamat_nasabah.setText(rs.getString("username"));
                //                txt_noHp.setText(rs.getString("password"));

            }

            tabung_banyak_sampah.requestFocus();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_tabung_id_sampahActionPerformed

    private void tabung_id_nasabahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabung_id_nasabahKeyReleased

    }//GEN-LAST:event_tabung_id_nasabahKeyReleased

    private void tabung_id_nasabahKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabung_id_nasabahKeyPressed
        //
    }//GEN-LAST:event_tabung_id_nasabahKeyPressed

    private void tabung_id_nasabahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabung_id_nasabahKeyTyped

    }//GEN-LAST:event_tabung_id_nasabahKeyTyped

    private void tabung_id_nasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_id_nasabahActionPerformed

        try {
            String sql = "SELECT * FROM nasabah WHERE kode_nas = '" + tabung_id_nasabah.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                tabung_nama_nasabah.setText(rs.getString("nama_nas"));

            }

            tabung_id_sampah.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Nasabah Tidak ditemukan");
        }

    }//GEN-LAST:event_tabung_id_nasabahActionPerformed

    private void tabung_harga_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_harga_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabung_harga_sampahActionPerformed

    private void tabung_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabung_totalActionPerformed

    private void tabung_jenis_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_jenis_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabung_jenis_sampahActionPerformed

    private void tabung_nama_nasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabung_nama_nasabahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabung_nama_nasabahActionPerformed

    private void rSButtonHover7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover7ActionPerformed

    private void rSButtonHover7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover7MouseClicked
        Tabpane.setSelectedIndex(1);
    }//GEN-LAST:event_rSButtonHover7MouseClicked

    private void jPanel45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel45MousePressed
        Tabpane.setSelectedIndex(10);
        //        setColor(btn_6);
        ////        ind_6.setOpaque(true);
        //        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_7, btn_1, btn_8});
    }//GEN-LAST:event_jPanel45MousePressed

    private void rSButtonHover19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover19ActionPerformed
        Fungsi.Tabel_laporan_tabungan("");
    }//GEN-LAST:event_rSButtonHover19ActionPerformed

    private void rSButtonHover18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover18ActionPerformed
        try {
            param.put("tglDari", tglFrom);
            param.put("tglSampai", tglUntil);
            //            File file = new File("src/com/laporan/lp.jrxml");
            InputStream file = getClass().getResourceAsStream("/com/laporan/laporan.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, param, konek);
            JasperViewer.viewReport(jasperPrint, false);

        } catch (Exception e) {
            System.out.println(e);

        }

    }//GEN-LAST:event_rSButtonHover18ActionPerformed

    private void laporan_date_sampaiPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_sampaiPropertyChange
        if (laporan_date_sampai.getDate() != null) {
            tglUntil = format.format(laporan_date_sampai.getDate());

        }
    }//GEN-LAST:event_laporan_date_sampaiPropertyChange

    private void laporan_date_dariPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_laporan_date_dariPropertyChange
        if (laporan_date_dari.getDate() != null) {
            tglFrom = format.format(laporan_date_dari.getDate());

        }
    }//GEN-LAST:event_laporan_date_dariPropertyChange

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
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_5, btn_7, btn_6});
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
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_5, btn_7, btn_6});        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11ActionPerformed

    private void rSButtonHover11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover11MouseClicked

    private void rSButtonHover15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover15ActionPerformed
        Tabpane.setSelectedIndex(4);

        setColor(btn_5);
        //        ind_5.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_3, btn_4, btn_1, btn_7, btn_6});

        try {
            int baris = tabel_sampah.getSelectedRow();
            this.penjualan_id_sampah.setText(tabel_sampah.getValueAt(baris, 1).toString());
            //            tabung_id_sampahActionPerformed(evt);
            penjualan_id_sampahActionPerformed(evt);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_rSButtonHover15ActionPerformed

    private void rSButtonHover13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover13ActionPerformed
        Tabpane.setSelectedIndex(7);

        setColor(btn_2);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_7, btn_6});

        try {
            int baris = tabel_sampah.getSelectedRow();
            this.tabung_id_sampah.setText(tabel_sampah.getValueAt(baris, 1).toString());
            tabung_id_sampahActionPerformed(evt);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_rSButtonHover13ActionPerformed

    private void txt_search_sampahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_sampahKeyReleased
        Fungsi.Tabel_sampah(this.txt_search_sampah.getText());
    }//GEN-LAST:event_txt_search_sampahKeyReleased

    private void txt_search_sampahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_sampahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_sampahActionPerformed

    private void rSButtonHover6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover6ActionPerformed
        //        try {
        //
        //            int baris = tabel_sampah.getSelectedRow();
        //            Samp_detail detail = new Samp_detail(this, true);
        ////            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
        //            detail.txt_id.setText(tabel_nasabah.getValueAt(baris, 0).toString());
        //
        //            try {
        //
        //                Connection konek = con.getKonek();
        //                String sql = "SELECT * FROM sampah WHERE id_samp = '" + Samp_detail.txt_id.getText() + "'";
        //                Statement st = konek.createStatement();
        //                ResultSet rs = st.executeQuery(sql);
        //
        //                while (rs.next()) {
        //                    Samp_detail.det_kode_samp.setText(rs.getString("kode_samp"));
        //                    Samp_detail.det_kategori.setText(rs.getString("kategori"));
        //                    Samp_detail.det_nama_sampah.setText(rs.getString("nama_samp"));
        //                    Samp_detail.det_harga_1.setText(rs.getString("harga_1"));
        //                    Samp_detail.det_harga_2.setText(rs.getString("harga_2"));
        //                    Samp_detail.det_harga_pgul.setText(rs.getString("harga_pgul"));
        //                    Samp_detail.det_stok.setText(rs.getString("stok"));
        //                    Samp_detail.det_catatan_sampah.setText(rs.getString("catatan_samp"));
        //
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
        tampil_detail_sampah();
    }//GEN-LAST:event_rSButtonHover6ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        Sampah_tambah sampah = new Sampah_tambah(this, true);
        sampah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void rSButtonHover5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover5MouseClicked

    private void rSButtonHover4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover4ActionPerformed
        proses_penampilan_edit_sampah();
    }//GEN-LAST:event_rSButtonHover4ActionPerformed

    private void rSButtonHover16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover16ActionPerformed

        try {
            //            Date tgl_dari = laporan_date_dari.getDate();
            //            Date tgl_sampai = laporan_date_sampai.getDate();
            //            Has

            InputStream file = getClass().getResourceAsStream("/com/laporan/Laporan_nasabah.jrxml"); //ASLI
            //            InputStream file = getClass().getResourceAsStream("\com\laporan\Laporan_nasabah.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, konek);
            JasperViewer.viewReport(jasperPrint, false);

            //                JasperExportManager.exportReportToPdfFile(jasperPrint, "src\\report\\raport_data_nasabah.pdf");
            //            JasperExportManager.exportReportToPdfFile(jasperPrint, "src/tmp/Data_nasabah.pdf");
            //            JasperExportManager.exportReportToPdf(jasperPrint);
            //             JRDocxExporter exporter = new JRDocxExporter();
            //            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            //            String DataNasabah = null;
            //            File exportReportFile = new File(DataNasabah + ".docx");
            //            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));
            //            exporter.exportReport();
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_rSButtonHover16ActionPerformed

    private void rSButtonHover10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover10ActionPerformed
        Fungsi.Tabel_buku_tabungan("");
        Tabpane.setSelectedIndex(8);
        try {
            int baris = tabel_nasabah.getSelectedRow();
            this.buku_tabungan_id_nasabah.setText(tabel_nasabah.getValueAt(baris, 1).toString());
            this.buku_tabungan_nama_nasabah.setText(tabel_nasabah.getValueAt(baris, 2).toString());
            //            this.buku_tabungan_saldo.setText(tabel_nasabah.getValueAt(baris, 5).toString());
            Fungsi.Tabel_buku_tabungan(this.buku_tabungan_id_nasabah.getText());
            try {
                String sql = "SELECT * FROM nasabah WHERE id_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'";
                Statement st = konek.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Main.buku_tabungan_saldo.setText(rs.getString("saldo_nas"));
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } catch (Exception e) {
        }
    }//GEN-LAST:event_rSButtonHover10ActionPerformed

    private void rSButtonHover12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover12ActionPerformed

        Tabpane.setSelectedIndex(7);

        setColor(btn_2);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_7, btn_6});

        try {
            int baris = tabel_nasabah.getSelectedRow();
            this.tabung_id_nasabah.setText(tabel_nasabah.getValueAt(baris, 1).toString());
            tabung_id_nasabahActionPerformed(evt);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_rSButtonHover12ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed

        //        Tabpane.setSelectedIndex(7);
        //
        //        setColor(btn_2);
        //        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_7, btn_6});
        //
        //        try {
        //            int baris = tabel_nasabah.getSelectedRow();
        //            this.tabung_id_nasabah.setText(tabel_nasabah.getValueAt(baris, 1).toString());
        //            tabung_id_nasabahActionPerformed(evt);
        //
        //        } catch (Exception e) {
        //        }
        tampil_detail_nasabah();
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void txt_search_nasabahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_nasabahKeyReleased
        Fungsi.Tabel_nasabah(this.txt_search_nasabah.getText());
    }//GEN-LAST:event_txt_search_nasabahKeyReleased

    private void txt_search_nasabahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_search_nasabahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_search_nasabahActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        //        try {
        //            int baris = tabel_nasabah.getSelectedRow();
        //            Nas_Edit f = new Nas_Edit(this, true);
        //            f.txt_kode.setText(tabel_nasabah.getValueAt(baris, 1).toString());
        //            f.txt_nama.setText(tabel_nasabah.getValueAt(baris, 2).toString());
        ////            f.txt_alamat.setText(tabel_nasabah.getValueAt(baris, 3).toString());
        ////            f.txt_hp.setText(tabel_nasabah.getValueAt(baris, 4).toString());
        //
        //            f.txt_id.setText(tabel_nasabah.getValueAt(baris, 0).toString());
        //
        //            f.setVisible(true);
        //
        //        } catch (Exception e) {
        //            System.out.println(e);
        //
        //        }

        proses_penampilan_edit_nasabah();
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        //        this.suara.clickLogin();
        Nas_tambah tambah = new Nas_tambah(this, true);
        tambah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover1MouseClicked
        //        suara.clickLogin();
        //        Nas_tambah tambah = new Nas_tambah(this, true);
        //        tambah.setVisible(true);
    }//GEN-LAST:event_rSButtonHover1MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        Tabpane.setSelectedIndex(9);
        penarikan_id_nas.requestFocus();
    }//GEN-LAST:event_jPanel20MouseClicked

    private void jPanel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseClicked
        Tabpane.setSelectedIndex(7);
        tabung_id_nasabah.requestFocus();
    }//GEN-LAST:event_jPanel18MouseClicked

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
        resetColor(new JPanel[]{btn_2, btn_3, btn_1, btn_5, btn_7, btn_6});
    }//GEN-LAST:event_jPanel30MousePressed

    private void jPanel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MousePressed
        Tabpane.setSelectedIndex(2);
        setColor(btn_3);
        //        ind_3.setOpaque(true);
        resetColor(new JPanel[]{btn_2, btn_1, btn_4, btn_5, btn_7, btn_6});
    }//GEN-LAST:event_jPanel17MousePressed

    private void jPanel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MousePressed
        Tabpane.setSelectedIndex(1);
        setColor(btn_2);
        //        ind_2.setOpaque(true);
        resetColor(new JPanel[]{btn_1, btn_3, btn_4, btn_5, btn_7, btn_6});
    }//GEN-LAST:event_jPanel6MousePressed

    private void jPanel46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel46MousePressed
        Tabpane.setSelectedIndex(11);
    }//GEN-LAST:event_jPanel46MousePressed

    private void jPanel47MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel47MousePressed
        Tabpane.setSelectedIndex(12);
    }//GEN-LAST:event_jPanel47MousePressed

    private void rSButtonHover30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover30ActionPerformed

    private void rSButtonHover31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover31ActionPerformed

    private void rSButtonHover32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover32ActionPerformed

    private void rSButtonHover17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover17ActionPerformed
        try {
            //            Date tgl_dari = laporan_date_dari.getDate();
            //            Date tgl_sampai = laporan_date_sampai.getDate();
            //            Has

            InputStream file = getClass().getResourceAsStream("/com/laporan/laporan_sampah.jrxml"); //ASLI
            //            InputStream file = getClass().getResourceAsStream("\com\laporan\Laporan_nasabah.jrxml");
            jasperDesign = JRXmlLoader.load(file);
            param.clear();
            jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, konek);
            JasperViewer.viewReport(jasperPrint, false);

            //                JasperExportManager.exportReportToPdfFile(jasperPrint, "src\\report\\raport_data_nasabah.pdf");
            //            JasperExportManager.exportReportToPdfFile(jasperPrint, "src/tmp/Data_nasabah.pdf");
            //            JasperExportManager.exportReportToPdf(jasperPrint);
            //             JRDocxExporter exporter = new JRDocxExporter();
            //            exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
            //            String DataNasabah = null;
            //            File exportReportFile = new File(DataNasabah + ".docx");
            //            exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(exportReportFile));
            //            exporter.exportReport();
        } catch (JRException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_rSButtonHover17ActionPerformed

    private void rSButtonHover34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover34ActionPerformed
        gantiPassword gp = new gantiPassword(this, true);
        gantiPassword.gantipassword_id_user.setText(Main.main_id_user.getText());
        gantiPassword.gantipassword_nama.setText(Main.nama_user.getText());

        gantiPassword.gantipassword_baru.requestFocus();
        gp.setVisible(true);

    }//GEN-LAST:event_rSButtonHover34ActionPerformed

    private void rSButtonHover36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonHover36ActionPerformed

    private void rb_plastikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_plastikActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_plastikActionPerformed

    private void rb_kertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_kertasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_kertasActionPerformed

    private void rb_logamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_logamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_logamActionPerformed

    private void rb_botol_kacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_botol_kacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_botol_kacaActionPerformed

    private void br_lainnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_br_lainnyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_br_lainnyaActionPerformed

    private void rSButtonHover20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover20ActionPerformed
        if (rb_plastik.isSelected()) {
            Fungsi.Tabel_sampah_plastik("");
        }
        if (rb_kertas.isSelected()) {
            Fungsi.Tabel_sampah_kertas("");
        }
        if (rb_logam.isSelected()) {
            Fungsi.Tabel_sampah_logam("");
        }
        if (rb_botol_kaca.isSelected()) {
            Fungsi.Tabel_sampah_botol_kaca("");
        } else if (br_lainnya.isSelected()) {
            Fungsi.Tabel_sampah_lainnya("");
        }
    }//GEN-LAST:event_rSButtonHover20ActionPerformed

    private void rSButtonHover33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover33ActionPerformed
        Fungsi.Tabel_sampah("");
        rb_botol_kaca.setSelected(false);
        rb_plastik.setSelected(false);
        rb_kertas.setSelected(false);
        rb_logam.setSelected(false);
        br_lainnya.setSelected(false);
    }//GEN-LAST:event_rSButtonHover33ActionPerformed

    private void main_password_confirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_main_password_confirmasiActionPerformed

    }//GEN-LAST:event_main_password_confirmasiActionPerformed

    private void penarikan_jumlah_penarikan_saldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penarikan_jumlah_penarikan_saldoKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE || (karakter == KeyEvent.VK_ENTER))))) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Hanya Boleh Memasukkan Angka !");

        }
    }//GEN-LAST:event_penarikan_jumlah_penarikan_saldoKeyTyped

    private void penjualan_jumlah_sampahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_penjualan_jumlah_sampahKeyTyped
        char karakter = evt.getKeyChar();
        if (!(((karakter >= '0') && (karakter <= '9') || (karakter == KeyEvent.VK_BACK_SPACE) || (karakter == KeyEvent.VK_DELETE || (karakter == KeyEvent.VK_ENTER))))) {
            getToolkit().beep();
            evt.consume();

            JOptionPane.showMessageDialog(this, "Hanya Boleh Memasukkan Angka !");

        }
    }//GEN-LAST:event_penjualan_jumlah_sampahKeyTyped

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTabbedPane Tabpane;
    private javax.swing.JPanel backgound;
    public static javax.swing.JRadioButton br_lainnya;
    public static javax.swing.JPanel btn_1;
    public static javax.swing.JPanel btn_2;
    public static javax.swing.JPanel btn_3;
    public static javax.swing.JPanel btn_4;
    public static javax.swing.JPanel btn_5;
    public static javax.swing.JPanel btn_6;
    public static javax.swing.JPanel btn_7;
    public static javax.swing.JPanel btn_8;
    public static javax.swing.JLabel buku_tabungan_id_nasabah;
    private javax.swing.JLabel buku_tabungan_nama_nasabah;
    public static javax.swing.JLabel buku_tabungan_saldo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel detail_alamat_nas;
    private javax.swing.JLabel detail_harga1;
    private javax.swing.JLabel detail_harga2;
    private javax.swing.JLabel detail_harga_pengepul;
    private javax.swing.JLabel detail_hp;
    private javax.swing.JLabel detail_id;
    public static javax.swing.JLabel detail_id_sampah;
    private javax.swing.JLabel detail_jenis_sampah;
    private javax.swing.JLabel detail_kategori_sampah;
    private javax.swing.JLabel detail_kode_nas;
    private javax.swing.JLabel detail_kode_samp;
    private javax.swing.JLabel detail_nama_nas;
    private javax.swing.JLabel detail_saldo_nas;
    private javax.swing.JLabel detail_stok;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelNasabah;
    private javax.swing.JLabel labelSampah;
    private javax.swing.JLabel labelTransaksi;
    public static com.toedter.calendar.JDateChooser laporan_date_dari;
    public static com.toedter.calendar.JDateChooser laporan_date_pejualan_sampai;
    public static com.toedter.calendar.JDateChooser laporan_date_penarikan_dari;
    public static com.toedter.calendar.JDateChooser laporan_date_penarikan_sampai;
    public static com.toedter.calendar.JDateChooser laporan_date_penjualan_dari;
    public static com.toedter.calendar.JDateChooser laporan_date_sampai;
    public static com.toedter.calendar.JDateChooser laporan_date_setoran_dari;
    public static com.toedter.calendar.JDateChooser laporan_date_setoran_sampai;
    public static javax.swing.JLabel main_id_user;
    public static javax.swing.JPasswordField main_password_confirmasi;
    private javax.swing.JPanel menubar;
    public static javax.swing.JLabel nama_user;
    private javax.swing.JPanel pane_home;
    private javax.swing.JTextField penarikan_alamat_nas;
    private javax.swing.JTextField penarikan_hp_nas;
    private javax.swing.JTextField penarikan_id_nas;
    private javax.swing.JLabel penarikan_isi_penarikan;
    private javax.swing.JLabel penarikan_isi_saldo;
    private javax.swing.JLabel penarikan_isi_sisa_saldo;
    private javax.swing.JTextField penarikan_jumlah_penarikan_saldo;
    private javax.swing.JTextField penarikan_nama_nas;
    private javax.swing.JTextField penarikan_total_saldo_nas;
    private javax.swing.JTextField penjualan_harga_sampah;
    private javax.swing.JTextField penjualan_id_pengepul;
    private javax.swing.JTextField penjualan_id_sampah;
    private javax.swing.JTextField penjualan_jumlah_sampah;
    private javax.swing.JTextField penjualan_nama_sampah;
    private javax.swing.JTextField penjualan_stok_sampah;
    private javax.swing.JLabel penjualan_total_penjualan_sampah;
    private rojerusan.RSButtonHover rSButtonHover1;
    private rojerusan.RSButtonHover rSButtonHover10;
    private rojerusan.RSButtonHover rSButtonHover11;
    private rojerusan.RSButtonHover rSButtonHover12;
    private rojerusan.RSButtonHover rSButtonHover13;
    private rojerusan.RSButtonHover rSButtonHover14;
    private rojerusan.RSButtonHover rSButtonHover15;
    private rojerusan.RSButtonHover rSButtonHover16;
    private rojerusan.RSButtonHover rSButtonHover17;
    private rojerusan.RSButtonHover rSButtonHover18;
    private rojerusan.RSButtonHover rSButtonHover19;
    private rojerusan.RSButtonHover rSButtonHover2;
    private rojerusan.RSButtonHover rSButtonHover20;
    private rojerusan.RSButtonHover rSButtonHover21;
    private rojerusan.RSButtonHover rSButtonHover22;
    private rojerusan.RSButtonHover rSButtonHover23;
    private rojerusan.RSButtonHover rSButtonHover24;
    private rojerusan.RSButtonHover rSButtonHover25;
    private rojerusan.RSButtonHover rSButtonHover26;
    private rojerusan.RSButtonHover rSButtonHover27;
    private rojerusan.RSButtonHover rSButtonHover28;
    private rojerusan.RSButtonHover rSButtonHover29;
    private rojerusan.RSButtonHover rSButtonHover3;
    private rojerusan.RSButtonHover rSButtonHover30;
    private rojerusan.RSButtonHover rSButtonHover31;
    private rojerusan.RSButtonHover rSButtonHover32;
    private rojerusan.RSButtonHover rSButtonHover33;
    private rojerusan.RSButtonHover rSButtonHover34;
    private rojerusan.RSButtonHover rSButtonHover36;
    private rojerusan.RSButtonHover rSButtonHover4;
    private rojerusan.RSButtonHover rSButtonHover5;
    private rojerusan.RSButtonHover rSButtonHover6;
    private rojerusan.RSButtonHover rSButtonHover7;
    private rojerusan.RSButtonHover rSButtonHover8;
    private rojerusan.RSButtonHover rSButtonHover9;
    public static javax.swing.JRadioButton rb_botol_kaca;
    public static javax.swing.JRadioButton rb_kertas;
    public static javax.swing.JRadioButton rb_logam;
    public static javax.swing.JRadioButton rb_plastik;
    public static rojerusan.RSTableMetro tabel_buku_tabungan;
    public static rojerusan.RSTableMetro tabel_laporan_penarikan;
    public static rojerusan.RSTableMetro tabel_laporan_penjualan;
    public static rojerusan.RSTableMetro tabel_laporan_setoran;
    public static rojerusan.RSTableMetro tabel_laporan_tabungan;
    public static rojerusan.RSTableMetro tabel_nasabah;
    public static rojerusan.RSTableMetro tabel_penarikan;
    public static rojerusan.RSTableMetro tabel_penjualan;
    public static rojerusan.RSTableMetro tabel_sampah;
    public static rojerusan.RSTableMetro tabel_tabungan;
    private javax.swing.JTextField tabung_banyak_sampah;
    private javax.swing.JTextField tabung_harga_sampah;
    private javax.swing.JTextField tabung_id_nasabah;
    private javax.swing.JTextField tabung_id_sampah;
    private javax.swing.JTextField tabung_jenis_sampah;
    private javax.swing.JTextField tabung_nama_nasabah;
    private javax.swing.JTextField tabung_total;
    private javax.swing.JRadioButton txt_button_datang;
    private javax.swing.JRadioButton txt_button_jemput;
    private com.toedter.calendar.JDateChooser txt_date;
    private com.toedter.calendar.JDateChooser txt_date1;
    private com.toedter.calendar.JDateChooser txt_date_penjualan;
    private javax.swing.JLabel txt_id_sim;
    private javax.swing.JLabel txt_id_sim1;
    private javax.swing.JLabel txt_id_sim2;
    private javax.swing.JTextField txt_search_nasabah;
    private javax.swing.JTextField txt_search_sampah;
    private rojerusan.RSButtonHover txt_simpan_tabungan;
    private rojerusan.RSButtonHover txt_simpan_tabungan1;
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
        tabung_banyak_sampah.setText("");
        tabung_harga_sampah.setText("");
        tabung_id_nasabah.setText("");
        tabung_id_sampah.setText("");
        tabung_nama_nasabah.setText("");
        tabung_total.setText("");
        tabung_jenis_sampah.setText("");
        tabung_id_nasabah.requestFocus();
    }

    private void tambahSimpanan() {
        try {

            String hargaSampah = this.tabung_harga_sampah.getText();
            String beratSampah = this.tabung_banyak_sampah.getText();

//            int harga = Integer.parseInt(tabung_harga_sampah.getText());
//            int berat = Integer.parseInt(tabung_banyak_sampah.getText());
//            int hasil;
//            hasil = harga * berat;
//            String hasilString = String.valueOf(hasil);
            double harga = Double.valueOf(tabung_harga_sampah.getText());
            double berat = Double.valueOf(tabung_banyak_sampah.getText());
            double hasil;
            hasil = harga * berat;
            String hasilString = String.valueOf(hasil);

            tabung_total.setText(hasilString);

//                String date = ((JTextField) txt_tanggal.getDateEditor().getUiComponent()).getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String startDateString = dateFormat.format(txt_date.getDate());
//            kk

            Query s = new Query();
//                s.setId_sim(this.txt_id_sim.getText());
            s.setTgl_sim(startDateString);
            s.setKode_nas(this.tabung_id_nasabah.getText());
            s.setKode_samp(this.tabung_id_sampah.getText());
            s.setNama_samp(this.tabung_jenis_sampah.getText());
            s.setHarga_samp(this.tabung_harga_sampah.getText());
            s.setQty_samp(this.tabung_banyak_sampah.getText());
            s.setTotal_samp(hasilString);

            if (Fungsi.createSimpanan(s)) {
//                    setClean();
                Fungsi.Tabel_nasabah("");
                Fungsi.Tabel_sampah("");
                Fungsi.Tabel_Simpanan("");
//                    ts.clickGo();
                JOptionPane.showMessageDialog(this,
                        "Menabung Sukses !", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this,
                        "PENAMBAHAN GAGAL", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
//                TabPane.setSelectedIndex(3);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void tambahpenarikan() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String startDateString = dateFormat.format(txt_date1.getDate());

            Query s = new Query();
//                s.setId_sim(this.txt_id_sim.getText());

            s.setKode_nas(this.penarikan_id_nas.getText());
            s.setTgl_pen(startDateString);
            s.setSaldo_nas(this.penarikan_isi_penarikan.getText());

            if (Fungsi.createPenarikan(s)) {
//                    setClean();
                Fungsi.Tabel_nasabah("");
                Fungsi.Tabel_penarikan("");

                JOptionPane.showMessageDialog(this,
                        "Penarikan Saldo Sukses !", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this,
                        "penarikan Saldo Gagal !", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
//                TabPane.setSelectedIndex(3);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void clean_penarikan() {
        penarikan_id_nas.setText("");
        penarikan_nama_nas.setText("");
        penarikan_alamat_nas.setText("");
        penarikan_hp_nas.setText("");
        penarikan_total_saldo_nas.setText("");
        penarikan_jumlah_penarikan_saldo.setText("");
        penarikan_isi_saldo.setText("xxxxxxx");
        penarikan_isi_penarikan.setText("xxxxxxx");
        penarikan_isi_sisa_saldo.setText("xxxxxxx");
        penarikan_id_nas.requestFocus();

    }

    private void perhitunganpenarikansaldo() {
        try {
            String sql = "SELECT * FROM nasabah WHERE kode_nas = '" + penarikan_id_nas.getText() + "'";
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                penarikan_isi_saldo.setText(rs.getString("saldo_nas"));
                penarikan_isi_penarikan.setText(this.penarikan_jumlah_penarikan_saldo.getText());

            }
            String hargaSampah = this.penarikan_isi_saldo.getText();
            String beratSampah = this.penarikan_isi_penarikan.getText();

            int harga = Integer.parseInt(penarikan_isi_saldo.getText());
            int berat = Integer.parseInt(penarikan_isi_penarikan.getText());
            int hasil;
            hasil = harga - berat;
            String hasilString = String.valueOf(hasil);
            penarikan_isi_sisa_saldo.setText(hasilString);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void proses_penampilan_edit_nasabah() {
        try {

            int baris = tabel_nasabah.getSelectedRow();
            Nas_Edit detail = new Nas_Edit(this, true);
//            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
            detail.txt_id.setText(tabel_nasabah.getValueAt(baris, 0).toString());

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
        try {

            int baris = tabel_nasabah.getSelectedRow();
//            Nas_Detail detail = new Nas_Detail(this, true);
////            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
            this.detail_id.setText(tabel_nasabah.getValueAt(baris, 0).toString());

            try {

//                Connection konek = con.getKonek();
                String sql = "SELECT * FROM nasabah WHERE id_nas = '" + this.detail_id.getText() + "'";
                Statement st = konek.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    this.detail_kode_nas.setText(rs.getString("kode_nas"));
                    this.detail_nama_nas.setText(rs.getString("nama_nas"));
                    this.detail_alamat_nas.setText(rs.getString("alamat_nas"));
                    this.detail_hp.setText(rs.getString("hp_nas"));
                    this.detail_saldo_nas.setText(rs.getString("saldo_nas"));

                }
//                while (rs.next()) {
//                    Nas_Detail.det_kode.setText(rs.getString("kode_nas"));
//                    Nas_Detail.det_nama.setText(rs.getString("nama_nas"));
//                    Nas_Detail.det_alamat.setText(rs.getString("alamat_nas"));
//                    Nas_Detail.det_hp.setText(rs.getString("hp_nas"));
//                    Nas_Detail.det_saldo.setText(rs.getString("saldo_nas"));
//
//                }

            } catch (Exception e) {
                System.out.println(e);
            }

//            detail.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private void tampil_detail_sampah() {
        try {

            int baris = tabel_sampah.getSelectedRow();
//            Nas_Detail detail = new Nas_Detail(this, true);
////            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
            this.detail_id_sampah.setText(tabel_sampah.getValueAt(baris, 0).toString());

            try {

//                Connection konek = con.getKonek();
                String sql = "SELECT * FROM sampah WHERE id_samp = '" + this.detail_id_sampah.getText() + "'";
                Statement st = konek.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    this.detail_kode_samp.setText(rs.getString("kode_samp"));
                    this.detail_kategori_sampah.setText(rs.getString("kategori"));
                    this.detail_jenis_sampah.setText(rs.getString("nama_samp"));
                    this.detail_harga1.setText(rs.getString("harga_1"));
                    this.detail_harga2.setText(rs.getString("harga_2"));
                    this.detail_harga_pengepul.setText(rs.getString("harga_pgul"));
                    this.detail_stok.setText(rs.getString("stok"));

                }
//                while (rs.next()) {
//                    Nas_Detail.det_kode.setText(rs.getString("kode_nas"));
//                    Nas_Detail.det_nama.setText(rs.getString("nama_nas"));
//                    Nas_Detail.det_alamat.setText(rs.getString("alamat_nas"));
//                    Nas_Detail.det_hp.setText(rs.getString("hp_nas"));
//                    Nas_Detail.det_saldo.setText(rs.getString("saldo_nas"));
//
//                }

            } catch (Exception e) {
                System.out.println(e);
            }

//            detail.setVisible(true);
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    private void proses_penampilan_edit_sampah() {
        try {

            int baris = tabel_sampah.getSelectedRow();
            Sampah_Edit detail = new Sampah_Edit(this, true);
//            f..setText(tabel_nasabah.getValueAt(baris, 1).toString());
            detail.txt_id_edit_sampah.setText(tabel_sampah.getValueAt(baris, 0).toString());

            try {

//                Connection konek = con.getKonek();
                String sql = "SELECT * FROM sampah WHERE id_samp = '" + Sampah_Edit.txt_id_edit_sampah.getText() + "'";
                Statement st = konek.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {

                    Sampah_Edit.edit_kode_sampah.setText(rs.getString("kode_samp"));
//                    Sampah_Edit.edit_kategori_sampah.
                    Sampah_Edit.edit_jenis_sampah.setText(rs.getString("nama_samp"));
                    Sampah_Edit.edit_harga1_sampah.setText(rs.getString("harga_1"));
                    Sampah_Edit.edit_harga2_sampah.setText(rs.getString("harga_2"));
                    Sampah_Edit.edit_hargar_pengepul_sampah.setText(rs.getString("harga_pgul"));
                    Sampah_Edit.edit_stok.setText(rs.getString("stok"));
                }

            } catch (Exception e) {
                System.out.println(e);
            }

            detail.setVisible(true);

        } catch (Exception e) {
            System.out.println(e);

        }
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

}
