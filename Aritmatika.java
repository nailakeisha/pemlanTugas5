public class Aritmatika {
    public void hitungPenjumlahan(int a, int b) { 
        int nilai = a + b; // hitung penjumlahan
        System.out.println("Nilai penjumlahan adalah: " + nilai); 
    }

    public static void hitungPerkalian(int a, int b) {  
        int nilai = a * b; // hitung perkalian
        System.out.println("Nilai perkalian adalah: " + nilai);  
    } 

    public static void hitungPengurangan(int a, int b) {  
        int nilai = a - b; // hitung pengurangan
        System.out.println("Nilai pengurangan adalah: " + nilai); 
    } 

    public double hitungPembagian(String nil, String nil2) {
        double a = Double.parseDouble(nil); // konversi String ke double
        double b = Double.parseDouble(nil2); // konversi String ke double

        if (b == 0) { // cek jika pembagi 0
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0; // kembalikan 0 sebagai nilai default
        }
        return a / b; // lakukan pembagian jika valid
    }
}