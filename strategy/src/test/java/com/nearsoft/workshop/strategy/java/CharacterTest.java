package com.nearsoft.workshop.strategy.java;

import com.nearsoft.workshop.strategy.character.Character;
import com.nearsoft.workshop.strategy.character.*;
import com.nearsoft.workshop.strategy.weapon.AxeBehaviour;
import com.nearsoft.workshop.strategy.weapon.BowAndArrowBehaviour;
import com.nearsoft.workshop.strategy.weapon.KnifeBehaviour;
import com.nearsoft.workshop.strategy.weapon.SwordBehaviour;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CharacterTest {

    @Test
    public void testKingWithKnife() throws Exception {
        Character king = new King();

        king.setWeaponBehaviour(new KnifeBehaviour());

        assertThat(king.fight(), is("I'M THE KING, and I'm cutting with a knife."));
    }

    @Test
    public void testQueenWithBowAndArrow() throws Exception {
        Character queen = new Queen();

        queen.setWeaponBehaviour(new BowAndArrowBehaviour());

        assertThat(queen.fight(), is("Mama! just killed a man, and I'm shooting an arrow with a bow."));
    }

    @Test
    public void testTrollWithAxe() throws Exception {
        Character troll = new Troll();

        troll.setWeaponBehaviour(new AxeBehaviour());

        assertThat(troll.fight(), is("Trololol, I'm chopping with an axe."));
    }

    @Test
    public void testTrollWithSword() throws Exception {
        Character troll = new Troll();

        troll.setWeaponBehaviour(new SwordBehaviour());

        assertThat(troll.fight(), is("Trololol, I'm swinging a sword."));
    }

    @Test
    public void testKnightWithBowAndArrow() throws Exception {
        Character knight = new Knight();

        knight.setWeaponBehaviour(new BowAndArrowBehaviour());

        assertThat(knight.fight(), is("There’ll be black knights and dragons, But I will always come for shooting an arrow with a bow."));
    }

    @Test
    public void testKnightWithSword() throws Exception {
        Character knight = new Knight();

        knight.setWeaponBehaviour(new SwordBehaviour());

        assertThat(knight.fight(), is("There’ll be black knights and dragons, But I will always come for swinging a sword."));
    }
}

