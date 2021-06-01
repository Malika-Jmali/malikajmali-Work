package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGroupNameTest {
    AnimalGroupName animaName = new AnimalGroupName();
    @Test
    public void getHerd() {


        Assert.assertEquals("Tower",animaName.getHerd("giraffe"));
        Assert.assertEquals("unknown",animaName.getHerd(""));
        Assert.assertEquals("Crash",animaName.getHerd("RhIno"));
        Assert.assertEquals("unknown",animaName.getHerd(null));
        Assert.assertEquals("unknown",animaName.getHerd("shark"));

    }
    // assertEquals("Input: animalGroupName(\"giraffe\"), "Tower");
}