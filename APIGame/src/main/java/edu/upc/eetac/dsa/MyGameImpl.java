package edu.upc.eetac.dsa;

public class MyGameImpl implements MyGame {

    private Level[] levels = new Level[3];
    private int numLevels = 0;

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

}
