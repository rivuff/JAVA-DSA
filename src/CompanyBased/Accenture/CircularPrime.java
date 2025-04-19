package CompanyBased.Accenture;

import java.util.ArrayList;
import java.util.List;

public class CircularPrime {
    public static void main(String[] args) {
        int lowerBound = 60;
        int upperBound = 80;


        List<Integer> list = new ArrayList<>();

        for(int i = lowerBound;i<=upperBound;i++){
            if(checkIsPrime(i)){
                int num =0;
                int numb = i;
                while (numb!=0){
                    num = num*10;
                    int val = numb%10;
                    num+=val;
                    numb=numb/10;
                }

                if(checkIsPrime(num)){
                    list.add(i);
                }
            }
        }
        int sum =0;
        for(int i =0;i<list.size();i++){
            sum+= list.get(i);
        }


        System.out.println(sum);
    }

    static boolean checkIsPrime(int num){

        if(num==1 || num==0){
            return false;
        }

        for(int i =2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
