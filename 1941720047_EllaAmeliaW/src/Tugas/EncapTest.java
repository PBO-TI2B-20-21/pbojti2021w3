/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author ASUS
 */
public class EncapTest {
     public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("Devi");
        encap.setAge(35);
        
        System.out.println("Name : "+ encap.getName());
        System.out.println("Age  : "+ encap.getAge());
        
        EncapDemo encap1 = new EncapDemo();
        encap1.setName("Rofiq");
        encap1.setAge(13);
        
        System.out.println("Name : "+ encap1.getName());
        System.out.println("Age  : "+ encap1.getAge());
        
        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Feri");
        encap2.setAge(22);
        
        System.out.println("Name : "+ encap2.getName());
        System.out.println("Age  : "+ encap2.getAge());
    }
}
