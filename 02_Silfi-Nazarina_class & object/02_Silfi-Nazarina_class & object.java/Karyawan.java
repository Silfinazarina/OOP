/**
 * Karyawan
 */
public class Karyawan {
    public String id, nama, jenisKel, jabatan;
    public int totGaji, gajiPokok, tunjangan;

    public void hitungGaji(){
        totGaji = gajiPokok + tunjangan;
    }

    public void cetakData(){
        System.out.println("------------------------------");
        System.out.println("Id karyawan  : "+ id);
        System.out.println("Nama karyawan: "+ nama);
        System.out.println("Jenis kelamin: "+jenisKel);
        System.out.println("Jabatan      : "+ jabatan);
        System.out.println("Gaji         : "+ totGaji);
    }

}