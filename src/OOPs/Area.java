package OOPs;

public class Area {

    static double[] Circle(int r){
        double area = 3.14 * r*r;
        double parameter = 2 * 3.14 * r;
        double[] arr = {area, parameter};
        return arr;
    }

    static int[] rectangles(int a, int b){
        int area = a*b;
        int parameter = 2*(a+b);

        int[] arr = {area, parameter};

        return  arr;
    }

    static int[] triangle(int a,int b, int c, int h){
        int area = 1/2 * h*b;
        int parameter = a+b+c;

        int[] arr = {area, parameter};

        return  arr;
    }
    public static void main(String[] args) {

    }


}
