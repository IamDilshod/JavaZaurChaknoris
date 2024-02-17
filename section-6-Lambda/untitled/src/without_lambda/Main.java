package without_lambda;

import java.util.ArrayList;

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
        return "without_lambda.Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
}

class StudentInfo{
    void printStudent(Student st){
        System.out.println(st.name + " " + st.sex + " " + st.age + " " + st.course + " " + st.avgGrade);
    }

    void printStudentsOverGrade(ArrayList<Student> list, double grade){
        for (Student s: list){
            if (s.avgGrade > grade){
                printStudent(s);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> list, int age){
        for (Student s: list){
            if (s.age > age){
                printStudent(s);
            }
        }
    }
}

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

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.printStudentsOverAge(list, 25);
        System.out.println("------------------");
        studentInfo.printStudentsOverGrade(list, 70);
    }
}
