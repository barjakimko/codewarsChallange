package org.example.lvl_6.Rectangle_Into_Squers;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SqInRectTest {


    @Test
    public void test1(){
        List<Integer> integerList = Arrays.asList(3, 2, 1, 1);
        assertEquals(integerList, SqInRect.sqInRect(5,3));
    }

    @Test
    public void test2(){
        List<Integer> integerList = Arrays.asList(3, 2, 1, 1);
        assertEquals(integerList, SqInRect.sqInRect(3,5));
    }

    @Test
    public void test3(){
        List<Integer> integerList = Arrays.asList(1);
        assertEquals(null, SqInRect.sqInRect(1,1));
    }

    @Test
    public void test4(){
        List<Integer> integerList = Arrays.asList(5);
        assertEquals(null, SqInRect.sqInRect(5,5));
    }

    @Test
    public void test5(){
        List<Integer> integerList = Arrays.asList(4,1,1,1,1);
        assertEquals(integerList, SqInRect.sqInRect(5,4));
    }

}
