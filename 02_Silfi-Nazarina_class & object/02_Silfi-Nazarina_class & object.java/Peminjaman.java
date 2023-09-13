//Jawaban tugas no 2

public class Peminjaman {
    public String idPinjam, namaMember, namaGame;
    public int bayar;
    
    public int hitungBayar(int lamaSewa, int hargaSewa){
        bayar = lamaSewa * hargaSewa;
        return bayar;
    }

    public void cetakData(){
        System.out.println("Id sewa\t: "+ idPinjam);
        System.out.println("Nama member : "+ namaMember);
        System.out.println("Nama game   : "+ namaGame);
    }

    public void cetakBayar(){
        System.out.println("Harga bayar : "+ bayar);
    }
}
