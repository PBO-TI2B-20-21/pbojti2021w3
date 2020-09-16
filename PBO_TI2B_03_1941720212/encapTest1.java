/**
 * encapTest1
 */
public class encapTest1 {

    public static void main(String[] args) {
        encapDemo1 encap = new encapDemo1();
        encap.setName("Dobleh");
        encap.setAge(19);
        
        System.out.println("Name : "+encap.getName());
        System.out.println("Age : "+encap.getAge());
    }
}