package KumarK.DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class maxProfitSalesman {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(0);
        l.add(1);
        List<Integer> ll = new ArrayList<>();
        ll.add(0);
        ll.add(2);
        ll.add(10);
        List<Integer> lll = new ArrayList<>();
        lll.add(1);
        lll.add(3);
        lll.add(2);


        list.add(l);list.add(ll);list.add(lll);

        System.out.println(maximizeTheProfit(5,list));

    }


    public static int maximizeTheProfit(int n, List<List<Integer>> offers) {
        int[][] arr = new int[offers.size()][3];
        for(int i =0;i<offers.size();i++){
            for(int j =0;j<3;j++){
                arr[i][j] = offers.get(i).get(j);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

        int[] dp = new int[n];

        Arrays.sort(arr, (a,b)->a[1]-b[1]);
        Arrays.fill(dp,0);

        int j = 0;
        for(int i =0;i<n;i++){
            int max = 0;
            while(j<offers.size()){
                if(arr[j][1] == i){
                    if(arr[j][0]!=0){
                        max = Math.max(max, dp[arr[j][0]-1]+arr[j][2]);
                    }
                    else max = Math.max(max, arr[j][2]);

                }else if(arr[j][1]>i){
                    break;
                }
                j++;
            }
            if(i==0){
                dp[i] = max;
            }else{
                dp[i] =Math.max(dp[i-1],max);
            }

        }

        return dp[n-1];



    }



}
