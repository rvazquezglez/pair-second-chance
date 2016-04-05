package com.nearsoft.workshop.strategy.character;

import com.nearsoft.workshop.strategy.weapon.WeaponBehaviour;

public abstract class Character {

    protected WeaponBehaviour weaponBehaviour;

    public abstract String fight();

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
