public class MainKaryawan {
    public static void main(String[] args) {
        Karyawan karyawan1 = new Karyawan();
        karyawan1.id = "K001";
        karyawan1.nama = "Silfi Nazarina";
        karyawan1.jenisKel = "Perempuan";
        karyawan1.jabatan = "Manager";
        karyawan1.gajiPokok = 10000000;
        karyawan1.tunjangan = 4000000;
        karyawan1.hitungGaji();
        karyawan1.cetakData();

    
        Karyawan karyawan2 = new Karyawan();
        karyawan2.id = "K002";
        karyawan2.nama = "Najwa Azzahra";
        karyawan2.jenisKel = "Perempuan";
        karyawan2.jabatan = "Manager proyek";
        karyawan2.gajiPokok = 9000000;
        karyawan2.tunjangan = 4000000;
        karyawan2.hitungGaji();
        karyawan2.cetakData();

    }
}
