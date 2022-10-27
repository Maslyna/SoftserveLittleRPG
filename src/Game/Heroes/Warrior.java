package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Interface.Interface;

import java.util.Scanner;

public class Warrior extends Hero {
    public float rage = 0;

    public Warrior(String name, float HP , float attack) {
        super(name, HP, attack);
    }

    public Warrior(String name) {
        super(name, 10, 4);
    }

    @Override
    public int attackEnemy(Enemy enemy) { //TODO
        Scanner scanner = new Scanner(System.in);
        int chose = 0;

        return chose;
    }

    @Override
    public void takeDamage(float damage) {
        super.takeDamage(damage);
        setRage((getRage() + (damage / 2)));
        System.out.println("Гнів героя зростає до " + getRage());
    }

    public void setRage(float rage) {
        this.rage = rage;
    }

    public float getRage() {
        return rage;
    }
    @Override
    public void infoAboutHero() {
        System.out.println("Герой: " + getName() +
                            "\nКлас: " + getClassName() +
                            "\nКількість HP: " + getHP() + " HP" +
                            "\nКількість гніву: " + getRage() + " RP");
    }
}
