package TiaraRamadhani;

import java.util.Scanner;//import kelas scanner

public class Days11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// membuat objek scanner

        System.out.print("Nama : ");
        String nama = input.nextLine();

        System.out.print("umur : ");
        int umur = input.nextInt();

        System.out.print("dua digit terakhir NIM : ");
        byte nim = input.nextByte();

        System.out.print("no sepatu : ");
        short noSepatu = input.nextShort();

        System.out.print("jarak rumah ke kampus : ");
        long jarak = input.nextLong();

        System.out.print("Berat Badan : ");
        double bb = input.nextDouble();

        System.out.print("Tinggi Badan : ");
        float tb = input.nextFloat();

        System.out.print("kelas : ");
        char kls = input.next().charAt(0);

        System.out.print("saya keren? ");
        boolean b = input.nextBoolean();

    }
}

