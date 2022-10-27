package Game.Enemies;

import Game.Heroes.Hero;


import java.util.Random;

public class Zombie extends Enemy {

    static Random random = new Random();

    public Zombie(double HP, double attack, int KD) {
        super("Zombie", HP, attack, KD);
    }

    public Zombie() {
        super("Zombie", 5, 1, 8);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getAttack() {
        return attack;
    }

    @Override
    public void infoAboutEnemy() {
        System.out.println("Ім'я: " + getName() + "\nHP: " + getHP() + "\nAttack: " + getAttack() + "\nKD: " + KD);
    }

    @Override
    public void takeDamage(double damage) {
        setHP(getHP() - damage);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " атакує героя на " + getAttack() + " HP шкоди");
        hero.takeDamage(getAttack());
    }

    @Override
    public void setHP(double HP) {
        this.HP = HP;
    }

    @Override
    public double getHP() {
        return HP;
    }

    @Override
    public int getKD() {
        return KD;
    }

    private boolean zombieAlive() {
        if (getHP() <= 0) {
            return random.nextInt(21) >= 15;
        } else {
            return true;
        }
    }

    @Override
    public boolean isAlive() {
        return zombieAlive();
    }
}
