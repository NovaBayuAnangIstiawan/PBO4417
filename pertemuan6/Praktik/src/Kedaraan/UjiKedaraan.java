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
public class UjiKedaraan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        //instansiasi
        System.out.println("========Bicycle=========");
        
        Bicycle bike = new Bicycle();
        bike.ringBell();
        bike.turnLeft();
        bike.turnRight();
        bike.goStraight();
        
        System.out.println("=====MotorVehicle=======");
        MotorVehicle motor = new MotorVehicle(4, "H  2912 CI");
      
        System.out.println("Plat motor : " + motor.getLicensesPlate());
        System.out.println("Engine     : " + motor.getSizeOfEngine());

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.setPower(true);
        System.out.println("Mesin    : "+motorCycle.getPower());
        if(motorCycle.getPower() == false){
            System.out.println("Mesin Off");
        }else{
            motorCycle.goStraight();
        }

        System.out.println("");
        System.out.println("==========CAR===========");
        
        Car myCar = new Car();
        myCar.setPower(true);
        System.out.println("Mesin    : "+myCar.getPower());
        myCar.setSeatBelt(true);
        System.out.println("SeatBelt : "+myCar.getSeatbelt());
        if(myCar.getSeatbelt() == false){
            System.out.println("");
        }else{
            myCar.goStraight();
        }

    }

}
