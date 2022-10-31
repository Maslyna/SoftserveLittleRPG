package Game.Heroes;
import Game.Enemies.Enemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Mage extends Hero {

    public String [] spellName = {
            "[1] - Проста атака",
            "[2] - Fireball (5 MP)",
            "[3] - Heal (3 MP)"
    };

    public Mage(String ClassName, String name, double HP, double attack, double mana, int KD) {
        super(ClassName, name, HP, attack, mana, KD);
        super.maxMana = 20;
    }

    @Override
    public void takeDamage(double damage) {
        setHP(getHP() - damage);
        setMana(getMana() + damage);
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
                break;
            } else if (chose == 2) {
                if (getMana() >= 5) {
                    System.out.println("Герой використовуе FIREBALL зі словвами: \"Fire!\";" +
                            "\nвін підносить руки догори і концентрує у ладонях ману, після чого дике полум'я виривається уперед. ");
                    attackAreaEnemies(enemyArrayList, getAttack() + 5);
                    setMana(getMana() - 5);
                    break;
                } else {
                    System.out.println("Помилка, недостатня кількість MP!");
                }
            } else if (chose == 3){
                if (getMana() >= 3){
                    System.out.println("Герой використовуе HEAL; він відновлює  " + (attack) + " HP");
                    setMana(getMana() - 3);
                    setHP(getHP() + getAttack());
                    break;
                } else {
                    System.out.println("Помилка, недостатня кількість MP!");
                }
            } else  if (chose == 0) {
                break;
            }
        }
        setMana(getMana() + 2);
        return chose;
    }

    @Override
    void attackAreaEnemies(ArrayList<Enemy> enemyArrayList, double damage) {
        for (Enemy i : enemyArrayList){
            i.takeDamage(getAttack());
        }
    }

    @Override
    public void getSpellName() {
        System.out.println("Навички Мага: ");
        for (String s : spellName) {
            System.out.println(s);
        }
        System.out.println("[0] - Exit");
    }
}
