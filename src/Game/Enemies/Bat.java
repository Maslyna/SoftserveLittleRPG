package Game.Enemies;

import Game.Heroes.Hero;

public class Bat extends Enemy{

    public Bat(double HP, double attack, int KD, int LVL) {
        super("Bat", HP, attack, KD, LVL);
    }

    public Bat(int LVL){
        super("Bat", 5, 0.5, 10, LVL);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " висмоктує у героя " + getAttack() + " HP");
        hero.takeDamage(getAttack());
        setHP(getHP() + getAttack());
    }
}
