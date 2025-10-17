package TiaraRamadhani;

import java.util.Scanner;

public class Days40 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        System.out.print("masukkan angka1 : ");
        double angka1 = tr.nextDouble();
        System.out.print("masukkan angka2 : ");
        double angka2 = tr.nextDouble();

        System.out.print("\npilih operato (+  -  *  /) : ");
        char pilih = tr.next().charAt(0);

        if (pilih == '+'){
            System.out.println("hasil penjumlahan : " + (angka1+angka2));
        }else if (pilih == '-') {
            System.out.println("hasil pengurangan : " + (angka1 - angka2));
        }else if (pilih == '*') {
            System.out.println("hasil perkalian : " + (angka1 * angka2));
        }else if (pilih == '/') {
            if (angka2 != 0){
                System.out.println("hasil pembagian : " + (angka1 / angka2));
            }else {
                System.out.println("Error : tidak bisa di bagi nol");
            }
        }else{
            System.out.println("operator tidak ada");
        }
    }
}
