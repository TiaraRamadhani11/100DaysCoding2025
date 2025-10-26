package TiaraRamadhani;
import java.util.Scanner;

public class Days50 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = tr.nextInt();

        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println("Angka " + angka + " adalah " + hasil);
    }
}
