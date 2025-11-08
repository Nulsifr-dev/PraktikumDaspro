package Jobsheet9;

import java.util.Scanner;

public class ArrayNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan Nilai Akhir Ke-" + i +" : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] >= 70) {
            System.out.println("Mahasiswa ke-"+ i +" lulus! ");
            }  else {
                System.out.println("Mahasiswa ke- " + (i + 1) + " tidak lulus");
            } 
        }
        sc.close();
    }
    
}
