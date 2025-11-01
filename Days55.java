package TiaraRamadhani;

import java.util.Scanner;

public class Days55 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        
        System.out.println("Batas bawah : ");
        int bw = tr.nextInt();
        System.out.println("Batas atas  : ");
        int ba = tr.nextInt();
        System.out.println("Angka : ");
        int angka = tr.nextInt();


        if(angka > bw && angka < ba){
            System.out.println("YAYAYAYA");
        }else{
            System.out.println("NONONONO");
        }
    }
}
