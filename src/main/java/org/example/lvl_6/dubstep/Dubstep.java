package org.example.lvl_6.dubstep;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Dubstep {

    public static String songDecoder(String str){
        return Arrays.stream(str.split("WUB")).collect(Collectors.joining(" "))
                .trim().replaceAll(" +", " ");
    }

    public static String songDecoder2(String str){
        return str.replaceAll("(WUB)+", " ").trim();
    }


    public static void main(String[] args) {
        System.out.println(songDecoder2("WUBWUBIWUBAMWUBWUBX"));
    }

}
