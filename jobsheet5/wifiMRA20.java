package jobsheet5;
import java.util.Scanner;
public class wifiMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = mra.next().toLowerCase();

        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenisPengguna.equals("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = mra.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak. Hanya civitas akademika yang diizinkan.");
        }

        
    }
}