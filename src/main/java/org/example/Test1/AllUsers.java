package org.example.Test1;

import java.util.ArrayList;
import java.util.List;

import static org.example.Test1.User.allUsers;

public interface AllUsers {
    static List<User> getAllUsers(){
        return new ArrayList<>(User.allUsers.values());
    }


    static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.sex == sex){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }
    static int getHowManyUsers(){
        return allUsers.size();
    }

    static int getHowManyUsers(Sex sex){
        return getAllUsers(sex).size();
    }
    static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    static int getAllAgeUsers(Sex sex){
        int countAge = 0;
        for (User user : getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }
    static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

    static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
}
