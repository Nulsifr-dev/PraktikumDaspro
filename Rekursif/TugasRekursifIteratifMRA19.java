package Rekursif;

import java.util.Scanner;

public class TugasRekursifIteratifMRA19 {
    static int jumlahIteratif(int[] arr, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
        }
        return total;
    }

    static int jumlahRekursif(int[] arr, int index) {
        if (index < 0) {
            return 0; // basis
        }
        return arr[index] + jumlahRekursif(arr, index - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = new int[100];

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (n - i) + ": ");
            angka[i] = sc.nextInt();
        }

        int totalIteratif = jumlahIteratif(angka, n);

        int totalRekursif = jumlahRekursif(angka, n - 1);

        System.out.println("\n=== HASIL PENJUMLAHAN ===");
        System.out.println("Total (Rekursif) : " + totalRekursif);
        System.out.println("Total (Iteratif) : " + totalIteratif);

        sc.close();
    }
    
}
