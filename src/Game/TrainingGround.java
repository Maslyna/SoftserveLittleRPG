package Game;

import Game.Actions.*;
import Game.Enemies.*;
import Game.Heroes.*;
import Game.Events.BattleEvents;
import Game.Interface.Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingGround implements Interface {

    static Scanner scan = new Scanner(System.in);
    static int control;

    public static void Training(Hero hero, ArrayList<Enemy> enemyArrayList){

        Enemy enemy = enemyArrayList.get(0);
        while (hero.isAlive()) {
            if (enemyArrayList.isEmpty()  && checkIsEnemyAlive.checkIsEAlive(enemyArrayList)){
                System.out.println("Перемога!");
                break;
            }
            Interface.getInterface();
            control = scan.nextInt();
            if (enemy == null || control == 4) {
                enemy = choseEnemyFromArray.takeEnemyFromArray(enemyArrayList, enemy);
            }
            if (control == 1) {
                AttackAction.HeroAttack(hero, enemy, enemyArrayList);
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
        //Hero hero = new Archer("Archer", "Alpha", 10, 2, 5, 10);
        //Hero hero = new Mage("Mage", "Alpha", 10, 5, 5, 10);
        Hero hero = new Warrior("Warrior", "Alpha", 10, 2, 10, 10);
        ArrayList<Enemy> enemyArrayList = new ArrayList<Enemy>();
        //enemyArrayList = BattleEvents.generatorOfEnemies(enemyArrayList);
        //System.out.println("Size of array list " + enemyArrayList.size());
        Enemy zombie1 = new Zombie(2);
        Enemy zombie2 = new Zombie(3);
        Enemy zombie3 = new Zombie(1);
        enemyArrayList.add(zombie1);
        enemyArrayList.add(zombie2);
        enemyArrayList.add(zombie3);
        hero.upExp(20);
        Training(hero, enemyArrayList);
    }
}
