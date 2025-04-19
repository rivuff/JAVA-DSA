package college;

public class minOpt {
    public static void main(String[] args) {
        String num = "53478";
        System.out.println(minimumOperations(num));
    }

    public static int minimumOperations(String num) {

        int n =num.length();
        int min = Integer.MAX_VALUE;
        int i = n-1;
        int cb=0;
        if(n==2){
            if(num.equals("25") || num.equals("50")  || num.equals("75")  || num.equals("00") ){
                return 0;
            }else{
                if(num.charAt(1)=='0'){
                    return 1;
                }else {
                    return -1;
                }
            }
        }
        while(i>=0){
            if(num.charAt(i) == '0'){
                int j =i-1;
                int count =cb;
                while(j>=0){
                    if(num.charAt(j)=='5' || num.charAt(j)=='0'){
                        min = Math.min(min, count);
                        break;
                    }else{
                        count++;
                    }
                    j--;
                }
                min = Math.min(min, count);
            }
            else if(num.charAt(i) == '5'){
                int j =i-1;
                int count =cb;
                while(j>=0){
                    if(num.charAt(j)=='2' || num.charAt(j)=='7'){
                        min = Math.min(min, count);
                        break;
                    }else{
                        count++;
                    }
                    j--;
                }
            }

            cb++;
            i--;
        }
        if(min>num.length()){
            min = num.length();
        }

        return min;
    }
}
