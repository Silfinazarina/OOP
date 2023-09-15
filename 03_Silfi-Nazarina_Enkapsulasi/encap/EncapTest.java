package encap;

public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(12); //modifikasi untuk pengecekan nilai minimal

        System.out.println("Name : "+ encap.getName());
        System.out.println("Age : "+ encap.getAge());

    }
}
