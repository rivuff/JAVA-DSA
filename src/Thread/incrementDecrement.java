package Thread;


class Example2{
    private int start;
    private int end;

    Example2(int start, int end){
        this.start = start;
        this.end = end;
    }
    synchronized void display(){
        Thread th = Thread.currentThread();
        try{
            if(end>start){
                for(int i = start; i<end;i++){
                    System.out.println(th.getName() + " " + i);
                }
            }
            if(end<start){
                for(int i = start;i>=end;i--){
                    System.out.println(th.getName() + " " + i);
                }
            }
        }catch (Exception e){

        }

    }
}

class Th extends Thread{
    Example2 e;
    Th(Example2 e){
        this.e = e;
    }

    public void run(){
        e.display();
    }
}

public class incrementDecrement {
    public static void main(String[] args) {
        Example2 ex1 = new Example2(1,5);
        Example2 ex2 = new Example2(5,1);
        Th a1 = new Th(ex1);
        Th a2 = new Th(ex2);

        a1.start();
        a2.start();
    }
}
