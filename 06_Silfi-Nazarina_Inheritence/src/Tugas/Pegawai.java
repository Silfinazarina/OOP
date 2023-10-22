package Tugas;

public class Pegawai {
    public String nip;
    private String nama;
    public String alamat;
    
    public Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }
    
    public String getNama() {
        return nama;
    }
    
    public int getGaji() {
       return 500000; 
    }
}