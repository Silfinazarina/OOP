package Tugas;

/**
 * Petugas
 */
public class Petugas {
    private String idPetugas, nama;
    static int n=0;

    Petugas(String idPetugas, String nama){
        this.idPetugas = idPetugas;
        this.nama = nama;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void info(){
        while (idPetugas != null) {
            System.out.println("\t--Peminjaman ke "+ (n+1)+ "--");
            n++;
            break;
        }
        System.out.println("Petugas:");
        System.out.println("Id Petugas    : "+ idPetugas);
        System.out.println("Nama Petugas  : "+ nama);
        System.out.println();
    }
}