package TiaraRamadhani;

import java.util.Scanner;

public class Coding96 {
    // Penjumlahan
    public static int tambah(int a, int b) {
        return a + b;
    }
    // Pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }
    // Perkalian
    public static int kali(int a, int b) {
        return a * b;
    }
    // Pembagian
    public static int bagi(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan angka1: ");
        int angka1 = tr.nextInt;
        System.out.print("Masukkan angka2: ");
        int angka2 = tr.nextInt;


        System.out.println("Penjumlahan = " + tambah(angka1, angka2));
        System.out.println("Pengurangan = " + kurang(angka1, angka2));
        System.out.println("Perkalian   = " + kali(angka1, angka2));
        System.out.println("Pembagian   = " + bagi(angka1, angka2));
    }
}
