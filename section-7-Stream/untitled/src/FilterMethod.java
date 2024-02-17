import java.util.*;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Alex", 24, 3, 78.98);
        Student st2 = new Student("Felix", 18, 1, 59.52);
        Student st3 = new Student("Helena",20, 3, 85.43);
        Student st4 = new Student("Lisa",27, 4, 90.34);
        Student st5 = new Student("Fernand",31, 2, 67.35);

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        List<Student> filteredList = list.stream().filter(l -> l.age > 25 && l.course< 3).collect(Collectors.toList());
        System.out.println(filteredList); // [Student{ name='Fernand', age=31, course=2, avgGrade=67.35 }]
    }
}

class Student{
    String name;
    int age;
    int course;
    double avgGrade;

    public Student(String name, int age, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{ " + "name='" + name + '\'' +", age=" + age + ", course=" + course +", avgGrade=" + avgGrade + " }";
    }
}

