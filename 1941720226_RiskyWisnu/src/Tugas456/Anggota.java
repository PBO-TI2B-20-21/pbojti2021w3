/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas456;

/**
 *
 * @author Risky
 */
public class Anggota {
    private String noKTP;
    private String nama;
    private float limitPeminjaman;
    public float jumlahPinjam;
    
    Anggota(String nk,String na,float lp){
        this.noKTP = nk;
        this.nama = na;
        this.limitPeminjaman = lp;
        this.jumlahPinjam = 0;
    }
    public String getNama(){
        return nama;
    }
    public float getLimitPeminjaman(){
        return limitPeminjaman;
    }
    public float getJumlahPinjam(){
        return jumlahPinjam;
    }
    public void pinjam(float jumlahPinjam){
        if(limitPeminjaman > jumlahPinjam){
            this.jumlahPinjam += jumlahPinjam;
            limitPeminjaman -= jumlahPinjam;
        }else{
            System.out.println("Maaf,jumlah peminjaman melebihi limit.");
        }
    }
    public void angsur(float angsur){
        double minimalAgs = jumlahPinjam * 0.1;
        if(angsur > minimalAgs){
             jumlahPinjam -=angsur;
        }else{
            System.out.println("Maaf,angsuran harus 10% dari jumlah pinjaman”.");
        }
    }
}
