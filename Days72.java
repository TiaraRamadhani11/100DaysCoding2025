package TiaraRamadhani;

import java.util.Scanner;

public class Days72 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        int jumlah = 0;
        while (true){
            System.out.print("Masukkan angka: ");
            int angka = tr.nextInt();
            if(angka < 0){
                break;
            }
            jumlah += angka;
        }
        System.out.println("Jumlah : " + jumlah);
    }
}
