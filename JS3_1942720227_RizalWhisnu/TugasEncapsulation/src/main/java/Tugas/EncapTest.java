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
public class EncapTest {

    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("Rizal");
        encap.setAge(31);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());

        EncapDemo encap1 = new EncapDemo();
        encap1.setName("Hanin");
        encap1.setAge(17);

        System.out.println("Name : " + encap1.getName());
        System.out.println("Age : " + encap1.getAge());

        EncapDemo encap2 = new EncapDemo();
        encap2.setName("Nesa");
        encap2.setAge(22);

        System.out.println("Name : " + encap2.getName());
        System.out.println("Age : " + encap2.getAge());
    }
}