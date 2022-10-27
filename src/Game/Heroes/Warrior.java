package Game.Heroes;

import Game.Enemies.Enemy;

import java.util.Scanner;

public class Warrior extends Hero {

    public String [] spellName = {
        "[1] - Проста атака",
        "[2] - Сильна атака (2 MP)",
        "[3] - Навіжена атака (2 MP and -1 HP)"
    };

    public Warrior(String ClassName, String name, double HP, double attack, double mana, int KD) {
        super(ClassName, name, HP, attack, mana, KD);
    }

    @Override
    public String getClassName() {
        return ClassName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void takeDamage(double damage) {
        setHP(getHP() - damage);
        setMana(getMana() + damage / 2);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
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
                if (getMana() >= 2) {
                    System.out.println("Герой використовуе СИЛЬНИЙ УДАР зі словвами: \"Моя твоя бум-бум!\"; він наносить: " + (attack + 2) + " HP damage");
                    enemy.takeDamage((attack + 2));
                    setMana(getMana() - 2);
                    break;
                } else {
                    System.out.println("Помилка, недостатня кількість MP!");
                }
            } else if (chose == 3){
                if (getMana() >= 2 && getHP() >= 2){
                    System.out.println("Герой використовуе НАВІЖЕНИЙ УДАР зі словвами: \"А-А-А-А-А!\"; він наносить: " + (attack * 2) + " HP damage");
                    enemy.takeDamage((attack * 2));
                    setMana(getMana() - 2);
                    setHP(getHP() - 1);
                } else {
                    System.out.println("Недостатньо HP або MP");
                }
            } else  if (chose == 0) {
                break;
            }
        }
        return chose;
    }

    @Override
    public void infoAboutHero() {
        System.out.println("Ім'я: " + getName() + "\nHP: " + getHP() + " MP: " + getMana() + "\nAttack: " + getAttack() + "\nKD: " + KD);
    }

    @Override
    public double getHP() {
        return HP;
    }

    @Override
    public void setHP(double HP) {
        this.HP = HP;
    }

    @Override
    public void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    public int getKD() {
        return KD;
    }

    @Override
    public double getMana() {
        return mana;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    @Override
    public void getSpellName() {
        System.out.println("Навички Воїна: ");
        for (int i = 0; i < spellName.length; i++){
            System.out.println(spellName[i]);
        }
        System.out.println("[0] - Exit");
    }

    @Override
    public boolean isAlive() {
        return !(HP <= 0);
    }
}
