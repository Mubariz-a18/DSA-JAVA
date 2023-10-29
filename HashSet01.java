import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSet01 {
    public static void main(String[] args){

        int [] arr = new int[]{1,2,11,12,1,2,1,3,4,5};
        Boolean isHasvingDuplicates = duplicates(arr);
        System.out.println((isHasvingDuplicates));

        Map<Integer,Integer> newMap = frequency(arr);
        for (Map.Entry<Integer, Integer> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static boolean duplicates(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ;i<arr.length; i++){
            if (!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else return  true;
        }
        return  false;
    }

    static Map<Integer,Integer> frequency(int[]arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int f = map.get(arr[i]);
                map.put(arr[i],f+1);
            }else{
                map.put(arr[i],1);
            }
        }
        return  map;
    }
}
