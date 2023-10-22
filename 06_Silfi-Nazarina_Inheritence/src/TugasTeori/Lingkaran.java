package TugasTeori;

public class Lingkaran extends BangunDatar{
    public float r;

    @Override
    public float luas(){
        return 3.14f * r * r;
    }

    @Override
    public float keliling(){
        return 2 * 3.14f * r;
    }
}
