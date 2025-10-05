package jobsheet5;
import java.util.Scanner;
public class ifCetakKRS20 {

    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.println("--- cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktlunas = mra.nextBoolean();

         if (uktlunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Pembayaran UKT belum lunas, silahkan melakukan pembayaran terlebih dahulu");
        }
        
        System.out.println("\n=== Versi Ternary Operator ===");
        String pesan = (uktlunas)
                ? "Pembayaran UKT terverifikasi.\nSilahkan cetak KRS dan minta tanda tangan DPA."
                : "Pembayaran UKT belum lunas, silahkan melakukan pembayaran terlebih dahulu.";

        System.out.println(pesan);
    }
}