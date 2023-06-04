package Thread;


class Example{
    synchronized void display(){
        Thread g = Thread.currentThread();

        for(int i =0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(g.getName()+" " + i );
            }catch (Exception e){

            }
        }
    }
}

class T extends Thread{
    Example e;
    T(Example e){
        this.e  = e;
    }
    public void run(){
        e.display();
    }

}
public class college {
    public static void main(String[] args) {
        Example ex = new Example();
        T a1 = new T(ex);
        T a2 = new T(ex);


        a1.start();
        a2.start();
    }
}
