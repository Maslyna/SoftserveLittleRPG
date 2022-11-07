package Game.Enemies;

public class Slime extends Enemy {
    public Slime(double HP, double attack, int KD, int LVL) {
        super("Slime", HP, attack, KD, LVL);
    }

    public Slime(int LVL) {
        super("Slime", 10, 0.5, 5, LVL);
    }

    @Override
    public void takeDamage(double damage) {
        setHP(getHP() - damage / 2);
        System.out.println("Слайм отримує лише половину надходячої шкоди!: " + (damage / 2) + " одиниць шкоди!");
    }
}
