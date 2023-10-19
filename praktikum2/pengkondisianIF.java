import java.util.Scanner;

public class pengkondisianIF {
        public static void main(String args[]) {
        // inisialisasi
        int angka1, angka2, hasil, perhitungan;
        try (Scanner input = new Scanner(System.in)) {
            // input user section
            System.out.print("Masukkan angka pertama: ");
            angka1 = input.nextInt();
            
            System.out.print("Masukkan angka kedua: ");
            angka2 = input.nextInt();

            System.out.print("List perhitungan: " 
            + "\n 1: Pertambahan" 
            + "\n 2: Pengurangan" 
            + "\n 3: Perkalian" 
            + "\n 4: Pembagian"
            + "\n Masukkan pilihan anda: ");
            perhitungan = input.nextInt();
        };

        // kondisi if
        if(perhitungan == 1) {
            hasil = angka1 + angka2;
            System.out.print("Hasilnya adalah: " + hasil);
        } else if(perhitungan == 2) {
            hasil = angka1 - angka2;
            System.out.print("Hasilnya adalah: " + hasil);
        } else if(perhitungan == 3) {
            hasil = angka1 * angka2;
            System.out.print("Hasilnya adalah: " + hasil);
        } else if(perhitungan == 4) {
            hasil = angka1 / angka2;
            System.out.print("Hasilnya adalah: " + hasil);
        } else {
            System.out.print("Angka yang dimasukkan salah!");
        };
    };
};
