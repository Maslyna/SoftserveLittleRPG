package Game.Actions;

import Game.Heroes.Hero;

import java.util.Random;

public class restAction {

    static Random random = new Random();

    public static void rest(Hero hero){
        int rand = (random.nextInt(10) + 1) * hero.getLVL();
        hero.setHP(hero.getHP() + rand);
        System.out.println(hero.getName() + " відновив " + rand + " HP");
    }
}
