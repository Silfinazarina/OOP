package Tugas;

public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    Komputer(){

    }

    Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }

    public void tampilData(){
        System.out.println("Merk\t\t   : " + merk);
        System.out.println("Kecepatan Processor: "+ kecProsesor+ " GHz");
        System.out.println("Size Memory\t   : "+ sizeMemory+" GB");
        System.out.println("Jenis Processor    : "+ jnsProsesor);
    }
}