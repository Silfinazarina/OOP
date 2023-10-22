package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Mac mc = new Mac("McBook Air", 2, 256 , "Apple M1", "lithium-ion", "Apple T2 Security Chip");
        mc.tampilMac();
        System.out.println();

        Windows wd = new Windows("MSI GS66 Stealth", 3, 1000, "Intel Core i7-11800H", "lithium-polimer 4 sel", "Windows Store, ....");
        wd.tampilWindows();
        System.out.println();

        Pc pc = new Pc("Dell XPS 13", 3, 512, "Intel Core i7-1165G7", (int)13.3);
        pc.tampilPc();
        System.out.println();
    }
}
//SILFI NAZARINA