/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bayu
 */
package switchCase;
import java.util.Scanner;
/**
 *
 * @author hady
 */
public class switchCaseTwo {
    public static void main (String [] hady){
        Scanner in = new Scanner (System.in);
        String nama , ktp ;
        int status;
        int statusPBL;
        int beliMobil;
        int editMobil;
        int pesan;
        int Mobil_1;

        
        
        System.out.print("Masukan nama : ");
        nama = in.nextLine();
        System.out.print("Masukan No.KTP : ");
        ktp = in.nextLine();
        
        System.out.print("Status : \n 1. Karyawan  \n 2. Pembeli \n\n Masukan pilihan :");
        status = in.nextInt();
        switch (status){
            case 1:
                System.out.print("edit harga Mobil : \n 1. Mobil sedan  \n 2. Mobil minibus  \n 3. mobil bus \n\n Masukan pilihan :");
                editMobil = in.nextInt(); 

                break;
            case 2:
                System.out.print("Pembelian Mobil : \n 1. Mobil sedan  \n 2. Mobil minibus  \n 3. mobil bus \n\n Masukan pilihan :");
                beliMobil = in.nextInt();
     
                switch (beliMobil){
                    case 1:
                        System.out.println("Mobil Sedan");
                        System.out.println("1. Nama Mobil : Toyota Yaris \n Harga : Rp.250.000.000 ");
                        System.out.println("2. Nama Mobil : Honda Civic \n Harga : Rp.500.000.000 ");
                        System.out.println("3. Nama Mobil : Honda City \n Harga : Rp.350.000.000 ");
                        System.out.print("Pilih Mobil yang di beli : ");
                        Mobil_1 = in.nextInt();
                        System.out.print("Jumlah Mobil yang di beli : ");
                        pesan = in.nextInt();
                        switch (Mobil_1){
                            case 1:
                                
                                System.out.println("==========Mobil Sedan==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 1 \n Nama Mobil : Toyota Yaris \n Harga : Rp.250.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*250000000);
                                System.out.println("Tip karyawan 10% jadi : "+pesan*250000000*10/100);
                                break;   
                            case 2:
                                
                                System.out.println("==========Mobil Sedan==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 2 \n Nama Mobil : Honda Civic \n Harga : Rp.500.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*500000000);
                            break; 
                            case 3:

                                System.out.println("==========Mobil Sedan==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 3 \n Nama Mobil : Honfa City \n Harga : Rp.350.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*350000000);
                            break; 
 
                        }
                        break;
                        
                    case 2:
                        System.out.println("==========MiniBus==========");
                        System.out.println("1. Nama Mobil : Toyota Yaris \n Harga : Rp.510.000.000 ");
                        System.out.println("2. Nama Mobil : Suzuki APV Luxury \n Harga : Rp.230.000.000 ");
                        System.out.println("3. Nama Mobil : DFSK Gelora \n Harga : Rp.160.000.000 ");
                        System.out.print("Pilih Mobil yang di beli : ");
                        Mobil_1 = in.nextInt();
                        System.out.print("Jumlah Mobil yang di beli : ");
                        pesan = in.nextInt();
                        switch (Mobil_1){
                            case 1:
                                
                                System.out.println("==========MiniBus==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 1 \n Nama Mobil : Toyota Yaris \n Harga : Rp.510.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*250000000);
                            break;   
                            case 2:
                                
                                System.out.println("==========MiniBus==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 2 \n Nama Mobil : Suzuki APV Luxury \n Harga : 230.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*230000000);
                            break; 
                            case 3:
                                
                                System.out.println("==========MiniBus==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 3 \n Nama Mobil : DFSK Gelora \n Harga : Rp.160.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*160000000);
                            break; 
 
                        }
                        break;
                    case 3:
                        System.out.println("==========Bus==========");
                        System.out.println("1. Nama Mobil : Mercedes Benz OH 1518 \n Harga : Rp.900.000.000 ");
                        System.out.println("2. Nama Mobil : Mercedes Benz OH 1520 \n Harga : Rp.930.000.000 ");
                        System.out.println("3. Nama Mobil : Mercedes Benz OH 1521 \n Harga : Rp.960.000.000 ");
                        System.out.print("Pilih Mobil yang di beli : ");
                        Mobil_1 = in.nextInt();
                        System.out.print("Jumlah Mobil yang di beli : ");
                        pesan = in.nextInt();
                        switch (Mobil_1){
                            case 1:
                            
                                System.out.println("==========Bus==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 1 \n Nama Mobil : Toyota Yaris \n Harga : Rp.900.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*950000000);
                            break;   
                            case 2:
                                System.out.println("==========Bus==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 2 \n Nama Mobil : Suzuki APV Luxury \n Harga : 930.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*930000000);
                            break; 
                            case 3:
                                System.out.println("==========Bus==========");
                                System.out.println("Mobil dengan atas nama : "+ nama);
                                System.out.println("No.KTP : "+ ktp);
                                System.out.println("Mobil 3 \n Nama Mobil : DFSK Gelora \n Harga : Rp.960.000.000 ");
                                System.out.println("Jumlah Pesan : "+pesan);
                                System.out.println("Total Bayar : "+pesan*960000000);
                            break; 
 
                        }
                        break;

                }

                
        }
  
    }
}

