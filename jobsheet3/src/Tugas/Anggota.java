package Tugas;

public class Anggota {
    private int noKTP;
    private String nama;
    private int limit = 5000000;
    private int jumlahPinjam;

    Anggota(int noKTP, String nama, int limit) {
        this.nama = nama;
        this.noKTP = noKTP;

    }

    public String getNama() {
        return nama;
    }

    public int getNoKTP() {
        return noKTP;
    }

    public void setLimitPinjam(int limit) {
        this.limit = limit;
    }

    public int getLimitPinjam() {
        return limit;

    }

    public int getJumlahPinjaman() {
        return jumlahPinjam;
    }

    public int pinjam(int pinjam) {
        if (pinjam <= limit) {
            jumlahPinjam += pinjam;
        } else {
            System.out.println("Maaf, jumlah pinjaman limit");
        }
        return jumlahPinjam;
    }

    public void angsur(int angsur) {
        if (angsur > (0.1 * jumlahPinjam)) {
            System.out.println("Angsuran anda diterima");
            jumlahPinjam -= angsur;
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        }
}
}