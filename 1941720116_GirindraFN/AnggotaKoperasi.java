package Tugas;

public class AnggotaKoperasi {
    public String noKtp;
    public String nama;
    public int limitPinjam;
    public int jumlahPinjam;
    
//    AnggotaKoperasi(String noKtp, String nama,int limit){
//        this.noKtp = noKtp;
//        this.nama = nama;
//        this.limitPinjam = limit;
//        this.jumlahPinjam = 0;
//    }
    public void setNoKTP(String noKtp){
        this.noKtp=noKtp;
    }
    public String getNoKTP(){
        return noKtp;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjam;
    }
    public int getJumlahPinjam(){
        return jumlahPinjam;
    }
    public void Pinjaman(int pinjam){
        if (pinjam > limitPinjam) {
            System.out.println("Maaf,jumlah pinjaman melebihi limit");
        }
        else{
            jumlahPinjam += pinjam;
        }
    }
    public void angsuran(int angsur){
        jumlahPinjam -= angsur;
        
        if(angsur > (0.01*jumlahPinjam)){
            System.out.println("angsuran anda diterima");
        }else {
            System.out.println("Maaf.. angsuran harus 10% dari jumlah pinjaman");
        }
    }
    public void printBukti(){
        System.out.println("Nama Anggota                  : " + nama);
        System.out.println("Limit Pinjaman                : " + limitPinjam);
        System.out.println("Nominal yang tersisa dipinjam : " + jumlahPinjam);
    }
}
