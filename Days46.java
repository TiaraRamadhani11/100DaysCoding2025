package TiaraRamadhani;

import java.util.Scanner;

public class Days46 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan jam mulai : ");
        int s = tr.nextInt();
        System.out.print("Masukkan lama pengerjaan : ");
        int l = tr.nextInt();

        int jam = (s + l)%24;
        int hasil = 9 - jam;
        System.out.println("keluaran : " + hasil + " jam");
    }
}
