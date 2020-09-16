/**
 * KoperasiDemo
 */
public class KoperasiDemo {

    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("Iwan","Jalan Mawar");
        System.out.println("Simpan" + anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
        
        anggota1.setNama("Iwan Setiawan");
        anggota1.setAlamat("jalan sukarno hatta no 10");
        anggota.setor(100000);
        System.out.println("Simpan" + anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());

        anggota1.pinjam(5000);
        System.out.println("Simpan" + anggota1.getNama()+" : Rp "+ anggota1.getSimpanan());
    }
}
    