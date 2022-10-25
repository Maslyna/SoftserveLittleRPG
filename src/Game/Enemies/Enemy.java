package Game.Enemies;
import Game.Heroes.Hero;
import Game.Mortal;
public abstract class Enemy implements Mortal {

    String name;
    float HP, attack;

    public abstract void infoAboutEnemy();
    public Enemy(String name, float HP, float attack) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
        System.out.println("Enemy created!");
    }

    public void takeDamage(float damage){
        setHP(HP -= damage);
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
