import java.util.Arrays;

class buildArray {
    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 1, 0 };

        int result[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr[i]];

        }
        System.out.println(Arrays.toString(result));

    }

}