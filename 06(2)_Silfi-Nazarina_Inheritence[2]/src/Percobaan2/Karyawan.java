package Percobaan2;

public class Karyawan {
    public String nama, alamat, jk;
    public int umur, gaji;

    Karyawan(){

    }

    Karyawan(String nama, String alamat, String jk, int umur, int gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }

    public void tampilDataKaryawan(){
        System.out.println("nama \t\t = " + nama);
        System.out.println("Alamat\t\t = " + alamat);
        System.out.println("Jenis Kelamin\t = "+ jk);
        System.out.println("Umur\t\t = "+ umur);
        System.out.println("Gaji\t\t = "+ gaji);
    }
}
