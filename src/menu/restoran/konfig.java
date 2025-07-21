/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu.restoran;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Deni Purwanto
 */
public class konfig {
    private static Connection MysqlConfig;
    
    public static Connection configDB() throws SQLException{
        try{
            //objek yang diperlukan untuk mengelola database
            Connection con;     //interface yang menyediakan method untuk menghubungi database;
            Statement stmt;    //inteface untuk mengeksekusi query;
            ResultSet rs;             // interface untuk menampung data hasil query.
            String url = "jdbc:mysql://localhost:3306/menu_restorant";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            MysqlConfig = DriverManager.getConnection(url,user,pass);   // Membuat koneksi ke database
        } catch (SQLException e){
            System.out.println("koneksi database gagal!" + e.getMessage());
        } catch (ClassNotFoundException cnfe){
            System.out.println("Pesan Error : " + cnfe);
        }
        return MysqlConfig;
    }
    
}
