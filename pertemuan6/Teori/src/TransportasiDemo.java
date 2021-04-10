import Transportasi.Sepeda;
import Transportasi.Mobil;

public class TransportasiDemo{
    public static void main(String[] args){
        System.out.println("========Mobil=========");
        Mobil Mobilku = new Mobil(4, "H 2926 CI");
        Mobilku.goStraight();
        System.out.println("Engine size : " + Mobilku.getsizeofEngine());
        System.out.println("Plat Nomor : " + Mobilku.getLicencePlate());
        System.out.println("=============================");
        
        System.out.println("===========Sepeda===========");
        Sepeda Speda = new Sepeda();
        Speda.ringBell();
        System.out.println("===========Sepeda===========");
    }
}