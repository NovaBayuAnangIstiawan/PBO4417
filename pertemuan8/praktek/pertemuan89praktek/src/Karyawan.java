/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
import java.util.ArrayList;

public class Karyawan extends Harga{
    private String noKTP;
    private String nama;
    public ArrayList<Mobil> listMbl;

    // kontruktor
    Karyawan(){
        listMbl = new ArrayList<Mobil>();
        noKTP="00001";
        nama="NA";
    }

    Karyawan(String noKTP, String nama){
        listMbl = new ArrayList<Mobil>();
        this.noKTP=noKTP;
        this.nama=nama;
    }

    // method
    public void setKTP(String noKTP){
        this.noKTP=noKTP;
    }

    public String getKTP(){
        return noKTP;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public String getNama(){
        return nama;
    }

    public void setHarga(int Harga){
        this.Harga=Harga;
    }

    public int getHarga(){
        return Harga;
    }

    public void jualMobil(Mobil mbl){
        if (listMbl.size()==0){
            listMbl.add(mbl);
        }
        else{
            for (int y=0;y<listMbl.size();y++){
                if (listMbl.get(y).getMerkMobil()==mbl.getMerkMobil()){
                    listMbl.add(mbl);
                    break;    
                }
                else{
                    System.out.println("Hanya boleh beli mobil satu merk");
                }
            }
        }
    }

    public void Tips(Individu mkd){
        int tips;
        int total_tips;

        total_tips=0;
        for (int i=0;i<mkd.listMbl.size();i++){
            tips = mkd.listMbl.get(i).getHarga()*10/100;
            total_tips = total_tips + tips;
        }
        System.out.println("======Data Karyawan======");
        System.out.println("No KTP : "+noKTP);
        System.out.println("Nama : "+nama);
        System.out.println("Total Tips Karyawan = "+total_tips);
    }

    public void setHargaMobil(Individu mkd,int nilai){
        for (int i=0;i<mkd.listMbl.size();i++){
            mkd.listMbl.get(i).setHarga(nilai);
        }
        System.out.println("Edit Nilai Jual Mobil : "+nilai);
    }

    public void invoiceKo(){
        System.out.println("======Data Konsumen======");
        System.out.println("No KTP : "+noKTP);
        System.out.println("Nama : "+nama);
        System.out.println("List mobil yang ditambah : ");
        for (int i=0;i<listMbl.size();i++){
            System.out.println(i+1+" "+listMbl.get(i).getMerkMobil()+" harga : "+listMbl.get(i).getHarga());
        }
    }
    public void invoiceKa(){
        System.out.println("======Data Karyawan======");
        System.out.println("No KTP : "+noKTP);
        System.out.println("Nama : "+nama);
        }
}
