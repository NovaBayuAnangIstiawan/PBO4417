/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.util.List;
import Model.*;
/**
 *
 * @author Bayu
 */
public interface IAdmin {
    public void insert(Admin b);
    public void update(Admin b);
    public void delete(int id);
    public List<Admin> getAll();
}
