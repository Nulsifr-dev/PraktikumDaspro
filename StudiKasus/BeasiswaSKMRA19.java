package StudiKasus;

import java.util.Scanner;

public class BeasiswaSKMRA19 {
    static Scanner sc = new Scanner(System.in);

    static String[][] data = new String[100][5];
    static int jumlah = 0;

    static boolean cekBeasiswa(String b) {
        return b.equalsIgnoreCase("Reguler") ||
               b.equalsIgnoreCase("Unggulan") ||
               b.equalsIgnoreCase("Riset");
    }

    static void tambahData() {

        System.out.print("\nNama Mahasiswa: ");
        String nama = sc.nextLine();

        if (nama.isBlank()) {
            System.out.println("Nama tidak boleh kosong!");
            return;
        }

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        if (nim.isBlank()) {
            System.out.println("NIM tidak boleh kosong!");
            return;
        }

        System.out.print("IPK terakhir: ");
        String ipkStr = sc.nextLine();
        double ipk;

        try {
            ipk = Double.parseDouble(ipkStr);
        } catch (NumberFormatException e) {
            System.out.println("IPK harus berupa angka desimal!");
            return;
        }

        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("IPK harus 0.0 - 4.0!");
            return;
        }

        System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
        String jenis = sc.nextLine();

        if (!cekBeasiswa(jenis)) {
            System.out.println("Jenis beasiswa tidak valid!");
            return;
        }

        System.out.print("Penghasilan orang tua (maksimal 2000000): ");
        String pengStr = sc.nextLine();
        int penghasilan;

        try {
            penghasilan = Integer.parseInt(pengStr);
        } catch (NumberFormatException e) {
            System.out.println("Penghasilan harus berupa angka!");
            return;
        }

        if (penghasilan > 2000000) {
            System.out.println("Pendaftar dibatalkan karena penghasilan melebihi batas maksimal.");
            return;
        }

        data[jumlah][0] = nama;
        data[jumlah][1] = nim;
        data[jumlah][2] = String.valueOf(ipk);
        data[jumlah][3] = jenis;
        data[jumlah][4] = String.valueOf(penghasilan);

        jumlah++;

        System.out.println("Pendaftar berhasil disimpan. Total: " + jumlah);
    }

    static void tampilkanSemua() {
        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("\n==================================================================");
        System.out.println("Nama\t\tNIM\t\tIPK\tBeasiswa\tPenghasilan");
        System.out.println("==================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t" +data[i][3] + "\t\t" + data[i][4]);
        }
        
    }

    static void cariJenis() {
        System.out.println("Masukkan jenis beasiswa (Reguler/Unggulan/Riset):");
        String jenis = sc.nextLine();

        boolean ada = false;

        for (int i = 0; i < jumlah; i++) {
            if (data[i][3].equalsIgnoreCase(jenis)) {
                if (!ada) {
                    System.out.println("Data pendaftar untuk beasiswa: " + jenis);
                    System.out.println("====================================================");
                }
                ada = true;
                System.out.println("Nama: " + data[i][0] + ", NIM: " + data[i][1] + ", IPK: " + data[i][2]);
            }
        }

        if (!ada) {
            System.out.println("Tidak ada pendaftar untuk jenis tersebut.");
        }

    }

    static void hitungRata() {
        String[] jenis = {"Reguler", "Unggulan", "Riset"};

        for (int j = 0; j < jenis.length; j++) {

            double total = 0;
            int count = 0;

            for (int i = 0; i < jumlah; i++) {
                if (data[i][3].equalsIgnoreCase(jenis[j])) {
                    total += Double.parseDouble(data[i][2]);
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(jenis[j] + " : tidak ada pendaftar.");
            } else {
                System.out.printf(jenis[j] + " : rata-rata IPK = %.2f\n", total / count);
            }
        }

    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Sistem Pendaftaran Beasiswa ===");
            System.out.println("1. Tambah Data Pendaftar Beasiswa");
            System.out.println("2. Tampilkan Semua Pendaftar");
            System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
            System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pil = sc.nextLine();

            switch (pil) {
                case "1": tambahData(); break;
                case "2": tampilkanSemua(); break;
                case "3": cariJenis(); break;
                case "4": hitungRata(); break;
                case "5": System.out.println("Program selesai."); return;
                default: System.out.println("Menu tidak valid!");
            }
        }

    }


}
