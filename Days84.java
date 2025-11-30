package TiaraRamadhani;

import java.util.Scanner;

public class Days84 {
    public static void main(String[] args) {

        // Soal 1
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int angka = tr.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " + angka + " = " + (i * angka));
        }

        // Soal 2
        System.out.print("Masukkan nilai n: ");
        int N = tr.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Iccang");
        }

        // Soal 3
        System.out.print("Input Teks: ");
        tr.nextLine();
        String tx = tr.nextLine();
        System.out.print("Input nilai n: ");
        int n = tr.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(tx);
        }
    }
}

