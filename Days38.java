package TiaraRamadhani;

import java.util.Scanner;

public class Days38 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("masukkan angka : ");
        int angka = tr.nextInt();

        if (angka > 0){
            System.out.println("Bilangan Positif");
        } else if (angka < 0) {
            System.out.println("Bilangan Negatif");
        }else {
            System.out.println("Bilangan Nol");
        }
    }
}
