package Game;

import Game.Actions.AttackAction;
import Game.Enemies.Enemy;
import Game.Enemies.Zombie;
import Game.Events.BattleEvents;
import Game.Heroes.Hero;
import Game.Heroes.Warrior;


public class BattleGround extends BattleEvents {
    public static void main(String[] args)  {

        Hero hero = new Warrior("Alpha", 10, 4);
        Enemy enemy = new Zombie();

        Game(hero, enemy);

        Result(hero, enemy);

    }

}