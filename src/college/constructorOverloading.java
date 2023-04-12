package college;

public class constructorOverloading {

    int a ;
    int b;

    constructorOverloading(int a){
        int b = 30;
        this.b = 50;
        System.out.println(b);
        this.a = a;
    }

    constructorOverloading(int a, int b){
        this.a = a;
        this.b = b;
    }

    byte c;
    byte d;

    constructorOverloading(byte a ,byte b){
        this.c = a;
        this.d = b;
    }

    public static void main(String[] args) {
        constructorOverloading withOutParameter = new constructorOverloading(40);
        System.out.println(withOutParameter.a);
        constructorOverloading withparam = new constructorOverloading(50,60);
        constructorOverloading byteParam = new constructorOverloading((byte) 23, (byte) 32);
        System.out.println(withparam.a + withparam.b);

        System.out.println("byte form " + byteParam.c + " "+ byteParam.d);
    }

}
