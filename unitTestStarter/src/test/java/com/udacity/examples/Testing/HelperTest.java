package com.udacity.examples.Testing;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HelperTest {
    @Before
    public void init() {
        System.out.println("init executed"); }
    @After
    public void teardown() {
        System.out.println("teardown executed"); }
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
    @Test
    public void validate_3lengthString() {
        List<String> empNames = Arrays.asList("sareeta", "Edd","", "Jeff","sam");
        assertEquals(2, Helper.getStringsOfLength3(empNames));
    }
    @Test
    public void verify_list_is_squared(){
        List<Integer> yrsOfExperience = Arrays.asList(13,4,15,6,17,8,19,1,2,3);
        List<Integer> expected = Arrays.asList(169, 16, 225, 36, 289, 64, 361, 1, 4, 9);
        assertEquals(expected, Helper.getSquareList(yrsOfExperience));
    }
    @Test
    public void verify_merged_list(){
        List<String> empNames = Arrays.asList("sareeta", "", "john","");
        assertEquals("sareeta, john", Helper.getMergedList(empNames));
    }
    @Test
    public void verify_getMax(){
        List<Integer> empLevel = Arrays.asList(3,3,3,5,7,2,2,5,7,5);
        assertEquals(7, Helper.getStats(empLevel).getMax());
    }
    // This method must be public and static
    @BeforeClass
    public static void initClass() {
        System.out.println("init Class executed");
    }
    @AfterClass
    public static void teardownclass() {
        System.out.println("teardown Class executed");
    }
    @Test
    public void verify_ArrayListTest(){
        int[] yrsOfExperience = {13,4,15,6,17,8,19,1,2,3};
        int[] expected = {13,4,15,6,17,8,19,1,2,3};
        assertArrayEquals(expected, yrsOfExperience);
    }
}

