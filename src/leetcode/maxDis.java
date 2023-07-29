package leetcode;

import java.util.HashMap;


class MaxMin{
    int start;
    int end;

    MaxMin(int start,int end){
        this.start = start;
        this.end = end;
    }
}

public class maxDis {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};

        System.out.println(maxDistance(arr, 6));
    }

    static int maxDistance(int arr[], int n)
    {
        // Your code here
        HashMap<Integer, MaxMin > map = new HashMap<>();

        for(int i = 0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], new MaxMin(i, i));
            }else{
                int min = map.get(arr[i]).start;
                int max = map.get(arr[i]).end;

                if(i<min){
                    map.put(arr[i], new MaxMin(i, max));
                }else if(i>max){
                    map.put(arr[i], new MaxMin(min, i));
                }
            }
        }
        int maxDistance=0;
        for(int key : map.keySet()){
            maxDistance = Math.max(maxDistance, map.get(key).end-map.get(key).start);
        }

        return maxDistance;
    }
}
