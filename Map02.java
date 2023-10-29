public class Map02 {
    public static void main(String[] args){
        duplicates(new int[]{1,1,2,3});
        frequencyOfChars("hellooworld");
    }

    static void duplicates(int[] arr){
        boolean[] seen = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (seen[arr[i]]) {
                System.out.println(arr[i]); // Print the duplicate element
            }
            seen[arr[i]] = true;
        }
    }

    static void frequencyOfChars(String str){
        int[] map = new int[26];
        for(int i = 0 ;i<str.length();i++){
            char ch = str.charAt(i);
            map[ch-97]= map[ch-97]+1;

        }
        for (int i = 0;i<26;i++){
            if(map[i] != 0){
                System.out.println((char) (97 + i) + " : " + map[i]);
            }
        }
    }
}
