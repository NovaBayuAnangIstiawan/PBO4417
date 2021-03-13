/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
public class TestTV2 {
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Erik");
        System.out.println(man1.namaSaya());
        TV tvku = new TV();
        man1.beliTV(tvku);
        
        //KODE UNTUK MENGOUTPUTKAN CEK TV
        System.out.println(man1.CekTVNB());
        //KODE UNTUK jualSemuaTV
        man1.JualSemuaTVNB();
        //KODE UNTUK MENGOUTPUTKAN CEK TV
        System.out.println(man1.CekTVNB());
        
        
    }
}

class TV {
    int channel = 7;
    int volumeLevel = 1;
    Boolean on;

    TV() {
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
    //====================================================================
    public void setChannel(int newChannel) {
        if (on == true) {
            if (newChannel <= 120 && newChannel >= 1) {
                channel = newChannel;
            }
        }

    }

    public void setVolume(int newVolumeLevel) {
        if (on == true) {
            if (newVolumeLevel <= 7 && newVolumeLevel >= 0) {
                volumeLevel = newVolumeLevel;
            }
        }

    }

    public void channelUp() {
        if (channel == 120) {
            channel = 1;
        } else {
            channel++;
        }
    }

    public void channelDown() {
        if (channel == 1) {
            channel = 120;
        } else {
            channel--;
         }
    }

    public void volumeUp() {
        if (on == true) {
            if (volumeLevel == 7) {
                volumeLevel++;
            }
        }
    }

    public void volumeDown() {
        if (on == true) {
            if (volumeLevel == 0) {
                volumeLevel--;
            }
        }
    }

}
class Manusia {
    String nama = "noname";
    boolean punyaTV = false;

    Manusia() {

    }

    Manusia(String nama) {
        this.nama = nama;
    }

    String namaSaya() {
        return nama;
    }

    void beliTV(TV newTv) {
        punyaTV = true;
    }

    void JualSemuaTVNB() {
        punyaTV = false;
    }

    boolean CekTVNB() {
        return punyaTV;
    }
}

// Method:
// Manusia()  Konstruktor kosong
// Manusia(nama:String)  konstruktor dengan parameter aktual nama, isi nama yang ada di property sama dengan nama pada parameter aktual 
// namaSaya():String  method untuk mengembalikan string nama yang ada di property
// beliTV(tiviku:TV):void  method untuk mengeset punyaTV menjadi “True”
// jualSemuaTV():void  method untuk mengeset punyaTV menjadi “False”
// cekTV():boolean  metho untuk mengembalikan nilai punyaTV
