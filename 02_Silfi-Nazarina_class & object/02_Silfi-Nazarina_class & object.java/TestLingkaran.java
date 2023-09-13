// main class dari jawaban tugas no 3

public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran ling1 = new  Lingkaran();
        ling1.phi = 22/7;
        ling1.r = 7;

        System.out.println("Lingkaran 1");
        System.out.println("-------------------------");
        System.out.println("Phi  : "+ ling1.phi);
        System.out.println("r    : "+ ling1.r);
        System.out.println("Luas : "+ ling1.hitungLuas() + " cm2");
        System.out.println("Keliling  : "+ ling1.hitungkeliling() + " cm");
    }
}