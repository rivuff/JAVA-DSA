package CompanyBased.Accenture;

import java.util.ArrayList;
import java.util.List;

public class MinSquares {
    public static void main(String[] args) {
        int n = 13;

        System.out.println(solve(n));
    }

    static int solve(int n){
        List<Integer> list = new ArrayList<>();

        int i = 1;

        while (true){
            int val = (int)Math.pow(i,2);
            if(val>n){
                break;
            }

            list.add(val);
            i++;
        }

        return minSq(0, list, n);
    }

    public static int minSq(int ind, List<Integer> list, int n){

        if(ind>=list.size() || n<0){
            return 200000;
        }
        if(n==0){
            return 0;
        }

        int take = 1 + minSq(ind,list, n-list.get(ind));
        int notTake = minSq(ind+1,list, n);

        return Math.min(take, notTake);
    }
}
