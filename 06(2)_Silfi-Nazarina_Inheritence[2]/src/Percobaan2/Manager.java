package Percobaan2;

public class Manager extends Karyawan{
    public int tunjangan;

    Manager(){

    }

    public void tampilDataManager(){
        super.tampilDataKaryawan();
        System.out.println("Tunjangan\t = "+ tunjangan);
        System.out.println("Total Gaji\t = "+ (super.gaji + tunjangan));
    }
}
