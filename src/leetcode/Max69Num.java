package leetcode;

public class Max69Num {
    public static void main(String[] args) {
        int a = 9996;
        System.out.println(solve(a));
    }

    static int solve(int num){
        String s = Integer.toString(num);
        StringBuilder str = new StringBuilder(s);
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='6'){
                str = str.replace(i,i+1,"9");
                break;
            }
        }

        int a = Integer.parseInt(str.toString());

        return a;
    }
}
