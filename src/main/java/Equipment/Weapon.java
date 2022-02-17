package Equipment;

import Attributes.WeaponAttributes;

public class Weapon {
    WeaponAttributes weaponAttributes = new WeaponAttributes();
    public WeaponType getWeaponType() {
        return weaponType;
    }
    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public WeaponType weaponType ;
    public double calculateDamage() {
        return weaponAttributes.Damage * weaponAttributes.AttackSpeed;
    }
}
