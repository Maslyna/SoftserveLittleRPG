package Game.Heroes;
import Game.Enemies.Enemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Archer extends Hero {

    public String [] spellName = {
            "[1] - Проста атака",
            "[2] - Точний удар (1 AP)",
            "[3] - Шотган (5 AP)"
    };

    public Archer(String ClassName, String name, double HP, double attack, double mana, int KD) {
        super(ClassName, name, HP, attack, mana, KD);
        super.maxMana = 10;
    }

    @Override
    public void takeDamage(double damage) {
        setHP(getHP() - damage);
        setMana(getMana() + damage);
    }

    void attackAreaEnemies(ArrayList<Enemy> enemyArrayList, double damage){
        for (Enemy i : enemyArrayList){
            i.takeDamage(getAttack());
        }
    }

    @Override
    public int attackEnemy(ArrayList<Enemy> enemyArrayList, Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        getSpellName();
        int chose = 0;
        while (true) {
            chose = scanner.nextInt();
            if (chose == 1){
                System.out.println("Герой наносить: " + attack + " HP damage");
                enemy.takeDamage(attack);
                setMana(getMana() + attack / 2);
                System.out.println("Кількість адреналіну зростає до: " + getMana());
                break;
            } else if (chose == 2) {
                if (getMana() >= 1) {
                    System.out.println("Герой використовуе ТОЧНИЙ УДАР; він наносить: " + (attack + 2) + " HP damage");
                    enemy.takeDamage((getAttack() + 2));
                    setMana(getMana() - 1);
                    break;
                } else {
                    System.out.println("Помилка, недостатня кількість AP!");
                }
            } else if (chose == 3){
                if (getMana() >= 5){
                    System.out.println("Герой використовуе Шотган; він звідкілясь дістає дідов двуствол і шмаляє" +
                            "\n//TODO потрібно дописати у лорі де він його взяв");
                    setMana(getMana() - 5);
                    attackAreaEnemies(enemyArrayList, getAttack());
                    break;
                } else {
                    System.out.println("Помилка, недостатня кількість AP!");
                }
            } else  if (chose == 0) {
                break;
            }
        }
        setMana(getMana() + 2);
        return chose;
    }

    @Override
    public void getSpellName() {
        System.out.println("Навички Лучника: ");
        for (String s : spellName) {
            System.out.println(s);
        }
        System.out.println("[0] - Exit");
    }
}