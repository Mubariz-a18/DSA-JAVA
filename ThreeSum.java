import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args){
        List<Integer>ListOfNums = Arrays.asList(0,2,2,3,4,1);
        int k = 8;
        List<int[]> listOfList = threeSum(ListOfNums,k);

        for(int[] comb: listOfList){
            System.out.println(Arrays.toString(comb));
        }
    }
    static List< int[] > threeSum(List<Integer>arr, int k){
        Collections.sort(arr);
        int n = arr.size();
        int p1 = 0;
        List<int[]> ListOFCombinations = new ArrayList<>(n);
        while(p1<n-2){
            int p2 = p1+1;
            int p3 = n-1;
            while(p2<p3){
                int sum = arr.get(p1) + arr.get(p2) + arr.get(p3);
                if(sum == k){
                    int[] combination = new int[]{ arr.get(p1) , arr.get(p2) , arr.get(p3)};
                    ListOFCombinations.add(combination);
                    p2++;
                    p3--;
                }else if (sum < k){
                    p2++;
                }else{
                    p3--;
                }
            }

            p1++;
        }
        return ListOFCombinations;
    }
}
