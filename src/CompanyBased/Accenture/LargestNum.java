package CompanyBased.Accenture;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = {5,5,5,5,5,5,5,5,5,5,0};
        System.out.println(solve(arr));
    }

    static String solve(int[] arr){
        int n = arr.length;
        int zero =0;
        int five = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                zero++;
            }else{
                five++;
            }
        }
        int val=0;

        if(zero==0){
            return "0";
        }
        if(five>=9){
            String ans = "";
            val = five/9;
            while (val-->0){
                for(int i =0;i<9;i++){
                    ans+= '9';
                }
            }
            while (zero-->0){
                ans+='0';
            }

            return ans;
        }

        return "0";

    }
}
