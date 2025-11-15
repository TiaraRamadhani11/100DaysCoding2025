package TiaraRamadhani;

import java.util.Scanner;

public class Days69 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = tr.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = tr.nextInt();

        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
