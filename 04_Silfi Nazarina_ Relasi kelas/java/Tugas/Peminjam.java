package Tugas;

public class Peminjam {
    private String idAnggota, nama;

    Peminjam(String idAnggota, String nama){
        this.idAnggota = idAnggota;
        this.nama = nama;
    }

    public void setIdAnggota(String idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void info(){
        System.out.println("Peminjam:");
        System.out.println("Id Anggota    : "+ idAnggota);
        System.out.println("Nama Peminjam : "+ nama);
        System.out.println();
    }
}