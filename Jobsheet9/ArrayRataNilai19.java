package Jobsheet9;

import java.util.Scanner;

public class ArrayRataNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilaiMhs = new int[jumlahMhs];
        double totallulus = 0, totalTidaklulus = 0;
        int jumlahLulus = 0, jmllhtidaklulus = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+ (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jumlahMhs; i++) {
            if (nilaiMhs[i] > 70) {
                totallulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidaklulus += nilaiMhs[i];
                jmllhtidaklulus++;
            }
        }
        double rata2Lulus = (jumlahLulus > 0) ? totallulus / jumlahLulus : 0;
        double rata2TidakLulus = (jmllhtidaklulus > 0) ? totalTidaklulus / jmllhtidaklulus : 0;

        System.err.println();
        System.out.println("Rata - Rata Nilai Lulus = "+ rata2Lulus);
        System.out.println("Rata - Rata Nilai Tidak Lulus = " + rata2TidakLulus);

        sc.close();
    }
    
}
