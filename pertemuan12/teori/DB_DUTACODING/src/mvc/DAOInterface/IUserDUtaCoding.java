/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAOInterface;
import java.util.List;
import mvc.Model.*;
/**
 *
 * @author Bayu
 */
public interface IUserDUtaCoding {
    public void insert(DutaCoding b);
    public void update(DutaCoding b);
    public void delete(int id);
    public List<DutaCoding> getAll();
    public List<DutaCoding> getCariNama(String nama);
}
