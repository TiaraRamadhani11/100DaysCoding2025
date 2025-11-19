package TiaraRamadhani;

import java.util.Scanner;

public class Days73 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU MAKANAN ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Ayam");
            System.out.println("3. Bakso");
            System.out.println("4. Ayam Geprek");
            System.out.print("Pilih menu: ");
            pilihan = tr.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Kamu memilih Nasi Goreng");
                    break;
                case 2:
                    System.out.println("Kamu memilih Mie Ayam");
                    break;
                case 3:
                    System.out.println("Kamu memilih Bakso");
                    break;
                case 4:
                    System.out.println("Kamu memilih Ayam Geprek");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (true);
    }
}

