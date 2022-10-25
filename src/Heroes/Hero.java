package Heroes;

import Enemies.Enemy;

public abstract class Hero {
    float HP, KD, attack;
    public String name;
    Hero(String name, float HP, float KD, float attack) {
        this.name = name;
        this.HP = HP;
        this.KD = KD;
        this.attack = attack;
    }
    public String getName() {
        return name;
    }
    public void attackEnemy(Enemy enemy) {
        System.out.println("Enemies.Enemy attacked!");
    }

}
