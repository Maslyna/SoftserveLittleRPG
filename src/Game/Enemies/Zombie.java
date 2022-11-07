package Game.Enemies;

import Game.Heroes.Hero;


import java.util.Random;

public class Zombie extends Enemy {

    static Random random = new Random();

    public Zombie(double HP, double attack, int KD, int LVL) {
        super("Zombie", HP, attack, KD, LVL);
    }

    public Zombie(int LVL) {
        super("Zombie", 5, 1, 8, LVL);
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
