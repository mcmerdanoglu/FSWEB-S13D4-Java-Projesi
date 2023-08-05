package Model;

public enum Weapon {
    SCIMITAR(10, 3.2, "melee"),
    SCYTHE(20, 2.5, "melee"),
    HALBERD(25, 2.2, "melee"),
    BOW(15, 3.0, "range"),
    MAUL(30, 1.8, "melee"),
    THUNDERBOLT(22, 2.8, "spell");

    private int damage;
    private double attackSpeedPerSecond;
    private String weaponType;


    Weapon(int damage, double attackSpeedPerSecond, String weaponType) {
        this.damage = damage;
        this.attackSpeedPerSecond = attackSpeedPerSecond;
        this.weaponType = weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeedPerSecond() {
        return attackSpeedPerSecond;
    }
}
