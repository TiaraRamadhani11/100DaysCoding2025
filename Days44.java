package TiaraRamadhani;

import java.util.Scanner;

public class LampuLaluLintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan warna lampu (merah/kuning/hijau): ");
        String warna = input.nextLine().toLowerCase(); // ubah ke huruf kecil agar mudah dibandingkan

        switch (warna) {
            case "merah":
                System.out.println("Berhenti!");
                break;
            case "kuning":
                System.out.println("Hati-hati, bersiap berhenti!");
                break;
            case "hijau":
                System.out.println("Silakan jalan!");
                break;
            default:
                System.out.println("Warna tidak dikenal. Coba lagi!");
        }
    }
}
