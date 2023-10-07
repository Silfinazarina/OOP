/**
 * Barang
 */
public class Barang {
    private String kdBarang, nama, kategori;
    private int jumlahStok;

    Barang(String kdBarang, String nama, String kategori, int jumlahStok){
        this.kdBarang = kdBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.jumlahStok = jumlahStok;
    }

    public void setKdBarang(String kdBarang) {
        this.kdBarang = kdBarang;
    }

    public String getKdBarang() {
        return kdBarang;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setJumlahStok(int jumlahStok) {
        this.jumlahStok = jumlahStok;
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public int hitungStok(int jumlahPinjam){
        return jumlahStok -= jumlahPinjam;
    }

    public void info(){
        System.out.println("Inventaris Peminjaman Barang Kampus");
        System.out.println("---------------------------------------");
        System.out.println("Kode Barang: "+ kdBarang);
        System.out.println("Nama Barang: "+ nama);
        System.out.println("Kategori   : "+ kategori);
        System.out.println("Jumlah stok: "+ jumlahStok);
    }
}//SILFI NAZARINA - QUIZ 1