package com.company;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Koperasi donny = new Koperasi(111333444,"Donny",5000000);

        int angsur;
        System.out.println("No KTP : "+donny.getNoKTP());
        System.out.println("Nama Anggota : "+ donny.getNama());
        System.out.println("Limit pinjaman : "+donny.getLimitPinjam());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());

        System.out.print("\nMasukkan jumlah angsuran : ");
        angsur=input.nextInt();
        donny.angsur(angsur);


//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsur(1000000);
//        System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());
//
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsur(3000000);
//        System.out.println("Jumlah pinjaman saat ini : "+ donny.getJumlahPinjaman());
    }
}
