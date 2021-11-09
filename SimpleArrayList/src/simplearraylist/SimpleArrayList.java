/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instansiasi Olah Data
        OlahData data = new OlahData();
        
        //instansiasi scanner
        Scanner input = new Scanner(System.in);
        
        while (true){
            System.out.println("Menu Data ArrayList: ");
            System.out.println("1. Tambah data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.println("------------------------------------");
            System.out.print("Pilih nomor berapa: ");
            int select = input.nextInt();
            System.out.println("------------------------------------");
            if (select == 1){
                data.TambahData();
            }
            else if (select == 2){
                data.CariData();
            }
            else if (select == 3){
                data.HapusData();
            }
            else if (select == 4){
                data.TampilData();
            }
            else if (select == 5){
                System.out.println("TERIMAKASIH");
                break;
            }
            else {
                System.out.println("Masukan pilihan yang tersedia");
            }
            
            
            
        }
    }
    
}
