package koperasigettersetter;
//Konstruktor, Instansiasi
public class KoperasiDemo2 {
    public static void main(String[] args) {
          Anggota2 anggota3 = new Anggota2("Iwan","Jalan mawar");
        System.out.println("`Simpanan"+anggota3.getNama()+" : Rp "+ anggota3.getSimpanan());
       
        anggota3.setNama("Iwan Setiawan");
        anggota3.setAlamat("Jalan Sukarno Hatta no 10");
        anggota3.setor(100000);
        System.out.println("Simpanan" +anggota3.getNama()+ " : Rp"+anggota3.getSimpanan());
    
        anggota3.pinjam(5000);
        System.out.println("Simpanan"+anggota3.getNama()+" : Rp "+anggota3.getSimpanan());    
    }
}
