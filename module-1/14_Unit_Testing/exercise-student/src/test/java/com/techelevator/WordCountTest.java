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
    public Map<String, Integer> getCount(String[] words) {
		Map<String, Integer> output = new HashMap<>();

		if (words != null) {
			for (String word : words) {
				if (!output.containsKey(word)) {
					output.put(word, 1);
				} else {
					output.put(word, output.get(word) + 1);
				}
			}
		}

		return output;
	}
}etCount(["c", "b", "a"]) → {"c": 1, "b": 1, "a": 1}
     *
     */
}