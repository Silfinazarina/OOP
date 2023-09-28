package Tugas;

public class Peminjaman {
    private Buku buku;
    private Peminjam peminjam;
    private Petugas petugas;

    Peminjaman(Buku buku, Peminjam peminjam, Petugas petugas){
        this.buku = buku;
        this.peminjam = peminjam;
        this.petugas = petugas;
    }

    public void setBuku(Buku buku) {
        this.buku = buku;
    }

    public Buku getBuku() {
        return buku;
    }

    public void setPeminjam(Peminjam peminjam) {
        this.peminjam = peminjam;
    }

    public Peminjam getPeminjam() {
        return peminjam;
    }

    public void setPetugas(Petugas petugas) {
        this.petugas = petugas;
    }

    public Petugas getPetugas() {
        return petugas;
    }

    public void info(){
        petugas.info();
        peminjam.info();
        buku.info();
    }
}