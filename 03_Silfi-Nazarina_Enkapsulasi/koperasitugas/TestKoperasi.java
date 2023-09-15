package koperasitugas;

import java.util.Scanner;

//Tugas no 4 & 5

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("======================================");
        System.out.println("\t   Data Peminjaman 1");
        System.out.println("======================================");
        System.out.println("Peminjam");
        System.out.println("No. KTP        : "+ anggota1.getKtp());
        System.out.println("Nama anggota   : "+ anggota1.getNama());
        System.out.println("Limit pinjaman : "+ anggota1.getLimit());
        System.out.print("Jumlah pinjam  : ");
        anggota1.pinjaman = sc.nextInt();
        System.out.println("--------------------------------------");
        System.out.print("Mengangsur sebesar: "); 
        int angsuran = sc.nextInt();
        anggota1.angsur(angsuran);
        System.out.println();

        System.out.print("Mengangsur sebesar: "); 
        angsuran = sc.nextInt();
        anggota1.angsur(angsuran);
        System.out.println();
        
        System.out.print("Mengangsur sebesar: "); 
        angsuran = sc.nextInt();
        anggota1.angsur(angsuran);
        System.out.println();
    }
}
