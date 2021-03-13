/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class MobilDemo2 {
    public static void main(String[] args) {
        // Membuat object
        Mobil2 mobil = new Mobil2();

        // Memanggil atribut dan memberi nilai
        mobil.warna = "Hitam";
        mobil.tahunProduksi = 2006;
        mobil.hidupkanMobil();
        mobil.ubahGigi(2);
        System.out.println("Warna : " + mobil.warna);
        System.out.println("Tahun : " + mobil.tahunProduksi);
        System.out.println("Tranmisi mobil sekarang: " + mobil.Gear);
    }
}
class Mobil2 {
    String warna;
    int tahunProduksi;
    boolean hidup = false;
    int Gear = 0;

    public void hidupkanMobil() {
        hidup = true;
        System.out.println("mesin hidup");
    }
    public void matikanMobil() {
        hidup = false;
        System.out.println("mesin mati");
    }
    public void ubahGigi(int Ntransmisi) {
        Gear = Gear + Ntransmisi;
    }
}
