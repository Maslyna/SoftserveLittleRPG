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

    abstract public String getClassName();

    public abstract String getName();

    public abstract void takeDamage(double damage);

    public abstract int attackEnemy(Enemy enemy);

    public abstract void infoAboutHero();

    public abstract void setHP(double HP);

    public abstract void setMana(double mana);

    public abstract int getKD();

    public abstract double getMana();

    public abstract double getHP();

    public abstract double getAttack();

    public abstract void getSpellName();

}
