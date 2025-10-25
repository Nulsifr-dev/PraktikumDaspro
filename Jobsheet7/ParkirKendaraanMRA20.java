package Jobsheet7;

import java.util.Scanner;

public class ParkirKendaraanMRA20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.println("Masukkan jenis kendaraan (1 untuk Mobil, 2 untuk Motor, 0 untuk Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500; 
                } else if (jenis == 1) {
                    total += durasi * 3000; // mobil
                } else if (jenis == 2) {
                    total += durasi * 2000; // motor
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid!\n");
            }

            System.out.println(); 

        } while (jenis != 0);

        System.out.println("Total pembayaran parkir hari ini: Rp " + total);
        System.out.println("Terima kasih telah menggunakan layanan parkir!");

        sc.close();
    }
}

