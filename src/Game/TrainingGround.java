package Game;

import Game.Actions.AttackAction;
import Game.Actions.checkIsAttackCanDamage;
import Game.Actions.checkIsEnemyAlive;
import Game.Actions.getEnemyNumber;
import Game.Enemies.Enemy;
import Game.Enemies.Zombie;
import Game.Heroes.Hero;
import Game.Heroes.Warrior;
import Game.Interface.Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainingGround {

    public static void Training(Hero hero, ArrayList<Enemy> enemyArrayList){
        Scanner scan = new Scanner(System.in);
        int control;
        int numberOfEnemy;
        Enemy enemy = enemyArrayList.get(0);
        while (hero.isAlive()) {
            if (enemyArrayList.isEmpty()){
                System.out.println("Перемога!");
                break;
            }
            Interface.getInterface();
            control = scan.nextInt();
            if (enemy == null || control == 4) {
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
                AttackAction.HeroAttack(hero, enemy);
                checkIsEnemyAlive.checkIsEAlive(enemyArrayList);
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
        Hero hero = new Warrior("Warrior", "Alpha", 20, 4, 0, 20);
        ArrayList<Enemy> enemyArrayList = new ArrayList<>();
        Enemy zombie1 = new Zombie();
        Enemy zombie2 = new Zombie();
        enemyArrayList.add(zombie1);
        enemyArrayList.add(zombie2);
        Training(hero, enemyArrayList);
    }
}
