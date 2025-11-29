package Pertemuan14;

public class PengunjungCafe19 {
    public static void daftarPengunjung(String...namaPengungjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (int i = 0; i < namaPengungjung.length; i++){
            System.out.println("- "+namaPengungjung);
        }
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
    
}
