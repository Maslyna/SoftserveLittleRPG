import Enemies.Enemy;
import Enemies.Zombie;
import Heroes.Hero;
import Heroes.Warrior;

import java.util.*;

public class BattleGround {

    public static void HeroAttack(Hero hero, Enemy enemy) {
        hero.attackEnemy(enemy);
    }

    public static void EnemyAttack(Hero hero, Enemy enemy) {
        enemy.attackHero(hero);
    }

    public static void getInterface() {
        System.out.println("""
                
                [1] - Атакувати ворога \t[2] - Інформація про героя
                [0] - Вихід
                ..."""

        );
    }
    public static void getInfo(Hero hero){
        hero.infoAboutHero();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Hero hero = new Warrior("Alpha", 10, 15, 4);
        Enemy enemy = new Zombie();

        int control;
        while (hero.isAlive()) {
            getInterface();
            control = scan.nextInt();

            if (control == 1){
                HeroAttack(hero, enemy);
                if (!enemy.isAlive())
                    break;
                EnemyAttack(hero, enemy);
            } else if (control == 2) {
                getInfo(hero);
            } else if (control == 0) {
                break;
            }

        }
        if (hero.isAlive()) {
            System.out.println("Перемога!");
        } else {
            System.out.println("Герой помер...");
        }

    }

}