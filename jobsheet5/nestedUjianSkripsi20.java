package jobsheet5;

import java.util.Scanner;

public class nestedUjianSkripsi20 {
    
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        String pesan="";

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebaskompen = mra.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = mra.nextInt();
        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbinganP2 = mra.nextInt();

        if (bebaskompen.equalsIgnoreCase("Ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skipsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 <4) {
                pesan = "Gagal! log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                pesan = "Gagal! log bimbingan P1 belum mencapai 8 kali";
            } 
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        System.out.println(pesan);
    }
}
