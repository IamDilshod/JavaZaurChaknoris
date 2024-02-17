import java.util.stream.Stream;

public class ConcatMethod {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,1,2,3);
        System.out.println(stream.count()); // 9

        System.out.println(stream.distinct().count());
    }
}


