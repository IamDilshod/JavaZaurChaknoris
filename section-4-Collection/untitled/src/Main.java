import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list1 = new ArrayList<>();
        Student st1 = new Student("Ali", 34);
        Student st2 = new Student("Vali", 24);

        Student st3 = new Student("Vali", 24);
        list1.add(st1);
        list1.add(st2);
        System.out.println(list1.indexOf(st3));
    }
}

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        Student student = (Student) obj;
        return student.age == this.age && student.name.equals(this.name);
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}




