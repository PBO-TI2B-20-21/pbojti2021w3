import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        float jumPinjaman, angsur;

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.print("Masukkan Jumlah Pinjaman : ");
        jumPinjaman = sc.nextFloat();
        donny.pinjam(jumPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan Jumlah Pinjaman : ");
        jumPinjaman = sc.nextFloat();
        donny.pinjam(jumPinjaman);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan Jumlah Angsuran : ");
        angsur = sc.nextFloat();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.print("Masukkan Jumlah Angsuran : ");
        angsur = sc.nextFloat();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

    }
}
