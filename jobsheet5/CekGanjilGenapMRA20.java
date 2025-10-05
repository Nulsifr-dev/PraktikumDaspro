package jobsheet5;

import java.util.Scanner;

public class CekGanjilGenapMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.println("--- Cek Bilangan Genap atau Ganjil ---");
        System.out.print("Masukkan sebuah angka: ");
        int angka = mra.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Angka " + angka + " adalah Genap");
        } else {
            System.out.println("Angka " + angka + " adalah Ganjil");
        }

    }
}
