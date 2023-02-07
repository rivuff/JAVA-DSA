package DynamicProgramming;

public class minimumNumberOfDeletionAndInsertion {
    public static void main(String[] args) {
        String str1 = "fcd";
        String str2 = "headbgfbb";

        System.out.println(minOperations(str1,str2));
    }

    static int minOperations(String str1, String str2)
    {
        // Your code goes here

        int n = str1.length();
        int m = str2.length();

        int count = 0;
        if (n>m){
            count+=n-m;
        }

        for (int i = 0; i < m; i++) {
            if(i>=n){
                count++;
            }
            else if(str1.charAt(i)!=str2.charAt(i)){
                count+=2;
            }
            else continue;
        }
        return count;
    }
}
