import java.util.Scanner;

public class Latihan {

    public static String Input;
    public static void main(String args[]) {

        Scanner Input = new Scanner(System.in);
        int angka1, angka2, hasil;
            System.out.println("Masukkan angka 1: ");
            angka1 = Input.nextInt();

            System.out.println("Masukkan angka 2: ");
            angka2 = Input.nextInt();

        hasil = angka1 + angka2;
        System.out.print("Hasilnya: " + hasil);

        System.out.println(" ");

        String namaDepan, namaBelakang, fullName;
        System.out.print("Masukkan nama depan: ");
        namaDepan = Input.next();

        System.out.println("Masukkan nama belakang: ");
        namaBelakang = Input.next();

        fullName = namaDepan + " " + namaBelakang;
        System.out.println(fullName);
    }
}
