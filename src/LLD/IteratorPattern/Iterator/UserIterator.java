package LLD.IteratorPattern.Iterator;

import LLD.IteratorPattern.repositories.UserRepository;
import LLD.IteratorPattern.repositories.UserRepositoryImpl;

import java.util.List;

public class UserIterator implements Iterator<List<String>> {

    private final UserRepository userRepository;
    private int limit = 1;
    private int offset = 0;
    private List<String> userList;

    public UserIterator(int limit) {
        this.userRepository = new UserRepositoryImpl();
        this.limit = limit;
        this.userList = userRepository.findUsers(limit, offset);
    }


    @Override
    public boolean hasNext() {
        return !userList.isEmpty();
    }

    @Override
    public List<String> next() {
        List<String> result = userList;
        this.offset += limit;
        this.userList = this.userRepository.findUsers(limit, offset);
        return result;
    }
}
