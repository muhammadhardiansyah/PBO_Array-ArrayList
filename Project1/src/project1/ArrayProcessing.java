/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

/**
 *
 * @author asus
 */
import java.util.Scanner;
public class ArrayProcessing {
    int[] dataBil = new int[100];
    
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya data (n): ");
        this.n = input.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Masukan bilangan ke-"+(i+1)+": ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for (int i = 0; i < this.n; i++){
            sum += data[i];
        }
        double rerata = sum / this.n;
        return rerata;
    }
       
    int cariMax(int[] data){
        int[] hasil = {data[0]};
        for (int bil : data){
            if (hasil[0] < bil){
                hasil[0] = bil;
            }
        }
        return hasil[0];
    }
    int cariMin(int[] data){
        int[] hasil = {data[0]};
        for (int i = 0; i < this.n ; i++){
            if (hasil[0] > data[i]){
                hasil[0] = data[i];
            }
        }
        return hasil[0];
    }
      
    void output(){
        System.out.println("========================================");
        System.out.println("Rerata: " + this.hitungRerata(this.dataBil));
        System.out.println("Nilai maximum dari array ini: " + this.cariMax(dataBil));
        System.out.println("Nilai minimum dari array ini: " + this.cariMin(dataBil));
    }
}
