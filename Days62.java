package TiaraRamadhani;

import java.util.Scanner;

public class Days62 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan Nilai N : ");
        int n = tr.nextInt();

        int total = 0;
        for (int i = 1; i <= n ; i++) {
            total += i;
        }
        System.out.println("Jumlah angka 1-N adalah " + total);
    }
}
