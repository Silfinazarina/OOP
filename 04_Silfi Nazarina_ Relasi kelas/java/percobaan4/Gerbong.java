package percobaan4;

public class Gerbong {
    private String kode;
    private Kursi[] arrayKursi;

    Gerbong(String kode, int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode){
        this.kode = kode;
    }

    public String getKode(){
        return kode;
    }

    //modifikasi pertanyaan no 5 praktikum 4
    public void setPenumpang(Penumpang penumpang, int nomor){ 
        Kursi kursi = this.arrayKursi[nomor-1];
        if (kursi.getPenumpang() == null) { 
            kursi.setPenumpang(penumpang);
        } else {
            System.out.println("Maaf "+ penumpang.getNama()+", kursi " + nomor + " sudah ditempati.");
            System.out.println();
        }
    }

    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}


