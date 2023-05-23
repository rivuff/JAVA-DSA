package college;

public class lion {

    public static void main(String[] args) {

        try {
            int a = 5/0;
        }catch (Exception e){
            System.out.println(e);
            throw e;
        }
    }
}
