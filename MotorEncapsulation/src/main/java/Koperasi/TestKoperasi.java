/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasi;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float angsuran;
        Anggota donny=new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota : "+donny.getNama());
        System.out.println("Limit Pinjaman : "+donny.getLimitPeminjaman());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah Pinjam saat ini : "+donny.getJumlahPeminjaman());
        
        System.out.println("\nMeminjam Uang 4.000.000...");
        donny.pinjam(4000000);
        
        System.out.println("\nMembayar Angsuran 1.000.000");
        donny.angsuran(1000000);
        System.out.println("Jumlah Pinjam saat ini : "+donny.getJumlahPeminjaman());
        
        System.out.println("\nMembayar Angsuran 300.000.000");
        donny.angsuran(3000000);
        
        System.out.println("Jumlah Pinjaman saat ini : "+donny.getJumlahPeminjaman());
        System.out.println("\nMasukkan Angsuran : ");
        angsuran=sc.nextFloat();
        donny.angsuran(angsuran);
        System.out.println("Jumlah Pinjaman saat ini : "+donny.getJumlahPeminjaman());
    }
}
