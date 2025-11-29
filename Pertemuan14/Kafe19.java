package Pertemuan14;

import java.util.Scanner;

public class Kafe19 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian");
        }
        System.out.println("===== MENU KAFE RESTO =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Capuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan");
    }

    public static int hitungTotalHarga19(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        
        if (kodePromo.equals("DISKON50%")){
            System.out.println("Selamat! Anda mendapat diskon 50%");
            hargaTotal = hargaTotal * 50 / 100;
        } else if (kodePromo.equals("DISKON30%")) {
            System.out.println("Selamat! Anda mendapat diskon 30%");
            hargaTotal = hargaTotal * 70 / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        return hargaTotal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Rifqi", true);

        int totalKeseluruhan = 0;
        String lanjut;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan kode promo (atau tekan Enter): ");
            String kodePromo = sc.nextLine();

            totalKeseluruhan = hitungTotalHarga19(pilihanMenu, banyakItem, kodePromo);  
            
            System.out.print("\nApakahingin memesan menu lain? (y/n): ");
            lanjut = sc.nextLine();
            System.out.println();
        } while (lanjut.equalsIgnoreCase("y"));
        

        System.out.println("Total harga untuk pesanan Anda: Rp"+ totalKeseluruhan);
        sc.close();
    }
}
