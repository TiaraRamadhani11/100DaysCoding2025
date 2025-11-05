package TiaraRamadhani;

import java.util.Scanner;
public class Days59 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan Nilai N: ");
        int n = tr.nextInt();

        System.out.println("\nAngka ganjil dari 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nAngka genap dari 1 sampai " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}