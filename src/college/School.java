package college;


interface Role{
    void introduce();
}

class Person implements Role{
    String name;
    Person(String name){
        this.name = name;
    }

    public void introduce(){
        System.out.println("My name is: " +name);
    }
}

class Student extends Person{
    int grade;
    int role;
    String name;

    Student(String name, int grade, int role){
        super(name);
        this.role = role;
        this.grade = grade;
    }

    public void introduce( ){
        super.introduce();
        System.out.println("I am a student in grade: "+ grade);
        System.out.println("My role is: "+ role);
    }

    public void study(){
        System.out.println("I am studying");
    }
}

class Teacher extends Person{
    String subject;

    Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I teach: "+ subject);
    }

    public void teach(){
        System.out.println("I am teaching");
    }
}

public class School {
    public static void main(String[] args) {
        Student student = new Student("Rivu", 6,39);
        student.introduce();
        student.study();

        Teacher teacher = new Teacher("Bipasha", "AIML");
        teacher.introduce();
        teacher.teach();
    }
}
