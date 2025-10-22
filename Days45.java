package TiaraRamadhani;

import java.util.Scanner;

public class Days45{
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.println("MENU MAKANAN");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Ayam Geprek");
        System.out.print("Masukkan pilihan Anda (1-4): ");
        int pilih = tr.nextInt();

        switch (pilih){
          case 1 :
            System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
            break;
          case 2 :
            System.out.println("Anda memilih Mie Ayam. Harga: Rp12.000");
            break;
          case 3 :
            System.out.println("Anda memilih Soto Ayam. Harga: Rp10.000");
            break;
          case 4 :
            System.out.println("Anda memilih Ayam Geprek. Harga: Rp13.000");
            break;
          default :
            System.out.println("Menu tidak tersedia!");  
        }
    }
}
