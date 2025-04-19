package CompanyBased.Accenture;

import java.util.HashSet;

public class RepeatingDigit {
    public static void main(String[] args) {

        int ab = 2019;
        ab++;
        while (true){

            HashSet<Integer> set = new HashSet<>();
            int digit = ab;
            int flag = 0;
            while (digit!=0){

                int val = digit%10;
                if(!set.contains(val)){
                    set.add(val);
                }else {
                    flag = 1;
                    break;
                }
                digit = digit/10;
            }

            if(flag==1){
                ab++;
            }else {
                System.out.println(ab);
                break;
            }
        }
    }
}
