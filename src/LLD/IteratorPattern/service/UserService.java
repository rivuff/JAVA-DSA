package LLD.IteratorPattern.service;

import LLD.IteratorPattern.Iterator.UserIterator;
import LLD.IteratorPattern.repositories.UserRepository;

import java.util.Iterator;
import java.util.List;

public class UserService {
    private final UserRepository userRepository;
    private final Iterator<List<String>> userIterator;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userIterator = (Iterator<List<String>>) new UserIterator(10);
    }

    public void getUserOnPlatform(){
        /**
         *  this.userRepository.findUser()
         *  problem with this is
         *
         *  1. Here the service layer has to keep track of current offset
         *  2. wherever this pagination is read. we need to keep track of offset here.
         *  3. we don't know when to stop. we might need to write separate logic, to check if no more data is there.
         *  4.
         *  */

        while (userIterator.hasNext()){
            List<String> users = userIterator.next();
            System.out.println(users);
        }


    }
}
