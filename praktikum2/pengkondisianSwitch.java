import java.util.Scanner;

public class pengkondisianSwitch {
    public static void main(String args[]) {
        // inisialisasi
        int angka1, angka2, hasil;
        String perhitungan;
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
                    + "\n Masukkan simbol anda: ");
            perhitungan = input.next();
        }

        // kondisi switch
        switch (perhitungan) {
            case "1":
                hasil = angka1 + angka2;
                System.out.print("Hasilnya adalah: " + hasil);
                break;
            case "2":
                hasil = angka1 - angka2;
                System.out.print("Hasilnya adalah: " + hasil);
                break;
            case "3":
                hasil = angka1 * angka2;
                System.out.print("Hasilnya adalah: " + hasil);
                break;
            case "4":
                hasil = angka1 / angka2;
                System.out.print("Hasilnya adalah: " + hasil);
                break;
            default:
                System.out.print("Simbol yang dimasukan tidak sesuai");
        }
    }
}
