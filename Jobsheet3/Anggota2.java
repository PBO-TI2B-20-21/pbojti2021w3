/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet3;
public class Anggota2 {
    private String noKTP;
    private String nama;
    private int limitPinjam=5000000;
    private int jumlahPinjam;
    private int pinjam;
    
    Anggota2 (String noKTP, String nama, int limitPinjam){
        this.nama = nama;
        this.noKTP = noKTP;
    }
    public String getnoKTP(){
        return noKTP;
    }
    public String getNama(){
        return nama;
    }
    public int getlimitPinjam(){ 
            return limitPinjam;
   }
    public int getjumlahPinjam(){       
         return jumlahPinjam;
    }
    public int pinjam(float uang){
        if(pinjam<= limitPinjam){
            jumlahPinjam +=uang;
        } else {
          System.out.println("Maaf, jumlah pinjaman melebihi limit");   
        } 
        return jumlahPinjam;
    }
    public int angsur(float uang){
        jumlahPinjam -=uang;
        if(uang>(0.01*jumlahPinjam)){
            System.out.println("Angsuran anda diterima");
        } else {
            System.out.println("Maaf angsuran harus 10% dari jumlah pinjaman");
        } return jumlahPinjam;
    }
}
