package TugasTeori;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("\tPERHITUNGAN BAGNUN DATAR");
        System.out.println("=========================================");

        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 5;
        pp1.lebar = 10;

        Segitiga st1 = new Segitiga();
        st1.alas = 4;
        st1.tinggi = 5;

        Lingkaran ling1 = new Lingkaran();
        ling1.r = 5;

        System.out.println("Persegi Panjang");
        System.out.println("----------------");
        System.out.println("Panjang : "+ pp1.panjang + " cm");
        System.out.println("Lebar   : "+ pp1.lebar + " cm");
        System.out.println("----------------");
        System.out.println("Luas     : " + pp1.luas() + " cm");
        System.out.println("Keliling : " + pp1.keliling() + " cm");
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Lingkaran");
        System.out.println("----------------");
        System.out.println("jari-jari : "+ ling1.r + " cm");
        System.out.println("----------------");
        System.out.println("Luas     : " + ling1.luas() + " cm");
        System.out.println("Keliling : " + ling1.keliling() + " cm");
        System.out.println("------------------------------------------");
        System.out.println();

        System.out.println("Segitiga");
        System.out.println("----------------");
        System.out.println("Alas    : "+ st1.alas + " cm");
        System.out.println("Tinggi  : "+ st1.tinggi + " cm");
        System.out.println("----------------");
        System.out.println("Luas     : " + st1.luas() + " cm");
        System.out.println("Keliling : " + st1.keliling() + " cm");
        System.out.println("------------------------------------------");
    }
}
