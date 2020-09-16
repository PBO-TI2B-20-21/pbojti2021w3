package Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota(111333444,"Donny",5000000);
        System.out.println("No KTP : "+donny.getNoKTP());
        System.out.println("Nama Anggota : "+ donny.getNama());
        System.out.println("Limit pinjaman : "+donny.getLimitPinjam());

        System.out.print("\nMeminjam uang : ");
        int pinjam = sc.nextInt();
        System.out.println("Jumlah pinjaman saat ini : "+ donny.pinjam(pinjam));

        System.out.print("\nMeminjam uang :");
       pinjam = sc.nextInt();
        System.out.println("Jumlah pinjaman saat ini : "+ donny.pinjam(pinjam));

        System.out.print("\nMembayar angsuran :");
        int angsur = sc.nextInt();
        System.out.println("Jumlah pinjaman saat ini : "+donny.pinjam(pinjam));

        System.out.print("\nMasukkan jumlah angsuran: ");
        angsur = sc.nextInt();
        donny.angsur(angsur);

        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
    }
}