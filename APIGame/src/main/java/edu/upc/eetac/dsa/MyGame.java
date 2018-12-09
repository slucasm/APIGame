package edu.upc.eetac.dsa;

import java.util.List;

public interface MyGame {

    Level getLevel(int i);

    void addLevel(Level level);

    void addObject(Objectt object);

    Objectt getObject(String idObject);

    List<Objectt> getAllObjects();

    int addUser(User user);

    int loginUser(String userName,String password);

    boolean isAdmin(String userName);

    int changePassword(String userName, String passwordOriginal,String passwordNew);

    User getUser(String userName);

    List<User> getAllUsers();

    List<User> getUsersOrderedByMoney();

}
