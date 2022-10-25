package Enemies;
import Heroes.Hero;

public class Enemy {
    public float HP = 10;
    public Enemy() {
        System.out.println("Enemies.Enemy created!");
    }

    public float getHP() {
        return HP;
    }

    public boolean checkIsLife(){
        if (HP <= 0) {
            System.out.println("Enemies.Enemy is dead");
            return false;
        }
        System.out.println("У ворога залишилося " + HP + " HP");
        return true;
    }

}
