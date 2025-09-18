package TiaraRamadhani;

import java.util.Scanner;

public class Days12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Biodata");
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Nim : ");
        String nim = input.nextLine();
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        float tb = input.nextFloat();
        System.out.print("Masukkan Berat Badan : ");
        double bb = input.nextDouble();

        System.out.println("\n===BIODATA===");
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Umur : " + umur);
        System.out.println("Tinggi Badan : " + tb + " cm");
        System.out.println("Berat Badan : " + bb + " Kg");

    }
}
