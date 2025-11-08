package Jobsheet9;

import java.util.Scanner;

public class SearchNilai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = -1;

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int Jumlah = sc.nextInt();

        int[] arrNilai = new int[Jumlah];

        for (int i = 0; i < Jumlah; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) + " : ");
           arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukan Nilai Yang Ingin Di Cari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println();
            System.out.println("Nilai "+ key +" Ketemu, Merupakan Nilai Mahasiswa Ke-"+ (hasil + 1));
        } else {
            System.out.println();
            System.out.println("Nilai Yang Di cari Tidak Di Temukan");
        }
        sc.close();
    }
    
}
