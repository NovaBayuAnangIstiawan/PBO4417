/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Controller;
import mvc.DAO.DAODutaCoding;
import mvc.Model.DutaCoding;
import mvc.Model.TabelDutaCoding;
import mvc.View.FormAdmin;
import java.util.List;
import javax.swing.JOptionPane;
import mvc.DAOInterface.IUserDUtaCoding;
/**
 *
 * @author Bayu
 */
public class ControllerDutaCoding {
    FormAdmin frame;
    DAODutaCoding DutaCoding;
    List<DutaCoding> lb;

    
    public ControllerDutaCoding(FormAdmin frame) {
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
    
    // menampilkan data ke dalam tabel
    public  void isiTable() {
        lb = DutaCoding.getAll();
        TabelDutaCoding tmb = new TabelDutaCoding(lb);
        frame.getTabelData().setModel(tmb);
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
    
    public void update() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            DutaCoding b = new DutaCoding();
            b.setId(Integer.parseInt(frame.getTxtID().getText()));
            b.setId(Integer.parseInt(frame.getTxtKTP().getText()));
            b.setNama(frame.getTxtNama().getText());
            b.setUsia(frame.getTxtUsia().getText());
            b.setJk(frame.getTxtJk().getSelectedItem().toString());
            b.setAlamat(frame.getTxtAlamat().getText());
            b.setAlasan(frame.getTxtAlasan().getText());
            
            DutaCoding.update(b);
            JOptionPane.showMessageDialog(null, "Update Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan diubah");
        }
    }
    
    public void delete() {
        if (!frame.getTxtID().getText().trim().isEmpty()) {
            int id = Integer.parseInt(frame.getTxtID().getText());
            DutaCoding.delete(id);
            JOptionPane.showMessageDialog(null, "Hapus Data Sukses");
        } else {
            JOptionPane.showMessageDialog(frame, "Pilih Data yang akan dihapus");
        }
    }
    
    public  void isiTableCariNama() {
        lb = DutaCoding.getCariNama(frame.getTxtSearchName().getText());
        TabelDutaCoding tmb = new TabelDutaCoding(lb);
        frame.getTabelData().setModel(tmb);
    }
    
    public void carinama() {
        if (!frame.getTxtSearchName().getText().trim().isEmpty()) {
            DutaCoding.getCariNama(frame.getTxtSearchName().getText());
            isiTableCariNama();
        } else {
            JOptionPane.showMessageDialog(frame, "Silahkan Pilih Data");
        }
    }
    
}
