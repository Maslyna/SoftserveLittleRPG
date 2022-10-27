package Game.Actions;

import Game.Enemies.Enemy;

import java.util.ArrayList;

public class checkIsEnemyAlive {

    public static void checkIsEAlive(ArrayList<Enemy> enemyArrayList){
        int k = 0;
        for (int i = 0; i < enemyArrayList.size() - k; i++){
            if (enemyArrayList.get(i).getHP() <= 0){
                enemyArrayList.remove(i);
                k++;
            }
        }
    }
}
