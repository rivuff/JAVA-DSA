package leetcode;

public class partitionstring {
    public static void main(String[] args) {
        String s = "23812";
        System.out.println(solve(s,5));
    }

    static int solve(String s, int k){
        String[] a= s.split(" ");

        if(k<9){
            for (int i = 0; i <s.length() ; i++) {
                if (Character.getNumericValue(s.charAt(i))>k){
                    return -1;
                }
            }
            return s.length();
        }
        if (k==9){
            return s.length();
        }

        int n = s.length();
        char[] arr = s.toCharArray();
        int i =0;
        String st = Integer.toString(k);
        int m = st.length();
        int count = 0;
        while (i<n){
            int j = i+1;
            int l =1;
            int val=arr[i]-'0';
            int flag = 1;
            while (l<m){
                if(j>=n){
                    count++;
                    i+=l;
                    flag=0;
                    break;
                }
                val = val*10+arr[j]-'0';
                j++;
                l++;
            }
            if (flag==1){
                if (val<=k){
                    count++;
                    i+=m;
                }
                else {
                    count++;
                    i+=(m-1);
                }
            }

        }
        return count;
    }
}
