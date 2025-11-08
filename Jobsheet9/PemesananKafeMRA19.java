package Jobsheet9;

import java.util.Scanner;

public class PemesananKafeMRA19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== Kafe suka-suka ======");
        System.out.print("Masukan Jumlah Pesanan : ");
        int jumlahphs = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jumlahphs];
        double[] hargaPesanan = new double[jumlahphs];

        for (int i = 0; i < jumlahphs; i++) {
            System.out.println("\nPesanan Ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan Harga Pesanan : ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        double total = 0;
        for (int i = 0; i < jumlahphs; i++) {
            total += hargaPesanan[i];
        }

        System.out.println("\n===== DAFTAR PESANAN Kafe =====");
        for (int i = 0; i < jumlahphs; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " Rp " + hargaPesanan[i]);
        }

        System.out.println("==================================================");
        System.out.println("TOTAL BIAYA : Rp " + total);
        System.out.println("==================================================");

        sc.close();
    }
    
}
