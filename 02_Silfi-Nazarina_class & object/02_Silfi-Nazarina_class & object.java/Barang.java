// Jawaban dari tugas no.4

public class Barang {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual(){
        int hargaJual = (int)(hargaDasar - (((diskon/100) * hargaDasar)));
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode barang : "+ kode);
        System.out.println("Nama barang : "+ namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon\t "+ diskon + " %");
        System.out.println("Harga jual  : "+ hitungHargaJual());
    }
}
