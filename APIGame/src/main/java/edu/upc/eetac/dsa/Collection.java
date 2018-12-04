package edu.upc.eetac.dsa;

public class Collection {
    public Game game;
    public Boolean rope;
    public Boolean key;
    public Boolean hammer;
    public Boolean slowEnemies;
    public Boolean strongHammer;

    public Collection(){

    }

    public Collection(Game game, Boolean rope, Boolean key, Boolean hammer, Boolean slowEnemies, Boolean strongHammer){
        this.game = game;
        this.rope = rope;
        this.key = key;
        this.hammer = hammer;
        this.slowEnemies = slowEnemies;
        this.strongHammer = strongHammer;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Boolean getRope() {
        return rope;
    }

    public void setRope(Boolean rope) {
        this.rope = rope;
    }

    public Boolean getKey() {
        return key;
    }

    public void setKey(Boolean key) {
        this.key = key;
    }

    public Boolean getHammer() {
        return hammer;
    }

    public void setHammer(Boolean hammer) {
        this.hammer = hammer;
    }

    public Boolean getSlowEnemies() {
        return slowEnemies;
    }

    public void setSlowEnemies(Boolean slowEnemies) {
        this.slowEnemies = slowEnemies;
    }

    public Boolean getStrongHammer() {
        return strongHammer;
    }

    public void setStrongHammer(Boolean strongHammer) {
        this.strongHammer = strongHammer;
    }
}
