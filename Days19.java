public class Days19{
    public static void main(String[] args) {
        int x = 450;
        byte y = (byte) x;  // paksa int ke byte
        double d = 11.10;
        int z = (int) d;    // paksa double ke int (pecahan hilang)

        System.out.println("int ke byte: " + y);
        System.out.println("double ke int: " + z);
    }
}
