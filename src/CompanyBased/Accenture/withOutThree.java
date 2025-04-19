package CompanyBased.Accenture;

public class withOutThree {
    public static void main(String[] args) {

        System.out.println(solve(45));
    }

    static int solve(int n){
        int i = 1;
        int count =0;
        while(i<=n){
            String str = Integer.toString(i);
            if(!str.contains("3")){
                count++;
            }
            i++;
        }

        return count;
    }


}

