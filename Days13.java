package TiaraRamadhani;

import java.util.Scanner;

public class Days13 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        String nama;
        final String nim;
        String programStudi;
        String alamat;
        float tb;
        double bb;
        byte usia;
        long ukt;
        char golonganDarah;
        boolean keaktifan;
        int jarakRumah;
        short jumlahSKS;

        nim = "D012345";
        nama = "Lestari";
        programStudi = "Informatika";
        alamat = "majene";
        tb = 149.7f;
        bb = 40.6;
        usia = 21;
        jarakRumah = 13;
        jumlahSKS = 20;
        ukt = 5000000;
        golonganDarah = 'z';
        keaktifan = false;

        System.out.println("TAMPILAN SEBELUM UPDATE");
        System.out.println("NIM \t\t\t\t: " + nim);
        System.out.println("Nama \t\t\t\t: " + nama);
        System.out.println("Prodi \t\t\t\t: " + programStudi);
        System.out.println("Alamat \t\t\t\t: " + alamat);
        System.out.println("Tinggi Badan \t\t: " + tb + "cm");
        System.out.println("Berat Badan \t\t: " + bb + "kg");
        System.out.println("Usia \t\t\t\t: "+ usia + " thn");
        System.out.println("Jarak Rumah \t\t: " + jarakRumah + "km");
        System.out.println("Jumlah SKS \t\t\t: " + jumlahSKS);
        System.out.println("UKT \t\t\t\t: " + ukt);
        System.out.println("Golongan Darah \t\t: " + golonganDarah);
        System.out.println("Keaktifan Mahasiswa : " + keaktifan);

        System.out.print("\nupdate nama \t\t: ");
        nama = tr.nextLine();
        System.out.print("update alamat \t\t: ");
        alamat = tr.nextLine();
        System.out.print("update tinggi badan : ");
        tb = tr.nextFloat();
        System.out.print("update jarak rumah \t: ");
        jarakRumah = tr.nextInt();
        System.out.print("update golongan darah : ");
        golonganDarah = tr.next().charAt(0);

        System.out.println("\nTAMPILAN SETELAH UPDATE");
        System.out.println(
                "NIM \t\t\t\t: " + nim + "\nNama \t\t\t\t: " + nama
                + "\nProdi \t\t\t\t: " + programStudi + "\nAlamat \t\t\t\t: " + alamat
                + "\nTinggi Badan \t\t: " + tb + "cm" + "\nBerat Badan \t\t: " + bb + "kg"
                + "\nUsia \t\t\t\t: "+ usia + " thn" + "\nJumlah SKS \t\t\t: " + jumlahSKS
                + "\nUKT \t\t\t\t: " + ukt + "\nGolongan Darah \t\t: " + golonganDarah
                + "\nKeaktifan Mahasiswa : " + keaktifan
        );
    }
}
