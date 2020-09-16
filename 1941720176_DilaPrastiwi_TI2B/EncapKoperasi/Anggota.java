/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapkoperasi;

/**
 *
 * @author WINDOWS 10
 */
public class Anggota {

    private String nama, noKtp;
    private int limit, pinjaman;

    Anggota(String noKtp, String nama, int limit) {
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
        pinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjam() {
        return limit;
    }

    public void pinjam(int pinjaman) {
        if (limit > pinjaman) {
            this.pinjaman += pinjaman;
            limit -= pinjaman;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit!\n");
        }
    }

    public int getJumlahPinjaman() {
        return pinjaman;
    }

    public void angsur(int angsur) {
        double minimum = pinjaman * 0.1;
        if (angsur > (int)minimum) {
            pinjaman -= angsur;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari humlah pijaman");
        }
    }
}
