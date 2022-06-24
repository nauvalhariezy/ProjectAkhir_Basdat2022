/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_ecommerce;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nauvalhariezy
 */
public class Config {
   private static Connection MySQLConfig;
   
   public static Connection configDB()throws SQLException {
       try{
        String url = "jdbc:mysql://localhost:3306/db_ecommerce";
        String user = "root";
        String pass = "";
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        MySQLConfig = DriverManager.getConnection(url, user, pass);
        
       } catch (SQLException e){
           System.out.println("Maaf Koneksi Gagal" + e.getMessage());
       }
       return MySQLConfig;
   }
    
}
