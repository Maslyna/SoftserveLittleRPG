package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Mortal;

public abstract class Hero implements Mortal {
    String name;
    String ClassName;
    double HP;
    double attack;
    double mana;
    int KD;

    Hero(String ClassName, String name, double HP, double attack, double mana, int KD) {
        this.ClassName = ClassName;
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.mana = mana;
        this.KD = KD;
    }

    public String getClassName() {
        return ClassName;
    }

    public String getName() {
        return name;
    }

    public abstract void takeDamage(double damage);

    public abstract int attackEnemy(Enemy enemy);

    public void infoAboutHero() {
        System.out.println("Класс: " + getClassName() +"\nІм'я: " + getName() +
                "\nHP: " + getHP() + " MP: " + getMana() + "\nAttack: " + getAttack() + "\nKD: " + KD);
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    public int getKD() {
        return KD;
    }

    public double getMana() {
        return mana;
    }

    public double getHP() {
        return HP;
    }

    public double getAttack() {
        return attack;
    }

    public abstract void getSpellName();

    @Override
    public boolean isAlive() {
        return !(HP <= 0);
    }
}
