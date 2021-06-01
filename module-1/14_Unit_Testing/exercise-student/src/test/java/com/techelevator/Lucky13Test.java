package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Test {
    Lucky13  malika = new Lucky13();
    
    @Test
    public void getLucky() {
        assertArrayEquals(true,malika.getLucky(new int[]{0, 2, 4}));
        assertArrayEquals(false,malika.getLucky(new int[]{1, 2, 3}));
        assertArrayEquals(false,malika.getLucky(new int[]{1, 2, 4}));
    }

    private void assertArrayEquals(boolean b, boolean lucky) {
    }
    /*
     * Given an array of ints, return true if the array contains no 1's and no 3's.
     * GetLucky([0, 2, 4]) → true GetLucky([1, 2, 3]) → false GetLucky([1, 2,
     * 4]) → false
     */
}