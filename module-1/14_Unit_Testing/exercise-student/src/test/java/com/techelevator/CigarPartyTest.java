package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {
    CigarParty myPartyTest = new CigarParty();
    @Test
    public void haveParty() {
       Assert.assertTrue(myPartyTest.haveParty(70,true));
        Assert.assertTrue(myPartyTest.haveParty(50,false));
        Assert.assertFalse(myPartyTest.haveParty(30,false));
    }
}