package org.example.lvl_6.Xbonacci;

import org.hamcrest.core.IsNot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class XbonacciTest {

    private Xbonacci variabonacci;
    private double precision = 1e-10;

    @Before
    public void setUp() {
        variabonacci = new Xbonacci();
    }

    @Test
    public void tibonacciTest1() {

        assertArrayEquals(new double[]{1,1,1,3,5,9,17,31,57,105},
                variabonacci.tribonacci(new double[]{1, 1, 1}, 10),
                precision);
    }

    @Test
    public void tibonacciTest2() {

        assertArrayEquals(new double[]{0,0,1,1,2,4,7,13,24,44},
                variabonacci.tribonacci(new double[]{0, 0, 1}, 10),
                precision);
    }

    @Test
    public void tibonacciTest3() {

        assertArrayEquals(new double[]{0,1,1,2,4,7,13,24,44,81},
                variabonacci.tribonacci(new double[]{0, 1, 1}, 10),
                precision);
    }

    @Test
    public void should_not_match() {

        assertThat(new double[]{0,1,1,2,4,7,13,24,44,8}, IsNot.not(variabonacci.tribonacci(new double[]{0, 1, 1}, 10)));

    }

}
