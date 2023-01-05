package DynamicProgramming;

public class NinjasTraining {
    public static void main(String[] args) {
        int[][] points = {
                {10,40,70},
                {20,50,80},
                {30,60,90}
        };

        System.out.println(ninjaTraining(3,points));

    }

    public static int ninjaTraining(int n, int points[][]) {
        return solve(n-1,3,points);
    }

    public static int solve(int n, int last, int[][] points){
        if(n==0){
            int max= 0;
            for (int i = 0; i < 3; i++) {
                if (i!=last){
                    max=Math.max(max,points[0][i]);
                }
            }
            return max;
        }

        int max=0;

        for (int i = 0; i < 3; i++) {
            if (i!=last){
                int p = points[n][i] + solve(n-1,i,points);
                max=Math.max(max,p);
            }
        }
        return max;
    }
}
