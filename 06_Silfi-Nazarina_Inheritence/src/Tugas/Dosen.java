package Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS;
    
    public Dosen(String nip, String nama, String alamat, int jumlahSKS, int TARIF_SKS) {
        super(nip, nama, alamat);
        this.jumlahSKS = jumlahSKS;
        this.TARIF_SKS = TARIF_SKS;
    }
    
    public void setSKS(int sks) {
        this.jumlahSKS = sks;
    }
    
    public int getGaji() {
        return jumlahSKS * TARIF_SKS;
    }
}
 