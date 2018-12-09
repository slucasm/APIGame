package edu.upc.eetac.dsa;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MyGameImpl implements MyGame {

    private Level[] levels = new Level[3];
    private int numLevels = 0;

    private List<Objectt> objectList = new LinkedList<>();

    private List<User> userList = new LinkedList<>();

    private static MyGameImpl instance;

    private MyGameImpl(){
    }

    public static MyGame getInstance(){
        if (instance == null){
            instance = new MyGameImpl();
        }
        return instance;
    }

    public Level getLevel(int i) {
        return levels[i];
    }

    public void addLevel(Level level) {
        level.setIdLevel(numLevels);
        int idLevel = level.getIdLevel();
        if (idLevel < levels.length) {
            levels[idLevel] = level;
        }
        numLevels ++;
    }

    public void addObject(Objectt object) {
        objectList.add(object);
    }

    public Objectt getObject(String idObject) {
        Objectt obj = new Objectt();
        for (Objectt object: objectList)
        {
            if (object.idObject.equals(idObject))
            {
                obj = object;
                break;
            }
        }
        return obj;
    }

    public List<Objectt> getAllObjects() {
        return objectList;
    }

    public int addUser(User user) {
        boolean userExists = false;
        for(User user1: userList){
            if (user1.userName.equals(user.userName))
            {
                userExists = true;
            }
        }
        if(!userExists)
        {
            userList.add(user);
            return 1;
        }
        else{
            return 0;
        }
    }

    public int loginUser(String userName, String password) {
        boolean loginIsCorrect = false;

        for (User user: userList){
            if (user.userName.equals(userName)){
                if (user.getPassword().equals(password)){
                    loginIsCorrect = true;
                }
            }
        }
        if (loginIsCorrect) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public boolean isAdmin(String userName) {
        boolean isAdmin = false;
        for(User user: userList){
            if(user.userName.equals(userName)){
                isAdmin = user.getAdmin();
            }
        }

        if (isAdmin){
            return true;
        }
        else{
            return false;
        }
    }

    public int changePassword(String userName, String passwordOriginal, String passwordNew) {
        boolean changeIsCorrect = false;

        for (User user: userList){
            if (user.userName.equals(userName)){
                if (user.getPassword().equals(passwordOriginal)){
                    user.setPassword(passwordNew);
                    changeIsCorrect = true;
                }
            }
        }
        if (changeIsCorrect) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public User getUser(String userName) {
        User user = new User();

        for(User user1: userList){
            if(user1.userName.equals(userName))
                user = user1;
        }
        return user;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public List<User> getUsersOrderedByMoney() {
        List<User> listUsers = this.userList;
        Collections.sort(listUsers, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.money-o2.money;
            }
        });
        return listUsers;
    }


}
