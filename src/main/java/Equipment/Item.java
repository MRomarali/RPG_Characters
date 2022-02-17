package Equipment;

public abstract class Item {
    public String name;
    public int newLevel;
    public Slot slot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getNewLevel() {
        return newLevel;
    }

    public void setNewLevel(int newLevel) {
        this.newLevel = newLevel;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
}
