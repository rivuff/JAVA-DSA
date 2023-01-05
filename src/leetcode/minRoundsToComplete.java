package leetcode;

import java.util.HashMap;

public class minRoundsToComplete {
    public static void main(String[] args) {
        int[] arr = {119,115,115,119,118,113,118,120,110,113,119,115,116,118,120,
                117,116,111,113,119,115,113,115,111,112,119,111,111,110,112,113,120,
                110,111,112,111,119,112,113,112,115,116,113,114,118,119,115,114,114,112,
                110,117,120,110,117,116,120,118,110,120,119,113,119,120,113,110,120,114,119,115,
                119,117,120,116,113,113,110,118,117,116,114,114,111,116,119,112,113,116,112,116,119,
                112,114,114,112,118,116,113,117,116};
        System.out.println(minimumRounds(arr));
    }

    public static int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = tasks.length;

        for(int i=0;i<n;i++){
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int count =0;
        for(int val : map.values()){
            if(val%5==0){
                int c = (val/5)*2;
                count+=c;
            }
            else if(val%5==2 || val%5==3){
                int c = (val/5)*2 + 1;
                count +=c;
            }
            else if(val%3==0){
                int c = val/3;
                count+=c;
            }
            else if(val%3==2){
                int c = val/3+1;
                count+=c;
            }
            else if(val%2==0){
                int c = val/2;
                count+=c;
            }
            else {
                return -1;
            }
        }
        return count;
    }
}
