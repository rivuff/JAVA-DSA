package college;

import java.util.*;

public class minOperaton {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(32);
        nums.add(1);

        System.out.println(minOperations(nums, 35));
    }
    public static int minOperations(List<Integer> nums, int target) {
        int n = nums.size();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nums.get(i);
        }
        HashSet<Integer> set =  new HashSet<>();
        generateSubsequenceSums(arr, 0,0, set);

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            int count =0;
            int num = arr[i];

            while(num!=0){
                if(set.contains(target-num)){
                    return count;
                }else{
                    num = num/2;
                    count++;
                }
            }
        }

        return -1;


    }

    private static void generateSubsequenceSums(int[] arr, int index, int currentSum, Set<Integer> subsequenceSums) {
        if (index == arr.length) {
            subsequenceSums.add(currentSum);
            return;
        }


        generateSubsequenceSums(arr, index + 1, currentSum, subsequenceSums);


        generateSubsequenceSums(arr, index + 1, currentSum + arr[index], subsequenceSums);
    }
}
