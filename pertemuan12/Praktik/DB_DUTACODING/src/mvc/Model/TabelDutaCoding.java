/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.Model;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author Bayu
 */
public class TabelDutaCoding extends AbstractTableModel {
    List<DutaCoding> lb;
    
    public TabelDutaCoding(List<DutaCoding> lb) {
        this.lb = lb;
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }
    
    public int getRowCount() {
        return lb.size();
    }
    
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "KTP";
            case 2:
                return "Nama";
            case 3:
                return "Usia";
            case 4:
                return "Kelamin";
            case 5:
                return "Alamat";
            case 6:
                return "Alasan";
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
                return lb. get(row).getKTP();
            case 2:
                return lb. get(row).getNama();
            case 3:
                return lb. get(row).getUsia();
            case 4:
                return lb. get(row).getJk();
            case 5:
                return lb. get(row).getAlamat();
            case 6:
                return lb. get(row).getAlasan();
            default:
                return null; 
        }
    }
}