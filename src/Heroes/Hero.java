package Heroes;

import Enemies.Enemy;

public abstract class Hero implements Mortal {
    float HP, KD, attack;
    public String name;
    Hero(String name, float HP, float KD, float attack) {
        this.name = name;
        this.HP = HP;
        this.KD = KD;
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
    public void attackEnemy(Enemy enemy) {
        System.out.println("Enemies.Enemy attacked!");
    }

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
