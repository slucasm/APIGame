package edu.upc.eetac.dsa;

import java.util.HashMap;

public class User {
    public String idUser;
    public String userName;
    private String password;
    private Boolean isAdmin;
    public int money;
    public HashMap<String,Game> gamesMap;

    public User (){

    }

    public User(String idUser, String userName,String password){
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.isAdmin = false;
        this.money = 0;
        this.gamesMap = new HashMap<String, Game>();
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public HashMap<String, Game> getGamesMap() {
        return gamesMap;
    }

    public void setGamesMap(HashMap<String, Game> gamesMap) {
        this.gamesMap = gamesMap;
    }
}
