import java.util.Scanner;

public class LimasSegitiga {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String answr;

        System.out.println("------Selamat datang di Program-----\n--Penghitung volume limas Segitiga--");
        System.out.print("\nSudahkah diketahui luas alas Limas segitiga nya? (y/t) : ");
        answr = Input.nextLine();
        if (answr.equals("y")) {
            double alasL, tinggiL;
            // masukan luas alas limas
            System.out.print("\nMasukan Luas Alas Limas (cm) :");
            alasL = Input.nextDouble();
            // masukan tinggi limas
            System.out.print("Masukan tinggi limas (cm) :");
            tinggiL = Input.nextDouble();
            Input.close();
            double volume = hitungVol(alasL, tinggiL);
            System.out.println("Volume Limas Segitiga : " + volume + " cm³");
            System.out.println("\nTerimakasih telah menggunakan program kami");
        } else if (answr.equals("t")) {
            double alasT, tinggiT, alasL, tinggiL;
            // masukan panjang alas segitiga
            System.out.print("\n-----Mencari Luas alas Limas-----");
            System.out.print("\nMasukan panjang Alas Segitiga (cm) :");
            alasT = Input.nextDouble();
            // masukan tinggi Segitiga
            System.out.print("Masukan tinggi Segitiga (cm) :");
            tinggiT = Input.nextDouble();
            // hitung luas alas limas
            alasL = hitungLuasAlas(alasT, tinggiT);
            System.out.println("Luas Alas limas : " + alasL + " cm\u00B2");
            // masukan tinggi limas
            System.out.print("\nMasukan tinggi limas (cm) :");
            tinggiL = Input.nextDouble();
            Input.close();
            double volume = hitungVol(alasL, tinggiL);
            System.out.println("Volume Limas Segitiga : " + volume + " cm³");
            System.out.println("\nTerimakasih telah menggunakan program kami");
        }
    }

    public static double hitungVol(double alasL, double tinggiL) {
        double volume = (1.0 / 3.0) * alasL * tinggiL;
        return volume;
    }

    public static double hitungLuasAlas(double alasT, double tinggiT) {
        double luas = (1.0 / 2.0) * alasT * tinggiT;
        return luas;
    }


}