package leetcode;

public class singleElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};

        System.out.println(singleNonDuplicate(arr));
    }

    public static int singleNonDuplicate(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (left + right)/2;

            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if(mid%2==1){
                if(arr[mid]!=arr[mid+1]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            else{
                if(arr[mid]!=arr[mid+1]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }

        }
        return -1;
    }
}
