package Game;

import Game.Actions.*;
import Game.Enemies.*;
import Game.Heroes.*;
import Game.Interface.Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingGround {

    static Scanner scan = new Scanner(System.in);
    static int control;
    static int numberOfEnemy;

    public static void Training(Hero hero, ArrayList<Enemy> enemyArrayList){

        Enemy enemy = enemyArrayList.get(0);
        while (hero.isAlive()) {
            if (enemyArrayList.isEmpty()){
                System.out.println("Перемога!");
                break;
            }
            Interface.getInterface();
            control = scan.nextInt();
            if (enemy == null || control == 4) {
                enemy = choseEnemyFromArray.takeEnemyFromArray(enemyArrayList, enemy);
            }
            if (control == 1) {
                AttackAction.HeroAttack(hero, enemy);
                if (!checkIsEnemyAlive.checkIsEAlive(enemyArrayList) && !enemyArrayList.isEmpty()){
                    enemy = choseEnemyFromArray.takeEnemyFromArray(enemyArrayList, enemy);
                }
                AttackAction.EnemyAttack(hero, enemyArrayList);
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

    public static void main(String[] args) {
        Hero hero = new Warrior("Warrior", "Alpha", 20, 4, 0, 10);
        ArrayList<Enemy> enemyArrayList = new ArrayList<>();
        Enemy zombie1 = new Zombie();
        Enemy zombie2 = new Zombie();
        enemyArrayList.add(zombie1);
        enemyArrayList.add(zombie2);
        Training(hero, enemyArrayList);
    }
}
