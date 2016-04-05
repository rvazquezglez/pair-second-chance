package com.nearsoft.pair.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class King extends Character {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String fight() {
        String fight = String.format("I'M THE KING, and I'm %s", weaponBehaviour.useWeapon());

        log.debug(fight);

        return fight;
    }
}
