package Model;

public class Player {

    private String name;
    private double healthPercentage;
    private Weapon weapon;

    public Player(String name, double healthPercentage, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
        //TODO checkHealth methodu tekrarı önler.
        checkHealth(healthPercentage);
    }

    private void checkHealth(double healthPercentage) {
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else this.healthPercentage = healthPercentage;
    }

    public double healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(double damage) {
        double remainingLife = healthPercentage - damage;
        if (remainingLife <= 0 || healthPercentage <= 0) {
            System.out.println(name + " player has been knocked out of game");
        }
        checkHealth(remainingLife);
    }

    public void restoreHealth(int healthPotion) {
        if (healthPercentage == 0) {
            System.out.println(name + " has resurrected");
        }
        checkHealth(healthPercentage + healthPotion);
        /* Tekrar yeni değişken atayarak kod yazmak yerine tek satır ile kontrol yapıldı.
        int restoredLife = healthPotion + healthPotion;
        if (restoredLife > 100 || healthPercentage > 100) {
            healthPercentage = 100;
        }
        checkHealth(healthPercentage);
         */
    }

    @Override
    public String toString() {
        return "name: " + name + " Health: " + healthPercentage + " Weapon: "
                + (weapon.getDamage() + " - " + weapon.getAttackSpeedPerSecond())
                + " Total Damage: " + (weapon.getDamage() * weapon.getAttackSpeedPerSecond());
    }

    // Oyuncuların birbirine hasar verebilmesi için yazıldı. Çalışıyor!♥♥♥
    public Weapon getWeapon() {
        return weapon;
    }
}
