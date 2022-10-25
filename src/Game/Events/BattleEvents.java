package Game.Events;

import Game.Enemies.Enemy;
import Game.Heroes.Hero;
import Game.Interface;

import java.util.Scanner;

public class BattleEvents extends Interface {

    public static void Game(Hero hero, Enemy enemy) {
        Scanner scan = new Scanner(System.in);
        int control;
        while (hero.isAlive()) {
            getInterface();
            control = scan.nextInt();

            if (control == 1) {
                if (HeroAttack(hero, enemy) != 0) {
                    if (!enemy.isAlive())
                        break;
                    EnemyAttack(hero, enemy);
                }

            } else if (control == 2) {
                getInfo(hero);
            } else if (control == 3) {
                getInfo(enemy);
            } else if (control == 0) {
                break;
            }
        }

    }

    public static void Result(Hero hero, Enemy enemy){
        if (hero.isAlive() && !enemy.isAlive()) {
            System.out.println("Перемога!");
        } else if (!hero.isAlive()) {
            System.out.println("Поразка...");
        } else {
            System.out.println("Вихід");
        }
    }


}