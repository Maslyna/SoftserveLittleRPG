package Game.Actions;

import Game.Enemies.Enemy;

import java.util.ArrayList;

public class checkIsEnemyAlive {

    public static boolean checkIsEAlive(ArrayList<Enemy> enemyArrayList) {
        int k = 0;
        for (int i = 0; i < enemyArrayList.size(); i++) {
            if (enemyArrayList.isEmpty())
                break;
            if (enemyArrayList.get(i).getHP() <= 0) {
                System.out.println(enemyArrayList.get(i).getName() + " вбит");
                enemyArrayList.remove(i);
                k++;
                i--;
            }
        }
        return k == 0;
    }
}
