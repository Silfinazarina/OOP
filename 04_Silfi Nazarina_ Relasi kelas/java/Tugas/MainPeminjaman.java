package Tugas;

public class MainPeminjaman {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("   DATA PEMINJAMAN PERPUSTAKAAN");
        System.out.println("====================================");

        Penulis author1 = new Penulis("Andrea Hirata");
        Penerbit publisher1 = new Penerbit("Bentang Pustaka", "2005");
        Buku book1 = new Buku("Laskar Pelangi", "Novel", author1, publisher1);
        Peminjam pinjam1 = new Peminjam("A001", "Silfi Nazarina");
        Petugas bertugas1 = new Petugas("P001", "Diana");
        Peminjaman Log1 = new Peminjaman(book1, pinjam1, bertugas1);

        Log1.info();

        Penulis author2 = new Penulis("Gosho Aoyama");
        Penerbit publisher2 = new Penerbit("Shogakukan (TMS Entertaiment)", "1994");
        Buku book2 = new Buku("Detektif Conan", "Komik", author2, publisher2);
        Peminjam pinjam2 = new Peminjam("A002", "Doh Kyungsoo");
        Petugas bertugas2 = new Petugas("P001", "Diana");
        Peminjaman Log2 = new Peminjaman(book2, pinjam2, bertugas2);

        Log2.info();
    }
}