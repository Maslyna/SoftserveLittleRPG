package Enemies;
import Heroes.Hero;

public abstract class Enemy implements Mortal {
    float HP, KD, attack;

    public Enemy(float HP, float KD, float attack) {
        this.HP = HP;
        this.KD = KD;
        this.attack = attack;
        System.out.println("Enemy created!");
    }

    public void takeDamage(float damage){
        HP -= damage;
    }

    public float getHP() {
        return HP;
    }

    @Override
    public boolean isAlive() {
        if (HP <= 0) {
            System.out.println("Enemy is dead");
            return false;
        }
        System.out.println("У ворога залишилося " + HP + " HP");
        return true;
    }
}
