package jobsheet5;

import java.util.Scanner;

public class PerpustakaanMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.println("--- Sistem Perpustakaan Kampus ---");
        System.out.print("Apakah mahasiswa membawa kartu mahasiswa? (true/false): ");
        boolean bawaKartu = mra.nextBoolean();

        System.out.print("Apakah mahasiswa sudah registrasi online? (true/false): ");
        boolean registrasiOnline = mra.nextBoolean();

        if (bawaKartu || registrasiOnline) {
            System.out.println("Izin masuk diberikan. Silakan masuk ke perpustakaan.");
        } else {
            System.out.println("Izin masuk ditolak. Harap bawa kartu mahasiswa atau lakukan registrasi online.");
        }

}
}