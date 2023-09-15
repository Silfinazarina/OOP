package motorencapsulation;

/**
 *
 * @author LENOVO
 * 
 * 
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }

    public void tambahkecepatan(){
        if (kontakOn == true) {
            if (kecepatan>=100) {
                System.out.println("Anda telah memasuki kecepatan maksimal (100) \n");
                kecepatan = 100;
            } else {
                kecepatan += 20; //untuk menjawab pertanyaan no.3 saya mengubah kecepatan dari yang awalnya 5 menjadi 20
            }
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void kurangiKecepatan(){
        if (kontakOn == true) {
            kecepatan -= 5;
        } else {
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
}
