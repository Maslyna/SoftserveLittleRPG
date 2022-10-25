import Enemies.Enemy;
import Heroes.Hero;
import Heroes.Warrior;

import java.util.*;

public class BattleGround {

    public static boolean HeroAttack(Hero hero, Enemy enemy){
        hero.attackEnemy(enemy);
        return !enemy.checkIsLife();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Hero hero = new Warrior("Alpha");
        Enemy enemy = new Enemy();

        int control;
        while (true){
            control = scan.nextInt();
            if (control == 1){
                if (HeroAttack(hero, enemy)){
                    enemy = null;
                    break;
                }
            }
            else if (control == 0){
                break;
            }
        }

    }

}