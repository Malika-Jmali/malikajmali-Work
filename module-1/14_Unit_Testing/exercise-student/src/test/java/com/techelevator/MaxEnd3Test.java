package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {

    @Test
    public void makeArray() {
        MaxEnd3 threeNums = new MaxEnd3();

        assertArrayEquals(new int[]{3, 3, 3},threeNums.makeArray(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 11, 11},threeNums.makeArray(new int[]{11, 5, 9}));
        assertArrayEquals(new int[]{3, 3, 3},threeNums.makeArray(new int[]{2, 11, 3}));



    /*
     Given an array of ints length 3, figure out which is larger between the first and last elements
     in the array, and set all the other elements to be that value. Return the changed array.
     MakeArray([1, 2, 3]) → [3, 3, 3]
     MakeArray([11, 5, 9]) → [11, 11, 11]
     MakeArray([2, 11, 3]) → [3, 3, 3]
     */
    }

}