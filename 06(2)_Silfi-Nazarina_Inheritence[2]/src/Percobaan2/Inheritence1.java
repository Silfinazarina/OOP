package Percobaan2;

public class Inheritence1 {
    public static void main(String[] args) {
        StaffTetap ST = new StaffTetap("Budi", "Malang", "Laki-laki", 20, 2000000, 200000, 250000, "2A", 100000);
        ST.tampilStaffTetap();

        StaffHarian SH = new StaffHarian("Indah", "Malang", "Perempuan", 27, 10000, 100000, 50000, 100);
        SH.tampilStaffHarian();
    }
}
