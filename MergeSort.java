import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] arr, int low, int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    //writing the merge code piece
    static void merge(int[] arr, int low, int mid, int high){

        int i = low;
        int j = mid+1;
        int k = 0;
        int[] result = new int[high-low+1];
        while(i <= mid && j <= high){
            if(arr[i]<=arr[j]){
                result[k++] = arr[i++];
            }else{
                result[k++] = arr[j++];
            }
        }
        while(i <= mid){
            result[k++] = arr[i++];
        }
        while(j <= high){
            result[k++] = arr[j++];
        }
        for(int l=0; l<result.length;l++){
            arr[low+l] = result[l];
        }
    }

    public static void main(String[] args){
      int[] arr =   new int[]{2,4,1,0,6,3};
       mergeSort(arr,0,5);
        System.out.println(Arrays.toString(arr) );
    }

}