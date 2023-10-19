import java.util.Scanner;

// pengkondisian if else
public class praktikum2 {
    public static void main(String args[]) {
        // inisialisasi
        int angka;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan angka: ");
            angka = input.nextInt();
        }

        if(angka < 5) {
            System.out.print("Angka yang dimasukkan kurang dari 5");
        } else {
            System.out.print("Angka yang dimasukkan lebih dari 5");
        }
    }
}