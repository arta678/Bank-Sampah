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
            ps.setString(8, s.getCatatan_samp());
           
            
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
            ps.setString(2, s.getNama_nas());
            ps.setString(3, s.getKode_samp());
            ps.setString(4, s.getHarga_samp());
            ps.setString(5, s.getQty_samp());
            ps.setString(6, s.getTotal_samp());
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
            ps.setString(5, s.getSaldo_nas());
            ps.setString(6, s.getId_nas());
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
        String Data[] = new String[4];

        try {
            Statement st = konek.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Data[0] = rs.getString("id_nas");
                Data[1] = rs.getString("kode_nas");
                Data[2] = rs.getString("nama_nas");
                Data[3] = rs.getString("saldo_nas");
                
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
                    + "stok LIKE'" + cari + "%' OR "
                    + "catatan_samp LIKE'" + cari + "%'"
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
    
    public static void Tabel_simpanan(String cari) {
        DefaultTableModel model = (DefaultTableModel) Main.tabel_sampah.getModel();

        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        String sql = "";
        if (cari.equals("")) {
            sql = Query.DAFTAR_SIMPANAN;

        } else {
            sql = "SELECT * FROM simpanan WHERE ("
                    + "id_samp LIKE'" + cari + "%' OR "
                    + "kode_samp LIKE'" + cari + "%' OR "
                    + "kategori LIKE'" + cari + "%' OR "
                    + "nama_samp LIKE'" + cari + "%' OR "
                    + "harga_1 LIKE'" + cari + "%' OR "
                    + "harga_2 LIKE'" + cari + "%' OR "
                    + "harga_pgul LIKE'" + cari + "%' OR "
                    + "stok LIKE'" + cari + "%' OR "
                    + "catatan_samp LIKE'" + cari + "%'"
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
    
    
    
    
}
