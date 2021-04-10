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
public class Car extends Vehicle {

    private int numGear;
    private Boolean seatbelt;
    private Boolean power;


    Car() {
        this.seatbelt = false;
        this.power = false;
    }

    public void setPower(Boolean power) {
        this.power = power;
    }

    public Boolean getPower() {
        return power;
    }

    public void setSeatBelt(Boolean seatBelt) {
        this.seatbelt = seatBelt;
    }

    public Boolean getSeatbelt() {
        return seatbelt;
    }

    public void setGear(int gear) {
        this.numGear = gear;
    }

    public int getGear() {
        return this.numGear;
    }

}
