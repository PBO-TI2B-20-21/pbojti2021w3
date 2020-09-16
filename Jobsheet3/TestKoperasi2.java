/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;

/**
 *
 * @author DEBORA
 */
public class TestKoperasi2 {
    public static void main(String args[]){
        Anggota2 donny = new Anggota2("111333444","Donny",5000000);
        
        System.out.println("Nama Anggota: "+donny.getNama());
        System.out.println("Limit Pinjaman: "+donny.getlimitPinjam());
        
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getjumlahPinjam());
        
        System.out.println("\nMeminjam  uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getjumlahPinjam());
    
        System.out.println("\nMembayar angsuran 1.000.000");
        donny.angsur(1000000);
        System.out.println("Jumlah Pinjaman saat ini: "+donny.getjumlahPinjam());
    
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getjumlahPinjam());
    
    }
    
}
