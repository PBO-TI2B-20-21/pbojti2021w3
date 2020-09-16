package Tugas;

/**
 *
 * @author Aulafz
 */
public class Anggota {

    public String nomorKtp, nama;
    public int LimitPinjaman, JumlahPinjaman;

    public Anggota(String nomorKtp, String nama, int LimitPinjaman) {
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.LimitPinjaman = LimitPinjaman;
        this.JumlahPinjaman = 0;
    }

    public String getNomorKtp() {
        return nomorKtp;
    }

    public void setNomorKtp(String nomorKtp) {
        this.nomorKtp = nomorKtp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return LimitPinjaman;
    }

    public void angsur(float uang) {
        if (uang < (0.1 * JumlahPinjaman)) {
            System.out.println("Maaf, angsuran minimal harus 10% dari jumlah pinjaman.");
        } else {
        JumlahPinjaman -= uang;
        }
    }

    public void pinjam(int uang) {
        if (uang > LimitPinjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            JumlahPinjaman += uang;
        }
        
    }

    public int getJumlahPinjaman() {
        return JumlahPinjaman;
    }
}
