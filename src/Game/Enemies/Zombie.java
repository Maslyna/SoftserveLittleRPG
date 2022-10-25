package Game.Enemies;

import Game.Heroes.Hero;


import java.util.Random;

public class Zombie extends Enemy {
    float maxHP = 10;

    public Zombie() {
        super("Zombie",10, 2);
    }

    @Override
    public void infoAboutEnemy() {
        System.out.println("Ім'я: " + name + "\nКількість HP: " + getHP() + "\nАтака: " + attack);
    }

    @Override
    public void attackHero(Hero hero) {
        super.attackHero(hero);
    }

    @Override
    public boolean isAlive() {
        Random random = new Random();
        if (HP <= 0) {
            System.out.println("Enemy is dead");
            if (random.nextInt(20 + 1) <= 15) {
                return false;
            } else {
                System.out.println("Enemy rice up!");
                HP = maxHP / 2;
                System.out.println("У ворога залишилося " + getHP() + " HP");
                return true;
            }

        }
        else
            return true;
    }
}
