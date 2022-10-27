package Game.Heroes;

import Game.Enemies.Enemy;
import Game.Mortal;

public abstract class Hero implements Mortal {
    String name;
    String ClassName;
    double HP, attack;
    String [] spellBookNames;
    int [] spellBookNumbers;//TODO
    int KD;

    public String getClassName() {
        return ClassName;
    }

    Hero(String ClassName, String name, double HP, double attack) {
        this.ClassName = ClassName;
        this.name = name;
        this.HP = HP;
        this.attack = attack;
    }

    public void takeDamage(double damage){
        setHP(getHP() - damage);
        System.out.println("Ворог наносить: " + damage + " HP damage");
        System.out.println("У героя залишилось: " + getHP() + " HP");
    }

    public String getName() {
        return name;
    }

    public abstract int attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return !(getHP() <= 0);
    }

    public abstract void infoAboutHero();

    public double getHP() {
        return HP;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public int getKD(){
        return KD;
    }

}
