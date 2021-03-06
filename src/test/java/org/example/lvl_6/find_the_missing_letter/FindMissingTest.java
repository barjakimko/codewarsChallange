package org.example.lvl_6.find_the_missing_letter;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMissingTest {

    @Test
    public void test1(){
        assertEquals('e', FindMissing.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', FindMissing.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

}
