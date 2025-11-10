package TiaraRamadhani;

import java.util.Scanner;

public class Days64 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
      
        System.out.print("Masukkan nilai M: ");
        int M = tr.nextInt();
        System.out.print("Masukkan nilai N: ");
        int N = tr.nextInt();

        int hasil = 1;
      
        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }
      
        System.out.println("Hasil dari " + M + " pangkat " + N + " = " + hasil);
    }
}
