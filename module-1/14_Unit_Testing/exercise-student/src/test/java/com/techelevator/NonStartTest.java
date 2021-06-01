package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {
    NonStart charOne = new NonStart();
    @Test
    public void getPartialString() {
        Assert.assertEquals("ellohere",charOne.getPartialString("Hello", "There"));
        Assert.assertEquals("avaode",charOne.getPartialString("java", "code"));
        Assert.assertEquals("hotlava",charOne.getPartialString("shotl", "java"));

    }
     /*
     Given 2 strings, return their concatenation, except omit the first char of each. The strings will
     be at least length 1.
     GetPartialString("Hello", "There") → "ellohere"
     GetPartialString("java", "code") → "avaode"
     GetPartialString("shotl", "java") → "hotlava"
     */
}