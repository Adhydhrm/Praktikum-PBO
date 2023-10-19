import java.util.Scanner;

public class latihan {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int angka1, angka2, hasil, perhitungan, perulangan;

        System.out.print("Masukkan perulangan: ");
        perulangan = input.nextInt();

        for(int i = 1; i <= perulangan; i++) {
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
            
            // kondisi if
            if (perhitungan == 1) {
                hasil = angka1 + angka2;
                System.out.println("Hasilnya adalah: " + hasil);
            } else if (perhitungan == 2) {
                hasil = angka1 - angka2;
                System.out.println("Hasilnya adalah: " + hasil);
            } else if (perhitungan == 3) {
                hasil = angka1 * angka2;
                System.out.println("Hasilnya adalah: " + hasil);
            } else if (perhitungan == 4) {
                hasil = angka1 / angka2;
                System.out.println("Hasilnya adalah: " + hasil);
            } else {
                System.out.println("Angka yang dimasukkan salah!");
            };
        };
    };
};
