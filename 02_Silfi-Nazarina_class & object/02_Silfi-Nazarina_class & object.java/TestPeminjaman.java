//Main class dari jawaban tugas no 2

public class TestPeminjaman {
    public static void main(String[] args) {
        Peminjaman pinjam1 = new Peminjaman();
        pinjam1.idPinjam = "P001";
        pinjam1.namaMember = "Silfi";
        pinjam1.namaGame = "Roblox";
        pinjam1.hitungBayar(3, 5000);
        pinjam1.cetakData();
        pinjam1.cetakBayar();
    }
}
