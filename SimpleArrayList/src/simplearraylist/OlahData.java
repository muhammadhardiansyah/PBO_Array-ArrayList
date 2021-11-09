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
import java.util.ArrayList;
import java.util.Collections;
public class OlahData {
    //Data
    ArrayList<String> data = new ArrayList<String>();
    
    //Input
    Scanner input = new Scanner(System.in);

    //Tampil Data
    void TampilData(){
        String[] isi = new String[this.data.size()];
        for (int i = 0; i < this.data.size(); i++){
                isi[i] = this.data.get(i);
        }
        for (String j : isi){
            if (isi.length == 1){
                System.out.println("[" + j + "]" );
            }
            else if (isi.length == 0){
                System.out.println("[ ]");
            }
            else if (j == isi[0]) {
                System.out.print("[" + j + ",");
            }
            else if (j == isi[isi.length-1]){
                System.out.println(j + "]");
            }
            else {
                System.out.print(j + ",");
            }
        }
        System.out.println("------------------------------------");
    }

    //Tambah Data
    void TambahData(){
        while (true){
            System.out.print("Masukan data string: ");
            this.data.add(input.nextLine());
            System.out.println("------------------------------------");
            System.out.print("Tambah data lagi?(y/n) ");
            char ans = input.nextLine().charAt(0);
            System.out.println("------------------------------------");
            if (ans == 'n'){
                break;
            }
        }
        //tampil data
        System.out.print("String yang ada pada data: ");
        this.TampilData();
        
    }
    
    //Cari Data
    void CariData(){
        System.out.print("Masukan string yang hendak anda cari: ");
        String find = input.nextLine();
        System.out.println("------------------------------------");
        boolean found = false;
        for (int i = 0; i < this.data.size(); i++){
            if (this.data.get(i).equals(find)){
                found = true;
            } 
        }
        if (found == true){
            System.out.println("String " + find + " berada pada index ke-" + this.data.indexOf(find) + " di dalam data");
        }
        else {
            System.out.println("String " + find + " tidak ada di dalam data");
        }
        System.out.println("------------------------------------");
        
    }
    
    //Hapus Data
    void HapusData(){
        System.out.print("Masukan String yang hendak anda hapus: ");
        String find = input.nextLine();
        System.out.println("------------------------------------");
        boolean found = false;
        int indeks = -1;
        for (int i = 0; i < this.data.size(); i++){
            if (this.data.get(i).equals(find)){
                found = true;
                indeks = i;
            } 
        }
        if (found == true){
            this.data.remove(indeks);
            System.out.println("String " + find + " sudah dihapus dari data.");
        }
        else{
            System.out.println("String " + find + " tidak ada dalam data");
            //tampil data
            System.out.print("String yang ada pada data: ");
            this.TampilData();
        }
        System.out.println("------------------------------------");
    }
    
    
    
    
    
}
