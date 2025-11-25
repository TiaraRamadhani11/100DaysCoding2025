package TiaraRamadhani;

import java.util.Scanner;

public class Days79 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.println("<--- BUAT AKUN --->");
        System.out.print("Masukkan Username Baru : ");
        String un_baru = tr.nextLine().toUpperCase();
        System.out.print("Masukkan Pasword Baru: ");
        String pw_baru = tr.nextLine().toUpperCase();

        while (true){
            System.out.println("\n<--- LOGIN AKUN --->");
            System.out.print("Masukkan Username : ");
            String un = tr.nextLine().toUpperCase();
            System.out.print("Masukkan Pasword : ");
            String pw = tr.nextLine().toUpperCase();

            if (un.equals(un_baru) && pw.equals(pw_baru)) {
                System.out.println("Login Berhasil!!!");
                break;
            }else {
                System.out.println("Login Gagal, Periksa Kembali username dan password");
            }
        }
    }
}
