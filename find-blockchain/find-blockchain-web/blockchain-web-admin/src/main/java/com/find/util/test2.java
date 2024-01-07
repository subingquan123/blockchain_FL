package com.find.util;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Description:
 * Author: Su
 * Date: 2023/12/28
 */

public class test2 {

    public static void main(String[] args) {

        


        HashMap<String, Integer> map = new HashMap<>();
        map.put("aaa",3);
        map.put("bbb",6);
        map.put("ddd",8);
        map.put("ccc",5);
        List<Map.Entry<String, Integer>> list = map.entrySet().stream().sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue())).collect(Collectors.toList());
        System.out.println(list);


//        Collections.sort(map,new Comparator<String>() {
//
//            @Override
//            public int compare(String s1, String s2) {
//                return map.get(s1) == map.get(s2) ? s1.compareTo(s2) : map.get(s2) - map.get(s1);
//            }
//        });
    }

}
