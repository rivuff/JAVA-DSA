package Thread;

class Asc extends Thread{
    Thread c = currentThread();
    public void run(){
        for(int i = 0;i<1000;i++){

            System.out.println(c.getName()+ "" + i);
        }
    }
}


class Bsc extends Thread{
    Thread c = currentThread();
    public void run(){
        for(int i = 1000;i>=0;i--){

            System.out.println(c.getName()+ "" + i);
        }
    }
}

public class Race {

    public static void main(String[] args) {
       Asc a = new Asc();
       Bsc b = new Bsc();
       a.start();
       b.start();
    }
}
