package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int jumlahPegawai;
    
    public DaftarGaji(int jumlahPegawai) {
        listPegawai = new Pegawai[jumlahPegawai];
    }
    
    public void addPegawai(Pegawai pegawai) {
        if (jumlahPegawai < listPegawai.length) {
            listPegawai[jumlahPegawai] = pegawai;
            jumlahPegawai++;
        } else {
            System.out.println("Daftar pegawai sudah penuh");
        }
    }
    
    public void printSemuaGaji() {
        System.out.println("============= DAFTAR GAJI PEGAWAI =============");
        for (int i = 0; i < jumlahPegawai; i++) {
            System.out.println("Pegawai "+ (i+1));
            System.out.println("Nama\t\t  : " + listPegawai[i].getNama());
            System.out.println("Gaji yg diperoleh : "+ listPegawai[i].getGaji());  
            System.out.println();
            
        }
    }
}
