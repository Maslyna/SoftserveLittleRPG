package Game.Actions;

import Game.Enemies.Enemy;

import java.util.ArrayList;
import java.util.Scanner;

public class choseEnemyFromArray {
    static Scanner scan = new Scanner(System.in);
    static int numberOfEnemy;
    public static Enemy takeEnemyFromArray(ArrayList<Enemy> enemyArrayList, Enemy enemy){
        if (enemyArrayList.size() != 1){
            System.out.println("Оберіть супротивника від 1 до " + enemyArrayList.size() + "\n");
            numberOfEnemy = scan.nextInt() - 1;
            if (numberOfEnemy < 0 || numberOfEnemy >= enemyArrayList.size()) {
                System.out.println("Немає ворога за цим номером");
                return null;
            } else {
                enemy = getEnemyNumber.number(enemyArrayList, numberOfEnemy);
                return enemy;
            }
        } else {
            if (enemyArrayList.isEmpty()) return null;
            else {
                enemy = getEnemyNumber.number(enemyArrayList, 0);
                return enemy;
            }

        }

    }

}
