import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        Option<Integer> integerOption = new Option<>(34);
        System.out.println(integerOption.getVal());

        Option<String> stringOption = new Option<String>("hello");
        System.out.println(stringOption.getVal());

        Option<Double> doubleOption = new Option<Double>(26.34);
        System.out.println(doubleOption.getVal());

    }
}

class Option<T extends Number> {
    private T val;

    Option(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}