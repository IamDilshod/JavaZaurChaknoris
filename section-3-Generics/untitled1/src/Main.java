public class Main {
    public static void main(String[] args) {
        Info<Integer> i = new Info<>(2);
        System.out.println(i.getValue());

        Info<String> s = new Info<>("hello");
        System.out.println(s.getValue());
    }
}

class Info<T>{
    private T value;

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
