package TiaraRamadhani;

import java.util.Scanner;

public class Days35 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai = tr.nextInt();

        if (nilai >= 65 && nilai <= 100){
            System.out.println("anda lulus");
        } else if (nilai < 65 && nilai >=  0) {
            System.out.println("anda tidak lulus");
        } else {
            System.out.println("nilai tidak valid");
        }
    }
}
