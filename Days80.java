package TiaraRamadhani;

public class Days80 {
    public static void main(String[] args) {
      //cara 1
      int [] angka;//deklarasi 
      angka = new int [3]; // alokasi 
      angka[0] = 11; //mengisi array
      angka[1] = 10;
      angka[2] = 26;

      //cara 2
      int [] data = new int [2]; //deklarasi + alokasi langsung 
      data[0] = 1;
      data[1] = 2006;

      //Cara 3
      String [] nama = {"tiara", "yaya"};

      //cetak
      System.out.println(Arrays.toString(angka));
    }
}
