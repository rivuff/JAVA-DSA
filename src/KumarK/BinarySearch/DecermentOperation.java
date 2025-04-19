package KumarK.BinarySearch;

public class DecermentOperation {
    public static void main(String[] args) {
        int n = 3;
        int[] arr = {1,3,4};
        int max = 4;


        int start = 0;
        int end = 100;


        while(start<=end){
            int mid= (start+end)/2;

            int count = 0;
            int i =0;
            while(i<n){
                int val = arr[i];

                while(val>0){
                    val-= mid;
                    count++;
                }
                i++;
            }

            if(count<max){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        System.out.println(start);
    }
}
