package TiaraRamadhani;

public class Days86{
    public static void main(String[] args) {

        int[] angka = {11, 10, 26, 1};

        int min = angka[0];
        for (int i = 1; i < angka.length; i++) {
            if (angka[i] < min) {
                min = angka[i];
            }
        }
        System.out.println("Angka maksimal adalah: " + min);
    }
}
