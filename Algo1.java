public class Algo1 {
    public static void main(String[] args){
        /*
        * Find the factors of n
        * Find the number of factors of n
        * Find the GCD of a,b
        * Find the lcm of a,b
        * Find the sum of Digits
        * Find the sum of Numbers till n
        * */



    // ___________________________________________//

//        int n = 25;
//        int count = countFactors(n);
//        System.out.println(count);

    // ___________________________________________//

//        factors(n);

    // ___________________________________________//

//        int sum = sumOfDigits(12345);
//        System.out.println(sum);

     // ___________________________________________//

//     int sum = sumOfDigitTillN( 10);
//     System.out.println(sum);

       // ___________________________________________//

//      int gcd = GCD(12,6);
//      System.out.println(gcd);

        // ___________________________________________//

//        int lcm = lcm(20,6);
//        System.out.println(lcm);

    }


    static void factors(int n ){
        int upper =(int) Math.sqrt(n);
         for (int i = 1;i<= upper;i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
        System.out.println(n);

    };


    static int countFactors(int n){
        int upper = (int) Math.sqrt(n);
        int count = 0;
        for(int i = 1;i<= upper;i++){
            if(n % i == 0){
                count = count + 2;
            }
        }

        return upper * upper == n ? count -1 : count;
    }


    static  int sumOfDigits(int n){
        int sum = 0;
        int digit;
        while (n > 0){
             digit = n %10;
            sum = sum +  digit;
            n = n/10;

        }

        return sum;
    }


    static  int sumOfDigitTillN(int n){
        return (n* (n+1)) /2;
    }


     public static int GCD(int a, int b) {
         int temp;
         if (b > a) {
             temp = b;
             b = a;
             a = temp;
         }

         // Ensure b is non-negative
         b = Math.abs(b);

         while (b != 0) {
             int remainder = a % b;
             a = b;
             b = remainder;
         }
             return a;
     }

     public static int lcm(int a , int b){
        int gcd = GCD(a,b);
        return  (a * b)/gcd;
     }
}
