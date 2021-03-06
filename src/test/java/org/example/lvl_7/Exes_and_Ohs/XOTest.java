package org.example.lvl_7.Exes_and_Ohs;

import org.junit.Test;

import static org.junit.Assert.*;

public class XOTest {


    @Test
    public void test1(){
        assertTrue(XO.getXO("xxxooo"));
    }

    @Test
    public void test2(){
        assertTrue(XO.getXO("xxxXooOo"));
    }

    @Test
    public void test3(){
        assertFalse(XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void test4(){
        assertFalse(XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void test5(){
        assertFalse(XO.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertTrue( XO.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}
