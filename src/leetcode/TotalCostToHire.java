package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TotalCostToHire {
    public static void main(String[] args) {
        int[] cost = {17,12,10,2,7,2,11,20,8};
        int k = 3;

        System.out.println(totalCost(cost,k,4));
    }


    public static long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        if(2*candidates >= n){
            Arrays.sort(costs);
            int sum = 0;
            for(int i = 0;i<k;i++){
                sum += costs[i];
            }
            return sum;
        }
        int sum = 0;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int start = 0;
        int end = n-1;

        while(start< candidates){
            pq1.add(costs[start]);
            start++;
        }

        while(end >= n-candidates){
            pq2.add(costs[end]);
            end--;
        }
        start--;
        end++;

        while(start<end){

            if(pq1.size()<candidates){
                pq1.add(costs[start]);
            }else if(pq2.size()<candidates){
                pq2.add(costs[end]);
            }


            int a = pq1.peek();
            int b= pq2.peek();

            if(a<b){
                sum+=a;
                pq1.poll();
                start++;
            }else{
                sum+=b;
                pq2.poll();
                end--;
            }
            k--;

        }

        while(k!=0){
            if(pq1.peek()==null || pq2.peek()==null){
                break;
            }
            int a = pq1.peek();
            int b= pq2.peek();

            if(a<b){
                sum+=a;
                pq1.poll();
            }else{
                sum+=b;
                pq2.poll();
            }
            k--;
        }

        if(pq1.peek()==null){
            while(k!=0 && pq2.peek()!=null){
                sum+=pq2.poll();
                k--;
            }
        }else if(pq2.peek()!=null){
            while(k!=0 && pq1.peek()!=null){
                sum+=pq1.poll();
                k--;
            }
        }

        return sum;
    }
}
