import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();
//        List<? extends  Number> list = new ArrayList<>();
        list.add(23);
        list.add(45.09);

        foo(list);
    }

    public static void foo(List<? extends Number> al) {
        for (Number num : al) {
            System.out.println(num);
        }
    }
}
