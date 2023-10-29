public class Map01 {
    public static void main(String[] args){
//       int[] arr = new int[]{7,4,4,6,5,3,4,3,0,0};
//        frequencyPositiveInt(arr);

        int[] arr2 = new int []{-2,-2,3,-3,9,0,0,8,-8,-6};
        frequencyPostiveAndNegetive(arr2);
    }

//    constraints (0<n<10^9) (0<a[i]<9)
    static void frequencyPositiveInt(int[] arr){
        int[] map = new int[10];
        for (int i = 0; i<arr.length;i++){
            map[arr[i]] = map[arr[i]]+1;
        }
        for(int i = 0; i<10 ; i++){
            if(map[i]!=0){
                System.out.println(i+" : " + map[i]);
            }
        }
    };

    static void frequencyPostiveAndNegetive(int[]arr){
        int[] map = new int[20];
        for (int i = 0;i<arr.length;i++){
            map[arr[i]+10] = map[arr[i]+10]+1;
        }

        for (int i = 0;i<20;i++){
            if(map[i]!=0){
                System.out.println( i-10+" : "+ (map[i]));
            }
        }
    }

}
