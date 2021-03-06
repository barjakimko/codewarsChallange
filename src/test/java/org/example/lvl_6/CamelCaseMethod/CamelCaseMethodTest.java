package org.example.lvl_6.CamelCaseMethod;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseMethodTest {

    @Test
    public void sampleTest(){
        assertEquals("TestCase", CamelCaseMethod.camelCaseOther("test case"));
    }

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCaseOther("camel case method"));
    }

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCaseMethod.camelCaseOther(" camel case word"));
    }

    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCaseMethod.camelCaseOther("say hello "));
    }

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCaseMethod.camelCaseOther("z"));
    }

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCaseMethod.camelCaseOther("ab  c"));
    }

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCaseMethod.camelCaseOther(""));
    }

}
