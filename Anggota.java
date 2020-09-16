
package koperasi;
import java.util.Scanner;
public class Anggota {
    private String noKtp;
    private String nama;
    private int limit;
    private int jmlPinjam;
    
    Anggota(String noKtp, String nama, int limit){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
        this.jmlPinjam = 0;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limit;
    }
    public int getJumlahPinjaman(){
        return jmlPinjam;
    }
    public void Pinjam(int pinjam){
        System.out.println("Meminjam uang "+pinjam+"...");
        if (pinjam > this.limit) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit. \n");  
        } else {
            this.jmlPinjam = pinjam;
            System.out.println("Jumlah pinjaman saat ini : "+getJumlahPinjaman()+"\n");
        }
    }
    public void Angsur(int angsur){
        System.out.println("Membayar angsuran "+angsur);
        if (angsur == (jmlPinjam*10/100)) {
            this.jmlPinjam -= angsur;
            System.out.println("Jumlah pinjaman saat ini : "+getJumlahPinjaman()+"\n");

        } else {
            System.out.println("Maaf angsuran harus 10% dari pinjaman");
            System.out.println("Jumlah pinjaman saat ini : "+getJumlahPinjaman()+"\n"); 
        }
    }
}
