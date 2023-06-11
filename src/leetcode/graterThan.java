package leetcode;

public class graterThan {
    public static void main(String[] args) {
        char[] letters = {'c', 'f','j'};
        char target = 'c';

        System.out.println(nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int[] key = new int[n];


        for(int i = 0;i<n;i++){
            key[i] = (int)letters[i];
        }

        int targetInt = (int)target;

        int l =0;
        int r = n-1;

        while(l<=r){
            int mid = l + (r-l)/2;

            if(key[mid]<=targetInt){
                l = mid +1;
            }
            else if(key[mid]>targetInt){
                r = mid-1;
            }

        }

        return letters[l];
    }
}
