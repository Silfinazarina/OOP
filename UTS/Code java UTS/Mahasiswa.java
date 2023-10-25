public class Mahasiswa { 
    String nim, nama, alamat; 
    char jenisKelamin;

    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin
    public Mahasiswa(String nim, String nama, String alamat, char jenisKelamin){
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public void printInfo(){
        System.out.println("===================================");
        System.out.println("\t  DATA MAHASISWA");
        System.out.println("===================================");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println();
    }

    public static void main(String[] args) {
        // b. Buat objek mahasiswa
        // Isi atribut nim, nama, alamat, jenisKelamin
        // lewat constructor
        Mahasiswa mhs1 = new Mahasiswa("2241720054", "Silfi Nazarina", "Malang ", 'P');
        mhs1.printInfo();
    }
}
//SILFI NAZARINA