package com.java.websocketproject.storage;

import org.apache.catalina.User;

import java.util.Set;

public class UserStorage {

    private static UserStorage instance;
    private Set<String> users;

    private UserStorage(){

    }

    public Set<String> getUsers() {

        return users;
    }

    public void setUsers(String user) throws Exception {
        if(users.contains(user)){
            throw  new Exception("User already exists with username" + user);
        }
        users.add(user);
    }

    public static synchronized UserStorage getInstance(){
        if(instance==null){
            instance = new UserStorage();
        }
        return  instance;
    }

}
