package _1_learn._1_2_oop._1_2_11_data_hiding;

class Person {
    private int age; // data hiding

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}

public class DataHiding {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(20);
        /* Error ! */
//        person.age = 30;
        System.out.println("Person age: " + person.getAge());
    }
}