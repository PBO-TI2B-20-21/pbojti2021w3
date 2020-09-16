package pbojs3;
public class EncapTest {
    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(13);
        
        System.out.println("Name : " +encap.getName());
        System.out.println("Age : " +encap.getAge());
    }
}
