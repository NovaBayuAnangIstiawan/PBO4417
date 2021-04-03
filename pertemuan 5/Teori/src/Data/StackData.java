/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.*;
/**
 *
 * @author nothing
 */
public class StackData extends NmBuah {
    
    private final Stack<NmBuah> Buah = new Stack<NmBuah>();
    StackData(){}
    
    //push data 
    public NmBuah pushData(NmBuah Buah){
        return this.Buah.push(Buah);
    }
  
    //show data
    public void fetchData(){
        for (int i = 0; i < Buah.size(); i++) {
            System.out.println("Buah : "+Buah.get(i).getBuah());
        }
    }
    
    public void popData(){
        NmBuah popBuah = this.Buah.pop();
        System.out.println("Pop Stack : "+popBuah.getBuah());
    }
    
    public void peekData(){
        NmBuah peekBuah = this.Buah.peek();
        System.out.println("Peek Stack : "+peekBuah.getBuah());
    }
	public void searchData(Stack<NmBuah> merkD,int element){
		int searchBuah = merkD.search(element);
			if(searchBuah == -1){
				System.out.println("Element not found ");
			}
			else{
				System.out.println("Element is found at position: " + searchBuah); 
			}
	}

}

