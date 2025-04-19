package leetcode;

import java.util.Arrays;

public class JobSequencing {
    static int maxCount=0;
    static class Job {
        int id, profit, deadline;
        Job(int x, int y, int z){
            this.id = x;
            this.deadline = y;
            this.profit = z;
        }
    }

    static int[] JobScheduling(Job arr[], int n)
    {

        Arrays.sort(arr, (a,b)-> b.profit-a.profit);

        int maxi = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i].deadline> maxi){
                maxi = arr[i].deadline;
            }
        }

        int[] result = new int[maxi+1];

        Arrays.fill(result, -1);

        int countJobs = 0;
        int jobProfit = 0;

        for(int i=0;i<n;i++){
            for(int j = arr[i].deadline;j>0;j--){
                if(result[j]== -1){
                    result[j] = i;
                    countJobs++;
                    jobProfit+=arr[i].profit;
                    break;
                }
            }
        }
       int[] ans = new int[2];
        ans[0] = countJobs;
        ans[1] = jobProfit;
       return ans;
    }


    public static void main(String[] args) {
        Job job1 = new Job(1,4,20);
        Job job2 = new Job(2,1,10);
        Job job3 = new Job(3,1,40);
        Job job4 = new Job(4,1,30);

        Job[] arr = new Job[4];
        arr[0] =job1;
        arr[1] = job2;
        arr[2] = job3;
        arr[3] = job4;

        int[] ans = JobScheduling(arr, 4);
        System.out.println(Arrays.toString(ans));
    }

}
