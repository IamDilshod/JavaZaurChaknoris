import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        al.add("i");
        al.add("f");
        al.add("d");
        al.add("a");
        System.out.println("Before sorting");
        System.out.println(al);
        System.out.println("After sorting");
        Collections.sort(al);
        System.out.println(al);
    }
}