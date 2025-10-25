package TiaraRamadhani;
import java.util.Scanner;

public class Days48 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = tr.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = tr.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = tr.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Hasil Penjumlahan: " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil Pengurangan: " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil Penkalian: " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 != 0) {
                    System.out.println("Hasil Pembagian: " + (angka1 / angka2));
                } else {
                    System.out.println("Error: tidak bisa membagi dengan nol!!!");
                }
                break;
            default:
                System.out.println("Operator tidak tersedia!");
        }
    }
}
