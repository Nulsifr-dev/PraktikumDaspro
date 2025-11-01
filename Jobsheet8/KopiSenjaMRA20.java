package Jobsheet8;

import java.util.Scanner;

public class KopiSenjaMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        int item, jumlahCabang, jumlahPelanggan;
        int totalPelanggan = 0, totalItem = 0;

        System.out.print("Masukkan jumlah cabang kafe : ");
        jumlahCabang = mra.nextInt();

        System.out.println("\n==== Input Penjualan Per Cabang ====");
        
        for (int cabang = 1; cabang <= jumlahCabang; cabang++){
            System.out.println("\n---- Cabang " +cabang+" ----");
            System.out.println("Jumlah pelanggan: ");
            jumlahPelanggan=mra.nextInt();
            
            int totalItemCabang=0;
            for (int pelanggan=1; pelanggan<=jumlahPelanggan; pelanggan++){
                System.out.print("- pelanggan " +pelanggan+ " membeli berapa item? ");
                item = mra.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + cabang + ": ");
            System.out.println("- Pelanggan: " + jumlahPelanggan+ " orang");
            System.out.println("- Item Terjual: " +totalItemCabang+ " item");

            totalPelanggan+=jumlahPelanggan;
            totalItem+=totalItemCabang;
        }
        System.out.println("\nTotal Seluruh Cabang: ");
        System.out.println("- pelanggan: " +totalPelanggan+ " orang");
        System.out.println("- Item Terjual: " +totalItem+" item");

        mra.close();
    }
    
}
