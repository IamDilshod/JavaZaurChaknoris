import java.util.Arrays;

public class SortedMethod {
    public static void main(String[] args) {
        int arr[] = new int[]{3,6,1,89,43,78,234,178};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr)); // [1, 3, 6, 43, 78, 89, 178, 234]
    }
}
