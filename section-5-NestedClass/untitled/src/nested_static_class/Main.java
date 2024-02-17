package nested_static_class;

public class Main {
    public static void main(String[] args) {
        Car.Engine carEngine = new Car.Engine(1589);
        System.out.println(carEngine);

        Car car = new Car("red", 2, carEngine);
        System.out.println(car);
    }
}

class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" + "color='" + color + '\'' + ", doorCount=" + doorCount + ", engine=" + engine + '}';
    }

     public static class Engine{
        int hoursePower;

        public Engine(int hoursePower){
            this.hoursePower=hoursePower;
        }

        @Override
        public String toString() {
            return "Engine{" + "hoursePower=" + hoursePower + '}';
        }
    }
}

class A extends Car.Engine{
    A(){
        super(98);
    }
}
