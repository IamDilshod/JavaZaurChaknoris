public class Test2 {
    public static void main(String[] args) {
//        Other<String> stringOther = new Other<String>("hello");
//        System.out.println(stringOther.getVal());

        Other<Integer> integerOther = new Other<>(45);
        System.out.println(integerOther.getVal());
    }
}

class Other<T extends Number> {
    private T val;

    public Other(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}
