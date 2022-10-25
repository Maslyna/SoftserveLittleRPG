package Game.Heroes;

import Game.Enemies.Enemy;

import java.util.Scanner;

public class Warrior extends Hero {
    public float rage = 0;
    String ClassName = "Воїн";
    public Warrior(String name, float HP , float attack) {
        super(name, HP, attack);
    }
    public Warrior(String name) {
        super(name, 10, 4);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public int attackEnemy(Enemy enemy) {
        Scanner scanner = new Scanner(System.in);
        int chose = 0;
        while (true) {
            System.out.println("Оберіть тип атаки: \n" + """
                    [1] - Звичайна   [2] - Сильна (2 RP)
                    [0] - Вихід
                    Enter:""");
            chose = scanner.nextInt();

            if (chose == 1){
                System.out.println("Герой наносить: " + attack + " HP damage");
                enemy.takeDamage(attack);
                break;
            } else if (chose == 2) {
                if (getRage() >= 2){
                    System.out.println("Герой використовуе СИЛЬНИЙ УДАР зі словвами: \"Моя твоя бум-бум\"; він наносить: " + (attack + 2) + " HP damage");
                    enemy.takeDamage((attack + 2));
                    setRage(getRage() - 2);
                    break;
                }
                else {
                    System.out.println("Помилка, недостатня кількість RP!");
                }
            } else  if (chose == 0) {
                break;
            }

        }
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
        System.out.println("Герой: " + name +
                            "\nКлас: " + ClassName +
                            "\nКількість HP: " + getHP() + " HP" +
                            "\nКількість гніву: " + getRage() + " RP");
    }
}
