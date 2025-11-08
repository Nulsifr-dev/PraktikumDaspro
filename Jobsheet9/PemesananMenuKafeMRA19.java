package Jobsheet9;

import java.util.Scanner;

public class PemesananMenuKafeMRA19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng",
            "Teh Tarik","Cappuccino","Chocolate Ice"};

        System.out.println("===== Menu Kafe suka-suka =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1)+ ". " + menu[i]);
        }

        System.out.print("\nMasukkan Nama Makanan Atau Minuman Yang Ingin Dicari : ");
        String cari = sc.nextLine();

        boolean found = false;
        int posisi = -1;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                found = true;
                posisi = i;
                break;
            }
        }

        System.out.println("\n===== HASIL MENU PENCARIAN =====");
        if (found) {
            System.out.println("Menu \"" + menu[posisi] + "\" Tersedia Di Daftar Menu, Urutan Ke-"+ (posisi + 1));
        } else {
            System.out.println("Mohon Maaf, Menu \""+ cari + "\" Tidak Di Temukan Di Daftar Menu.");
        }

        sc.close();
    }
    
}
