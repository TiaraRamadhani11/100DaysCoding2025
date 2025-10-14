package TiaraRamadhani;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Days37 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int a = tr.nextInt();

        if (a %2 == 0){
            System.out.println("Angka genap");
        }else{
            System.out.println("Angka Ganjil");
        }
    }
}
