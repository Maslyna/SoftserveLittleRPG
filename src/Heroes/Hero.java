package Heroes;

import Enemies.Enemy;

public abstract class Hero {
    String name;
    Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attackEnemy(Enemy enemy) {
        System.out.println("Enemies.Enemy attacked!");
    }

}
