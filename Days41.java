package TiaraRamadhani;

import java.util.Scanner;
public class Days41{
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);
        
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = tr.nextDouble();

        System.out.print("Masukkan tunjangan: ");
        double tunjangan = tr.nextDouble();

        System.out.print("Masukkan potongan: ");
        double potongan = tr.nextDouble();
      
        double gajiBersih = gajiPokok + tunjangan - potongan;
        System.out.println("Gaji Bersih  : Rp " + gajiBersih);
    }
}
