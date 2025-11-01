package Jobsheet8;

import java.util.Scanner;

public class PersegiAngkaMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.print("Masukkan nilai n (nilai n minimal 3) = ");
        int n = mra.nextInt();

        for (int i = 1; i <= n; i++ ) {
            for (int j=1; j<=n; j++){
                
                if (i == 1 || i == n || j == 1 || j==n){
                    System.out.print(n+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        mra.close();
    }
    
}
