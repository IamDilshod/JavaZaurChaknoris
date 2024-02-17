import java.util.stream.Stream;

public class PeekMethod {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,1,2,3);
        System.out.println(stream.distinct().peek(item -> {System.out.println(item);}).count());
    }
}
