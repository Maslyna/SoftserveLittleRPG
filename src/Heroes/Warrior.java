package Heroes;

import Enemies.Enemy;

public class Warrior extends Hero {

    float HP = 10;
    float KD = 16;
    float attack = 4;

    public Warrior(String name) {
        super(name);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.HP -= attack;
        System.out.println("Герой наносить 4 очка урона!");
    }
}
