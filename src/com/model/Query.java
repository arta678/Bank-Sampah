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
     public static String DAFTAR_SAMPAH2 = "SELECT * FROM sampah";
    public static String DAFTAR_SIMPANAN = "SELECT * FROM simpanan";
    public static String DAFTAR_PENARIKAN = "SELECT * FROM penarikan";
    public static String DAFTAR_LOGIN = "SELECT * FROM login";
    public static String DAFTAR_PENJUALAN = "SELECT * FROM penjualan";
    public static String DAFTAR_LAPORAN_TABUNGAN = "SELECT * FROM laporan_tabungan";
    public static String JUMLAH_NASABAH = "SELECT COUNT(id_nas) FROM nasabah";
   

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
    public static String REGISTER_PENJUALAN = "INSERT INTO penjualan("
            + "tgl_jual,"
            + "nama_pengepul,"
            + "kode_samp,"
            + "nama_samp, "
            + "harga_samp, "
            + "berat, "
            + "total_harga)"
            + "VALUES(?,?,?,?,?,?,?)";

    public static String REGISTER_SAMPAH = "INSERT INTO sampah("
            + "kode_samp,"
            + "kategori,"
            + "nama_samp,"
            + "harga_1,"
            + "harga_2, "
            + "harga_pgul, "
            + "stok)"
            + "VALUES(?,?,?,?,?,?,?)";
    public static String REGISTER_SIMPANAN = "INSERT INTO simpanan("
            + "tgl_sim,"
            + "kode_nas,"
            + "kode_samp,"
            + "nama_samp,"
            + "harga_samp,"
            + "qty_samp,"
            + "total_samp)"
            + "VALUES(?,?,?,?,?,?,?)";
    public static String REGISTER_PENARIKAN = "INSERT INTO penarikan("
            + "kode_nas,"
            + "tgl_pen,"
            + "saldo_penarikan)"
            + "VALUES(?,?,?)";

    //UPDATE
    //UPDATE
    public static String UPDATE_NASABAH = "UPDATE nasabah SET "
            + "kode_nas = ?,"
            + "nama_nas = ?,"
            + "alamat_nas = ?,"
            + "hp_nas = ?"
            + "WHERE id_nas = ?";
    
    public static String UPDATE_SAMPAH = "UPDATE sampah SET "
            + "kode_samp = ?,"
            + "kategori = ?,"
            + "nama_samp = ?,"
            + "harga_1 = ?,"
            + "harga_2 = ?,"
            + "harga_pgul = ?,"
            + "stok = ?"
            + "WHERE id_samp = ?";

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
    //SAMPAH 
    //-------
    private String id_samp;
    private String kode_samp;
    private String kategori;
    private String nama_samp;
    private String harga_1;
    private String harga_2;
    private String harga_pgul;
    private String stok;
    private String catatan_samp;
    //--------

    //SIMPANAN
    private String id_sim;
    private String tgl_sim;
//    private String nama_nas;
    private String harga_samp;
   
    private String qty_samp;
    private String total_samp;
    
    
    //PENARIKAN
    private String tgl_pen;
    private String id_pen;
    private String saldo_penarikan;
    
        
    
    //PENJUALAN
          private String tgl_jual;
          private String nama_pengepul;
          private String berat;
          private String total_harga;

    public String getTgl_jual() {
        return tgl_jual;
    }

    public void setTgl_jual(String tgl_jual) {
        this.tgl_jual = tgl_jual;
    }

    public String getNama_pengepul() {
        return nama_pengepul;
    }

    public void setNama_pengepul(String nama_pengepul) {
        this.nama_pengepul = nama_pengepul;
    }

    public String getBerat() {
        return berat;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public String getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(String total_harga) {
        this.total_harga = total_harga;
    }
         
          
          
          
    
    
    //________

    public String getSaldo_penarikan() {
        return saldo_penarikan;
    }

    public void setSaldo_penarikan(String saldo_penarikan) {
        this.saldo_penarikan = saldo_penarikan;
    }
    
    

    public String getId_pen() {
        return id_pen;
    }

    public void setId_pen(String id_pen) {
        this.id_pen = id_pen;
    }

    
    
    public String getTgl_pen() {
        return tgl_pen;
    }

    public void setTgl_pen(String tgl_pen) {
        this.tgl_pen = tgl_pen;
    }
    

    public String getHarga_samp() {
        return harga_samp;
    }

    public void setHarga_samp(String harga_samp) {
        this.harga_samp = harga_samp;
    }
    
    

    public String getId_sim() {
        return id_sim;
    }

    public void setId_sim(String id_sim) {
        this.id_sim = id_sim;
    }

    public String getTgl_sim() {
        return tgl_sim;
    }

    public void setTgl_sim(String tgl_sim) {
        this.tgl_sim = tgl_sim;
    }

    public String getQty_samp() {
        return qty_samp;
    }

    public void setQty_samp(String qty_samp) {
        this.qty_samp = qty_samp;
    }

    public String getTotal_samp() {
        return total_samp;
    }

    public void setTotal_samp(String total_samp) {
        this.total_samp = total_samp;
    }
    
    

    public String getKode_samp() {
        return kode_samp;
    }

    public void setKode_samp(String kode_samp) {
        this.kode_samp = kode_samp;
    }

    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }

    public String getId_samp() {
        return id_samp;
    }

    public void setId_samp(String id_samp) {
        this.id_samp = id_samp;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getNama_samp() {
        return nama_samp;
    }

    public void setNama_samp(String nama_samp) {
        this.nama_samp = nama_samp;
    }

    public String getHarga_1() {
        return harga_1;
    }

    public void setHarga_1(String harga_1) {
        this.harga_1 = harga_1;
    }

    public String getHarga_2() {
        return harga_2;
    }

    public void setHarga_2(String harga_2) {
        this.harga_2 = harga_2;
    }

    public String getHarga_pgul() {
        return harga_pgul;
    }

    public void setHarga_pgul(String harga_pgul) {
        this.harga_pgul = harga_pgul;
    }

    public String getCatatan_samp() {
        return catatan_samp;
    }

    public void setCatatan_samp(String catatan_samp) {
        this.catatan_samp = catatan_samp;
    }

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
