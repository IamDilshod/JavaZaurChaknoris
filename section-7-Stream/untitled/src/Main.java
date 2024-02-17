import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int arr[] =new int[]{1,2,4,5,6};
        int arr2 [] = Arrays.stream(arr).map(item -> item *2).toArray();

        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]); // [1,2,4,5,6]
        }

        System.out.println("--------");
        for (int i=0; i< arr2.length; i++){
            System.out.println(arr2[i]); // [2,4,8,10,12]
        }

    }
}

