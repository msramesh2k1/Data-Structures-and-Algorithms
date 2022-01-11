import java.util.Arrays;

public class suffleArray {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8, 9 };

        int finalarr[] = new int[arr.length];

        int k = 0;
        for (int i = 0; i < arr.length / 2; i++) {

            finalarr[k++] = arr[i];
            finalarr[k++] = arr[i + arr.length / 2];

        }
        System.out.println(Arrays.toString(finalarr));
    }

}
