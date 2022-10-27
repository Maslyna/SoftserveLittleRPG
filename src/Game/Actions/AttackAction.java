package Game.Actions;

import Game.Enemies.Enemy;
import Game.Heroes.Hero;

import java.util.ArrayList;
import java.util.Random;

public class AttackAction {
    static Random random = new Random();
    public static boolean checkIfEnemyCanDamage(Hero hero) {
        return random.nextInt(21) >= hero.getKD();
    }
    public static boolean checkIfHeroCanDamage(Enemy enemy){
        return random.nextInt(21) >= enemy.getKD();
    }

    public static void HeroAttack(Hero hero, Enemy enemy) {
        if (checkIfHeroCanDamage(enemy))
            hero.attackEnemy(enemy);
        else
            System.out.println("Герой промахнувся!");
    }
    public static void EnemyAttack(Hero hero, ArrayList<Enemy> enemyArrayList) {
        if (!enemyArrayList.isEmpty()){
            for (Enemy i : enemyArrayList){
                if (checkIfEnemyCanDamage(hero))
                    i.attackHero(hero);
                else
                    System.out.println(i.getName() + " промахнувся!");
            }//TODO
        }

    }

}
