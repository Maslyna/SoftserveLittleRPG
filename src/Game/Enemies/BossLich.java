package Game.Enemies;

import Game.Heroes.Hero;

public class BossLich extends Enemy{

    public BossLich(String name, double HP, double attack, int KD, int LVL) {
        super(name, HP, attack, KD, LVL);
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(attack);
    }
}
