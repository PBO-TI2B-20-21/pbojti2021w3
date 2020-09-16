/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author Bedman
 */
import java.util.Scanner;

public class KoperasiDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        boolean rotate = true;
        Anggota donny = new Anggota(1223334444, "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimit());
        System.out.println("");
        while (ulang) {
            System.out.print("Masukkan Jumlah Pinjaman: Rp. ");
            int pinjam = input.nextInt();
            int a = donny.getUtang();
            int b = donny.getLimit();
            if (pinjam > b && a == 0) {
                System.out.println("Maaf, jumlah pinjaman melebihi limit");
                ulang = true;
                System.out.println("");
            } else {
                donny.setUtang(pinjam);
                System.out.println("Meminjam uang Rp." + donny.getUtang());
                System.out.println("Jumlah pinjaman saat ini: " + donny.getUtang());
                System.out.println("");
                System.out.println("1. Membayar Angsuran");
                int pilih = input.nextInt();
                switch (pilih) {
                    case 1:
                        while (rotate) {
                            System.out.print("Masukkan jumlah angsuran: Rp.");
                            int angsur = input.nextInt();
                            if (angsur < (donny.getUtang() * 0.1)) {
                                System.out.println("Angsuran anda kurang");
                                rotate = true;
                            } else {
                                donny.setor(angsur);
                                System.out.println("Jumlah pinjaman saat ini: " + donny.getUtang());
                                if (donny.getUtang() > 0) {
                                    System.out.println("Ingin Mengangsur lagi?");
                                    System.out.println("1. YA");
                                    System.out.println("2. Tidak");
                                    int angka = input.nextInt();
                                    if (angka==1) {
                                        rotate=true;
                                    } else {
                                        rotate=false;
                                        ulang=false;
                                    }
                                    System.out.println("");
                                } else {
                                    System.out.println("Pinjaman anda sudah lunas");
                                    rotate = false;
                                }
                            }

                        }
                }
            }
        }
    }
}
//System.out.println("");

//donny.setor(1000000);
//System.out.println("Membayar Angsuran Rp. 1.000.000");
//System.out.println("Jumlah pinjaman saat ini: "+donny.getUtang());
//System.out.println("");
//donny.setor(3000000);
// System.out.println("Membayar Angsuran Rp. 3.000.000");
       // System.out.println("Jumlah pinjaman saat ini: "+donny.getUtang());
