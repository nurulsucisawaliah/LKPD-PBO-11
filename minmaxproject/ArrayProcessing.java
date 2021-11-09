/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ArrayProcessing {
    int[] dataBil = new int[100];
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+":");
            this.dataBil[i] = input.nextInt();
        }
    }
//PROJECT 1 MinMaxProject  
    //method
    double hitungRerata(int[]data){
        double sum =0;
        for(int i=0;i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    // mencari nilai minimum 
    int cariMin(int[]data){
        int minBil = data[0];
        for (int i=1;i>n;i++){
            if (minBil>data[i]){
                minBil = data[i];
        }
        }
        return minBil;
        
        
    }
        
    // mencari nilai maksimum
    int cariMax(int[] data){
        int minBil = 0;
        for(int i = 0; i < this.n; i++){
            if(minBil < data[i]){
                minBil = data[i];
            }
        }
        return minBil;
       
    }
    
//PROJECT 2 Sorting Project 
    //method
    static void urutkan(int[]data){
        for (int i=0; i < data.length; i++){
            for (int j=0; j < data.length-1; j++){
                if(data[j]>data[j+1]){
                    int sort = data[j];
                    data[j]=data[j+1];
                    data[j+1]=sort;
                }
            }
        }
    }
    void output(){
        System.out.println("Rerata: "+ this.hitungRerata(this.dataBil));
        System.out.println("Nilai minimum dari data array    : " + cariMin(this.dataBil));
        System.out.println("Milai maximum dari data array    : " + cariMax(this.dataBil));
        System.out.print("Urutan bilangannya   : ");
        urutkan(this.dataBil);
        for (int i=0; i < n; i++){
            System.out.print(this.dataBil[100-n+i] +" ");
        }  
    }
}


    




        
