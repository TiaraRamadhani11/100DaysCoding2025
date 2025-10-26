package TiaraRamadhani;

import java.util.Scanner;
public class Days49 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai = tr.nextInt();
        String status = (nilai >= 65) ? "Lulus" : "Tidak Lulus";
        System.out.println(status);
    }
}
