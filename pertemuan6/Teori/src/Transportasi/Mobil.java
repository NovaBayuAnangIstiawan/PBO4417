package Transportasi;
import java.util.Scanner;

public class Mobil {
    public int sizeofEngine = 1;
    public String licencePlate = "H 1 IDN";

    public Mobil() {
    }
    public Mobil(int sizeEng, String lcPlate) {
        this.sizeofEngine = sizeEng;
        this.licencePlate = lcPlate;
    }
    public int getsizeofEngine() {
        return this.sizeofEngine;
    }
    public String getLicencePlate() {
        return this.licencePlate;
    }
    public void goStraight() {
        System.out.println("Maju...");
    }
}