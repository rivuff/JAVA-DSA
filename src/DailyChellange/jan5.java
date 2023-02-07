package DailyChellange;

import java.util.ArrayList;
import java.util.List;

public class jan5 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };

        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] points) {
        List<int[]> list = new ArrayList<>();
        int n = points.length;
        list.add(points[0]);
        for(int i = 1;i<n;i++){
            int flag = 0;
            for(int j=0;j<list.size();j++){

                if(list.get(j)[0]<=points[i][0] && list.get(j)[1]>=points[i][0]){
                    list.get(j)[1] = Math.max(list.get(j)[1],points[i][1]);
                    flag=1;
                    break;
                }
                else if(list.get(j)[0]<=points[i][1] && list.get(j)[1]>=points[i][1]){
                    list.get(j)[0] = Math.min(list.get(j)[0],points[i][0]);
                    flag=1;
                    break;
                }

            }

            if (flag==0){
                list.add(points[i]);
            }
        }
        return list.size();
    }
}
