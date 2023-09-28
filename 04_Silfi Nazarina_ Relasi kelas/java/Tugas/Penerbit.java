package Tugas;

public class Penerbit {
    private String nama, tahunTerbit;

    Penerbit(String nama, String tahunTerbit){
        this.nama = nama;
        this.tahunTerbit= tahunTerbit;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public String getTahunTerbit() {
        return tahunTerbit;
    }

    public void info(){
        System.out.println("Penerbit      : "+ nama);
        System.out.println("Tahun Terbit  : "+ tahunTerbit);
    }
}