package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Mortal;

import java.util.ArrayList;

public abstract class Hero implements Mortal {
    String name;
    String ClassName;
    ArrayList<String> Inventory = new ArrayList<>(); //TODO
    int LVL;
    private int Exp, ExpLimite; //TODO
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
        LVL = 1; Exp = 0; ExpLimite = 10;
    }

    public int getLVL() {
        return LVL;
    }

    public void setLVL(int LVL) {
        this.LVL = LVL;
    }

    public void lvlUP () {
        System.out.println(getName() + " отримав новий рівень: " + (getLVL() + 1));
        setLVL(getLVL() + 1);
        attack *= LVL;
        maxHP *= LVL;
        maxMana *= LVL;
        ExpLimite *= 2;
    }

    public int getExp() {
        return Exp;
    }

    public void upExp(int Exp) {
        this.Exp += Exp;
        System.out.println(getName() + " отримав: " + Exp + " EXP!");
        while (true){
            if (this.Exp >= ExpLimite)
                lvlUP();
            else
                break;
        }

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
        System.out.println("Класс: " + getClassName() +"\nІм'я: " + getName()
                + "\nРівень: " + getLVL() + "\t\t\tEXP: " + getExp() + "/" + ExpLimite  +
                "\nHP: " + getHP() + "/" + getMaxHP() + "\t\tMP: " + getMana() + "/" + getMaxMana()
                + "\nAttack: " + getAttack() + "\t\tKD: " + KD);
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

    public ArrayList<String> getInventory() {
        return Inventory;
    }

    public double getMaxHP() {
        return maxHP;
    }

    public double getMaxMana() {
        return maxMana;
    }

    @Override
    public boolean isAlive() {
        return !(HP <= 0);
    }
}
