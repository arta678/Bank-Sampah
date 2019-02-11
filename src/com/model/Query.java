/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

/**
 *
 * @author artawgn
 */
public class Query {
    
    public static String DAFTAR_NASABAH = "SELECT * FROM nasabah";
    public static String DAFTAR_PETUGAS = "SELECT * FROM petugas";
    public static String DAFTAR_SAMPAH = "SELECT * FROM sampah";
    public static String DAFTAR_SIMPANAN = "SELECT * FROM simpanan";
    public static String DAFTAR_PENARIKAN = "SELECT * FROM penarikan";
    public static String DAFTAR_LOGIN = "SELECT * FROM login";
    
    
    //CREATE
    //CREATE
    //CREATE
    
    public static String REGISTER_NASABAH = "INSERT INTO nasabah("
            + "kode_nas,"
            + "nama_nas,"
            + "alamat_nas,"
            + "hp_nas, "
            + "saldo_nas)"
            + "VALUES(?,?,?,?,?)";
    
    //UPDATE
    //UPDATE
     public static String UPDATE_NASABAH = "UPDATE nasabah SET "
            + "kode_nas = ?,"
            + "nama_nas = ?,"
            + "alamat_nas = ?,"
            + "hp_nas = ?,"
            + "saldo_nas = ?"
            + "WHERE id = ?";
    
    
    
    //GET SET
    //GET SET
    //GET SET
    //Nasabah
    private String id_nas;
    private String kode_nas;
    private String nama_nas;
    private String alamat_nas;
    private String hp_nas;
    private String saldo_nas;
    //-------

    public String getSaldo_nas() {
        return saldo_nas;
    }

    public void setSaldo_nas(String saldo_nas) {
        this.saldo_nas = saldo_nas;
    }

    public String getHp_nas() {
        return hp_nas;
    }

    public void setHp_nas(String hp_nas) {
        this.hp_nas = hp_nas;
    }

    public String getId_nas() {
        return id_nas;
    }

    public void setId_nas(String id_nas) {
        this.id_nas = id_nas;
    }
    

    public String getKode_nas() {
        return kode_nas;
    }

    public void setKode_nas(String kode_nas) {
        this.kode_nas = kode_nas;
    }

    public String getNama_nas() {
        return nama_nas;
    }

    public void setNama_nas(String nama_nas) {
        this.nama_nas = nama_nas;
    }

    public String getAlamat_nas() {
        return alamat_nas;
    }

    public void setAlamat_nas(String alamat_nas) {
        this.alamat_nas = alamat_nas;
    }

    
    
}
