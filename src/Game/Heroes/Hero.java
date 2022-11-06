package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Mortal;

import java.util.ArrayList;

public abstract class Hero implements Mortal {
    String name;
    String ClassName;
    double HP, maxHP;
    double attack;
    double mana, maxMana;
    int KD;

    Hero (String ClassName, String name, double HP, double attack, double mana, int KD) {
        this.ClassName = ClassName;
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.mana = mana;
        this.KD = KD;
        maxHP = HP;
        maxMana = mana;
    }

    public String getClassName() {
        return ClassName;
    }

    public String getName() {
        return name;
    }

    public abstract void takeDamage(double damage);

    public abstract int attackEnemy(ArrayList<Enemy> enemyArrayList, Enemy enemy);

    abstract void attackAreaEnemies(ArrayList<Enemy> enemyArrayList, double damage);

    public void infoAboutHero() {
        System.out.println("Класс: " + getClassName() +"\nІм'я: " + getName() +
                "\nHP: " + getHP() + "/" + maxHP + "\nMP: " + getMana() + "/" + maxMana + "\nAttack: " + getAttack() + "\nKD: " + KD);
    }

    public void setHP(double HP) {
        this.HP = Math.min(HP, maxHP);
    }

    public void setMana(double mana) {
        this.mana = Math.min(mana, maxMana);
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
