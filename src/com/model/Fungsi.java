/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.koneksi.Konek;
import com.sun.org.apache.bcel.internal.generic.InstructionConstants;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author artawgn
 */
public class Fungsi {
    //    private static final Connection konek = con.getKonek();

    private static com.koneksi.Konek con = new Konek();
    private static PreparedStatement ps = null;
    private static final Connection konek = con.getKonek();

    //perhitungan 
//    public   static void jumlahNasbah(){
//     String sql = "SELECT COUNT(id_nas) FROM nasabah";
////     String baris = 
//    
//     
//       try {
//            Statement st = konek.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//
//            while (rs.next()) {
//                Main.txt_jumlah_transaksi.setText(sql);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
//        }
//       
//    
//    }
    //CREATE 
    //CREATE 
    public static boolean createNasabah(Query s) {
        String sql = Query.REGISTER_NASABAH;
        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, s.getKode_nas());
            ps.setString(2, s.getNama_nas());
            ps.setString(3, s.getAlamat_nas());
            ps.setString(4, s.getHp_nas());
            ps.setString(5, s.getSaldo_nas());

            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean createUserAplikasi(Query s) {
        String sql = Query.REGISTER_USER;
        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, s.getUsername());
            ps.setString(2, s.getPassword());

            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean createSampah(Query s) {
        String sql = Query.REGISTER_SAMPAH;
        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, s.getKode_samp());
            ps.setString(2, s.getKategori());
            ps.setString(3, s.getNama_samp());
            ps.setString(4, s.getHarga_1());
            ps.setString(5, s.getHarga_2());
            ps.setString(6, s.getHarga_pgul());
            ps.setString(7, s.getStok());

            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean createSimpanan(Query s) {
        String sql = Query.REGISTER_SIMPANAN;
        try {
            ps = konek.prepareStatement(sql);

            ps.setString(1, s.getTgl_sim());
            ps.setString(2, s.getKode_nas());
            ps.setString(3, s.getKode_samp());
            ps.setString(4, s.getNama_samp());
            ps.setString(5, s.getHarga_samp());
            ps.setString(6, s.getQty_samp());
            ps.setString(7, s.getTotal_samp());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean createPenarikan(Query s) {
        String sql = Query.REGISTER_PENARIKAN;
        try {
            ps = konek.prepareStatement(sql);

            ps.setString(1, s.getKode_nas());
            ps.setString(2, s.getTgl_pen());
            ps.setString(3, s.getSaldo_penarikan());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean createPenjualan(Query s) {
        String sql = Query.REGISTER_PENJUALAN;
        try {
            ps = konek.prepareStatement(sql);

            ps.setString(1, s.getTgl_jual());
            ps.setString(2, s.getNama_pengepul());
            ps.setString(3, s.getKode_samp());
            ps.setString(4, s.getNama_samp());
            ps.setString(5, s.getHarga_samp());
            ps.setString(6, s.getBerat());
            ps.setString(7, s.getTotal_harga());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //UPDATE
    //UPDATE
    public static boolean updateNasbah(Query s) {
        String sql = Query.UPDATE_NASABAH;

        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, s.getKode_nas());
            ps.setString(2, s.getNama_nas());
            ps.setString(3, s.getAlamat_nas());
            ps.setString(4, s.getHp_nas());
//            ps.setString(5, s.getSaldo_nas());
            ps.setString(5, s.getId_nas());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;

//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean updateUser(Query s) {
        String sql = Query.UPDATE_USER;

        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, s.getUsername());
            ps.setString(2, s.getPassword());
            ps.setString(3, s.getId_user());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;

//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean updateSampah(Query s) {
        String sql = Query.UPDATE_SAMPAH;

        try {
            ps = konek.prepareStatement(sql);
            ps.setString(1, s.getKode_samp());
            ps.setString(2, s.getKategori());
            ps.setString(3, s.getNama_samp());
            ps.setString(4, s.getHarga_1());
            ps.setString(5, s.getHarga_2());
            ps.setString(6, s.getHarga_pgul());
            ps.setString(7, s.getStok());
            ps.setString(8, s.getId_samp());
            ps.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;

//            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //TABEl
    //TABEL
    public static void Tabel_nasabah(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_nasabah.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_NASABAH;

        } else {
            sql = "SELECT * FROM nasabah WHERE ("
                    + "id_nas LIKE'" + cari + "%' OR "
                    + "kode_nas LIKE'" + cari + "%' OR "
                    + "nama_nas LIKE'" + cari + "%' OR "
                    + "alamat_nas LIKE'" + cari + "%' OR "
                    + "hp_nas LIKE'" + cari + "%' OR "
                    + "saldo_nas LIKE'" + cari + "%'"
                    + ")";
        }
        String Data[] = new String[3];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("id_nas");
                Data[1] = rs.getString("kode_nas");
                Data[2] = rs.getString("nama_nas");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Tabel_penarikan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_penarikan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_PENARIKAN;

        } else {
            sql = "SELECT * FROM penarikan WHERE ("
                    + "id_pen LIKE'" + cari + "%' OR "
                    + "kode_nas LIKE'" + cari + "%' OR "
                    + "tgl_pen LIKE'" + cari + "%' OR "
                    + "saldo_nas LIKE'" + cari + "%'"
                    + ")";
        }
        String Data[] = new String[4];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("id_pen");
                Data[1] = rs.getString("tgl_pen");
                Data[2] = rs.getString("kode_nas");
                Data[3] = rs.getString("saldo_penarikan");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Tabel_Simpanan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_tabungan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_SIMPANAN;

        } else {
            sql = "SELECT * FROM simpanan WHERE ("
                    + "id_sim LIKE'" + cari + "%' OR "
                    + "tgl_simp LIKE'" + cari + "%' OR "
                    + "kode_nas LIKE'" + cari + "%' OR "
                    + "kode_samp LIKE'" + cari + "%' OR "
                    + "nama_samp LIKE'" + cari + "%' OR "
                    + "harga_samp LIKE'" + cari + "%' OR "
                    + "qty_samp LIKE'" + cari + "%' OR "
                    + "total_samp LIKE'" + cari + "%'"
                    + ")";
        }
        String Data[] = new String[6];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

//                Data[0] = rs.getString("id_sim");
//                Data[1] = rs.getString("tgl_sim");
//                Data[2] = rs.getString("kode_nas");
//                Data[3] = rs.getString("nama_samp");
//                Data[4] = rs.getString("total_samp");
//                Data[0] = rs.getString("id_sim");
                Data[0] = rs.getString("tgl_sim");
                Data[1] = rs.getString("kode_nas");
                Data[2] = rs.getString("nama_samp");
                Data[3] = rs.getString("harga_samp");
                Data[4] = rs.getString("qty_samp");
                Data[5] = rs.getString("total_samp");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Tabel_sampah(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_sampah.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_SAMPAH;

        } else {
            sql = "SELECT * FROM sampah WHERE ("
                    + "id_samp LIKE'" + cari + "%' OR "
                    + "kode_samp LIKE'" + cari + "%' OR "
                    + "kategori LIKE'" + cari + "%' OR "
                    + "nama_samp LIKE'" + cari + "%' OR "
                    + "harga_1 LIKE'" + cari + "%' OR "
                    + "harga_2 LIKE'" + cari + "%' OR "
                    + "harga_pgul LIKE'" + cari + "%' OR "
                    + "stok LIKE'" + cari + "%'"
                    + ")";
        }
        String Data[] = new String[4];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("id_samp");
                Data[1] = rs.getString("kode_samp");
                Data[2] = rs.getString("nama_samp");
                Data[3] = rs.getString("stok");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Tabel_User(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_pengguna_aplikasi.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_USER;

        } else {
            sql = "SELECT * FROM user WHERE ("
                    + "username LIKE'" + cari + "%' OR "
                    + "password LIKE'" + cari + "%'"
                    + ")";
        }
        String Data[] = new String[3];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Data[0] = rs.getString("id_user");
                Data[1] = rs.getString("username");
                Data[2] = rs.getString("password");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void Tabel_buku_tabungan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_buku_tabungan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
//            sql = Query.DAFTAR_LAPORAN_TABUNGAN;
//            sql = "SELECT * FROM laporan_tabungan WHERE kode_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'";
            sql = "SELECT * FROM laporan_tabungan WHERE kode_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'"
                    + "ORDER BY laporan_tabungan.id_tabungan ASC";
        } else {
            sql = "SELECT * FROM laporan_tabungan WHERE ("
                    //                    + "id_tabungan LIKE'" + cari + "%' OR "
                    //                    + "tgl_tabungan LIKE'" + cari + "%' OR "
                    //                    + "kode_nas LIKE'" + cari + "%' OR "
                    //                    + "nama_samp LIKE'" + cari + "%' OR "
                    //                    + "harga_1 LIKE'" + cari + "%' OR "
                    //                    + "harga_2 LIKE'" + cari + "%' OR "
                    //                    + "harga_pgul LIKE'" + cari + "%' OR "
                    + "kode_nas LIKE'" + cari + "%'"
                    + ")" + "ORDER BY laporan_tabungan.id_tabungan ASC";
        }
        String Data[] = new String[6];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("tgl_tabungan");
                Data[1] = rs.getString("jenis_samp");
                Data[2] = rs.getString("harga_samp");
                Data[3] = rs.getString("berat_samp");
                Data[4] = rs.getString("debet");
                Data[5] = rs.getString("kredit");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Tabel_laporan_tabungan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_laporan_tabungan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String startDateString = dateFormat.format(Main.laporan_date_dari2.getDate());
////            Date tanggalLaporan = Main.laporan_date_dari2.getDate();
//            sql = Query.DAFTAR_LAPORAN_TABUNGAN;
//            sql = "SELECT * FROM laporan_tabungan WHERE kode_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'";
//            sql = "SELECT * FROM laporan_tabungan WHERE tgl_tabungan = '" + startDateString + "'";

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tgl_DARI = format.format(Main.laporan_date_dari.getDate());
            String tgl_SAMPAI = format.format(Main.laporan_date_sampai.getDate());

//            String sampai = "2019/02/25";
            sql = "select * from laporan_tabungan where tgl_tabungan>='" + tgl_DARI + "'and tgl_tabungan<='" + tgl_SAMPAI + "'";
//            sql = "select * from laporan_tabungan where tgl_tabungan between '"+dari+"and "+sampai"'";
//            SELECT * FROM `tabungan` WHERE `tanggal` BETWEEN '09/01/2019' AND '11/01/2019'
        } else {
            sql = "SELECT * FROM laporan_tabungan WHERE ("
                    + "id_tabungan LIKE'" + Main.laporan_date_dari + "%'";
//                    //                    + "tgl_tabungan LIKE'" + cari + "%' OR "
//                    //                    + "kode_nas LIKE'" + cari + "%' OR "
//                    //                    + "nama_samp LIKE'" + cari + "%' OR "
//                    //                    + "harga_1 LIKE'" + cari + "%' OR "
//                    //                    + "harga_2 LIKE'" + cari + "%' OR "
//                    //                    + "harga_pgul LIKE'" + cari + "%' OR "
//                    + "kode_nas LIKE'" + cari + "%'"
//                    + ")" + "ORDER BY laporan_tabungan.tgl_tabungan ASC";
        }
        String Data[] = new String[10];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("tgl_tabungan");
                Data[1] = rs.getString("kode");
                Data[2] = rs.getString("kode_nas");
                Data[3] = rs.getString("jenis_samp");
                Data[4] = rs.getString("kode_samp");
                Data[5] = rs.getString("harga_samp");
                Data[6] = rs.getString("berat_samp");
                Data[7] = rs.getString("debet");
                Data[8] = rs.getString("kredit");
                Data[9] = rs.getString("penjualan");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Tabel_laporan_setoran(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_laporan_setoran.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String startDateString = dateFormat.format(Main.laporan_date_dari2.getDate());
////            Date tanggalLaporan = Main.laporan_date_dari2.getDate();
//            sql = Query.DAFTAR_LAPORAN_TABUNGAN;
//            sql = "SELECT * FROM laporan_tabungan WHERE kode_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'";
//            sql = "SELECT * FROM laporan_tabungan WHERE tgl_tabungan = '" + startDateString + "'";

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tgl_DARI = format.format(Main.laporan_date_setoran_dari.getDate());
            String tgl_SAMPAI = format.format(Main.laporan_date_setoran_sampai.getDate());

//            String sampai = "2019/02/25";
            sql = "select * from simpanan where tgl_sim>='" + tgl_DARI + "'and tgl_sim<='" + tgl_SAMPAI + "'";
//            sql = "select * from laporan_tabungan where tgl_tabungan between '"+dari+"and "+sampai"'";
//            SELECT * FROM `tabungan` WHERE `tanggal` BETWEEN '09/01/2019' AND '11/01/2019'
        } else {
//            sql = "SELECT * FROM simpanan WHERE ("
//                                        + "tgl_sim LIKE'" + tgl_DARI + "%'";
//                    //                    + "tgl_tabungan LIKE'" + cari + "%' OR "
//                    //                    + "kode_nas LIKE'" + cari + "%' OR "
//                    //                    + "nama_samp LIKE'" + cari + "%' OR "
//                    //                    + "harga_1 LIKE'" + cari + "%' OR "
//                    //                    + "harga_2 LIKE'" + cari + "%' OR "
//                    //                    + "harga_pgul LIKE'" + cari + "%' OR "
//                    + "kode_nas LIKE'" + cari + "%'"
//                    + ")" + "ORDER BY laporan_tabungan.tgl_tabungan ASC";
        }
        String Data[] = new String[6];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("tgl_sim");
                Data[1] = rs.getString("kode_nas");
                Data[2] = rs.getString("nama_samp");
                Data[3] = rs.getString("harga_samp");
                Data[4] = rs.getString("qty_samp");
                Data[5] = rs.getString("total_samp");
//                Data[6] = rs.getString("harga_samp");
//                Data[7] = rs.getString("debet");
//                Data[8] = rs.getString("kredit");
//                Data[5] = rs.getString("kredit");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Tabel_laporan_penarikan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_laporan_penarikan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String startDateString = dateFormat.format(Main.laporan_date_dari2.getDate());
////            Date tanggalLaporan = Main.laporan_date_dari2.getDate();
//            sql = Query.DAFTAR_LAPORAN_TABUNGAN;
//            sql = "SELECT * FROM laporan_tabungan WHERE kode_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'";
//            sql = "SELECT * FROM laporan_tabungan WHERE tgl_tabungan = '" + startDateString + "'";

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tgl_DARI = format.format(Main.laporan_date_penarikan_dari.getDate());
            String tgl_SAMPAI = format.format(Main.laporan_date_penarikan_sampai.getDate());

//            String sampai = "2019/02/25";
            sql = "select * from penarikan where tgl_pen>='" + tgl_DARI + "'and tgl_pen<='" + tgl_SAMPAI + "'";
//            sql = "select * from laporan_tabungan where tgl_tabungan between '"+dari+"and "+sampai"'";
//            SELECT * FROM `tabungan` WHERE `tanggal` BETWEEN '09/01/2019' AND '11/01/2019'
        } else {
//            sql = "SELECT * FROM simpanan WHERE ("
//                                        + "tgl_sim LIKE'" + tgl_DARI + "%'";
//                    //                    + "tgl_tabungan LIKE'" + cari + "%' OR "
//                    //                    + "kode_nas LIKE'" + cari + "%' OR "
//                    //                    + "nama_samp LIKE'" + cari + "%' OR "
//                    //                    + "harga_1 LIKE'" + cari + "%' OR "
//                    //                    + "harga_2 LIKE'" + cari + "%' OR "
//                    //                    + "harga_pgul LIKE'" + cari + "%' OR "
//                    + "kode_nas LIKE'" + cari + "%'"
//                    + ")" + "ORDER BY laporan_tabungan.tgl_tabungan ASC";
        }
        String Data[] = new String[4];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("tgl_pen");
                Data[1] = rs.getString("kode_nas");
                Data[2] = rs.getString("saldo_penarikan");
//                Data[3] = rs.getString("harga_samp");
//                Data[4] = rs.getString("qty_samp");
//                Data[5] = rs.getString("total_samp");
//                Data[6] = rs.getString("harga_samp");
//                Data[7] = rs.getString("debet");
//                Data[8] = rs.getString("kredit");
//                Data[5] = rs.getString("kredit");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Tabel_laporan_penjualan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_laporan_penjualan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
//            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String startDateString = dateFormat.format(Main.laporan_date_dari2.getDate());
////            Date tanggalLaporan = Main.laporan_date_dari2.getDate();
//            sql = Query.DAFTAR_LAPORAN_TABUNGAN;
//            sql = "SELECT * FROM laporan_tabungan WHERE kode_nas = '" + Main.buku_tabungan_id_nasabah.getText() + "'";
//            sql = "SELECT * FROM laporan_tabungan WHERE tgl_tabungan = '" + startDateString + "'";

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String tgl_DARI = format.format(Main.laporan_date_penjualan_dari.getDate());
            String tgl_SAMPAI = format.format(Main.laporan_date_pejualan_sampai.getDate());

//            String sampai = "2019/02/25";
            sql = "select * from penjualan where tgl_jual>='" + tgl_DARI + "'and tgl_jual<='" + tgl_SAMPAI + "'";
//            sql = "select * from laporan_tabungan where tgl_tabungan between '"+dari+"and "+sampai"'";
//            SELECT * FROM `tabungan` WHERE `tanggal` BETWEEN '09/01/2019' AND '11/01/2019'
        } else {
//            sql = "SELECT * FROM simpanan WHERE ("
//                                        + "tgl_sim LIKE'" + tgl_DARI + "%'";
//                    //                    + "tgl_tabungan LIKE'" + cari + "%' OR "
//                    //                    + "kode_nas LIKE'" + cari + "%' OR "
//                    //                    + "nama_samp LIKE'" + cari + "%' OR "
//                    //                    + "harga_1 LIKE'" + cari + "%' OR "
//                    //                    + "harga_2 LIKE'" + cari + "%' OR "
//                    //                    + "harga_pgul LIKE'" + cari + "%' OR "
//                    + "kode_nas LIKE'" + cari + "%'"
//                    + ")" + "ORDER BY laporan_tabungan.tgl_tabungan ASC";
        }
        String Data[] = new String[7];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("tgl_jual");
                Data[1] = rs.getString("nama_pengepul");
//                Data[2] = rs.getString("kode_samp");
                Data[2] = rs.getString("nama_samp");
                Data[3] = rs.getString("harga_samp");
                Data[4] = rs.getString("berat");
                Data[5] = rs.getString("total_harga");
//                Data[7] = rs.getString("debet");
//                Data[8] = rs.getString("kredit");
//                Data[5] = rs.getString("kredit");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void Tabel_Penjualan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_penjualan.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_PENJUALAN;

        } else {
            sql = "SELECT * FROM penjualan WHERE ("
                    + "id_jual LIKE'" + cari + "%' OR "
                    + "tgl_jual LIKE'" + cari + "%' OR "
                    + "nama_pengepul LIKE'" + cari + "%' OR "
                    + "kode_samp LIKE'" + cari + "%' OR "
                    + "nama_samp LIKE'" + cari + "%' OR "
                    + "harga_samp LIKE'" + cari + "%' OR "
                    + "berat LIKE'" + cari + "%' OR "
                    + "total_harga LIKE'" + cari + "%'"
                    + ")";
        }
        String Data[] = new String[6];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

//                Data[0] = rs.getString("id_sim");
//                Data[1] = rs.getString("tgl_sim");
//                Data[2] = rs.getString("kode_nas");
//                Data[3] = rs.getString("nama_samp");
//                Data[4] = rs.getString("total_samp");
//                Data[0] = rs.getString("id_sim");
                Data[0] = rs.getString("tgl_jual");
                Data[1] = rs.getString("nama_pengepul");
                Data[2] = rs.getString("nama_samp");
                Data[3] = rs.getString("harga_samp");
                Data[4] = rs.getString("berat");
                Data[5] = rs.getString("total_harga");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
