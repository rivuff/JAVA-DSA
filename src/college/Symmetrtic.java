package college;

import java.util.ArrayList;
import java.util.List;

public class Symmetrtic {
    public static void main(String[] args) {

        int a = countSymmetricIntegers(1,10000);
        System.out.println(a);
    }

    public static int countSymmetricIntegers(int low, int high) {


        int count =0;

        while (low<=high){
            int i = low;
            List<Integer> start = new ArrayList<>();
            while (i>0){
                int val = i%10;
                start.add(0,val);
                i = i/10;
            }

            if(start.size()%2==1){
                low++;
                continue;
            }else {
                int sums = 0;
                int sume =0;
                for(int j =0;j<start.size()/2;j++){
                    sums +=start.get(j);
                }

                for(int j =start.size()/2;j<start.size();j++){
                    sume +=start.get(j);
                }

                if(sums==sume){
                    count++;
                }
            }
            low++;
        }

        return count;

    }
}
