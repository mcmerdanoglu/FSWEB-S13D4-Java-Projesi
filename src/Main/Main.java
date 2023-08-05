package Main;

import Model.Player;
import Model.Point;
import Model.Weapon;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point nokta1 = new Point(6, 5);
        Point nokta2 = new Point(3, 1);
        Point nokta3 = new Point(-1, -8);
        Point point = new Point(0, 0);

        System.out.println("Point-----------------------------");
        System.out.println("distance(0,0)= " + nokta1.distance());
        System.out.println("distance(nokta2)= " + nokta1.distance(nokta2));
        System.out.println("distance(2,2)= " + nokta1.distance(2, 2));
        System.out.println("nokta1 ve nokta3 arasındaki mesafe: " + nokta1.distance(nokta3));
        System.out.println("distance()= " + point.distance());


        Player player1 = new Player("Cem", 1000, Weapon.SCIMITAR);
        Player player2 = new Player("Ritz", 65, Weapon.MAUL);

        System.out.println("Player-----------------------------");
        System.out.println(player1);
        player1.loseHealth(50);
        System.out.println(player1);
        player1.loseHealth(70);
        System.out.println(player1);
        System.out.println("Player after Dead-----------------------------");
        player1.restoreHealth(1200);
        System.out.println(player1);
        player1.loseHealth(70);
        System.out.println(player1);
        player1.restoreHealth(20);
        System.out.println(player1);
        System.out.println(player2);
        player2.loseHealth(player1.getWeapon().getDamage() * player1.getWeapon().getAttackSpeedPerSecond());
        System.out.println(player2);
    }
}