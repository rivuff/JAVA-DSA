package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxNumGroup {
    public static int maxIncreasingGroups(List<Integer> usageLimits) {
        int n = usageLimits.size();
        List<Integer> sortedLimits = new ArrayList<>(usageLimits);
        Collections.sort(sortedLimits, Collections.reverseOrder());

        int maxGroups = 0;
        int groupSize = 0;
        int currentCount = 0;

        for (int i = 0; i < n; i++) {
            currentCount++;
            if(n-i-2>=0) {
                if(sortedLimits.get(n - i - 1) == sortedLimits.get(n-i-2)){
                    continue;
                }
            }

            if (sortedLimits.get(n - i - 1) < currentCount) {
                currentCount = sortedLimits.get(n - i - 1);
            }



            if (currentCount == 0) {
                break;
            }

            groupSize++;

            if (groupSize == currentCount) {
                maxGroups++;
                groupSize = 0;
                currentCount = 0;
            }
        }

        return maxGroups;
    }

    public static void main(String[] args) {
        List<Integer> usageLimits1 = Arrays.asList(1, 2, 5);
        List<Integer> usageLimits2 = Arrays.asList(2, 1, 2);
        List<Integer> usageLimits3 = Arrays.asList(1, 1);

        System.out.println("Output 1: " + maxIncreasingGroups(usageLimits1)); // Output: 3
        System.out.println("Output 2: " + maxIncreasingGroups(usageLimits2)); // Output: 2
        System.out.println("Output 3: " + maxIncreasingGroups(usageLimits3)); // Output: 1
    }
}
