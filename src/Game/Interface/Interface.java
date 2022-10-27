package Game.Interface;

import Game.Enemies.Enemy;
import Game.Heroes.Hero;

public interface Interface {
    static void getInterface() {
        System.out.println("""
                
                [1] - Атакувати ворога             [2] - Інформація про героя
                [3] - Інформація про ворога/гів    [4] - Обрати ворога для побиття
                [0] - Вихід
                Enter:
                """
        );
    }
    static void getInfo(Hero hero){
        hero.infoAboutHero();
    }
    static void getInfo(Enemy enemy){ enemy.infoAboutEnemy();}

    static void getWarriorListAttack() {
        System.out.println("Оберіть тип атаки: \n" + """
                    [1] - Звичайна   [2] - Сильна (2 RP)
                    [0] - Вихід
                    Enter:""");
    }

    static void getArcherListAttack() {
        System.out.println("Оберіть тип атаки: \n" + """
                    [1] - Звичайна   [2] - АТАКА ПОСЛАБЛЕННЯ
                    [0] - Вихід
                    Enter:""");
    }

    static void getMAgeListAttack() {

    }

    static void getStartScreen(){
        System.out.println("""
                                 Який клас ви хочете обрати?
                           [1] - Воїн   [2] - Лучник   [3] - Маг
                           [0] - Вихід
                           Enter:
                           """);
    }

}
