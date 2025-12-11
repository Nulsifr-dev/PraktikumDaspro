package StudiKasus;

import java.util.Scanner;

public class MagangSKMRA19 {
    static Scanner sc = new Scanner(System.in);

    static String[][] data = new String[100][6];
    static int jumlah = 0;

    static boolean cekStatus(String s) {
        return s.equalsIgnoreCase("Diterima") ||
               s.equalsIgnoreCase("Menunggu") ||
               s.equalsIgnoreCase("Ditolak");
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

        System.out.print("Program Studi: ");
        String prodi = sc.nextLine();
        if (prodi.isBlank()) { 
            System.out.println("Prodi tidak boleh kosong!"); 
            return; 
        }

        System.out.print("Perusahaan Tujuan Magang: ");
        String perusahaan = sc.nextLine();
        if (perusahaan.isBlank()) { 
            System.out.println("Perusahaan tidak boleh kosong!"); 
            return; 
        }

        System.out.print("Semester pengambilan magang (6 atau 7): ");
        String semStr=sc.nextLine();

        int semester;
        try {
            semester = Integer.parseInt(semStr);
        } catch (Exception e) {
            System.out.println("Semester harus berupa angka 6 atau 7!");
            return;
        }

        if (semester != 6 && semester != 7) {
            System.out.println("Semester hanya boleh 6 atau 7!");
            return;
        }

        System.out.print("Status magang (Diterima/Menunggu/Ditolak): ");
        String status = sc.nextLine();

        if (!cekStatus(status)) {
            System.out.println("Status tidak valid!");
            return;
        }

        data[jumlah][0] = nama;
        data[jumlah][1] = nim;
        data[jumlah][2] = prodi;
        data[jumlah][3] = perusahaan;
        data[jumlah][4] = String.valueOf(semester);
        data[jumlah][5] = status;

        jumlah++;

        System.out.println("Data pendaftaran magang berhasil ditambahkan. Total pendaftar: " + jumlah);
    }

    static void tampilkanSemua() {
        if (jumlah == 0) {
            System.out.println("Belum ada pendaftar.");
            return;
        }

        System.out.println("\n=============================================================================================");
        System.out.println("No\tNama\tNIM\t\tProdi\t\tPerusahaan\tSemester\tStatus");
        System.out.println("=============================================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%d\t%s\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n", (i + 1), data[i][0], data[i][1], data[i][2], data[i][3], data[i][4], data[i][5]);

        }
    }

    static void cariProdi() {
        System.out.print("Masukkan Program Studi: ");
        String cari = sc.nextLine();

        boolean ada = false;

        System.out.println("\nPendaftar dengan Program Studi: " + cari);
        System.out.println("====================================================");

        for (int i = 0; i < jumlah; i++) {
            if (data[i][2].equalsIgnoreCase(cari)) {
                ada = true;
                System.out.printf("Nama: %s\t NIM: %s\t Perusahaan: %s\t Semester: %s\t Status: %s\n", data[i][0], data[i][1], data[i][3], data[i][4], data[i][5]);
            }
        }

        if (!ada) {
            System.out.println("Tidak ada pendaftar dari prodi tersebut.");
        }
    }

    static void hitungStatus() {
        int diterima = 0, menunggu = 0, ditolak = 0;

        for (int i = 0; i < jumlah; i++) {
            String s = data[i][5];

            if (s.equalsIgnoreCase("Diterima")) diterima++;
            else if (s.equalsIgnoreCase("Menunggu")) menunggu++;
            else if (s.equalsIgnoreCase("Ditolak")) ditolak++;
        }

        System.out.println("\nJumlah Pendaftar per Status:");
        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak  : " + ditolak);
        System.out.println("Total pendaftar: " + jumlah);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n=== Sistem Pendaftaran Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang");
            System.out.println("2. Tampilkan Semua Pendaftar Magang");
            System.out.println("3. Cari Pendaftar berdasarkan Program Studi");
            System.out.println("4. Hitung Jumlah Pendaftar untuk Setiap Status");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            String pil = sc.nextLine();

            switch (pil) {
                case "1": tambahData(); break;
                case "2": tampilkanSemua(); break;
                case "3": cariProdi(); break;
                case "4": hitungStatus(); break;
                case "5": System.out.println("Program selesai."); return;
                default: System.out.println("Menu tidak valid!");
            }
        }

    }


}
