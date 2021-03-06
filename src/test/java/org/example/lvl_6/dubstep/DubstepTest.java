package org.example.lvl_6.dubstep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DubstepTest {

    @Test
    public void test1() {
        assertEquals("ABC", Dubstep.songDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", Dubstep.songDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void test3() {
        assertEquals("ABC", Dubstep.songDecoder2("WUBWUBABCWUB"));
    }

    @Test
    public void Test4() {
        assertEquals("R L", Dubstep.songDecoder2("RWUBWUBWUBLWUB"));
    }

    @Test
    public void test5() {
        assertEquals("WE ARE THE CHAMPIONS MY FRIEND",
                Dubstep.songDecoder2("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

    @Test
    public void Test6() {
        assertEquals("WE ARE THE CHAMPIONS MY FRIEND",
                Dubstep.songDecoder2("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }




}
