package leetcode;

public class NumberOfOccurance {
    public static void main(String[] args) {
        int k = 3;
        int a= 1;
        int b = 40;
        int count = 0;
        char l = (char)(k+'0');
        int i =a;

        while (i<b){
            String str = Integer.toString(i);

            if(str.contains(Integer.toString(k))){
                for(int j = 0;j<str.length();j++){
                    if(str.charAt(j)==l){
                        count++;
                    }
                }
            }

            i++;
        }

        System.out.println(count);
    }
}
