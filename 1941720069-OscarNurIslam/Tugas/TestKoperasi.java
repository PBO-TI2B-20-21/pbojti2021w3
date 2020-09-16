package Tugas;

public class TestKoperasi {
    public static void main(String[] args) {
   Anggota donny = new Anggota("111333444","Donny",5000000);
        System.out.println("Nama Anggota: "+ donny.getLimit());
        
        System.out.println("\nMeminjam uang 10.000.000");
        donny.pinjam(1000000);
        System.out.println("Jumlah pinjaman saat ini :"+donny.getSimpanan());
        
        System.out.println("\nMeminjam uang 4.000.000");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getSimpanan());
   
        System.out.println("\n membayat angsuran 1.000.000");
        donny.setor(1000000);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getSimpanan());
        
        System.out.println("\n Membayar angsuran 3.000.000");
        donny.setor(3000000);
        System.out.println("Jumlah pinjaman saat ini: " +donny.getSimpanan());
    }
}