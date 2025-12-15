package TiaraRamadhani;

import java.util.Scanner;

public class Days99 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            int cek = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cek++;
                }
            }

            if (cek == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
