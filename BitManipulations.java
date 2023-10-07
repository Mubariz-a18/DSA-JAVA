public class BitManipulations {
    public static void main(String[] args){
//            System.out.println(countBits(23));
        int[] arr = new int[]{
                1,1,3,4,4,5
        };
        System.out.println(findNonRepeatingNum(arr));
    }

//    static int countBits(int x){
//        int count = 0;
////        for (int i = 1;i<=32;i++){
////            if(((1<<i)& x) != 0){
////                count++;
////            }
////        }
//        while (x > 0) {
//            // Use bitwise AND to check if the least significant bit is set (1)
//            // If it is, increment the count
//            count += x & 1;
//
//            // Right shift the number to check the next bit
//            x <<= 1;
//        }
//
//        return  count;
//    }

    static int findNonRepeatingNum(int[] arr){
        int res = 0;
        for (int i =0;i<arr.length;i++){
            res = res^arr[i];
        }
        return res;
    }
}
