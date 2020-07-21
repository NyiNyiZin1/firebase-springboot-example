package firebase.example.springboot.pojo;

/**
 * @author NyiNyiZin
 * @date Jul 16, 2020
 * @time 3:21:14 PM
 */
public class Patient {

    private String name;

    private int age;

    private String city;


    public Patient(String name, int age, String city) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
