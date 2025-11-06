package TiaraRamadhani;

import java.util.Scanner;
public class Days60 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = tr.nextInt();

        System.out.println("Angka ganjil N - 1");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nAngka genap N - 1");
        for (int i = N; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}