package org.example.lvl_6.Rectangle_Into_Squers;

import java.util.ArrayList;
import java.util.List;

public class SqInRect {
    public static List<Integer> sqInRect(int lng, int wdth) {

        List<Integer> results = new ArrayList<>();
        if(lng == wdth){
            return null;
        }
        while (lng != 0 && wdth != 0){
            if(lng == wdth){
                results.add(lng);
                lng-=lng;
                wdth-=wdth;
            }else if (lng > wdth){
                results.add(wdth);
                lng-=wdth;
            }else {
                results.add(lng);
                wdth-=lng;
            }
        }
        return results;
    }
    // java start
    // czysty kod
    // java efektywne programowanie


    public static void main(String[] args) {
        System.out.println(sqInRect(1, 1));
    }
}
