package leetcode;

public class maxEnemy {
    public static void main(String[] args) {
        int[] arr = {0,0,1,-1};
        System.out.println(solce(arr));
    }

    static int solce(int[] forts){
        int n = forts.length;
        int count = 0;
        int max= 0;
        int flag=0;
        int flag2=0;

        for(int i =0;i<n;i++){
            if(forts[i]==1 || forts[i]==-1){
                flag=1;
            }
            if (flag==0){
                continue;
            }
            if(forts[i]==1){
                if (flag2==1){
                    max = Math.max(max,count);
                    count=0;
                    flag2=0;
                }
                else count=0;

            }
            else if(forts[i]==-1){
               if (flag2==0){
                   max = Math.max(max,count);
                   count=0;
                   flag2=1;
               }
               else count=0;
            }
            else{
                count++;
            }

        }

        return max;

    }
}
