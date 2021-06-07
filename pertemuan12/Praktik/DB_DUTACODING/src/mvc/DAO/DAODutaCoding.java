/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;
import mvc.Koneksi.Koneksi;
import mvc.Model.DutaCoding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IUserDUtaCoding;
/**
 *
 * @author Bayu
 */
public class DAODutaCoding {
    Connection connection;
    final String insert = "INSERT INTO tbl_pendaftaran (id, KTP, nama, usia, jk, alamat, alasan) VALUES (?, ?, ?, ?, ?);";
    final String update = "UPDATE tbl_pendaftaran set id=?, KTP=?, nama=?, usia=? jk=?, alamat=? alasan=? where id=?;";
    final String delete = "DELETE FROM tbl_pendaftaran where id=?;";
    final String select = "SELECT * FROM tbl_pendaftaran;";
    final String carinama = "SELECT * FROM tbl_pendaftaran where nama like ?";
    
    public DAODutaCoding() {
        connection = Koneksi.connection();
    }
    
    public void insert(DutaCoding b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(insert);
            statement.setInt(1, b.getId());
            statement.setInt(2, b.getKTP());
            statement.setString(3, b.getNama());
            statement.setString(4, b.getJk());
            statement.setString(5, b.getAlamat());
            statement.setString(6, b.getAlasan());
            
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                b.setId(rs.getInt(1));
            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Input");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Input");
            }
        }
    }
    
    public void update(DutaCoding b) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(update);
            
            statement.setInt(1, b.getId());
            statement.setInt(2, b.getKTP());
            statement.setString(3, b.getNama());
            statement.setString(4, b.getJk());
            statement.setString(5, b.getAlamat());
            statement.setString(6, b.getAlasan());
            statement.setInt(7, b.getId());
            statement.executeUpdate();
            
//            ResultSet rs = statement.getGeneratedKeys();
//            while (rs.next()) {
//                b.setId(rs.getInt(1));
//            }
        } catch (SQLException ex) {
            System.out.println("Berhasil Update");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Update");
            }
        }
    }

    public void delete(int id) {
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Berhasil Delete");
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.out.println("Gagal Delete");
            }
        }
    }
    
    public List<DutaCoding> getAll() {
        List<DutaCoding> lb = null;
        try {
            lb = new ArrayList<DutaCoding>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while (rs.next()) {                
                DutaCoding b = new DutaCoding();
                b.setId(rs.getInt("id"));
                b.setKTP(rs.getInt("KTP"));
                b.setNama(rs.getString("nama"));
                b.setUsia(rs.getString("usia"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAODutaCoding.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }
    
    public List<DutaCoding> getCariNama(String nama) {
        List<DutaCoding> lb = null;
        try {
            lb = new ArrayList<DutaCoding>();
            PreparedStatement st = connection.prepareStatement(carinama);
            st.setString(1, "%" + nama + "%");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
                DutaCoding b = new DutaCoding();
                b.setId(rs.getInt("id"));
                b.setKTP(rs.getInt("KTP"));
                b.setNama(rs.getString("nama"));
                b.setUsia(rs.getString("usia"));
                b.setJk(rs.getString("jk"));
                b.setAlamat(rs.getString("alamat"));
                b.setAlasan(rs.getString("alasan"));
                lb.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAODutaCoding.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lb;
    }

    private String KTP() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Nama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Usia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Jk() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String Alamat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String Alasan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
