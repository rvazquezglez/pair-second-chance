package com.nearsoft.pair.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Queen extends Character {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String fight() {
        String fight = String.format("Mama! just killed a man, and I'm %s", weaponBehaviour.useWeapon());
        log.debug(fight);
        return fight;
    }
}
