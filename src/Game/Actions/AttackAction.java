package Game.Actions;

import Game.Enemies.Enemy;
import Game.Heroes.Hero;

import java.util.ArrayList;

public class AttackAction {
    public static void HeroAttack(Hero hero, Enemy enemy) {

        if (checkIsAttackCanDamage.checkIfHeroCanDamage(enemy))
            hero.attackEnemy(enemy);
        else
            System.out.println("Герой промахнувся!");
    }
    public static void EnemyAttack(Hero hero, ArrayList<Enemy> enemyArrayList) {
        for (Enemy i : enemyArrayList){
            if (checkIsAttackCanDamage.checkIfEnemyCanDamage(hero))
                i.attackHero(hero);
        }//TODO
    }
}
