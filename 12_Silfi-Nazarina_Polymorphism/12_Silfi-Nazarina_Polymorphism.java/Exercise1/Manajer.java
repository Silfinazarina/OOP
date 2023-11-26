public class Manajer extends Pegawai{
    private int tunjangan;

    Manajer(String nama, int gaji, int tunjangan){
        this.nama = nama;
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    @Override
    public int getGaji() {
        // TODO Auto-generated method stub
        return super.getGaji();
    }

    public int getTunjangan() {
        return tunjangan;
    }
}