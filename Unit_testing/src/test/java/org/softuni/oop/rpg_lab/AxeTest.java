package org.softuni.oop.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

public class AxeTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 1;
    private static final int DUMMY_HEALTH = 20;
    private static final int DUMMY_XP = 10;
    private Weapon axe;
    private Target target;

    @Test
    public void TestDurability(){
        Axe axe = new Axe(10,20);
        Dummy dummy = new Dummy(10,10);

        axe.attack(dummy);
        Assert.assertTrue(axe.getDurabilityPoints() == 19);

    }

    @Test (expected = IllegalStateException.class)
    public void brokenWeaponCantAttack(){
        Axe axe = new Axe(10,20);
        Dummy dummy = new Dummy(10,10);

        axe.attack(dummy);
        axe.attack(dummy);



    }

}
