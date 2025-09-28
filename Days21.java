package TiaraRamadhani;

public class Days21 {
    public static void main(String[] args) {
        int angka1 = 11;
        int angka2 = 10;

        System.out.println("Sebelum ditukar:");
        System.out.println("angka 1 = "+angka1);
        System.out.println("angka 2 = "+angka2);

        // Tukar nilai tanpa variabel tambahan
        angka1 = angka1 + angka2;  // angka1 = 11 + 10 = 21
        angka2 = angka1 - angka2;  // angka2 = 21 - 10 = 11
        angka1 = angka1 - angka2;  // angka1 = 21 - 11 = 10

        System.out.println("Sesudah ditukar:");
        System.out.println("angka 1 = "+angka1);
        System.out.println("angka 2 = "+angka2);
    }
}

