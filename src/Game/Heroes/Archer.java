/*package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Interface.Interface;

import java.util.Scanner;

public class Archer extends Hero {
public void setRatFactor(float ratFactor) {
        this.ratFactor = ratFactor;
    }

    public float getRatFactor() {
        return ratFactor;
    }

    float ratFactor;

    public Archer(String name, float HP, float attack) {
        super(name, HP, attack);
        setClassName("Лучник");
    }

    @Override
    public void takeDamage(float damage) {
        super.takeDamage(damage);
    }

    @Override
    public int attackEnemy(Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        int chose = 0;
        while (true) {
            Interface.getArcherListAttack();
            chose = scanner.nextInt();

            if (chose == 1){
                System.out.println("Герой наносить: " + attack + " HP damage");
                enemy.takeDamage(attack);
                setRatFactor((float) (attack * 0.5));
                break;
            } else if (chose == 2) {
                if (ratFactor >= 2){
                    System.out.println("Герой виконуэ АТАКУ ПОСЛАБЛЕННЯ на:  "
                            + (attack * 0.5) + " HP + накладен стан послаблення на ворога" );
                    setRatFactor((float) (attack - 2));
                } else {
                    System.out.println("Помилка, недостатня кількість AP!");
                }
            } else  if (chose == 0) {
                break;
            }

        }
        return chose;
    }

    @Override
    public void infoAboutHero() {
        System.out.println("Герой: " + getName() +
                "\nКлас: " + getClassName() +
                "\nКількість HP: " + getHP() + " HP" +
                "\nКількість адреналіну: " + getRatFactor() + " AP");

}*/