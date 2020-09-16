package TugasEnkapsulasi;

/**
 *
 * @author Dhimas Arbi
 */
public class Anggota {
    private String nomorKtp, nama;
    private int limitPinjam, jumlahPinjaman = 0;
    
    Anggota(String nomorKtp, String nama, int limitPinjam){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjam;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    public void pinjam(int uang){
        if(uang > limitPinjam){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else{
            jumlahPinjaman+=uang;
        }
    }
    public void angsur(int uang){ //memodifikasi kode agar angsuran minimal = 10%
        if(uang < 0.1*jumlahPinjaman){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else{
            jumlahPinjaman-=uang;
        }
    }
    public void statusPinjaman(){
        System.out.println("\nNama Anggota : "+ getNama());
        System.out.println("Limit Pinjaman : "+ getLimitPinjaman());
        System.out.println("Jumlah Pinjaman : "+ getJumlahPinjaman());
    }
    
}
