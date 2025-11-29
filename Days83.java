package TiaraRamadhani;

public class Days83 {
    public static void main(String[] args) {
        int [] data = {11, 10, 26, 1};
        int jumlah = 0;

        for (int i = 0; i < data.length ; i++) {
            jumlah += data[i];
        }
        System.out.println("total penjumlahan isi array = " + jumlah);
    }
}
