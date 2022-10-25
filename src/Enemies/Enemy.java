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
        setHP(HP -= damage);
        System.out.println("Герой наносить: " + damage +  " HP damage");
        System.out.println("У ворога залишилось " + getHP() + " HP");
    }

    public void attackHero(Hero hero) {
        System.out.println("Ворог атакує героя! ");
        hero.takeDamage(attack);
    }
    public void setHP(float HP) {
        this.HP = HP;
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
        return true;
    }

}
