package com.udacity.examples.Testing;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HelperTest {
    @Test
    public void test(){
        assertEquals(3, 3);
    }
    @Test
    public void getCountTest(){
        List<String> empNames = Arrays.asList("Stone", "sober");
        final long actual = Helper.getCount(empNames);
        assertEquals(2, actual);
    }
    @Test
    public void getStatsTest(){
        List<Integer> stats = Arrays.asList(12,3,4,5,6,1,5,12,16);
        assertEquals(16,Helper.getStats(stats).getMax());
    }
    @Test
    public void compareArrays(){
        int[] yrs = {12,13,14};
        int[] exp = {12,13,14};
        assertArrayEquals(exp, yrs);
    }
    @Test
    public void getMergedListTest(){
        List<String> empNames = Arrays.asList("Ed","","","Kofi");
        String exp = "Ed, Kofi";
        String act = Helper.getMergedList(empNames);
        assertEquals(exp,act);
    }
}
