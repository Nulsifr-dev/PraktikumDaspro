package Pertemuan14;

import java.util.Scanner;

public class Kubus19 {
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("Masukan Sisi Kubus:");
      int sisi = sc.nextInt();

      int volume = hitungVolume(sisi);
      int luasPermukaan = hitungLuasPermukaan(sisi);

      System.out.println("Volume Kubus: " + volume);
      System.out.println("Luas Permukaan Kubus: " + luasPermukaan);
        
    sc.close();
    }
    
}
