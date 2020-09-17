/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoperasiGetterSetter;
public class KoperasiDemo {
    public static void main(String[] args) {
        Anggota ang1=new Anggota("Iwan","Jalan Mawar");
        System.out.println("Simpanan "+ang1.getNama()+ " : Rp "+ang1.getSimpanan());
        ang1.setNama("Iwan Setiawan");
        ang1.setAlamat("Jalan Sukarno Hatta no 18");
        ang1.setor(100000);
        System.out.println("Simpanan "+ang1.getNama()+ " : Rp"+ang1.getSimpanan());
        
        ang1.pinjam(5000);
        System.out.println("Simpanan "+ang1.getNama()+ " : Rp"+ ang1.getSimpanan());
    }
}
