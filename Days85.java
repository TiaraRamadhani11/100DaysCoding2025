package TiaraRamadhani;

public class Days85{
    public static void main(String[] args) {

        int[] angka = {11, 10, 26, 1};

        int max = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Angka maksimal adalah: " + max);
    }
}
