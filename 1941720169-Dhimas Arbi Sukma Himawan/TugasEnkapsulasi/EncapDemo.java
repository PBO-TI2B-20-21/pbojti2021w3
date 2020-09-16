package TugasEnkapsulasi;

/**
 *
 * @author Dhimas Arbi
 */
public class EncapDemo {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        if (newAge >= 18 && newAge <= 30) {
            if (newAge > 30) {
                age = 30;
            } else {
                age = newAge;
            }
        }else{
            System.out.println("Maaf umur Anda tidak sesuai dengan batas umur yang telah ditentukan!! \n");
        }
    }
}
