/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
import java.util.Scanner;
public  class BukuDemo{
    public static void main(String[] args) {
        Buku buku1 = new Buku(1, "Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku buku2 = new Buku(2, "Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);

        buku1.cetakBuku();
        buku2.cetakBuku();
    }
}
class Buku {
    int Nomor;
    String judul;
    String pengarang;
    String penerbit;
    int tahun;

    Buku(int Nomor, String judul, String pengarang, String penerbit, int tahun) {
        this.Nomor = Nomor;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    void cetakBuku() {
        System.out.println("=================================");
        System.out.println("Buku             :"+this.Nomor);
        System.out.println("Judul Buku       :"+this.judul);
        System.out.println("pengarang        :"+this.pengarang);
        System.out.println("Penerbit         :"+this.penerbit);
        System.out.println("Tahun            :"+this.tahun);
    }
}























