package Game.Actions;

import Game.Enemies.Enemy;
import Game.Heroes.Hero;

import java.util.Random;


public class checkIsAttackCanDamage {
    static Random random = new Random();
    public static boolean checkIfEnemyCanDamage(Hero hero) {
        return random.nextInt(21) >= hero.getKD();
    }
    public static boolean checkIfHeroCanDamage(Enemy enemy){
        return random.nextInt(21) >= enemy.getKD();
    }
}
