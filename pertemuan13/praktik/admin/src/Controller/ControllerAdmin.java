/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import DAO.DAOAdmin;
import Model.Admin;
import Model.TabelUser;
import View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Bayu
 */
public class ControllerAdmin {
    FormAdmin frame;
    DAOAdmin implDutaCoding;
    List<Admin> lb;

    
    public ControllerAdmin(FormAdmin frame) {
        this.frame = frame;
        implDutaCoding = new DAOAdmin();
        lb = implDutaCoding.getAll();
        
    }  
    // menampilkan data ke dalam tabel
    public  void isiTable() {
        lb = implDutaCoding.getAll();
        TabelUser tmb = new TabelUser(lb);
        frame.getTabelData().setModel(tmb);
    }
        // mengosongkan semua field
    public void reset() {
        frame.getTxtId().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
    }
    
    public void isiField(int row) {
        frame.getTxtId().setText(lb.get(row).getId().toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
    }
    
    public void update() {
            Admin b = new Admin();
            b.setId(Integer.parseInt(frame.getTxtId().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            implDutaCoding.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
    }
    
    public void delete() {
        if (!frame.getTxtId().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtId().getText());
            implDutaCoding.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
}
