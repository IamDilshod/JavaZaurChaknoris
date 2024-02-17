import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Animal> listAnimal = new ArrayList<>();
        listAnimal.add(new Animal("Animal"));
        List<Dog> listDog = new ArrayList<>();
        listDog.add(new Dog("Dog"));

        foo(listAnimal);
        foo(listDog);

    }

    public static void foo(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal.getName());
        }
    }
}

class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
}