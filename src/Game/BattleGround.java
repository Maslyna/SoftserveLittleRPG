package Game;

import Game.Enemies.*;
import Game.Heroes.*;
import Game.Events.BattleEvents;
import Game.Interface.Interface;

import java.util.ArrayList;
import java.util.Scanner;


public class BattleGround extends BattleEvents {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        Start();
    }

    public static void Start() {
        Interface.getStartScreen();
        Hero hero;
        ArrayList <Enemy> enemyArrayList = new ArrayList<Enemy>();
        while (true){
            int chose = scanner.nextInt();
            if (chose == 1){
                System.out.println("Ви обрали воїна...");
                System.out.println("Оберіть ім'я:");
                String name = scanner.next();
                hero = new Warrior("Warrior", name, 20, 2, 10, 15);
                break;
            } else if (chose == 2){
                System.out.println("Ви обрали лучника...");
                System.out.println("Оберіть ім'я:");
                String name = scanner.next();
                hero = new Archer("Archer", name, 15, 3, 10, 15);
                break;
            } else if (chose == 3){
                System.out.println("Ви обрали мага...");
                System.out.println("Оберіть ім'я:");
                String name = scanner.next();
                hero = new Mage("Mage", name, 10, 5, 20, 10);
                break;
            }
        }
        Game(hero, enemyArrayList);
    }

    public static void Game(Hero hero, ArrayList<Enemy> enemyArrayList){
        while (hero.isAlive()){
            if (getRoom(hero, enemyArrayList)){
                continue;
            } else {
                System.out.println("GAME OVER");
                break;
            }
        }
    }

}