package HashMap;

public class rotateString {
    public static void main(String[] args) {
        String str = "abcdef";
        String goal = "cdefab";

        System.out.println(rotateString(str, goal));
    }

    public static boolean rotateString(String s, String goal) {
        int i = 0;
        int j = 0;

        while(j<s.length()){
            if(solve(s,goal, i , j)){
                return true;
            }
            else{
                j++;
            }
        }

        return false;

    }

    public static boolean solve(String s, String goal, int i , int j){
        int count = 0;
        while(s.charAt(i)==goal.charAt(j)){
            count++;
            i++;
            j++;

            if(j==s.length()){
                j = 0;
            }

            if(count == s.length()){
                return true;
            }
        }

        return false;
    }
}
