package MotorEncaplusation;
import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinjam,angsur;
        
        AnggotaKoperasi donny = new AnggotaKoperasi("111333444","Donny",5000000);
        System.out.println("Nama Anggota: " + donny.getName());
        System.out.println("Limit Pinjaman: "+ donny.getLimitPinjaman());
        System.out.print("Berapa yang anda Pinjam? ");
        pinjam = sc.nextInt();
        System.out.println("\nMeminjam uang " + pinjam); donny.pinjam(pinjam);
        System.out.println("Jumlah Pinjaman saat ini: "+ donny.getJumlahPinjam());
        System.out.print("Berapa yang anda Pinjam? ");
        pinjam = sc.nextInt();
        System.out.println("\nMeminjam uang " + pinjam); donny.pinjam(pinjam); 
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());
        System.out.print("Berapa yang anda Angsur? ");
        angsur = sc.nextInt();
        System.out.println("\nMembayar angsuran "+ angsur); donny.angsur(angsur); 
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam()); 
        System.out.print("Berapa yang anda Angsur? ");
        angsur = sc.nextInt();
        System.out.println("\nMembayar angsuran "+ angsur); donny.angsur(angsur); 
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam()); 

    }   
}