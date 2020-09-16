
package tugas3;
import java.util.Scanner;
/**
 * 07_BimaGilangL
 */
public class TestKoperasi {
    public static void main(String[] args){
        Scanner bim = new Scanner(System.in);
        Anggota donny = new Anggota ("111333444","Donny", 5000000);
        
        System.out.println("Nama Anggota\t: "+donny.getNama());
        System.out.println("Limit Pinjaman\t: "+donny.getLimitPinjam());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
        System.out.print("Masukan pinjaman saat ini : ");
        int pinjam = bim.nextInt();
        donny.pinjaman(pinjam);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());
        System.out.print("\nMasukan nilai angsuran : ");
        int angsur = bim.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini : "+donny.getJumlahPinjaman());
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXX");
    }
}
