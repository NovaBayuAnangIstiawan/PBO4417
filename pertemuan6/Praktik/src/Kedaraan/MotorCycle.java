/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kedaraan;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author nothing
 */
public class MotorCycle extends Vehicle {
    private int numGear;
    private Boolean power;

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Boolean getPower() {
        return power;
    }
    
    MotorCycle(){
        this.numGear = 0;
        this.power = false;
    }
    
    public void setGear(int gear){
        this.numGear = gear;
    }
    public int getGear(){
        return this.numGear;
    }    
}
