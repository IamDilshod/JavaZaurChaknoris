package nested_inner_class;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("red", 2);
        System.out.println(car);
        Car.Engine engine = new Car("red", 23).new Engine(200);

    }
}

class Car {
    String color;
    int doorCount;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
         return "Car{" + "color='" + color + '\'' + ", doorCount=" + doorCount + ", engine=" + engine + '}';
    }

    public class Engine{
        int hoursePower;
        final static int a=83;
        private int year=2018;

        public Engine(int hoursePower){
            this.hoursePower=hoursePower;
        }

        @Override
        public String toString() {
            return "Engine{" + "hoursePower=" + hoursePower + '}';
        }
    }
}
