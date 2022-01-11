import java.util.Arrays;

public class concatenationarray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 1 };
        int result[] = new int[arr.length * 2];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
            result[i + arr.length] = arr[i];

        }
        System.out.println(Arrays.toString(result));

    }
}
