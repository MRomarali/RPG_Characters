package Stats;

import Attributes.PrimaryAttributes;

public class WeaponStats extends Stats {
    int damage;
    int speed;

    public WeaponStats(int damage, int speed, int level, String name, PrimaryAttributes baseAttribute, PrimaryAttributes totalAttribute, int durability) {
        super(durability, level, name, baseAttribute);
        this.damage = damage;
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
