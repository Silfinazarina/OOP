public class Main {
    public static void main(String[] args) {
        Manusia hum1 = new Manusia();
        Manusia hum2 = new Dosen();
        Manusia hum3 = new Mahasiswa();

        hum1.bernafas();
        hum1.makan();
        System.out.println();
        hum2.makan();
        System.out.println();
        hum3.makan();
    }
}