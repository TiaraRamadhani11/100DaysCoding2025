package TiaraRamadhani;

import java.util.Scanner;

public class Days36 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan umur : ");
        int umur = tr.nextInt();
        System.out.print("Masukkan Suhu Tubuh : ");
        int suhu = tr.nextInt();

        if (umur >= 18){
            if (suhu <= 37){
                System.out.println("Anda Boleh Masuk");
            }else {
                System.out.println("Dilarang masuk! suhu tubuh anda tinggi");
            }
        }else{
            System.out.println("Umur tidak mencukupi");
        }
    }
}

