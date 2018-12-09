package edu.upc.eetac.dsa;

public class Game {
    //public User user;
    public String idGame;
    public Boolean isCompleted;
    public int gameLength;
    public int checkPoint;
    public int healthPoints;
    //public Collection object;

    public Game(){

    }

    public Game(String idGame, Boolean isCompleted, int gameLength, int checkPoint, int healthPoints) {
        this.idGame = idGame;
        this.isCompleted = isCompleted;
        this.gameLength = gameLength;
        this.checkPoint = checkPoint;
        this.healthPoints = healthPoints;
    }

    /*public Game (User user, String idGame, Boolean isCompleted, int gameLength, int checkPoint, int healthPoints, Collection object){
            this.user = user;
            this.idGame = idGame;
            this.isCompleted = isCompleted;
            this.gameLength = gameLength;
            this.checkPoint = checkPoint;
            this.healthPoints = healthPoints;
            this.object = object;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }
    */
    public String getIdGame() {
        return idGame;
    }

    public void setIdGame(String idGame) {
        this.idGame = idGame;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }

    public int getGameLength() {
        return gameLength;
    }

    public void setGameLength(int gameLength) {
        this.gameLength = gameLength;
    }

    public int getCheckPoint() {
        return checkPoint;
    }

    public void setCheckPoint(int checkPoint) {
        this.checkPoint = checkPoint;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    /*public Collection getObject() {
        return object;
    }

    public void setObject(Collection object) {
        this.object = object;
    }*/
}
