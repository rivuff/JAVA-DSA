package LLD.IteratorPattern.repositories;

import LLD.IteratorPattern.InMemoryDB;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{
    InMemoryDB db;
    public UserRepositoryImpl(){
        this.db = new InMemoryDB();
    }

    @Override
    public List<String> findUsers(int limit, int offset) {
        List<String> allUsers = db.getUsers();

        int start =( offset-1) + limit;
        int end = Math.min(start + limit, allUsers.size());

        if(start>=end){
            return List.of();
        }

        return allUsers.subList(start, end);
    }
}
