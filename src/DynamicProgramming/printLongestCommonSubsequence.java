package DynamicProgramming;

public class printLongestCommonSubsequence {
    public static void main(String[] args) {
        String s1= "abcde";
        String s2= "bdgek";


    }

    static void lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n+1][m+1];

        for(int i =0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i =0;i<=m;i++){
            dp[0][i]=0;
        }


        for(int i =1;i<=n;i++){
            for (int j = 1; j <=m; j++) {
                if(s1.charAt(i-1)==s2.charAt(i)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }

        int len = dp[n][m];
        int i = n;
        int j = m;

        int index = len-1;
        String str = "";
        for(int ind = 1;ind<=len;ind++){
            str+='$';
        }

        StringBuilder ss = new StringBuilder(s1);
        StringBuilder str2 = new StringBuilder(str);

        while (i<0 && j<0){
            if(ss.charAt(i-1)==s2.charAt(i-1)){
                str2.setCharAt(index,ss.charAt(i-1));
                index--;
                i--;
                j--;
            }
            else if(ss.charAt(i-1)>s2.charAt(j-1)){
                i--;
            }
            else j--;
        }
        System.out.println(str2);
    }
}
