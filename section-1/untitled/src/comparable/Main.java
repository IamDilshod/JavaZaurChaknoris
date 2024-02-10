package comparable;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 2300);
        Employee emp2 = new Employee(182, "Ivan", "Petrov", 4800);
        Employee emp3 = new Employee(123, "Ivan", "Sidirov", 1500);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}

class Employee  {
    Integer id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee { " +id +" "+ name + " "+ surname +" "+ salary + " }";
    }
}

class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.id-emp2.id;
    }
}

class NameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return  emp1.name.compareTo(emp2.name);
    }
}