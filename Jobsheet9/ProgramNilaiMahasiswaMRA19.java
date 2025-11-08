package Jobsheet9;

import java.util.Scanner;

public class ProgramNilaiMahasiswaMRA19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();
        int[] Nilai = new int[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+ (i + 1) + " : ");
            Nilai[i] = sc.nextInt();
        }

        int total = 0;
        for (int i = 0; i < jumlahMhs; i++) {
            total += Nilai[i];
        }

        double Rata2 = (double) total / jumlahMhs;
        int tertinggi = Nilai [0];
        int terendah = Nilai [0];

        for (int i = 0; i < jumlahMhs; i++) {
            if(Nilai[i] > tertinggi) {
                tertinggi = Nilai[i];
            }
            if (Nilai[i] < terendah) {
                terendah = Nilai[i];
            }
        }

        System.out.println("==== Hasil Nilai Mahasiswa ====");
        System.out.print("Nilai Yang Dimasukkan : ");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print(Nilai[i] + " ");
        }

        System.out.println("\nNilai Rata - Rata : " + Rata2);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);

        sc.close();
    }
    
}
