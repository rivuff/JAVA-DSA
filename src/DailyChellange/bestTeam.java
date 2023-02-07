package DailyChellange;


import java.util.Arrays;

public class bestTeam {
    public static void main(String[] args) {

    }

    static int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;

        int[][] ageScorePair = new int[n][n];

        for (int i = 0; i < n; i++) {
            ageScorePair[i][0] = ages[i];
            ageScorePair[i][1] = scores[i];
        }

        Arrays.sort(ageScorePair, (a,b)-> a[0]==b[0] ? a[1]-b[1]: a[0]-b[0]);
        int[][] dp =new int[n][n];
        for(int[] arr : dp){
            Arrays.fill(arr,-1);
        }

        return solve(-1,0,dp,ageScorePair);
    }

    static int solve(int prev, int ind, int[][] dp, int[][] ageScorePair){
        if(ind>=ageScorePair.length){
            return 0;
        }

        if(dp[prev+1][ind]!=-1){
            return dp[prev+1][ind];
        }

        if(prev==-1 || ageScorePair[ind][1]>=ageScorePair[prev][1]){
            return dp[prev+1][ind] = Math.max(solve(prev,ind+1,dp,ageScorePair),ageScorePair[ind][1]+ solve(ind,ind+1,dp,ageScorePair));

        }



        return dp[prev+1][ind] = solve(prev,ind+1,dp,ageScorePair);
    }
}
