package college;

public class overLoading {
    public static void main(String[] args) {
        int radius = 4;
        int height = 4;
        int base = 5;
        int areaCircle = Area(radius);
        int areaTriangle = Area(height,base);
        System.out.println("area of a circle " + areaCircle);
        System.out.println("area of a triangle " + areaTriangle);
        System.out.println("Jani na ki " + Area((byte) 2));
    }

    static byte Area(byte a){
        return a;
    }
    static int Area(int r){
        return (int)3.2*r*r;
    }

    static int Area(int h, int b){
        return (h*b)/2;
    }
}
