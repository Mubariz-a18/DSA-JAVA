import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class ArrayListOfArray {
    static List<String[]> arrayList(String[]arrA,String[]arrB){

        List<String[]> arrayOfList = new ArrayList<>();
        arrayOfList.add(arrA);
        arrayOfList.add(arrB);
        return  arrayOfList;

    }
    public  static  void main(String[] args){
        String[] arrA = new String[]{"a","b"};
        String[] arrB = new String[]{"c","d"};
      List<String[]> newArrlist = arrayList(arrA, arrB);
      for(String[] arr: newArrlist){
          System.out.println(Arrays.toString(arr));
      }
    }
}
