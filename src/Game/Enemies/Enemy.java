package Game.Enemies;
import Game.Heroes.Hero;
import Game.Mortal;

public abstract class Enemy implements Mortal {

    String name;
    double HP;
    double attack;
    int KD;

    public abstract String getName();

    public abstract double getAttack();

    public abstract void infoAboutEnemy();

    public Enemy(String name, double HP, double attack, int KD) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        this.KD = KD;
    }

    public abstract void takeDamage(double damage);

    public abstract void attackHero(Hero hero);

    public abstract void setHP(double HP);

    public abstract double getHP();

    public abstract int getKD();
}
