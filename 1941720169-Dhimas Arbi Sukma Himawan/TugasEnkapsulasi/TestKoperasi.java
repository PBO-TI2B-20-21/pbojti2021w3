package TugasEnkapsulasi;

/**
 *
 * @author Dhimas Arbi
 */
import java.util.Scanner;
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner dhimas = new Scanner(System.in);

        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        donny.statusPinjaman();
        
        int pilih;
        do {
            menu();
            pilih = dhimas.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("\nMasukkan jumlah pinjaman : ");
                    donny.pinjam(dhimas.nextInt());
                    donny.statusPinjaman();
                    break;
                case 2:
                    if (donny.getJumlahPinjaman() == 0) {
                        System.out.println("\nPinjaman Anda telah lunas");
                    } else {
                        System.out.print("\nMasukkan angsuran: ");
                        donny.angsur(dhimas.nextInt());
                        donny.statusPinjaman();
                    }
            }
        } while (pilih == 1 || pilih == 2);

    }

    public static void menu() {
        System.out.println("1. Pinjam");
        System.out.println("2. Bayar angsuran");
        System.out.println("-------------------");
    }

}
