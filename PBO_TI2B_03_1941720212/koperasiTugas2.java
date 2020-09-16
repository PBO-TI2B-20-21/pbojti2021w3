import java.util.Scanner;

/**
 * koperasiTugas2
 */
public class koperasiTugas2 {

    public static void main(String[] args) {
    //    AnggotaTugas2 donny = new AnggotaTugas2("123456", "Donny", 5000000); 
    //    System.out.println("Nama Anggota: " + donny.getNama());
    //    System.out.println("Limit Pinjaman: " + donny.getLimit());
    //    System.out.println("\nMeminjam uang 10.000.000...");
    //    donny.setPinjam(10000000);
    //    System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjam());
    //    System.out.println("\nMeminjam uang 4.000.000...");
    //    donny.setPinjam(4000000);
    //    System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjam());
    //    System.out.println("\nMembayar angsuran 100.000");
    //    donny.angsur(100000);
    //    System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjam());
    //    System.out.println("\nMembayar angsuran 3.000.000");
    //    donny.angsur(3000000);
    //    System.out.println("Jumlah pinjaman saat ini: " + donny.getPinjam());
    Scanner sc = new Scanner(System.in);
        int sisa=0;
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        System.out.print("No KTP : ");
        String ktp = sc.nextLine();
        System.out.print("Limit pinjaman : ");
        int limit = sc.nextInt();
        AnggotaTugas2 andika = new AnggotaTugas2(ktp, nama, limit);
        int pilih;
        do{
            System.out.println("1. pinjam");
            System.out.println("2. angsur");
            System.out.println("3. lihat jumlah pinjaman");
            System.out.println("4. cetak");
            System.out.println("5. keluar");
            System.out.println("=============================");
            System.out.print("Masukkan Pilihan: ");
            pilih = sc.nextInt();
            switch(pilih){
                case 1 :
                    System.out.print("Masukkan jumlah pinjaman : ");
                    int pinjam = sc.nextInt();
                    andika.setPinjam(pinjam);
                    break;
                case 2 :
                    System.out.print("Masukkan angsuran : ");
                    int angsur = sc.nextInt();
                    andika.angsur(angsur);
                    break;
                case 3 :
                    System.out.println("Sisa pinjaman anda : "+andika.hitung(sisa));
                    break;
                case 4 :
                    System.out.println("Nama : "+andika.getNama());
                    System.out.println("No KTP : "+andika.getKTP());
                    System.out.println("Limit Peminjaman : "+andika.getLimit());
                    System.out.println("Sisa Pinjaman : "+andika.getPinjam());                    
            }
        }while(pilih!=5);
    }
}