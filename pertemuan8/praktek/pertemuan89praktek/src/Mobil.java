/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class Mobil extends Harga{
    // property
    private String idMobil;
    private String merkMobil;
    public int Harga;

    // konstruktor
    Mobil(){
        idMobil="00001";
        merkMobil="NA";
        Harga=5;
    }

    Mobil(String idMobil, String merkMobil, int Harga){
        this.idMobil=idMobil;
        this.merkMobil=merkMobil;
        this.Harga=Harga;
    }

    // method
    public void setID(String idMobil){
        this.idMobil=idMobil;
    }

    public String getID(){
        return idMobil;
    }

    public void setMerkMobil(String merkMobil){
        this.merkMobil=merkMobil;
    }

    public String getMerkMobil(){
        return merkMobil;
    }

    public void setHarga(int Harga){
        this.Harga=Harga;
    }

    public int getHarga(){
        return Harga;
    }
}
