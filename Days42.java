package TiaraRamadhani;

import java.util.Scanner;
public class Days42 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = tr.nextInt();

        System.out.println("\nKelipatan 3:");
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nKelipatan 5:");
        for (int i = 1; i <= batas; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nKelipatan 3 dan 5:");
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

