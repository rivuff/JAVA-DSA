package leetcode;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int m = Integer.MAX_VALUE;
        String str = strs[0];
        String ans= "";

        for(int i =0;i<n;i++){
            m = Math.min(strs[i].length(), m);
        }

        for(int i =1;i<n;i++){
            for(int j = 0;j<m;j++){
                if(str.charAt(j)== strs[i].charAt(j)){
                    ans = ans + str.charAt(j);
                }
                else{
                    break;
                }
            }
            if(ans==""){
                break;
            }
            str = ans;
            if(i!=n-1){
                ans = "";
            }

            m = str.length();
        }


        return ans;

    }
}
