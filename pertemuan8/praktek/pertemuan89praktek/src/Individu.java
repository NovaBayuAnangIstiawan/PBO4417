/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class Individu extends Karyawan{
    // poperty

    // kontruktor
    Individu(String noKTP, String nama){
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
                    System.out.println("Hanya boleh 1 mobil");
                }
            }
        }
    }
}