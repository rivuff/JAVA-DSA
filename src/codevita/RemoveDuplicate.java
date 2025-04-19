package codevita;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "abciijklma";

        int n = str.length();
        String ans = "";

        if(n==1){
            System.out.println(str);
        }
        else if(n==2){
            if(str.charAt(0)!=str.charAt(1)){
                System.out.println(str);
            }else System.out.println(" ");
        }
        else
        {
            int i =0;
            while (i<n-1){
                if(str.charAt(i)==str.charAt(i+1)){
                    char ch = str.charAt(i);
                    i++;
                    while (i<n){
                        if(ch == str.charAt(i)){
                            i++;
                        }else break;
                    }
                }else {
                    ans+=str.charAt(i);
                    i++;
                }
            }
            if(str.charAt(n-2)!=str.charAt(n-1)){
                ans+=str.charAt(n-1);
            }

            System.out.println(ans);
        }

    }
}
