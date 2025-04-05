import java.util.Scanner;

public class MainAritmatika { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); //  menerima input dari user

        // input dan panggil method pengurangan (static)
        System.out.print("Masukkan nilai 1: "); 
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2: "); 
        int nil2 = in.nextInt();
        Aritmatika.hitungPengurangan(nil1, nil2); // panggil method static

        // input dan panggil method perkalian (static)
        System.out.print("Masukkan nilai 1: "); 
        nil1 = in.nextInt(); 
        System.out.print("Masukkan nilai 2: "); 
        nil2 = in.nextInt(); 
        Aritmatika.hitungPerkalian(nil1, nil2); // panggil method static

        // input dan panggil method penjumlahan (non-static, butuh objek)
        System.out.print("Masukkan nilai 1: "); 
        int value1 = in.nextInt(); 
        System.out.print("Masukkan nilai 2: "); 
        int value2 = in.nextInt();
        Aritmatika aritmatika = new Aritmatika(); // buat objek
        aritmatika.hitungPenjumlahan(value1, value2); // panggil method non-static

        // input untuk pembagian (input String)
        System.out.print("Masukkan nilai 1 untuk pembagian: "); 
        String str1 = in.next();
        System.out.print("Masukkan nilai 2 untuk pembagian: "); 
        String str2 = in.next();

        double hasil = aritmatika.hitungPembagian(str1, str2); // panggil method pembagian
        System.out.println("Hasil pembagian: " + hasil); // tampilkan hasil
    } 
}
