/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
  * @author Bayu
 */
public class TestTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel 
                + " and Volume Level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel 
                + " and Volume Level is " + tv2.volumeLevel);
    }
    
}
    class RemoteTV{
        int on = 1;
        int channel = 0;
        int volumeLevel = 0;
        int loop = 0;

        void setChannel(int Channel){
        }

        void setVolume(int Volume){
        }

        void channelUp(){
        channel++;
        }

        void channelDown(){
        channel--;
        }

        void volumeUp(){
        volumeLevel++;
        }

        void volumeDown(){
        volumeLevel--;
        }

        void turnOn(){
        on = 1;
        }

        void turnOff(){
        on = 0;
        loop = 1;
        }
        
    }