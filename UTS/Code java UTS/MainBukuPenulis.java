public class MainBukuPenulis {
    public static void main(String[] args) {
        Penulis author1 = new Penulis();
        author1.setNama("Silfi");
        author1.setAlamat("Malang");

        Buku book1 = new Buku();
        book1.setISBN("123-325-27");
        book1.setJudul("Melaju");
        book1.setPenulis(author1);
        book1.setHarga(50000);

        System.out.println("==============================");
        System.out.println("          DATA BUKU");
        System.out.println("==============================");
        System.out.println("ISBN           : "+ book1.getISBN());
        System.out.println("Judul          : "+ book1.getJudul());
        System.out.println("Nama Penulis   : "+ book1.getPenulis().getNama());
        System.out.println("Alamat Penulis : "+ book1.getPenulis().getAlamat());
        System.out.println("Harga          : "+ book1.getHarga());
        System.out.println();

    }
}
