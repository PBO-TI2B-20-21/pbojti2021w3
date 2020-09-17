/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encap;
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encp=new EncapDemo();
        encp.setName("James");
        encp.setAge(35);
        
        System.out.println("Name : "+encp.getName());
        System.out.println("Age : "+encp.getAge());
        
        EncapDemo enc = new EncapDemo();
        enc.setName("Ferguso");
        enc.setAge(17);
        
        System.out.println("Name : "+enc.getName());
        System.out.println("Age : "+enc.getAge());
    }
}
