package Jobsheet7;

import java.util.Scanner;

public class TiketBioskopMRA20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HARGA_TIKET = 50000;
        String input;
        int jumlahTiket;
        double totalHarga, diskon;
        int totalSemuaTiket = 0;
        double totalSemuaPenjualan = 0;

        System.out.println("=== Penjualan Tiket Bioskop ===");
        System.out.println("Ketik 'ok' untuk keluar.\n");

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("ok")) {
                System.out.println("\nTransaksi selesai. Terima kasih!\n");
                break;
            }

            jumlahTiket = Integer.parseInt(input);

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Masukkan angka positif.\n");
                continue;
            }

            totalHarga = jumlahTiket * HARGA_TIKET;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0.0;
            }

            totalHarga -= totalHarga * diskon;

            totalSemuaTiket += jumlahTiket;
            totalSemuaPenjualan += totalHarga;

            System.out.println("Diskon: " + (int)(diskon * 100) + "%");
            System.out.println("Total yang harus dibayar: Rp " + (int)totalHarga);
            System.out.println("----------------------------------------\n");

        } while (true);

        System.out.println("=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalSemuaTiket);
        System.out.println("Total penjualan: Rp " + (int)totalSemuaPenjualan);

        sc.close();
    }
}