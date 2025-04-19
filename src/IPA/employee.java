package IPA;

import java.util.Scanner;

class EmployeeDet {
    private String name;
    private int EmpId;
    private String branch;
    private double rating;
    private boolean transport;

    public EmployeeDet(String name, int EmpId, String branch, double rating, boolean transport){
        this.name = name;
        this.EmpId = EmpId;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getEmpId(){
        return  EmpId;
    }
    public void setEmpId(int EmpId){
        this.EmpId = EmpId;
    }

    public String getName(){
        return getName();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBranch(){
        return branch;
    }

    public void setBranch(String branch){
        this.branch= branch;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public boolean getTransport(boolean transport){
        return transport;
    }

    public void setTransport(boolean transport){
        this.transport = transport;
    }

}

public class employee {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        EmployeeDet[] emp = new EmployeeDet[4];

        for(int i = 0;i<emp.length; i++){
            int a  = scr.nextInt();
        }

    }
}
