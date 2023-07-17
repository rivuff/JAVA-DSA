package OOPs;

import java.util.Scanner;

abstract class ABook{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here

class MyBook extends ABook{
    //String title;
    @Override
    void setTitle(String s) {
        s = "A tale of two cities";
    }
}

public class Book{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}