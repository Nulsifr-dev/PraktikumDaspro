package JOBSHEET6;
import java.util.Scanner;
public class LulusSemesterMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.println("===== DATA DIRI MAHASISWA =====");
        System.out.print("Nama\t: ");
        String nama=mra.nextLine();
        System.out.print("NIM\t: ");
        String nim=mra.nextLine();

        System.out.println("\n--- Mata Kuliah 1: Algoritma dan Pemograman ---");
        System.out.print("Nilai UTS\t: ");
        int uts=mra.nextInt();
        System.out.print("Nilai UAS\t: ");
        int uas=mra.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int tugas=mra.nextInt();

        double nilaiakhir1=(uts*0.3)+(uas*0.4)+(tugas*0.3);
        String huruf= "", status="";
        if (nilaiakhir1 >= 80) huruf="A";
        else if (nilaiakhir1 >= 73) huruf="B+";
        else if (nilaiakhir1 >= 65) huruf="B";
        else if (nilaiakhir1 >= 60) huruf="C+";
        else if (nilaiakhir1 >= 50) huruf="C";
        else if (nilaiakhir1 >= 39) huruf="D";
        else huruf="E";

        status = (nilaiakhir1 >=60 ? "LULUS" : "TIDAK LULUS");

        System.out.println("\n--- Mata Kuliah 2: Algoritma dan Pemograman ---");
        System.out.print("Nilai UTS\t: ");
        int uts2=mra.nextInt();
        System.out.print("Nilai UAS\t: ");
        int uas2=mra.nextInt();
        System.out.print("Nilai Tugas\t: ");
        int tugas2=mra.nextInt();
        
        double nilaiakhir2=(uts2*0.3)+(uas2*0.4)+(tugas2*0.3);
        String huruf2= "", status2="";
        if (nilaiakhir2 >= 80) huruf2="A";
        else if (nilaiakhir2 >= 73) huruf2="B+";
        else if (nilaiakhir2 >= 65) huruf2="B";
        else if (nilaiakhir2 >= 60) huruf2="C+";
        else if (nilaiakhir2 >= 50) huruf2="C";
        else if (nilaiakhir2 >= 39) huruf2="D";
        else huruf2="E";

        status2 = (nilaiakhir2 >=60 ? "LULUS" : "TIDAK LULUS");

        System.out.println("\n\n================== HASIL PENILAIAN AKADEMIK ==================");
        System.out.println("Nama\t: "+nama);
        System.out.println("NIM\t: "+nim);
        
        System.out.println("\nMata Kuliah\t\t\tUTS\tUAS\tTUGAS\tNILAI AKHIR\tNILAI HURUF\tSTATUS");
        System.out.println("==================================================================================================");
        System.out.println(String.format("ALgoritma pemrograman\t\t%s\t%s\t%s\t%.2f\t\t%s\t\t%s",uts,uas,tugas,nilaiakhir1,huruf,status));
        System.out.println(String.format("Struktur Data\t\t\t%s\t%s\t%s\t%.2f\t\t%s\t\t%s",uts2,uas2,tugas2,nilaiakhir2,huruf2,status2));
        
        double ratanilaiakhir=(nilaiakhir1+nilaiakhir2)/2;
        String statussemester="";
        statussemester = (ratanilaiakhir >= 70 ? "LULUS (Rata-rata > 70)" : "TIDAK LULUS (Rata-rata < 70)");
        System.out.println(String.format("\nRata-rata Nilai Akhir\t: %.2f",ratanilaiakhir));
        System.out.println("Status Semester\t\t: "+statussemester);

        mra.close();
    }
    
}
