package leetcode;

import java.util.Arrays;

public class boats {
    public static void main(String[] args) {
        int[] arr = {3,2,2,1};
        System.out.println(numRescueBoats(arr,3));
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int count =0;
        int sum =0;
        for(int i =0;i<n;i++){
            sum += people[i];

            if(sum==limit){
                count++;
                sum = 0;
            }
            else if(sum>limit){
                count++;
                sum = people[i];

            }
        }
        if(sum<=limit){
            count++;

        }
        return count;
    }
}
