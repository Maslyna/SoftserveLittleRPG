package Game.Enemies;
import Game.Heroes.Hero;
import Game.Mortal;

public abstract class Enemy implements Mortal {
    String name;
    double HP, maxHP;
    double attack;
    int KD;
    int LVL;

    public String getName() {
        return name;
    }

    public double getAttack() {
        return attack;
    }

    public void infoAboutEnemy() {
        System.out.println("Ім'я: " + getName() + "\nРівень: " + getLVL() + "\nHP: " + getHP() + "/" + maxHP + "\nAttack: " + getAttack() + "\nKD: " + KD + "\n");
    }

    public Enemy(String name, double HP, double attack, int KD, int LVL) {
        this.name = name;
        this.HP = HP * LVL;
        this.attack = attack * LVL;
        this.KD = KD;
        this.LVL = LVL;
        maxHP = this.HP;
    }


    public int getLVL() {
        return LVL;
    }


    public void takeDamage(double damage) {
        setHP(getHP() - damage);
        System.out.println(getName() + " отримує " + damage + " одиниць шкоди!");
    }

    public void attackHero(Hero hero) {
        System.out.println(getName() + " атакує героя на " + getAttack() + " HP шкоди");
        hero.takeDamage(getAttack());
    }

    public void setHP(double HP) {
        this.HP = Math.min(HP, maxHP);
    }

    public double getHP() {
        return HP;
    }

    public int getKD() {
        return KD;
    }

    @Override
    public boolean isAlive() {
        return !(getHP() <= 0);
    }

}
