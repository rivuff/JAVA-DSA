package leetcode;

public class takeK {
    public static void main(String[] args) {
        String s = "aabaaaacaab";
        int k = 2;
        int n = s.length();


    }

    public int takeCharacters(String s, int k) {
        int n= s.length();
        int[][] arr= new int[n+1][n+1];
            int count1=0;
            int count2=0;
            int count3 =0;

            for (int i = 0; i <n; i++) {

                if (s.charAt(i)=='a'){
                    count1++;
                }
                else if (s.charAt(i)=='b'){
                    count2++;
                }
                else if (s.charAt(i)=='c'){
                    count3++;
                }
            }

        if (count1>=k && count2>=k && count3>=k){
            return solve(0,n-1,"",s,k,arr);
        }

        return -1;

    }
    static int solve(int indL,int indR,String cr, String s, int k,int[][] arr){
        if(cr.length()>=k*3){
            int count1=0;
            int count2=0;
            int count3 =0;

            for (int i = 0; i < cr.length(); i++) {

                if (cr.charAt(i)=='a'){
                    count1++;
                }
                else if (cr.charAt(i)=='b'){
                    count2++;
                }
                else if (cr.charAt(i)=='c'){
                    count3++;
                }
            }

            if (count1>=k && count2>=k && count3>=k){
                return 0;
            }
        }

        if (arr[indL][indR]!=-1) return arr[indL][indR];

        int left = 1+solve(indL+1,indR,cr+s.charAt(indL),s,k,arr);
        int right = 1+solve(indL,indR-1,cr+s.charAt(indR),s,k,arr);


        return arr[indL][indR]= Math.min(left,right);
    }
}
