package Game;

import Game.Enemies.Enemy;
import Game.Heroes.Hero;

public abstract class Interface {
    public static int HeroAttack(Hero hero, Enemy enemy) {
        return hero.attackEnemy(enemy);
    }
    public static void EnemyAttack(Hero hero, Enemy enemy) {
        enemy.attackHero(hero);
    }
    public static void getInterface() {
        System.out.println("""
                
                [1] - Атакувати ворога         [2] - Інформація про героя
                [3] - Інформація про ворога
                [0] - Вихід
                Enter:
                """
        );
    }
    public static void getInfo(Hero hero){
        hero.infoAboutHero();
    }

    public static void getInfo(Enemy enemy){ enemy.infoAboutEnemy();}

}
