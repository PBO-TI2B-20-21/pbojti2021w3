/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float angsur;
        Anggota donny = new Anggota("1234567", "Donny", 5000000);

        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman : " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000");
        donny.pinjam(10000000);

        System.out.println("Jumlah pinjaman saat ini : " + donny.getJmlPinjaman());
        System.out.println("\nMeminjam uang 4.000.000");
        donny.pinjam(4000000);

        System.out.println("Jumlah pinjamana saat ini : " + donny.getJmlPinjaman());
        System.out.print("\nMasukkan angsuran : ");
        angsur = sc.nextFloat();
        donny.angsur(angsur);

        System.out.println("Jumlah pinjaman saat ini : " + donny.getJmlPinjaman());
    }

}
