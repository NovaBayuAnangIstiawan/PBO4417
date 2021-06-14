/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;


/**
 *
 * @author Bayu
 */
public class Koneksi {
    static Connection con;
    
    public static Connection getconnection() {
        if (con == null) 
        {
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("data_admin");
            data.setUser("root");
            data.setPassword("");
            try
            {
                con = data.getConnection();
                System.out.println("koneksi berhasil");
            }catch(SQLException e)
            {
                System.out.println("tidak konek");
            }
        }
        return con;
        }

    }    

    
    
    

