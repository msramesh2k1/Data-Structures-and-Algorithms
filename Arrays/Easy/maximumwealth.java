import java.util.Arrays;

public class maximumwealth {
    public static void main(String args[]) {
        int[][] arr = { { 1, 4, 3 }, { 3, 2, 1 } };
        int result = 0;

        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];

            }

            result = Math.max(sum, result);

        }
        System.out.print(result);

    }
}