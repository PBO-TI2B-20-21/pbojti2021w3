
package koperasi;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota donny = new Anggota("111333444","Donny",5000000);
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Nama Anggota   :"+donny.getNama());
        System.out.println("Limit Pinjaman :"+donny.getLimitPinjaman()+"\n");
        
        System.out.println("Masukan jumlah pinjam : ");
        int n=keyboard.nextInt();
        donny.Pinjam(n);
        System.out.println("Masukan jumlah angsur : ");
        int m=keyboard.nextInt();
        donny.Angsur(m);
    }
}
