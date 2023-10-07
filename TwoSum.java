import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TowSum {
    public static List<int[]> toSum(int[] arr) {
        Arrays.sort(arr);

        List<int[]> result = new ArrayList<>();
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            if (arr[i] + arr[j] == 0) {
                int[] pair = {arr[i], arr[j]};
                result.add(pair);
                i++;
                j--;
            } else if (arr[i] + arr[j] < 0) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -1, 3, -3, 5, -5, 6};
        List<int[]> pairs = toSum(arr);

        for (int[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}
