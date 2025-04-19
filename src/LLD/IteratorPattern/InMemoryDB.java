package LLD.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDB {

    List<String> users = new ArrayList<>();

    public void seeder(){
        for(int i =0;i<1000;i++){
            users.add("users" + i);
        }
    }

    public List<String> getUsers(){
        return users;
    }
}
