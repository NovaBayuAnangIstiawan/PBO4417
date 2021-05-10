/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class Borongan extends Karyawan{
    // poperty

    // kontruktor
    Borongan(String noKTP, String nama){
        super(noKTP, nama);
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
}