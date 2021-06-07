/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAODutaCoding;
import mvc.Model.DutaCoding;
import mvc.Model.TabelDutaCoding;
import mvc.View.FormUser;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IUserDUtaCoding;
/**
 *
 * @author Bayu
 */
public class ControllerDutaCodingUser {
    FormUser frame;
    DAODutaCoding DutaCoding;
    List<DutaCoding> lb;

    
    public ControllerDutaCodingUser(FormUser frame) {
        this.frame = frame;
        DutaCoding = new DAODutaCoding();
        lb = DutaCoding.getAll();
        
    }
    
    // mengosongkan semua field
    public void reset() {
        frame.getTxtID().setText("");
        frame.getTxtKTP().setText("");
        frame.getTxtNama().setText("");
        frame.getTxtUsia().setText("");
        frame.getTxtJk().setSelectedItem("");
        frame.getTxtAlamat().setText("");
        frame.getTxtAlasan().setText("");
    }
    
    
    public void isiField(int row) {
        frame.getTxtID().setText(lb.get(row).getId().toString());
        frame.getTxtKTP().setText(lb.get(row).getId().toString());
        frame.getTxtNama().setText(lb.get(row).getNama());
        frame.getTxtUsia().setText(lb.get(row).getUsia());
        frame.getTxtJk().setSelectedItem(lb.get(row).getJk());
        frame.getTxtAlamat().setText(lb.get(row).getAlamat());
        frame.getTxtAlasan().setText(lb.get(row).getAlamat());
    }
    
    public void insert() {
            DutaCoding b = new DutaCoding();
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            b.setId(Integer.parseInt(frame.getTxtKTP().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setUsia(frame.getTxtUsia().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setAlasan(frame.getTxtAlasan().getText());
            DutaCoding.insert(b);
            JOptionPane.showMessageDialog(null, "Simpan Data Sukses");

    }
    
    

    
}