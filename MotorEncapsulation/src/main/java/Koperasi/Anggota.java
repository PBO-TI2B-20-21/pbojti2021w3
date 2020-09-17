/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koperasi;
public class Anggota {
    private String NIK;
    private String nama;
    private float limitPeminjaman;
    public float jumlahPinjaman;
    
    Anggota(String name, String no, float limitPinjam){
        this.NIK=no;
        this.nama=name;
        this.limitPeminjaman=limitPinjam;
        this.jumlahPinjaman=0;
    }
    
    public String getNama(){
        return nama;
    }
    
    public float getLimitPeminjaman(){
        return limitPeminjaman;
    }
    
    public float getJumlahPeminjaman(){
        return jumlahPinjaman;
    }
    
    public void pinjam(float jumlahPinjam){
        if(limitPeminjaman>jumlahPinjaman){
            this.jumlahPinjaman+=jumlahPinjaman;
            limitPeminjaman-=jumlahPinjaman;
        }
        else{
            System.out.println("Peminjaman Melebihi Limit");
        }
    }
    
    public void angsuran(float angsuran){
        double minimalAngsuran=jumlahPinjaman*0.1;
        if(angsuran>minimalAngsuran){
            jumlahPinjaman-=angsuran;
        }
        else{
            System.out.println("Maaf Angsuran Harus 10% dari Jumlah Pinjaman");
        }
    }
}
