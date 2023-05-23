package leetcode;

public class maxNumVowel {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k =3;

        System.out.println(maxVowels(s,k));
    }

    public static int maxVowels(String s, int k) {
        int count=0;
        int n = s.length();
        int max =0;
        int i =0;
        int j = 0;

        while(j<k){
            if(s.charAt(j)=='a' || s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u' ){
                count++;
            }
            j++;
        }
        max = count;


        while(i<n-k){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' ||s.charAt(i)=='o' ||s.charAt(i)=='u'){
                count--;
            }

            if(s.charAt(j)=='a' || s.charAt(j)=='e' ||s.charAt(j)=='i' ||s.charAt(j)=='o' ||s.charAt(j)=='u' ){
                count++;
            }
            max = Math.max(count,max);
            i++;
            j++;
        }

        return max;
    }
}
