package leetcode;

import java.util.HashMap;
import java.util.Map;

public class minCalculate {

    public static void main(String[] args) {

        int num1 = 3, num2 = -2;
        int minOps = makeTheIntegerZero(num1, num2);
        System.out.println("Minimum operations to make num1 zero: " + minOps);

        num1 = 5;
        num2 = 7;
        minOps = makeTheIntegerZero(num1, num2);
        System.out.println("Minimum operations to make num1 zero: " + minOps);
    }
    public static int makeTheIntegerZero(int num1, int num2) {
        int count = 0;

        while (num1 != 0) {
            if ((num1 & 1) != (num2 & 1)) {
                if ((num1 & 1) == 1) {
                    num1 -= (1 << 1) + num2;
                } else {
                    num1 += (1 << 1) + num2;
                }
                count++;
            }
            num1 >>= 1;
            num2 >>= 1;
        }

        return count;
    }


    private static int solve(int num1, int num2, Map<String, Integer> map) {
        if (num1 == 0) {
            return 0;
        }

        String key = num1 + "-" + num2;
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int minOps = Integer.MAX_VALUE;

        for (int i = 0; i <= 60; i++) {
            int subtraction = (int) Math.pow(2, i) + num2;
            int nextNum = num1 - subtraction;

            if (nextNum == 0) {
                minOps = 1;
                break;
            } else if (nextNum < 0) {
                minOps = -1;
                break;
            }

            int result = solve(nextNum, num2, map);

            if (result != -1) {
                minOps = Math.min(minOps, 1 + result);
            }
        }

        minOps = (minOps == Integer.MAX_VALUE) ? -1 : minOps;
        map.put(key, minOps);

        return minOps;
    }


}


