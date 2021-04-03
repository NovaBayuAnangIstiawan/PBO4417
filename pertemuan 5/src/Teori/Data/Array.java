/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Data;
import java.util.ArrayList;

/**
 *
 * @author nothing
 */
public class Array extends NmBuah {
    
    private final ArrayList<NmBuah> NamaBuah = new ArrayList<>();
    
    public void addNewData(NmBuah Buah){
        NamaBuah.add(Buah);
    }
    public void fetchData(){
         for (int i = 0; i < NamaBuah.size(); i++) {
            System.out.println("Buah : "+NamaBuah.get(i).getBuah());
        }
    }
    public void removeData(NmBuah Buah){
        NamaBuah.remove(Buah);
    }
}
