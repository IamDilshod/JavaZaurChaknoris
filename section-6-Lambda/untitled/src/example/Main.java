package example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Alex", 'm', 24, 3, 78.98);
        Student st2 = new Student("Felix", 'm', 18, 1, 59.52);
        Student st3 = new Student("Helena", 'f', 20, 3, 85.43);
        Student st4 = new Student("Lisa", 'f', 27, 4, 90.34);
        Student st5 = new Student("Fernand", 'm', 31, 2, 67.35);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        Info info = student -> student.age<30;

        for (Student student:list){
            if (info.check(student)){
                printStudent(student);
            }
        }

    }

        public static void foo(I i, String s){
            System.out.println(i.len(s));
        }

    static void printStudent(Student st){
        System.out.println(st.name + " " + st.sex + " " + st.age + " " + st.course + " " + st.avgGrade);
    }
}

class Student{
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

@FunctionalInterface
interface Info{
    boolean check(Student student);
}


interface I{
    int len(String s);
}