package pl.pp;

public class Person {
    public String name;
    public int age;
    // New fields added for Task 2
    public String address;
    public int year_of_birth;

    public Person(String name, int age, String address, int year_of_birth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.year_of_birth = year_of_birth;
    }

    // Modified method to increase age by given value
    public void growOld(int years) {
        this.age += years;
    }

    // New method to decrease age by 1
    public void beYounger() {
        this.age -= 1;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Year of Birth: " + year_of_birth);
    }
}
