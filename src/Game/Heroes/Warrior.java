package Game.Heroes;
import Game.Enemies.Enemy;

import java.util.ArrayList;
import java.util.Scanner;

public class Warrior extends Hero {

    public String [] spellName = {
        "[1] - Проста атака",
        "[2] - Спіраль лотоса (2 MP)",
        "[3] - Навіжена атака (2 MP and -1 HP)"
    };

    public Warrior(String ClassName, String name, double HP, double attack, double mana, int KD) {
        super(ClassName, name, HP, attack, mana, KD);
        super.maxMana = 10;
    }

    @Override
    public void takeDamage(double damage) {
        setHP(getHP() - damage);
        setMana(getMana() + damage / 2);
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
                setMana(getMana() + getAttack() / 2);
                System.out.println("Кількість гніву зростає до " + getMana());
                enemy.takeDamage(attack);
                break;
            } else if (chose == 2) {
                if (getMana() >= 2) {
                    System.out.println("Герой використовуе СПІРАЛЬ ЛОТОСА зі словвами: \"Моя ваша бум-бум!\"; він починає дико флексити: ");
                    attackAreaEnemies(enemyArrayList, getAttack());
                    setMana(getMana() - 2);
                    break;
                } else {
                    System.out.println("Помилка, недостатня кількість RP!");
                }
            } else if (chose == 3){
                if (getMana() >= 2 && getHP() >= 2){
                    System.out.println("Герой використовуе НАВІЖЕНИЙ УДАР зі словвами: \"А-А-А-А-А!\"; він наносить: " + (attack * 2) + " HP damage");
                    enemy.takeDamage((attack * 2));
                    setMana(getMana() - 2);
                    setHP(getHP() - 1);
                    break;
                } else {
                    System.out.println("Недостатньо HP або RP");
                }
            } else  if (chose == 0) {
                break;
            }
        }
        return chose;
    }

    @Override
    void attackAreaEnemies(ArrayList<Enemy> enemyArrayList, double damage) {
        for (Enemy i : enemyArrayList){
            i.takeDamage(damage);
        }
    }

    @Override
    public void getSpellName() {
        System.out.println("Навички Воїна: ");
        for (String s : spellName) {
            System.out.println(s);
        }
        System.out.println("[0] - Exit");
    }

}
