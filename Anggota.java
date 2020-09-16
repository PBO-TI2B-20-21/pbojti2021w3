/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasigettersetter;

/**
 *
 * @author Bedman
 */
public class Anggota {
    private String Nama;
    private int NIK ;
    private int pinjam = 0,pinjam1;
    private int limit;
   
    Anggota(){
        
    }
    Anggota(int nik,String nama,int limit){
        this.NIK=nik;
        Nama=nama;
        this.limit=limit;
    }
    public void setNik(int nik){
        this.NIK=nik;
    }
     public void setNama(String nama){
        Nama=nama;
    }
    public String getNama(){
        return Nama;
    }
    public int getNik(){
       return NIK;
    }
    public void setUtang(int utang){
        pinjam+=utang;
    }
    public int getUtang(){
        return pinjam;
    }
    public int getLimit(){
        return limit;
    }
    public void setor(float uang){
        pinjam-=uang;
    }
     
}
