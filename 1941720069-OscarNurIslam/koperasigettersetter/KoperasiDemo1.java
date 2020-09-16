package koperasigettersetter;
//Konstruktor, Instansiasi
public class KoperasiDemo1 {
    public static void main(String[] args) {
    Anggota anggota2 = new Anggota();
        System.out.println("`Simpanan"+anggota2.getNama()+" : Rp "+ anggota2.getSimpanan());
        anggota2.setNama("Iwan Setiawan");
        anggota2.setAlamat("Jalan Sukarno Hatta no 10");
        anggota2.setor(100000);
        System.out.println("Simpanan" +anggota2.getNama()+ " : Rp"+anggota2.getSimpanan());
    
        anggota2.pinjam(5000);
        System.out.println("Simpanan"+anggota2.getNama()+" : Rp "+anggota2.getSimpanan());    
    }
    }
