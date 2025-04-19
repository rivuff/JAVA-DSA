package DailyChellange;

public class GarbageCollect {
    public static void main(String[] args) {
        String[] str={"MMM","PGM","GP"};
        int[] travel = {3,10};

        System.out.println(garbageCollection(str, travel));
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int total=0;
        int n = garbage.length;

        char[] arr = {'G', 'P','M'};


        for(int i =0;i<arr.length;i++){
            int lastInd = -1;
            int sum = 0;
            for(int j = n-1;j>=0;j--){
                String str = garbage[j];

                if(str.contains(Character.toString(arr[i]))){
                    lastInd = j;
                    break;
                }
            }

            for(int j =0;j<=lastInd;j++){
                if(j<lastInd){
                    sum+= travel[j];
                }
                String str= garbage[j];

                for(int k = 0;k<str.length();k++){
                    if(arr[i]== str.charAt(k)){
                        sum++;
                    }
                }
            }

            total+=sum;

        }

        return total;

    }
}
