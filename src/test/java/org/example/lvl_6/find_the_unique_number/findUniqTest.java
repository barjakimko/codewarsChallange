package org.example.lvl_6.find_the_unique_number;

import org.junit.Test;

import static org.junit.Assert.*;

public class findUniqTest {

    private double precision = 0.0000000000001;

    @Test
    public void should_return_true(){
        assertEquals(1.0 , FindUniq.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(2.0 , FindUniq.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertNotEquals(1.0 , FindUniq.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
        assertEquals(0.0 , FindUniq.findUniq(new double[]{1, 1, 1, 1, 1, 1}), precision);
    }

}
