package Rekursif;

import java.util.Scanner;

public class Percobaan2 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return(1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }

    static  String cetakDeret(int bilangan, int pangkat) {
        String deret = " ";
        for (int i=0; i < pangkat; i++) {
            deret += bilangan;
            if (i < pangkat - 1) {
                deret += "x";
            }
        }
        deret += "x1";
        return deret;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(cetakDeret(bilangan, pangkat)+" = "+hitungPangkat(bilangan, pangkat));
        
        sc.close();
    }
    
    
    
}
