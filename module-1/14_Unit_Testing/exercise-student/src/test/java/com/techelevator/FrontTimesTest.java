package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {
    FrontTimes generateStringTest = new FrontTimes();
    @Test
    public void generateString() {
        // Assert.assertEquals("ChoCho"2);
        Assert.assertEquals("ChoCho",generateStringTest.generateString("Chocolate", 2));
        Assert.assertEquals("ChoChoCho",generateStringTest.generateString("Chocolate", 3));
        Assert.assertEquals("AbcAbcAbc",generateStringTest.generateString("Abc", 3));



    }
}