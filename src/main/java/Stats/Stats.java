package Stats;

import Attributes.PrimaryAttributes;

public class Stats {
    int health;
    int level;
    String name;
    PrimaryAttributes baseAttribute;
    PrimaryAttributes totalAttribute;

    public Stats(int health, int level, String name, PrimaryAttributes baseAttribute) {
        this.health = health;
        this.level = level;
        this.name = name;
        this.baseAttribute = baseAttribute;
        this.totalAttribute = new PrimaryAttributes(
                this.baseAttribute.getStrength(),
                this.baseAttribute.getDexterity(),
                this.baseAttribute.getIntelligence()
        );
    }

    public void levelUp(PrimaryAttributes toIncrement) {
        this.setLevel(this.level + 1);
        this.totalAttribute.setStrength(this.totalAttribute.getStrength() + toIncrement.getStrength());
        this.totalAttribute.setDexterity(this.totalAttribute.getDexterity() + toIncrement.getDexterity());
        this.totalAttribute.setIntelligence(this.totalAttribute.getIntelligence() + toIncrement.getIntelligence());
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Stats { " +
                "health = " + health +
                ", level = " + level +
                ", name = '" + name + '\'' +
                ", baseAttribute = " + baseAttribute +
                ", totalAttribute = " + totalAttribute +
                " }";
    }
}

