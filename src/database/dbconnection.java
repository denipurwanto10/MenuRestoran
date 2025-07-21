/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Deni Purwanto
 */
public class dbconnection {
    Connection conn;
    
    public dbconnection(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javagui","root","");
    } catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}
    public Connection getConnection(){
        return conn;
    }
    
}
