/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;
public class Anggota {
   
private String    Ktp;
 private String nama;
private  int limit;
private int angsur;
private int pinjam;
private int simpan;
Anggota(String ktp, String nama, int limit){
        this.Ktp=ktp;
        this.nama=nama;
        this.limit=limit;
    }
    
    void setNama(String nama){
        this.nama = nama;
    }
    
    void setKTP(String ktp){
        this.Ktp = ktp;
    }
    
    void setLimit(int limit){
        this.limit=limit;
    }
   void setPinjam(int pinjam){
   this.pinjam=pinjam;
   } 
   
void setAngsur(int angsur){
this.angsur=angsur;
}    
    String getNama(){
        return nama;
    }
    
    String getKTP(){
        return Ktp;
    }
    
    int getLimit(){
        return limit;
    }
    public float getSimpanan(){
return simpan;
}
   public void setor(int uang){
simpan -=uang;
}
public void pinjam(int uang){
 simpan +=uang;   
}
}