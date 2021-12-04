/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author ERLANGGA AJI N
 */
import java.sql.*;

public class KoneksiDatabase {
    Connection cn;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhosttugas_crudkasbulanan", "root", "");
            return cn;
        } catch (Exception e) {
            return null;
        }
    }
}