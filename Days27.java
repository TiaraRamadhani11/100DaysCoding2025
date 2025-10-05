package TiaraRamadhani;

import java.util.Scanner;

public class Days27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //soal no 1
        System.out.println("input");
        System.out.print("masukkan panjang : ");
        int p = sc.nextInt();
        System.out.print("masukkan Lebar : ");
        int l = sc.nextInt();
        int keramik = 2*2;
        System.out.println("jumlah keramik yang di butuhkan : "+ (p*l)/keramik);

        //soal no 2
        System.out.println("\ninput");
        System.out.print("masukkan nilai a  : ");
        int a = sc.nextInt();
        System.out.print("masukkan nilai b  : ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("output");
        System.out.println("nilai a : " + a);
        System.out.println("nilai b : " + b);
    }
}
