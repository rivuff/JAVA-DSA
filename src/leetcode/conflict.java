package leetcode;

public class conflict {
    public static void main(String[] args) {
        String[] event1 = {"1:15", "2:00"};
        String[] event2 = {"2:00", "3:00"};


    }

    public static boolean haveConflict(String[] event1, String[] event2) {
        StringBuilder s1 = new StringBuilder(event1[0]);
        StringBuilder s2 = new StringBuilder(event1[1]);
        StringBuilder s3 = new StringBuilder(event2[0]);
        StringBuilder s4 = new StringBuilder(event2[1]);


        int count1 =0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i)==':'){
                count1=i;
                break;
            }
        }
        s1.replace(count1,count1+1,".");

        int count2 =0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i)==':'){
                count2=i;
                break;
            }
        }
        s2.replace(count2,count2+1,".");

        int count3 =0;
        for (int i = 0; i < s3.length(); i++) {
            if (s3.charAt(i)==':'){
                count3=i;
                break;
            }
        }
        s3.replace(count3,count3+1,".");

        int count4 =0;
        for (int i = 0; i < s4.length(); i++) {
            if (s4.charAt(i)==':'){
                count4=i;
                break;
            }
        }
        s4.replace(count4,count4+1,".");


        double a1 = Double.valueOf(s1.toString());
        double a2 = Double.valueOf(s2.toString());
        double a3 = Double.valueOf(s3.toString());
        double a4 = Double.valueOf(s4.toString());

        if(a3>=a1 && a3<=a2){
            return true;
        }
        else if(a1>=a3 && a1<=a4){
            return true;
        }
        return false;

    }
}
