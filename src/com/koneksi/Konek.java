/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author artawgn
 */
public class Konek {
    public static Connection connection  = null;
    String USERNAME= "root";
    String PASSWORD= "";
    String DB= "jdbc:mysql://localhost/bank_sampah";
    
    
    
    public Connection getKonek(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(DB,USERNAME,PASSWORD);
            System.out.println("Koneksi Database Sukses !");
            return connection;
        } catch (Exception e) {
            System.out.println("Koneksi GAGAL !");
            return null;
            
        }
    
        
        
    }
    
}
