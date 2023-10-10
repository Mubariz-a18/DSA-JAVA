import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test {



        public static void main(String[] args) {
//            List<Integer> originalList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//            System.out.println(originalList);
//            int k = 3;
//
//            rotateListLeftInPlace(originalList, k);
//
//            // Print the rotated list
//            System.out.println(originalList);

//                List<Integer> ar1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//                int n1 = ar1.size();
//                int k1 = 3;
//                int pairCount1 = divisibleSumPairs(n1, k1, ar1);
//                System.out.println("Test Case 1: " + pairCount1);
//
//                // Test Case 2
//                List<Integer> ar2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
//                int n2 = ar2.size();
//                int k2 = 2;
//                int pairCount2 = divisibleSumPairs(n2, k2, ar2);
//                System.out.println("Test Case 2: " + pairCount2);
//
//                // Test Case 3
//                List<Integer> ar3 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
//                int n3 = ar3.size();
//                int k3 = 5;
//                int pairCount3 = divisibleSumPairs(n3, k3, ar3);
//                System.out.println("Test Case 3: " + pairCount3);
//
//                // Test Case 4
//                List<Integer> ar4 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
//                int n4 = ar4.size();
//                int k4 = 5;
//                int pairCount4 = divisibleSumPairs(n4, k4, ar4);
//                System.out.println("Test Case 4: " + pairCount4);
//
//                // Test Case 5
//                List<Integer> ar5 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
//                int n5 = ar5.size();
//                int k5 = 10;
//                int pairCount5 = divisibleSumPairs(n5, k5, ar5);
//                System.out.println("Test Case 5: " + pairCount5);

        int count = divisors(16);
                System.out.println(count);

        }

//        public static void rotateListLeftInPlace(List<Integer> list, int k) {
//            int n = list.size();
//            k = k % n;
//
//            // Reverse the first k elements
//            reverseList(list, 0, k - 1);
//
//            // Reverse the remaining n - k elements
//            reverseList(list, k, n - 1);
//
//            // Reverse the entire list
//            reverseList(list, 0, n - 1);
//        }
//
//        public static void reverseList(List<Integer> list, int start, int end) {
//            while (start < end) {
//                Collections.swap(list, start, end);
//                start++;
//                end--;
//            }
//        }

//        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
//                int PairCount = 0;
//                int p1 = 0;
//                int p2 = 1;
//                while (p1 < n-1) {
//                        if ((ar.get(p1) + ar.get(p2)) % k == 0) {
//                                PairCount++;
//                        }
//                        p2++;
//                        if (p2 == n) {
//                                p1++;
//                                p2 = p1 + 1;
//                        }
//                }
//                return PairCount;
//        }


        public static int divisors(int n) {
                int divisorsCount = 0;
                int SqRtOfN = (int) Math.sqrt(n);
                for(int i = 1;i<=SqRtOfN;i++){
                        if(n % i == 0){
                                if(i % 2 == 0){
                                        divisorsCount++;
                                }
                                int otherDivisior = n / i;
                                if(otherDivisior != i && otherDivisior % 2 == 0){
                                        divisorsCount++;
                                }
                        }
                }
                return divisorsCount;
        }

}
