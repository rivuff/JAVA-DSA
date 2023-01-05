package leetcode;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class devideInTeams {
    public static void main(String[] args) {
        int[] skill={3,4};
        System.out.println(dividePlayers(skill));
    }

    public static long dividePlayers(int[] skill) {
        int n = skill.length;
        if (n ==2){
            return skill[0]*skill[1];
        }
        if (n==0){
            return 0;
        }

        Arrays.sort(skill);

        int i = 0;
        int j = n-1;
        int a = skill[i]+skill[j];

        List<Integer> list = new ArrayList<>();
        while (j>i){
            if (skill[i]+skill[j]!=a){
                return -1;
            }
            else {
                list.add(skill[i]*skill[j]);
                i++;
                j--;
            }
        }

        long total = 0;
        for (int k = 0; k < list.size(); k++) {
            total+=list.get(k);
        }

        return total;

    }
}
