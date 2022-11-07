package Game.Events;

import Game.Actions.*;
import Game.Enemies.*;
import Game.Heroes.*;
import Game.Interface.Interface;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BattleEvents implements Interface {

    static Scanner scan = new Scanner(System.in);
    static int control;
    static Random random = new Random();

    public static boolean getTypeOfRoom() {
        int rand = random.nextInt(10);
        return rand % 2 == 0;
    }

    public static boolean getRoom(Hero hero, ArrayList<Enemy> enemyArrayList) {
        if (getTypeOfRoom()){
            restRoom(hero);
            return true;
        } else {
            return fightRoom(hero, enemyArrayList);
        }
    }

    public static boolean Battle(Hero hero, ArrayList<Enemy> enemyArrayList) {
        int exp = enemyArrayList.size();
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
                AttackAction.HeroAttack(hero, enemy, enemyArrayList);
                if (!checkIsEnemyAlive.checkIsEAlive(enemyArrayList) && !enemyArrayList.isEmpty()) {
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
        if (enemyArrayList.isEmpty())
            hero.upExp(exp);
        return hero.isAlive();
    }

    public static boolean fightRoom(Hero hero, ArrayList<Enemy> enemyArrayList) {
        System.out.println("\n" + hero.getName() + " наткнувся на комнату з: ");
        enemyArrayList = generatorOfEnemies(enemyArrayList);
        return Battle(hero, enemyArrayList);
    }

    public static ArrayList<Enemy> generatorOfEnemies(ArrayList<Enemy> enemyArrayList){
        enemyArrayList.clear();
        int randInt = random.nextInt(4) + 1;
        System.out.print((randInt) + " ворогами");
        for (;randInt > 0; randInt--) {
            int numberOfEnemy = random.nextInt(4);
            if (numberOfEnemy == 1) {
                Enemy enemy = new Zombie();
                enemyArrayList.add(enemy);
            } else if (numberOfEnemy == 2) {
                Enemy enemy = new Bat();
                enemyArrayList.add(enemy);
            } else {
                Enemy enemy = new Slime();
                enemyArrayList.add(enemy);
            }
        }
        return enemyArrayList;
    }

    public static void restRoom(Hero hero) {
        System.out.println("\nЙдучи уперед " + hero.getName() + " побачив кімнату, у якій немає ворогів, тут можна трохи відпочити.");
        Interface.getRestRoomInterface();
        while (true) {
            control = scan.nextInt();
            if (control == 1) {
                restAction.rest(hero);
                break;
            } else if (control == 2){
                Interface.getInfo(hero);
            } else if (control == 0){
                System.out.println("Вихід");
                break;
            } else {
                System.out.println("Немає такого вибору");
            }
        }
    }

}