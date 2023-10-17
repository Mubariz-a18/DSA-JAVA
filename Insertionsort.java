import java.util.Arrays;

public class Insertionsort {

    static  void insertionsort(int[]arr){
           int n = arr.length;
           int p = 0;
           while( p < n-1 ){
               if(arr[p]>arr[p+1]){
                   int i = p + 1;
                   while(i > 0 && arr[i]<arr[i-1]){
                           int temp = arr[i];
                           arr[i] = arr[i - 1];
                           arr[i - 1] = temp;
                           i--;
                   }
               }
               p++;
           }
           System.out.println(Arrays.toString(arr));
    }
    public static  void main(String[] args){
        int[] arr = new int[]{3, 1, -1, 0, 4,9,7};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
