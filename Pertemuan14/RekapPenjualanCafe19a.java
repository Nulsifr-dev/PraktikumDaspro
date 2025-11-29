package Pertemuan14;

import java.util.Scanner;

public class RekapPenjualanCafe19a {
    public static void inputPenjualan(int[][] penjualan, String[] namaMenu, Scanner sc) {
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\nInput penjualan " + namaMenu[i] + ":");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }
    
    public static void tampilPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\n===== TABEL PENJUALAN =====");
        System.out.print("Menu\t\t");
        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.print("Hari " + (j+1) + "\t");
        }
        System.out.println();
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (namaMenu[i].length() < 8) System.out.print("\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void menuTertinggi(int[][] penjualan, String[] namaMenu) {
        int maxTotal = 0;
        int indexMax = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }
        
        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(namaMenu[indexMax] + " dengan total: " + maxTotal);
    }
    
    public static void rataRataPenjualan(int[][] penjualan, String[] namaMenu) {
        System.out.println("\nRata-rata penjualan per menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(namaMenu[i] + ": " + rataRata);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] namaMenu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int[][] penjualan = new int[5][7];
        
        inputPenjualan(penjualan, namaMenu, sc);
        tampilPenjualan(penjualan, namaMenu);
        menuTertinggi(penjualan, namaMenu);
        rataRataPenjualan(penjualan, namaMenu);
        
        sc.close();
    }
    
}
