package Pertemuan14;

public class PengunjungCafe19 {
    public static void daftarPengunjung(String...namaPengungjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengungjung){
            System.out.println("- "+nama);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
    
}
