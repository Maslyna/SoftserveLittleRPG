package Game.Enemies;

import Game.Heroes.Hero;

public class Bat extends Enemy{

    public Bat(double HP, double attack, int KD) {
        super("Bat", HP, attack, KD);
    }

    public Bat(){
        super("Bat", 5, 0.5, 10);
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println(getName() + " висмоктує у героя " + getAttack() + " HP");
        hero.takeDamage(getAttack());
        setHP(getHP() + getAttack());
    }
}
