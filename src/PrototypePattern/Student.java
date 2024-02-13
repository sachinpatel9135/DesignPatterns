package PrototypePattern;

public class Student implements Prototype{
    int age;
    private final int rollNumber;
    String name;

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Student clone() {
        return new Student(age, rollNumber, name);
    }
}
