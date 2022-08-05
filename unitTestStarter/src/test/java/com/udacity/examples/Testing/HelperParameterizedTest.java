package com.udacity.examples.Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class HelperParameterizedTest {
    private String input;
    private String output;

    public HelperParameterizedTest(String input) {
        super();
        this.input = input;
    }
    @Parameterized.Parameters
    public static Collection initData(){
        String empName[][] ={{"Ed", "Lam"},{"Ed", "Lam"}};
        return Arrays.asList(empName);
    }
}
