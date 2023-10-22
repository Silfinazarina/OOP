package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        DaftarGaji dg = new DaftarGaji(5);

        Pegawai pegawai1 = new Pegawai("123", "Silfi Nazarina", "Malang");
        Dosen dosen1 = new Dosen("456", "Najwa Azzahra", "Semarang", 10, 200000);
        Pegawai pegawai2 = new Pegawai("789", "Larasati Puspita", "Jalan DEF");

        dg.addPegawai(pegawai1);
        dg.addPegawai(dosen1);
        dg.addPegawai(pegawai2);
        dg.printSemuaGaji();
    }
}
