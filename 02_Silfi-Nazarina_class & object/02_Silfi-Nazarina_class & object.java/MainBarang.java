public class MainBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.kode = "B001";
        brg1.namaBarang = "Laptop";
        brg1.hargaDasar = 7000000;
        brg1.diskon = 15;
        System.out.println("Harga jual: "+ brg1.hitungHargaJual());
        brg1.tampilData();
    }
}
