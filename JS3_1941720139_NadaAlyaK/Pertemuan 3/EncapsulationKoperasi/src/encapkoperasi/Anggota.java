/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapkoperasi;

/**
 *
 * @author Nada Alya
 */
public class Anggota {

    private String noKTP, nama;
    private int limit, pinjaman;

    Anggota(String noKTP, String nama, int limit) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limit = limit;
        pinjaman = 0;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
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
        if (angsur > (int) minimum) {
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman!");
        }
    }
}
