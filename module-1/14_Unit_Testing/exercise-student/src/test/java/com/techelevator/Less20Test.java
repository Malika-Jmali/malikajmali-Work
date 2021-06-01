package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Less20Test {

    @Test
    public void isLessThanMultipleOf20() {
        //Act
        //type of class // name is instances /// =create an instance of the class.
        Less20 less20Test = new Less20();
        Assert.assertTrue(less20Test.isLessThanMultipleOf20(18));
        Assert.assertTrue(less20Test.isLessThanMultipleOf20(19));
        Assert.assertFalse(less20Test.isLessThanMultipleOf20(20));


    }
}