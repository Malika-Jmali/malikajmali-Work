package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {
    StringBits OnlyOne= new StringBits();

    @Test
    public void getBits() {
        Assert.assertEquals("Hlo",OnlyOne.getBits("Hello"));
        Assert.assertEquals("H",OnlyOne.getBits("Hi"));
        Assert.assertEquals("Hello",OnlyOne.getBits("Heeololeo"));

    }

    /*
     * Given a string, return a new string made of every other char starting with
     * the first, so "Hello" yields "Hlo". GetBits("Hello") → "Hlo" GetBits("Hi")
     * → "H" GetBits("Heeololeo") → "Hello"
     */
}