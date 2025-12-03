package TiaraRamadhani;

import java.util.Scanner;

public class Days87 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        int[] array = {11, 10, 26, 1};
        System.out.print("masukkan elemen yg ingin di cari : ");
        int target = tr.nextInt();

        boolean status = false;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                status = true;
                index = i;
                break;
            }
        }

        if (status) {
            System.out.println("Elemen " + target + " ditemukan di indeks ke-" + index);
        } else {
            System.out.println("Elemen " + target + " tidak ditemukan.");
        }
    }
}
