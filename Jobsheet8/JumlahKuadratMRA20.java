package Jobsheet8;

import java.util.Scanner;

public class JumlahKuadratMRA20 {
    public static void main(String[] args) {
        Scanner mra = new Scanner(System.in);

        System.out.print("masukkan nilai n: ");
        int n = mra.nextInt();

        int i, j, kuadrat = 0;

        for (j = 1; j <= n; j++) {
            int jumlah = 0;
            System.out.print("n = " + j + ">> Jumlah kuadrat = ");
            for (i = 1; i <= j; i++){
                kuadrat = i*i;
                jumlah += kuadrat;
                
                System.out.print(kuadrat);
                if (i<j){
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + jumlah);
        }
        mra.close();
    }
    
}
