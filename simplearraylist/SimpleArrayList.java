/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SimpleArrayList {
    public static void main(String[] args) {
        aplikasi a = new aplikasi();
        while(true){
            int menu;
            System.out.println("Menu Data ArrayList: ");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.print("Pilih nomor berapa: ");
            menu = input.nextInt();

            switch (menu) {
                case 1:
                    a.tambahData();
                case 2:
                    a.indexOf();
                case 3: 
                    a.hapusData();
                case 4:
                    a.tampilData();
                case 5:
                    System.exit(0);
            }
        }
    }
    
}
