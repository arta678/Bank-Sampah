/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import com.koneksi.Konek;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public static void Tabel_PopUp_penjualan_sampah(String cari) {
        DefaultTableModel model = (DefaultTableModel) showtabel.tabel_penjualan_sampah.getModel();
        

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
//                Data[3] = rs.getString("stok");

                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

}
