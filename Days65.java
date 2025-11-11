package TiaraRamadhani;

import java.util.Scanner;
public class Days65 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int angka = tr.nextInt();

        int fak = 1;
        for (int i = 1; i <= angka; i++) {
            fak = fak * i;
        }

        System.out.println("Hasil dari " + angka + "! adalah " + fak);


    }
}
