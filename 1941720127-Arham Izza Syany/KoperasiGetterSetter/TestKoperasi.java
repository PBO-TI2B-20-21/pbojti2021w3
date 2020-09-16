import java.util.Scanner;
public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pinjam,angsur;
        
        DemoKoperasi donny = new DemoKoperasi("111333444","Donny",5000000);
        System.out.println("Nama Anggota: " + donny.getName());
        System.out.println("Limit Pinjaman: "+ donny.getLimitPinjaman());

        System.out.print("\nAnda ingin pinjam berapa kali ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("\nAnda ingin Pinjam berapa?");
            pinjam = sc.nextInt();
            donny.pinjam(pinjam);
            System.out.println("Jumlah Pinjaman saat ini: "+ donny.getJumlahPinjam());
            System.out.println("Meminjam uang " + pinjam); 
        }
        System.out.print("\nAnda ingin angsur berapa kali ");
        int count2 = sc.nextInt();
        for (int i = 0; i < count2; i++) {
            System.out.print("\nAnda ingin angsur berapa?");
            angsur = sc.nextInt();
            donny.angsur(angsur); 
            System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjam());  
            System.out.println("Membayar angsuran" + angsur);
        }

    }   
}
