package codevita;

import java.util.Scanner;

public class NumberEncryption {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String number = scr.nextLine();
        String direction = scr.nextLine();
        char[] nums = number.toCharArray();
        int n = direction.length();
        int j =0;
        for(int i =0;i<n;i++){
            if(direction.charAt(i)=='R'){
                if(j<n-1) {
                    j++;
                }
            }else if(direction.charAt(i)=='L'){
                if(j>0){
                    j--;
                }
            }else if(direction.charAt(i)=='D'){
                int num = nums[j]-'0';
                if(num>0){
                    num--;
                }
                nums[j] = Character.forDigit(num, 10);
            }else if(direction.charAt(i)=='T'){
                int num = nums[j]-'0';
                if(num<9){
                    num++;
                }
                nums[j] = Character.forDigit(num, 10);
            }else if(direction.charAt(i)=='S'){
                i++;
                int num = nums[j]-'0';
                int ind = direction.charAt(i)-'0';
                char x = nums[ind-1];
                nums[j] = nums[ind-1];
                char ch = Character.forDigit(num, 10);
                nums[ind-1] = Character.forDigit(num, 10);
            }
        }

        String ans = "";
        for(int i = 0;i<nums.length;i++){
            ans+=nums[i];
        }

        System.out.println(ans);
    }
}
