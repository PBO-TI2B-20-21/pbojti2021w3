package Tugas;
public class Anggota {
    private String ktp;
    private String nama;
    private float limitPinjam;
    private float jumlahPinjam;
    
    
    Anggota(String ktp, String nama, float limitPeminjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjam = limitPeminjaman;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public float getJumlahPinjaman(){
        return jumlahPinjam;
    }
    public  float getLimitPeminjaman(){
        return limitPinjam;
    }
    public void pijaman(float uang){
        if(uang<limitPinjam){
            jumlahPinjam += uang;
        }else{
            System.out.println("Pinjaman melebihi limit pinjaman \n");
        }
    }
    public void angsuran(float uang){
        if(uang>(0.1 *jumlahPinjam)){
            jumlahPinjam -= uang;
        }else{
            System.out.println("Jumlah angsuran kurang dari 10% jumlah peminjaman \n");
        }
    }
}