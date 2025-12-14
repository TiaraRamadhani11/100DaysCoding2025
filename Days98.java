package TiaraRamadhani;

import java.util.Scanner;

public class Days98{
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan nilai maksimum N: ");
        int n = tr.nextInt();

        int a = 0, b = 1;

        System.out.print("Deret Fibonacci: ");
        while (a <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
