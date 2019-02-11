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
            ps.setString(5, s.getStatus_nas());
            
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
            ps.setString(5, s.getStatus_nas());
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
                    + "status LIKE'" + cari + "%'"
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
                Data[3] = rs.getString("status");
                
                model.addRow(Data);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Fungsi.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    
}
