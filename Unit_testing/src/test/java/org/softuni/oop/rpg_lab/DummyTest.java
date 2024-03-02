package org.softuni.oop.rpg_lab;

import org.junit.Assert;
import org.junit.Test;

public class DummyTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 1;
    private static final int DUMMY_HEALTH = 20;
    private static final int DUMMY_XP = 10;

    private Weapon axe;
    private Target target;

    @Test
    public void TestLosesHealth(){
        Axe axe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        Dummy dummy= new Dummy(15,10);
        axe.attack(dummy);
        Assert.assertTrue(dummy.getHealth() == 5);



    }
    @Test(expected = IllegalStateException.class)
    public void TestIsDeadThrow(){
        Axe axe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        Dummy dummy= new Dummy(DUMMY_HEALTH,DUMMY_XP);
        axe.attack(dummy);
        axe.attack(dummy);
        axe.attack(dummy);




    }
}
