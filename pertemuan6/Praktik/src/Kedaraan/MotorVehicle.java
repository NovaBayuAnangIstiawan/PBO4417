/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author nothing
 */
package Kedaraan;
public class MotorVehicle extends Vehicle{
    
    private int sizeofEngine;
    private String licensesPlate;
    
    MotorVehicle(){   
           this.sizeofEngine = 1;
           this.licensesPlate = "H 1 IDN";
    }
    MotorVehicle(int sizeEngine, String plate){
        this.sizeofEngine = sizeEngine;
        this.licensesPlate = plate;
    }
    
    public int getSizeOfEngine(){
        return this.sizeofEngine;
    }
    public String getLicensesPlate(){
        return this.licensesPlate;
    }
        
        
}
