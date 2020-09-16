/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author hp
 */
public class Anggota {

    private String noKTP;
    private String nama;
    private float limitPeminjaman;
    public float jmlPinjam;

    Anggota(String no, String nm, float lp) {
        this.noKTP = no;
        this.nama = nm;
        this.limitPeminjaman = lp;
        this.jmlPinjam = 0;
    }

    public String getNama() {
        return nama;
    }

    public float getLimitPinjaman() {
        return limitPeminjaman;
    }

    public float getJmlPinjaman() {
        return jmlPinjam;
    }

    public void pinjam(float jmlPinjam) {
        if (limitPeminjaman > jmlPinjam) {
            this.jmlPinjam += jmlPinjam;
            limitPeminjaman -= jmlPinjam;
        } else {
            System.out.println("Maaf, Pinjaman melebihi limit.");
        }
    }

    public void angsur(float angsur) {
        double minAngsur = jmlPinjam * 0.1;
        if (angsur > minAngsur) {
            jmlPinjam -= angsur;

        } else {
            System.out.println("Maaf, Angsuran minimal 10% dari jumlah pinjaman");
        }
    }
}