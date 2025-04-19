package leetcode;

public class Change {
    public static void main(String[] args) {
        String[] strArr = {"56", "011000"};

        System.out.println(solve(strArr));
    }

    public static int solve(String[] strArr){
        int val = Integer.parseInt(strArr[0]);
        String str = decimalToBinary(val);

        String strGiv = strArr[1];

        int n = str.length();
        int count = 0;
        for(int i =0;i<n;i++){
            if(strGiv.charAt(i)!=str.charAt(i)){
                count++;
            }
        }

        return count;
    }

    public static String decimalToBinary(int n)
    {
        int remainder, quotient = n;
        String binaryNum = "";
        while (quotient > 0) {
            remainder = quotient % 2;
            binaryNum = Integer.toString(remainder) + binaryNum;
            quotient = quotient / 2;
        }
        return binaryNum;
    }
}
