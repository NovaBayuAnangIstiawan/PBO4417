/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class UjiKendaraan {
    public static void main(String[] args) {
        System.out.println("========MotorVehicle=========");
        MotorVehicle motor = new MotorVehicle(4, "H 2926 CI");
        motor.goStraight();
        System.out.println("Engine size : " + motor.getsizeofEngine());
        System.out.println("Plat Nomor : " + motor.getLicencePlate());
        System.out.println("=============================");
        
        System.out.println("===========Bicycle===========");
        Bicycle Speda = new Bicycle();
        Speda.ringBell();
        Speda.turnLeft();
        Speda.turnRight();
        System.out.println("=============================");
        
        
        
        
        

       

        





    }
}