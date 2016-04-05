package com.nearsoft.workshop.strategy.character;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Knight extends Character {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String fight() {
        String fight = String.format(
                "There’ll be black knights and dragons, " +
                        "But I will always come for %s", weaponBehaviour.useWeapon());

        log.debug(fight);

        return fight;
    }
}
