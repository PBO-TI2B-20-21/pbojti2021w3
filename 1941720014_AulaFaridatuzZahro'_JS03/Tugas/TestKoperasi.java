package Tugas;

import java.util.Scanner;

/**
 *
 * @author Aulafz
 */
public class TestKoperasi {

    public static void menu() {
        System.out.println("Pilihan Transaksi: ");
        System.out.println("1. Pinjam");
        System.out.println("2. Angsur");
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Scanner aula = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());
        int pilih;
        do {
            menu();
            System.out.print("Masukkan pilihan anda (1/2) : ");
            pilih = aula.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman : ");
                    donny.pinjam(aula.nextInt());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah angsuran : ");
                    donny.angsur(aula.nextInt());
                    break;
                default:
                    System.out.println("Pilihan anda tidak tersedia.");
            }
            System.out.println();
            System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
        } while (pilih == 1 || pilih == 2);

//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjam(10000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjam(4000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 100.000");
//        donny.angsur(100000);
//        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjaman());
    }
}
