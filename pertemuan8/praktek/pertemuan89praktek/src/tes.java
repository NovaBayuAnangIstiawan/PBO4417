
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

public class tes implements Data_Mobil{
    public static void main(String[] agr)
    {	
		String idKTPK;
        String idnamaK;
		String jenis;
		String jenismobil;
		String idKTP;
        String idnama;
		boolean absen;
		boolean ada;
		String gantiHarga;
		int newHarga;
		Scanner idnamaKscan = new Scanner(System.in);
		Scanner idKTPKscan = new Scanner(System.in);
		Scanner jenisscan = new Scanner(System.in);
        Scanner idnamascan = new Scanner(System.in);
		Scanner idKTPscan = new Scanner(System.in);
		Scanner jenismobilscan = new Scanner(System.in);
		Scanner gantiHargascan = new Scanner(System.in);
		Scanner newHargascan = new Scanner(System.in);

        // mengambil input
		System.out.println("======Selamat Datang Pegawai=========");
		System.out.println("======Saatnya Melakukan Absen========");
        System.out.print("Nama: ");
		idnamaK = idnamaKscan.nextLine();
		System.out.print("No KTP: ");
		idKTPK = idKTPKscan.nextLine();
		Karyawan k1 = new Karyawan(idKTPK,idnamaK);
		k1.invoiceKa();

        // cek ada atau gk
		absen=false;
        if( idnamaK == null ) {
            absen=false;
        } else {
            absen=true;
        }

		if( absen == true ) {
			System.out.println("=====Saatnya Melayani Pelanggan=====");
			System.out.println("=======Masukkan Data Pelanggan======");
			System.out.println("[1]Individu");
			System.out.println("[2]Borongan");
			System.out.println("Pelanggan Individu atau Borongan ?");
			System.out.print("Jenis: ");
			jenis = jenisscan.nextLine();

			// cek ada atau gk
			ada=false;
			if( jenis == null ) {
				ada=false;
			} else {
				ada=true;
			}

			if( ada == true ) {
				System.out.println("=============================");
				if(jenis.equalsIgnoreCase("1")) {
					System.out.println("=======Masukkan Data Pelanggan======");
					System.out.println("==Tulis Nama dan No KTP Pelanggan===");
					String berhenti;
					System.out.print("Nama: ");
					idnama = idnamascan.nextLine();
					System.out.print("No KTP: ");
					idKTP = idKTPscan.nextLine();
					Individu p1 = new Individu(idKTP,idnama);
					berhenti="false";
					
					while(berhenti=="false"){
						System.out.println("==Jenis Mobil Yang Ingin dibeli==");
						System.out.println("|[1]Toyota Avanza = Rp70000000  |");
						System.out.println("|[2]Honda Brio    = Rp50000000  |");
						System.out.println("|[3]Toyota Calya  = Rp80000000  |");
						System.out.println("|    [4]Berhenti Membeli		|");
						System.out.println("=================================");
						System.out.print("Input: ");
						jenismobil = jenismobilscan.nextLine();
						if( jenismobil.equalsIgnoreCase("1")) {
							p1.jualMobil(m1);
						} 
						else if( jenismobil.equalsIgnoreCase("2")) {
							p1.jualMobil(m2);
						}
						else if( jenismobil.equalsIgnoreCase("3")) {
							p1.jualMobil(m3);
						}
						else {
							berhenti="true";
						}
					}
					p1.invoiceKo();
					System.out.println("==Anda Ingin Setting Harga Mobil==");
					System.out.println("| [1]Iya                          |");
					System.out.println("| [2]Tidak                        |");
					System.out.println("=================================");
					System.out.print("Input: ");
					gantiHarga = gantiHargascan.nextLine();
					if( gantiHarga.equalsIgnoreCase("1")) {
						System.out.print("Harga Baru: ");
						newHarga = newHargascan.nextInt();
						k1.setHargaMobil(p1,newHarga);
					}
					k1.invoiceKa();
					k1.Tips(p1);

				} 
				else if (jenis.equalsIgnoreCase("2")){
					String berhenti;
					System.out.print("Nama: ");
					idnama = idnamascan.nextLine();
					System.out.print("No KTP: ");
					idKTP = idKTPscan.nextLine();
					System.out.println("Selamat datang " + idnama);
					System.out.println("No KTP " + idKTP);
					Individu p3 = new Individu(idKTP,idnama);
					berhenti="false";
					
					while(berhenti=="false"){
						System.out.println("==Jenis Mobil Yang Ingin dibeli==");
						System.out.println("|[1]Toyota Avanza = Rp70000000  |");
						System.out.println("|[2]Honda Brio    = Rp50000000  |");
						System.out.println("|[3]Toyota Calya  = Rp80000000  |");
						System.out.println("|    [4]Berhenti Membeli		|");
						System.out.println("=================================");
						System.out.print("Input: ");
						jenismobil = jenismobilscan.nextLine();
						if( jenismobil.equalsIgnoreCase("1")) {
							p3.jualMobil(m1);
						} 
						else if( jenismobil.equalsIgnoreCase("2")) {
							p3.jualMobil(m2);
						}
						else if( jenismobil.equalsIgnoreCase("3")) {
							p3.jualMobil(m3);
						}
						else {
							berhenti="true";
						}
					}
					p3.invoiceKo();
					System.out.println("==Anda Ingin Setting Harga Mobil==");
					System.out.println("| [1]Iya                          |");
					System.out.println("| [2]Tidak                        |");
					System.out.println("=================================");
					System.out.print("Input: ");
					gantiHarga = gantiHargascan.nextLine();
					if( gantiHarga.equalsIgnoreCase("1")) {
						System.out.print("Harga Baru: ");
						newHarga = newHargascan.nextInt();
						k1.setHargaMobil(p3,newHarga);
					}
					k1.invoiceKa();
					k1.Tips(p3);
				}
				else {
					System.out.println("Error");
				}

				
			} else {
				System.out.println("Error");
			}
        } 
		else {
            System.out.println("Tolong Input dengan Benar");
        }
		
	}

}
