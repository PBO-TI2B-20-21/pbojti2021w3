
package koperasigettersetter;
/**
 * 07_BimaGilangL
 */
public class KoperasiDemo {
    public static void main(String[] args){
        Anggota agt1 = new Anggota("iwan","Jl.Mawar");
        System.out.println("Simpanan " +agt1.getNama()+ " : Rp."+agt1.getSimpanan());
        
        agt1.setNama("Iwan Setiawan");
        agt1.setAlamat("Jalan Soekarno Hatta no.10");
        agt1.setor(100000);
        System.out.println("Simpanan " +agt1.getNama()+ " : Rp."+agt1.getSimpanan());
        
        agt1.pinjam(5000);
        System.out.println("Simpanan " +agt1.getNama()+ " : Rp."+agt1.getSimpanan());
        
    }
}
