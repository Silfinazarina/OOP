package TugasTeori;

public class Segitiga extends BangunDatar{
    public float alas, tinggi;

    @Override
    public float luas(){
        return 0.5f * alas * tinggi;
    }

    @Override
    public float keliling(){
        return 0.0f; // tidak bisa menghitung keliling segitiga karena atribut yang ada hanya alas dan tinggi. Sedangkan untuk menghitung keliling segitiga kita harus mengetahui panjang masing masing sisinya kemudian ditambahkan.
    }
}
