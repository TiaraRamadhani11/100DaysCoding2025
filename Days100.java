package TiaraRamadhani;

import java.util.Arrays;
import java.util.Scanner;

public class Days100 {
    static int[] data;
    static int n;

    static int retas(int[] dataAwal) {
        n = dataAwal.length;
        data = new int[n];
        Arrays.fill(data, -1);

        int totalPergeseran = 0;

        for (int nilai : dataAwal) {
            int indeks = nilai % n;

            while (data[indeks] != -1) {
                indeks = (indeks + 1) % n;
                totalPergeseran++;
            }
            data[indeks] = nilai;
        }
        return totalPergeseran;
    }

    static String susunKode(int p) {
        StringBuilder kode = new StringBuilder();

        for (int i = 0; i < n && kode.length() < p; i++) {
            if (data[i] != -1) {
                kode.append(data[i]);
            }
        }
        return kode.substring(0, Math.min(p, kode.length()));
    }

    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("Masukkan ukuran array : ");
        int n = tr.nextInt();
        int[] dataAwal = new int[n];
        System.out.print("Masukkan isi Array : ");
        for (int i = 0; i < n; i++) {
            dataAwal[i] = tr.nextInt();
        }

        int p = retas(dataAwal);
        String hasilKode = susunKode(p);

        System.out.println("Hasil : " + hasilKode);
    }
}