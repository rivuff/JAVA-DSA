package leetcode;

import java.util.HashMap;

public class sumZero {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(maxLen(arr, 0));
    }

    static int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefix = new int[n+1];

        prefix[0] = arr[0];
        int maxLen = 0;
        map.put(0, -1); // Initialize the map with a sum of 0 at index -1

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];

            if (prefix[i] == 0) {
                maxLen = Math.max(maxLen, i + 1);
            }

            if (map.containsKey(prefix[i])) {
                int prevIndex = map.get(prefix[i]);
                maxLen = Math.max(maxLen, i - prevIndex);
            } else {
                map.put(prefix[i], i);
            }
        }

        return maxLen;

    }
}
