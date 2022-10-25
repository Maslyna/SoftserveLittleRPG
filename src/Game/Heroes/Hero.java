package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Mortal;

public abstract class Hero implements Mortal {
    float HP, attack;
    public String name;
    Hero(String name, float HP, float attack) {
        this.name = name;
        this.HP = HP;
        this.attack = attack;
    }
    public void takeDamage(float damage){
        setHP(HP-=damage);
        System.out.println("Ворог наносить: " + damage + " HP damage");
        System.out.println("У героя залишилось: " + getHP() + " HP");
    }
    public String getName() {
        return name;
    }
    public abstract int attackEnemy(Enemy enemy);
    @Override
    public boolean isAlive() {
        return !(getHP() <= 0);
    }

    public abstract void infoAboutHero();

    public float getHP() {
        return HP;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

}
