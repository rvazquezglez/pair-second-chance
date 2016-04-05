package com.nearsoft.workshop.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Troll extends Character {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String fight() {
        String fight = String.format("Trololol, I'm %s", weaponBehaviour.useWeapon());
        log.debug(fight);
        return fight;
    }
}
