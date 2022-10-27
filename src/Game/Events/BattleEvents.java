package Game.Events;

import Game.Actions.AttackAction;
import Game.Actions.checkIsEnemyAlive;
import Game.Enemies.Enemy;
import Game.Heroes.Hero;
import Game.Interface.Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class BattleEvents implements Interface {



    public static void Game(Hero hero, ArrayList<Enemy> enemyArrayList) {
        Scanner scan = new Scanner(System.in);
        int control;
        int numberOfEnemy;
        Enemy enemy = null;
        while (hero.isAlive()) {
            if (enemyArrayList.isEmpty()){
                System.out.println("Перемога!");
                break;
            }
            Interface.getInterface();
            control = scan.nextInt();
            if (enemy == null || control == 4){
                System.out.println("Оберіть супротивника від 1 до " + enemyArrayList.size() + "\n");
                numberOfEnemy = scan.nextInt() - 1;
                if (numberOfEnemy < 0 || numberOfEnemy >= enemyArrayList.size()) {
                    System.out.println("Немає ворога за цим номером");
                    continue;
                } else {
                    enemy = getEnemyNumber.number(enemyArrayList, numberOfEnemy);
                }
            }

            if (control == 1) {
                if (HeroAttackAction.HeroAttack(hero, enemy) != 0) {

                    if (!enemy.isAlive()){
                        checkIsEnemyAlive.checkIsEAlive(enemyArrayList);
                        continue;
                    }

                    EnemyAttackActions.EnemyAttack(hero, enemyArrayList);
                }
            } else if (control == 2) {
                Interface.getInfo(hero);
            } else if (control == 3) {
                for (Enemy i : enemyArrayList)
                    Interface.getInfo(i);
            } else if (control == 0) {
                break;
            }
        }

        if (!hero.isAlive()) {
            System.out.println("Поразка...");
        } else {
            System.out.println("Вихід");
        }
        scan.close();
    }


}