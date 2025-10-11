package TiaraRamadhani;

import java.util.Scanner;
public class Days34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan nilai N : ");
        int N = sc.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                A += i;
            } else if(i % 2 == 0){
                B += i;
            }

            if (i % 3 == 0 && i % 5 == 0) {
                C += i;
            }

            if (i % 3 == 0 || i % 5 == 0) {
                D += i;
            }
        }

        System.out.println("\nA. total angka ganjil = " + A);
        System.out.println("B. total angka genap = " + B);
        System.out.println("C. total angka yang habis dibagi tiga dan lima = " + C);
        System.out.println("D. total angka yang habis dibagi tiga atau lima = " + D);

        //operator aritmatika
        int hasil1 = D * B;
        int hasil2 = C / A;
        int hasil3 = D + B;
        int hasil4 = C - A;
        int hasil5 = B % D;
        System.out.println("\n1. D * B = " + hasil1);
        System.out.println("2. C / A = " + hasil2);
        System.out.println("3. D + B = " + hasil3);
        System.out.println("4. C - A = " + hasil4);
        System.out.println("5. B % D = " + hasil5);
        
        if (hasil3 < 5) {
            System.out.println("\nara");
        } else if (hasil3 > 5) {
            System.out.println("\nara ara");
        } else {
            System.out.println("\nara ara ara");
        }

    }
}
