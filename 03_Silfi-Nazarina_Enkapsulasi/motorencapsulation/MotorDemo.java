package motorencapsulation;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.printStatus();
        motor.tambahkecepatan();

        motor.nyalakanMesin();
        motor.printStatus();

        motor.tambahkecepatan();
        motor.printStatus();

        motor.tambahkecepatan();
        motor.printStatus();

        motor.tambahkecepatan();
        motor.printStatus();

        motor.tambahkecepatan();
        motor.printStatus();

        motor.tambahkecepatan(); //nilai maksimal disini
        motor.printStatus();

        motor.tambahkecepatan(); //tidak bisa menambah lagi karena sudah sampai pada titik maksimal

        motor.kurangiKecepatan();
        motor.printStatus();

        motor.matikanMesin();
        motor.printStatus();
    }
}
