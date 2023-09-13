public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa(); // Instansiasi tambahan objek ke-2 
        mhs2.nim = 102;
        mhs2.nama = "Silfi";
        mhs2.alamat = "Jl. ANggre No 5B";
        mhs2.kelas = "1C";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa(); // Instansiasi tambahan objek ke-2 
        mhs3.nim = 103;
        mhs3.nama = "Nazarina";
        mhs3.alamat = "Jl. Melati No 23";
        mhs3.kelas = "2C";
        mhs3.tampilBiodata();
    }
}
