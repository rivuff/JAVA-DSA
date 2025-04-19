package TwoPointer;

public class HighlyProfitable {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5};
        int k = 3;

        HighlyProfitable highly = new HighlyProfitable();
        System.out.println(highly.solve(arr, k));
    }

    int solve(int[] arr, int k){
        int n = arr.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int prev =0;
        while (j<n){
            if(arr[j]>prev){
                j++;
                if(j<n){
                    prev = arr[j];
                }

                if(j - i +1==k){
                    i++;
                    count++;
                }
            }else {
                i =j;
                prev = arr[i];
                j++;
            }
        }

        return count;
    }
}
