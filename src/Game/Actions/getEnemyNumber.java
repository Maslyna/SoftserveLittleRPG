package Game.Actions;

import Game.Enemies.Enemy;

import java.util.ArrayList;

public class getEnemyNumber {
    public static Enemy number(ArrayList<Enemy> enemyArrayList, int i) {
        return enemyArrayList.get(i);
    }

}
