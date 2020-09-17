package Tugas;

import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner indra = new Scanner(System.in);
//        AnggotaKoperasi donny = new AnggotaKoperasi("111333444", "Donny", 5000000);
        AnggotaKoperasi agt = new AnggotaKoperasi();
        System.out.print("Nama Anggota    : ");
        agt.nama = indra.nextLine();
        System.out.print("Limit Pinjaman  : ");
        agt.limitPinjam = indra.nextInt();
        
        System.out.println("\nMasukkan nominal yang ingin dipinjam : ");
        int nominal = indra.nextInt();
        agt.Pinjaman(nominal);
        System.out.println("Jumlah pinjaman saat ini : " + agt.getJumlahPinjam());
        
        System.out.println("\nMasukkan nominal angsuran : ");
        int angsur = indra.nextInt();
        agt.angsuran(angsur);
        System.out.println("Jumlah pinjam saat ini : " + agt.getJumlahPinjam());
        System.out.println();
        agt.printBukti();

//        System.out.println("Nama Anggota : " + donny.getNama());
//        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());
//        
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.Pinjaman(10000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.Pinjaman(4000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsuran(1000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjam());
//        
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsuran(3000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjam());
    }
}
