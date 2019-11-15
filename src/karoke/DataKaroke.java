/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karoke;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author LABKOM1-RPL23
 */
public class DataKaroke {
    public static void main(String[] args){
        String rafa_nama, rafa_namatipe = null;
        int rafa_jam, rafa_tipe; 
        double rafa_harga = 0;
        double rafa_kalijam = 0;
        double rafa_diskon = 0;
        double rafa_bayar = 0.0;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("-----------Karoke Syariah----------");
        System.out.println("tipe kamar : ");
        System.out.println("1. Room Small /55.000");
        System.out.println("2. Room Medium /70.000");
        System.out.println("3. Room Large /120.000");
        System.out.println("4. Family Room /150.000");

        System.out.print("Nama : ");
        rafa_nama = keyboard.nextLine();
        System.out.print("tipe (1/2/3/4): ");
        rafa_tipe = keyboard.nextInt();
        if (rafa_tipe>4 || rafa_tipe<1) {
            System.err.println("Tipe Tidak Ada!");
        }else{
            System.out.print("Jam Sewa : ");
            rafa_jam = keyboard.nextInt();

            //harga
            if (rafa_tipe==1) {
                rafa_harga = 55000;
                rafa_namatipe = "room small";
            }else if(rafa_tipe==2){
                rafa_harga = 70000;
                rafa_namatipe = "room medium";
            }else if(rafa_tipe==3){
                rafa_harga = 120000;
                rafa_namatipe = "room large";
            }else if(rafa_tipe==4){
                rafa_harga = 150000;
                rafa_namatipe = "family room";
            }
            
            System.out.println("==============Struk Bayar================");
            System.out.println("Nama : "+rafa_nama);
            System.out.println("Tipe :"+rafa_namatipe);
            System.out.println("Jam Sewa :"+rafa_jam+" Jam");
            //jika diskon
            if (rafa_jam > 3) {
                System.out.println("Anda Mendapatkan diskon 11.11%!");
                rafa_kalijam = rafa_harga*rafa_jam;
                rafa_diskon = rafa_kalijam*0.1111;
            }else{
                rafa_kalijam = rafa_harga*rafa_jam;
                rafa_diskon = 0;
            }
            //hitung harga jika diskon
            rafa_bayar = rafa_kalijam - rafa_diskon;

            System.out.println("Harga Bayar : Rp."+rafa_bayar);

            JOptionPane.showMessageDialog(null, "===========Struk Bayar==========="+
                    "\nNama : "+rafa_nama+
                    "\nTipe : "+rafa_namatipe+
                    "\nJam Sewa : "+rafa_jam+" Jam"
                    +"\nHarga Bayar : Rp."+rafa_bayar);
        }
        
    }
    
}
