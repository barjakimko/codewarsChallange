package org.example.lvl_5.Simple_Pig_latin;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimplePigLatinTest {

    @Test
    public void some_test(){
        assertEquals(SimplePigLatin.pigIt("Pig latin is cool"), "igPay atinlay siay oolcay");
        assertEquals("hisTay siay ymay tringsay", SimplePigLatin.pigIt("This is my string"));
    }


}
