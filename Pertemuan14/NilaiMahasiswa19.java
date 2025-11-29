package Pertemuan14;

import java.util.Scanner;

public class NilaiMahasiswa19 {
    public static void isianArray(int [] arrray){}
    Scanner sc = new Scanner(System.in);
    
    public static void isianArray(double[] arrayNilai, Scanner sc) {
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            arrayNilai[i] = sc.nextDouble();
        }
    }
    
    public static void tampilArray(double[] arrayNilai) {
        System.out.println("Daftar Nilai Mahasiswa:");
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + arrayNilai[i]);
        }
    }
    
    public static double hitTot(double[] arrayNilai) {
        double total = 0;
        for (double nilai : arrayNilai) {
            total += nilai;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        
        double[] nilaiMhs = new double[n];
        
        isianArray(nilaiMhs, sc);
        tampilArray(nilaiMhs);
        
        double totalNilai = hitTot(nilaiMhs);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai: " + (totalNilai/n));
        
        sc.close();
    }
    
}
