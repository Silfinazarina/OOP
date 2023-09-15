package koperasitugas;

//Tugas no 4 & 5

public class Anggota {
    private String ktp, nama;
    private int limit;
    public int pinjaman;

    Anggota(String ktp, String nama, int limit){ 
        this.ktp = ktp;
        this.nama = nama;
        this.limit = limit;
        this.pinjaman = 0;
    }

    public void setKtp(String ktp){
        this.ktp = ktp;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getKtp(){
        return ktp;
    }

    public String getNama(){
        return nama;
    }

    public int getLimit(){
        return limit;
    }

    public void angsur(int uang){
        int minimAngsur = (int)(0.1 * pinjaman);
        if (uang > minimAngsur) {
            pinjaman -= uang;
        } else {
            System.out.println("Maaf! Angsuran harus 10% dari pinjaman");
            uang = 0;
        }
        System.out.println("Jumlah pinjaman saat ini: "+ pinjaman);
        System.out.println();
        if (pinjaman == 0) {
            System.out.println("\t    ---LUNAS!---");
        } 
    }

    public void pinjam (int uang){
        if (uang > limit) {
            // pinjaman = 5000000;
            System.out.println("Maaf! Jumlah peinjaman melebihi limit (Rp.5000.000)");
        } else {
            pinjaman += uang;
        }
        System.out.println("Jumlah pinjam  : "+ pinjaman);
    }
}
