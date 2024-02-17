import java.util.*;

public class MainOther {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("one");
        StringBuilder sb2 = new StringBuilder("two");
        StringBuilder sb3 = new StringBuilder("three");
        StringBuilder sb4 = new StringBuilder("four");

        StringBuilder[] stringBuilders = {sb1, sb2, sb3, sb4};

        List<StringBuilder> stringBuilderList = Arrays.asList(stringBuilders);
        System.out.println(stringBuilderList);

    }
}