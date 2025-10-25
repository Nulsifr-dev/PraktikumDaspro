package Jobsheet7;

import java.util.Scanner;
public class KafeDoWhile20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, totalHarga;
        String namaPelanggan;
        int hargakopi = 12000;
        int hargateh = 7000;
        int hargaroti = 20000;

        do {
            System.out.println("Massukkan nama pelanggan (Ketik 'Batal' Untuk keluar ): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua Transaksi selesai. Terima kasih!");
    
        sc.close();
    }
}