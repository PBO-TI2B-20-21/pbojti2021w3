package pbojs3;
import java.util.Scanner;
public class Testkoperasi {
    public static void main(String[] args) {
        AnggotaTugas donny = new AnggotaTugas();
        Scanner hendra = new Scanner(System.in);
        System.out.print("Nama Anggota : ");
        donny.nama = hendra.nextLine();
        System.out.print("Limit Pinjaman : ");
        donny.limitpinjam = hendra.nextInt();
        
        System.out.print("\nMasukkan nominal yang dipinjam : ");
        int nominal = hendra.nextInt();
        donny.Pinjaman(nominal);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getjumlahpinjam());
        
        System.out.println("\nMasukkan nominal Angsuran : ");
        int angsur=hendra.nextInt();
        donny.angsuran(angsur);
        System.out.println("Jumlah pinjam saat ini : "+donny.getjumlahpinjam());
        System.out.println();
        donny.printstatus();
    }
}
