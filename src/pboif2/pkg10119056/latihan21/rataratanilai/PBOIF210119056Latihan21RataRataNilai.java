/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan21.rataratanilai;
import java.util.Scanner;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan rata-rata nilai
 */

public class PBOIF210119056Latihan21RataRataNilai {
    
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        double jumlah,nilai,rata;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan banyaknya Mahasiswa: ");
        n=input.nextInt();
        jumlah = 0;
        for(int i=1; i<=n; i++){
            System.out.print("Nilai Mahasiswa ke- "+i+":" );
            nilai=input.nextInt();
            jumlah+=nilai;
        }
        rata=jumlah / n;
        System.out.println("Rata-rata nilai mahasiswa : " + rata);
        System.out.println("Develoved by : Irfan Ginanjar ");
    }
}
