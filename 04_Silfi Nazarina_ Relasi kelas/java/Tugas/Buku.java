package Tugas;

public class Buku {
    private String judul, jenis;
    private Penulis penulis;
    private Penerbit penerbit;

    Buku(String judul, String jenis, Penulis penulis, Penerbit penerbit){
        this.judul = judul;
        this.jenis = jenis;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }

    public Penerbit getPenerbit() {
        return penerbit;
    }

    public void info(){
        System.out.println("Buku:" );
        System.out.println("Judul\t      : "+ judul);
        System.out.println("Jenis\t      : "+ jenis);
        penulis.info();
        penerbit.info();
        System.out.println("------------------------------------");
    }
}