package Tugas;
import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444", "Doni", 5000000);
        Scanner sc = new Scanner(System.in);
        float pinjaman, angsuran;
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman :" + donny.getLimitPeminjaman());
        System.out.println("\n jumlah pinjaman uang :");
        pinjaman = sc.nextFloat();
        donny.pijaman(pinjaman);
        System.out.println("Jumlah Pinjaman Saat ini :" + donny.getJumlahPinjaman());
        System.out.println("\n jumlah angsuran :");
        angsuran = sc.nextFloat();
        donny.angsuran(angsuran);
        System.out.println("Jumlah Pinjaman Saat ini :" + donny.getJumlahPinjaman());

        
    }
}
