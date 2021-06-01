package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {

    @Test
    public void getCount() {
        WordCount wording= new WordCount();
        Map<String, Integer>result1=wording.getCount(new String[]{"ba", "ba", "black", "sheep"});
        Assert.assertEquals(2,(result1.get("ba")).intValue());
        Assert.assertEquals(1,(result1.get("black")).intValue());
        Assert.assertEquals(1,(result1.get("sheep")).intValue());

        Map<String, Integer>result2=wording.getCount(new String[]{"a", "b", "a", "c", "b"});
        Assert.assertEquals(2,(result2.get("a")).intValue());
        Assert.assertEquals(2,(result2.get("b")).intValue());
        Assert.assertEquals(1,(result2.get("c")).intValue());

        Map<String, Integer>result3=wording.getCount(new String[]{});
        Assert.assertEquals(0,(result3.size()));

        Map<String, Integer>result4=wording.getCount(new String[]{"c", "b", "a"});
        Assert.assertEquals(1,(result4.get("c")).intValue());
        Assert.assertEquals(1,(result4.get("b")).intValue());
        Assert.assertEquals(1,(result4.get("a")).intValue());


    }
    /*
     * Given an array of strings, return a Dictionary<string, int> with a key for
     * each different string, with the value the number of times that string appears
     * in the array.
     *
     * ** A CLASSIC **
     *
     * getCount(["ba", "ba", "black", "sheep"]) → {"ba" : 2, "black": 1, "sheep": 1 }
     * getCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     * getCount([]) → {}
     * getCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
     *
     */
}