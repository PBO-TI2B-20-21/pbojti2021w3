public class Anggota {

    public String noKTP;
    public String nama;
    public int limitPeminjaman;
    public int jumlahPinjaman;

    Anggota(String noKTP, String nama, int limitPinjaman) {
        this.nama = nama;
        this.noKTP = noKTP;
        this.limitPeminjaman = 5000000;
        this.jumlahPinjaman = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setnoKTP(String noKTP) {
        this.noKTP = noKTP;
    }

    public String getNama() {
        return nama = nama;
    }

    public String getnoKTP() {
        return noKTP = noKTP;
    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public int pinjam(int uang) {
        if (uang > 5000000) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
            return jumlahPinjaman;
        }
        return jumlahPinjaman += uang;
    }
    public void angsur(int uang){
        jumlahPinjaman -= uang;
    }

}
