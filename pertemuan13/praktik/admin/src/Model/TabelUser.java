/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bayu
 */
public class TabelUser extends AbstractTableModel {
    List<Admin> lb;
    
    public TabelUser(List<Admin> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }
    
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Id";
            case 1:
                return "Nama";
            case 2:
                return "Kelamin";
            case 3:
                return "Alamat";
            default:
                return null;
        }
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return lb. get(row).getId();
            case 1:
                return lb. get(row).getNama();
            case 2:
                return lb. get(row).getJk();
            case 3:
                return lb. get(row).getAlamat();
            default:
                return null; 
        }
    }
}