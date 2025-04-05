public class Vehicle1 {
    private double load; // menyimpan total beban saat ini
    private final double maxLoad = 10000; // beban maksimum yang bisa dimuat kendaraan (konstanta)

    public double getLoad() { 
        return this.load; // mengembalikan beban saat ini
    } 

    public double getMaxLoad() {
        return this.maxLoad; // mengembalikan kapasitas maksimum kendaraan
    } 

    public boolean addBox(double weight) { 
        double temp = this.load + weight; // hitung total beban sementara jika kotak ditambahkan
        if (temp <= maxLoad) { // jika belum melebihi kapasitas maksimum
            this.load = temp; // tambahkan beban
            return true; // berhasil menambahkan
        } else { 
            return false; // gagal menambahkan karena melebihi kapasitas
        } 
    } 
}