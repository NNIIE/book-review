package two.model;

import two.weapon.WeaponBehavior;

public abstract class Character {

    private final WeaponBehavior weaponBehavior;

    public Character(final WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    abstract void fight();

    public void attack() {
        weaponBehavior.useWeapon();
    }

}
