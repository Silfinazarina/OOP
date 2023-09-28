package Tugas;

public class Penulis {

    private String nama;

    Penulis(String nama){
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void info(){
        System.out.println("Penulis       : "+ nama);
    }
}