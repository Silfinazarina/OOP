package percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setNama("Avanza");
        m.setBiaya(350000);
        Sopir s = new Sopir();
        s.setNama("John Doe"); 
        s.setBiaya(200000);
        Pelanggan p = new Pelanggan();
        p.setNama("Jane Doe");
        p.setMobil(m);
        p.setSopir(s);
        p.setHari(2);
        System.out.println("Nilai Total = "+ p.hitungBiayaTotal());

        System.out.println(p.getMobil().getNama()); //menggunakan getNama bukan getMerk karena pada percobaan maupun class diagramnya variabel diset dengan nama 'nama'. Namun pada contoh percobaan main dilangkah i selanjutnya, pada objek mobil variabel berubah menjadi setMerk. Pada percobaan dan tugas, saya tetap menggunakan variabel 'nama' seperti class diagram.
    }
}
