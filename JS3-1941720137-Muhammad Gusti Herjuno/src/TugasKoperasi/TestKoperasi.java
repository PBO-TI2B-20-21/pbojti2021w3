package TugasKoperasi;
import java.util.Scanner;

import koperasigettersetter.Anggota;

public class TestKoperasi {
    public static void main(String[] args) {
        float angsur;
        Scanner sc = new Scanner(System.in);
        Anggota1 donny = new Anggota1("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota : " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlhPinjam());

        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlhPinjam());

        System.out.print("\nmasukkan jumlah angsuran : ");
        angsur = sc.nextFloat();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJmlhPinjam());


    }
}
