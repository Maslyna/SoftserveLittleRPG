package Heroes;

import Enemies.Enemy;

public class Warrior extends Hero {

    String ClassName = "Воїн";
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
    }

    @Override
    public void infoAboutHero() {
        System.out.println("Герой: " + name +
                            "\nКлас: " + ClassName +
                            "\nКількість HP: " + getHP());
    }
}
