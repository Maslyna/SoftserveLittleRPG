package Game;

import Game.Enemies.Enemy;
import Game.Enemies.Zombie;
import Game.Events.BattleEvents;
import Game.Heroes.Archer;
import Game.Heroes.Hero;
import Game.Heroes.Warrior;
import Game.Interface.Interface;

import java.util.ArrayList;
import java.util.Scanner;


public class BattleGround extends BattleEvents {
    public static void main(String[] args)  {

        ArrayList<Enemy> enemyArrayList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String name;
        Hero hero = null;
        Interface.getStartScreen();
        int chose = scanner.nextInt();
        if (chose == 1){
            System.out.println("\nХто ти, воїн?: \n");
            name = "Alpha";
            hero = new Warrior(name, 10, 4);
        } else if (chose == 2) {
            System.out.println("\nЯке ж в тебе ім'я?: \n");
            name = "Beta";
            hero = new Archer(name, 10, 4);
        } else if (chose == 3) {
            System.out.println("\nЯке ж в вас ім'я?: \n");
            name = scanner.nextLine();
            hero = new Warrior(name, 10, 4);
        }

        Enemy enemy1 = new Zombie();
        Enemy enemy2 = new Zombie();
        enemyArrayList.add(enemy1);
        enemyArrayList.add(enemy2);
        Game(hero, enemyArrayList);
        scanner.close();
    }

}