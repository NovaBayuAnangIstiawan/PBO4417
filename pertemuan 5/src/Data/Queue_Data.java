/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author nothing
 */
public class Queue_Data extends NmBuah {
    private final Queue<NmBuah> Buah = new LinkedList<>();
    
    Queue_Data(){
        
    }
    
    public void addData(NmBuah Buah){
        this.Buah.add(Buah);
    }
    
    public void removeData(NmBuah Buah){
        this.Buah.remove(Buah);
    }
    
    public void fetchData(){
          
         for (int i = 0; i < Buah.size(); i++) {;
             System.out.println("Buah : "+Buah.element().getBuah());
        };
    }

    public void pollData(){
        NmBuah peekBuah = this.Buah.poll();
        System.out.println("Poll Queue : "+peekBuah.getBuah());
    }
}
