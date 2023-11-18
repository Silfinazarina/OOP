public class Segitiga {
    private int sudut;
    
    public int totalSudut(int sudutA){
        return sudut = 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB){
        return sudut = 180 - (sudutA + sudutB);
    }

    public int keliling(int sisiA, int sisiB, int sisiC){
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB){
        return Math.sqrt(Math.pow(sisiA, 2) + Math.pow(sisiB, 2));
    }

    public static void main(String[] args) {
        Segitiga st1 = new Segitiga();

        System.out.println("Total sudut dengan satu sudut: "+ st1.totalSudut(60));
        System.out.println("Total sudut dengan dua sudut : "+ st1.totalSudut(60, 60));
        System.out.println("Keliling dua sisi \t: "+ st1.keliling(3, 4 ,5));
        System.out.println("Keliling tiga sisi\t: "+ st1.keliling(5, 6));

    }
}
