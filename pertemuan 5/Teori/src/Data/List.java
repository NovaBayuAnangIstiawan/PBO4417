/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.Stack;


/**
 *
 * @author nothing
 */
public class List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //instansiasi
        System.out.println("=============ArrayList===============");
        Array array = new Array();
        NmBuah B0 = new NmBuah(); 
        NmBuah B1 = new NmBuah();
        NmBuah B2 = new NmBuah();
        NmBuah B3 = new NmBuah();
        // set data
        
        B0.setBuah("Nanas");
        B1.setBuah("Jeruk");
        B2.setBuah("Nangka");
        B3.setBuah("Jambu");
        //add array list
        array.addNewData(B0);
        array.addNewData(B1);
        array.addNewData(B2);
        array.addNewData(B3);
        array.fetchData();
        
        //remove array list
        System.out.println("=========After remove list===========");
        array.removeData(B0);
        array.removeData(B3);
        array.fetchData();
        
        // stack data
        System.out.println("");
        System.out.println("=============Stack Data==============");
        StackData stack = new StackData();
        Stack<NmBuah> stack1 = new Stack<NmBuah>();
        stack.pushData(B0);
        stack.pushData(B1);
        stack.pushData(B2);
        stack.pushData(B3);
        stack.fetchData();
        
        //pop data
        stack.popData();
        System.out.println("===========After Pop Data============");
        stack.fetchData();
        //peek data
        stack.peekData();
        stack.searchData(stack1,2);
        
        // queue data
        System.out.println("");
        System.out.println("=============Queue Data==============");
        Queue_Data queue = new Queue_Data();
        queue.addData(B0);
        queue.addData(B1);
        queue.addData(B2);
        queue.addData(B3);
        queue.fetchData();
        
        //remove queue
        queue.removeData(B1);
        System.out.println("=========After Remove queue==========");
        queue.fetchData();
    
        //poll queue
        queue.pollData();
        System.out.println("==========After Poll queue===========");
        queue.fetchData();
    }   
}
