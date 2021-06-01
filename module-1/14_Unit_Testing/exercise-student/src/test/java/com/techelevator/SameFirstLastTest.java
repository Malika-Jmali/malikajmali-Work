package com.techelevator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {

    @Test
    public void isItTheSame() {
        SameFirstLast jhonJhony= new SameFirstLast();
        assertArrayEquals(false,jhonJhony.isItTheSame(new int[]{1, 2, 3}));
        assertArrayEquals(true,jhonJhony.isItTheSame(new int[]{1, 2, 3, 1}));
        assertArrayEquals(true,jhonJhony.isItTheSame(new int[]{1, 2, 1}));

    }

    private void assertArrayEquals(boolean b, boolean itTheSame) {
    }
     /*
     Given an array of ints, return true if the array is length 1 or more, and the first element and
     the last element are equal.
     IsItTheSame([1, 2, 3]) → false
     IsItTheSame([1, 2, 3, 1]) → true
     IsItTheSame([1, 2, 1]) → true
     */
}