/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas456;

import java.util.Scanner;

/**
 *
 * @author Risky
 */
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner risky = new Scanner(System.in);
        float angsur;
        Anggota donny = new Anggota("111333444","Donny",5000000);
        
        System.out.println("Nama anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " +donny.getLimitPeminjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
        System.out.println("\nMembayar angsuran");
        System.out.print("Masukkan jumlah angsuran : ");
        angsur = risky.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        
    }
}
