package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFashionTest {
    @Test
    public void getATable() {
        DateFashion getTableTest = new DateFashion();
        // Assert.assertEquals(2, 5, 10);
        Assert.assertEquals(2,getTableTest.getATable(5,10));
        Assert.assertEquals(0,getTableTest.getATable(5,2));
        Assert.assertEquals(1,getTableTest.getATable(5,5));
    }
}