package CompanyBased.Accenture;

public class Panagram {
    public static void main(String[] args) {
        String str = "Bawds jog, flick quartz, vex nymph";

        System.out.println(solve(str));

    }

    static boolean solve(String str){
        char ch = 'a';
        char chCap = 'A';
        for(int i = 1;i<26;i++){
            if(str.contains(Character.toString(ch)) || str.contains(Character.toString(chCap))){
                ch += 1;
                chCap+=1;
            }else return false;
        }

        return true;
    }
}
