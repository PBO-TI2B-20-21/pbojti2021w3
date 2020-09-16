package pbojs3;
public class AnggotaTugas {
    public String noKtp;
    public String nama;
    public int limitpinjam;
    public int jumlahPinjam;
    
//    AnggotaTugas(String noKtp, String nama,int limit){
//        this.noKtp = noKtp;
//        this.nama = nama;
//        this.limitpinjam = limit;
//        this.jumlahPinjam = 0;
//    }
    public void setnoKTP(String noKtp){
        this.noKtp=noKtp;
    }
    public String getnoKTP(){
        return noKtp;
    }
    public void setnama(String nama){
        this.nama=nama;
    }
    public String getnama(){
        return nama;
    }
    public int getlimit(){
        return limitpinjam;
    }
    public int getjumlahpinjam(){
        return jumlahPinjam;
    }
    public void Pinjaman(int pinjam){
        if (pinjam > limitpinjam) {
            System.out.println("Maaf,jumlah pinjaman melebihi limit");
        }
        else{
            jumlahPinjam += pinjam;
        }
    }
    public void angsuran(double angsur){
        jumlahPinjam-= angsur;
        
        if (angsur > (0.01*jumlahPinjam)) {
            System.out.println("Angsuran anda diterima");
        }
        else{
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
    }
    public void printstatus(){
        System.out.println("==KOPERASI SIMPAN PINJAM==");
        System.out.println("Nama Anggota : "+nama);
        System.out.println("Limit Pinjaman      : "+limitpinjam);
        System.out.println("Nominal yang tersisa dipinjam : "+jumlahPinjam);
    }
}
