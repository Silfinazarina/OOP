/**
 * PerkalianKu1
 */
//kode program latihan kesatu
public class PerkalianKu1{
    void perkalian(int a, int b){
        System.out.println(a*b);
    }

    void perkalian(int a, int b, int c){
        System.out.println(a*b*c);
    }

    public static void main(String[] args) {
        PerkalianKu1 objek = new PerkalianKu1();

        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
}




