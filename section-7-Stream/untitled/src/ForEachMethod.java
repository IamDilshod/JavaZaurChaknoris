import java.util.Arrays;

public class ForEachMethod {
    public static void main(String[] args) {
        int arr[] =new int[]{1,2,4,5,6};

        Arrays.stream(arr).forEach(item -> {
            item *= 10;
            System.out.println(item); // [10,20,40,50,60]
        });
    }
}

