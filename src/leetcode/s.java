package leetcode;

public class s {
    public static void main(String[] args) {

        String[] words = {"pgmiltbptl","jnkxwutznb","bmeirwjars","ugzyaufzzp","pgmiltbptl","sfhtxkmzwn","pgmiltbptl","pgmiltbptl","onvmgvjhxa","jyzdtwbwqp"};
        String target = "pgmiltbptl";
        int a = 4;
        System.out.println(closetTarget(words,target,a));
    }

    public static int closetTarget(String[] words, String target, int startIndex) {
        int i = startIndex;
        int j = startIndex;
        int n = words.length;
        int count1=1;
        int count2 = 1;
        if(words[startIndex]==target){
            return 0;
        }
        else{
            i++;
            j--;
        }

        while((i%n)!=startIndex){
            if(words[i%n].equals(target)){
                break;
            }
            count1++;
            i++;
        }

        if((i%n)==startIndex){
            return -1;
        }

        while((j%n)!=startIndex){
            if(words[(j+n)%n].equals(target)){
                break;
            }
            count2++;
            j--;
        }

        return Math.min(count1,count2);
    }
}
