package Entities;

import Attributes.PrimaryAttributes;
import Equipment.*;
import Exceptions.InvalidWeaponException;
import Stats.Stats;

import java.io.InvalidClassException;
import java.util.HashMap;

public abstract class Character {
    public HashMap<Slot, Item> SlotEquipments = new HashMap<>();
    public HashMap<Slot, Weapon> WeaponEquipments = new HashMap<>();
    private Stats stats;
    private PrimaryAttributes levelUp;
    private final HeroType heroType;

    public Stats getStats() {
        return stats;
    }
    public Character(HeroType heroType) {
        this.heroType = heroType;

        try {
            this.stats = defaultStats(this.heroType);
        } catch (InvalidClassException e) {
            e.printStackTrace();
        }
    }

    public PrimaryAttributes getLevelUp() {
        return levelUp;
    }


    public ArmorType[] getArmorType() throws Exception {
        switch (heroType){
            case Mage -> {
                return new ArmorType[]{ArmorType.CLOTH};
            }
            case Rogue, Ranger -> {
                return new ArmorType[]{ArmorType.LEATHER, ArmorType.MAIL};
            }
            case Warrior -> {
                return new ArmorType[]{ArmorType.MAIL, ArmorType.PLATE};
            }
            default -> throw new Exception("could not find armor types");
        }
    }

    public Stats defaultStats(HeroType heroType) throws InvalidClassException {
        int level = 1;
        int health = 100;

        switch (heroType) {
            case Mage -> {
                PrimaryAttributes base = new PrimaryAttributes(1, 1, 8);
                this.levelUp = new PrimaryAttributes(1, 1, 5);
                return new Stats(health, level, "Mage", base);
            }
            case Ranger -> {
                PrimaryAttributes base = new PrimaryAttributes(1, 7, 1);
                this.levelUp = new PrimaryAttributes(1, 5, 1);
                return new Stats(health, level, "Ranger", base);
            }
            case Rogue -> {
                PrimaryAttributes base = new PrimaryAttributes(2, 6, 1);
                this.levelUp = new PrimaryAttributes(1, 4, 1);
                return new Stats(health, level, "Rogue", base);
            }
            case Warrior -> {
                PrimaryAttributes base = new PrimaryAttributes(5, 2, 1);
                this.levelUp = new PrimaryAttributes(3, 2, 1);
                return new Stats(health, level, "Warrior", base);
            }
        }
        throw new InvalidClassException("Invalid class exception");
    }
    public String setArmorEquipment(Armor armor) throws InvalidWeaponException {
        if (armor.armorType == ArmorType.PLATE || armor.armorType == ArmorType.MAIL){
                if (armor.slot == Slot.HEAD){
                    SlotEquipments.put(Slot.HEAD,armor);
                }else if (armor.slot == Slot.BODY){
                    SlotEquipments.put(Slot.BODY,armor);
                }else if (armor.slot == Slot.LEGS){
                    SlotEquipments.put(Slot.LEGS,armor);
                }else {
                    throw new InvalidWeaponException();
                }
                return "Equipped weapon";
            }
        return "Done";
    }

    public String setWeaponEquipment(Weapon weapon) throws InvalidWeaponException {
    if (weapon.weaponType == WeaponType.Wand || weapon.weaponType == WeaponType.Axe ||
            weapon.weaponType == WeaponType.Bow || weapon.weaponType == WeaponType.Dagger ||
            weapon.weaponType == WeaponType.Hammer || weapon.weaponType == WeaponType.Staff
            || weapon.weaponType == WeaponType.Sword) {
                WeaponEquipments.put(Slot.WEAPON,weapon);
            }else {
                throw new InvalidWeaponException();
            }
            return "Equipped weapon";
    }
}
