package TiaraRamadhani;

import java.util.Scanner;

public class Days63 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan N : ");
        int n = tr.nextInt();

        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("perkalian 1 sampai " + n + " adalah : " + total);
    }
}