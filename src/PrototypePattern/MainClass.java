package PrototypePattern;

public class MainClass {
    public static void main(String[] args) {
        Student student = new Student(24,3220,"Abc");
        Student clone = student.clone();
        System.out.println(clone.name);
        System.out.println(clone.age);
    }
}
