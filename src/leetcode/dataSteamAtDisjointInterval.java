package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class dataSteamAtDisjointInterval {
    public static void main(String[] args) {

    }
}
class SummaryRanges {
    private Set<Integer> numbers;

    public SummaryRanges() {
        numbers = new TreeSet<>();
    }

    public void addNum(int value) {
        numbers.add(value);
    }

    public int[][] getIntervals() {
        List<int[]> disjoint = new ArrayList<>();

        for(int n : numbers){

            int size = disjoint.size();

            if(size>0 && disjoint.get(size-1)[1]+1==n){
                disjoint.get(size-1)[1]=n;
            }
            else{
                disjoint.add(new int[]{n,n});
            }
        }

        return disjoint.toArray(new int[0][]);
    }
}
