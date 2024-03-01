package org.softuni.oop.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

public class HeroTest {
    private static final String HERO_NAME = "Goshko";

    @Test
    public void heroGainsExperienceAfterAttackIfTargetDies() {

        Target fakeTarget = new Target() {
            @Override
            public void takeAttack(int attackPoints) {

            }

            @Override
            public int getHealth() {
                return 0;
            }

            @Override
            public int giveExperience() {
                return 20;
            }

            @Override
            public boolean isDead() {
                return true;
            }
        };
        Weapon fakeWeapon  = new Weapon() {
            @Override
            public void attack(Target target) {

            }

            @Override
            public int getAttackPoints() {
                return 10;
            }

            @Override
            public int getDurabilityPoints() {
                return 0;
            }
        };

        Hero hero = new Hero(HERO_NAME, fakeWeapon);
        hero.attack(fakeTarget);
        Assert.assertEquals(20,hero.getExperience());

    }
}
