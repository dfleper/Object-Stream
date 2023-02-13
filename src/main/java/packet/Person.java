package packet;
//@author Domingo 2013_02_13

import java.io.Serializable;

public class Person implements Serializable {

    String name;
    String city;
    int age;

    public Person(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void showPerson() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
