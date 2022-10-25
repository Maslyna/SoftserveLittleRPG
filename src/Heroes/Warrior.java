package Heroes;

import Enemies.Enemy;

public class Warrior extends Hero {


    public Warrior(String name, float HP , float KD, float attack) {
        super(name, HP, KD, attack);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(attack);
        System.out.println("Герой наносить 4 очка урона!");
    }
}
