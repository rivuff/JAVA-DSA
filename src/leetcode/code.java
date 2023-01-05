package leetcode;

import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        int[] arr = {1,2,-1,-1,-1,5,3,5,};
        System.out.println(allocate(2,4,arr));
    }

    public static int allocate(int size, int mID,int[] arr) {
        int count = 0;
        int n = arr.length;
        int j =0;
        int i =0;
        int k =0;
        int flag = 0;
        int flag1=0;
        while (i<n){
            while (i<n && arr[i]==-1){
                if (flag==0){
                    flag=1;
                    j=i;
                }

                count++;
                i++;
                if (count>=size){
                    for (int l = j; l <size ; l++) {
                        arr[l]=mID;
                        flag1=1;
                    }
                    break;
                }
            }
            flag=0;
            i++;
            k=i;
        }
        if (flag1==0){
            return -1;
        }

        return k;
    }


    class Allocator {
        int[] arr;
        public Allocator(int n) {
            arr = new int[n];
            Arrays.fill(arr,-1);
        }

        public int allocate(int size, int mID) {
            int count = 0;
            int n = arr.length;
            int j =0;
            int i =0;
            int k =0;
            int flag = 0;
            int flag1=0;
            while (i<n){
                while (i<n && arr[i]==-1){
                    if (flag==0){
                        flag=1;
                        j=i;
                    }

                    count++;
                    i++;
                    if (count>=size){
                        for (int l = j; l <size ; l++) {
                            arr[l]=mID;
                            flag1=1;
                        }
                        break;
                    }else {
                        k=i;
                    }
                }
                flag=0;
                i++;
            }
            if (flag1==0){
                return -1;
            }
            i++;
            return k;
        }

        public int free(int mID) {
            int count =0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]==mID){
                    arr[i]=-1;
                    count++;
                }
            }
            return count;
        }
    }
}
