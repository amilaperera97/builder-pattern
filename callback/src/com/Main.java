package com;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public class Main {

    interface FuntionAr {
        int add(Integer x, Integer y);
    }

    public static int getIntForRoman(String roman) {
        Map<String, Integer> values = new HashMap<>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        return values.get(roman);
    }

    public static void main(String[] args) {
//M CD L X X V I
        String s = "DCXXI";
//                "DCXXI";
//        "III"
//        "LVIII"
//        "MCMXCIV"
//1476
//        IV IX XL XC CD CM
        int value = 0;
        char[] arr = s.toCharArray();
//        for (int x = 0; x < arr.length; x++) {
//            int y = x + 1;
//            String currentChar = String.valueOf(arr[x]);
//            String nextChar = !(y >= arr.length) ? String.valueOf(arr[y]) : "";
//            int intValue = getIntForRoman(currentChar);
//
//            if (("I".equals(currentChar) && ("X".equals(nextChar) || "V".equals(nextChar))) ||
//                    ("X".equals(currentChar) && ("L".equals(nextChar) || "C".equals(nextChar))) ||
//                    ("C".equals(currentChar) && ("D".equals(nextChar) || "M".equals(nextChar)))) {
//                intValue = getIntForRoman(nextChar) - intValue;
//                ++x;
//            }
//            value += intValue;
//        }
//        System.out.println(value);
        String[] values = {
                "dog","racecar","car"
        };
        System.out.println(longestCommonPrefix(values));

//        System.out.println(java.util.Arrays.toString(array));
    }

    public static String longestCommonPrefix(String[] strs) {
        AtomicReference<String> prefix = new AtomicReference<>("");
        List<String> stringList = null;

        for (String str : Arrays.asList(strs)) {
            String[] array = str.split("(?<=\\G.{1})");
            stringList = new ArrayList<>();
            for (int i = 0; i < array.length - 1; ) {
                StringBuffer twoChar = new StringBuffer(array[i]);
                twoChar.append(array[++i]);
                stringList.add(String.valueOf(twoChar));
            }
        }

        for (String s : stringList) {
            int count = 0;
            for (String str : Arrays.asList(strs)) {
                if (str.contains(s)) {
                    count++;
                }
            }
            if (count == strs.length) {
                prefix.set(s);
                break;
            }
        }
        return prefix.get();
    }

    static void hello(String fName, String lName, Consumer<String> callback) {
        System.out.println(fName);

        if (lName != null) {
            System.out.println(lName);
        } else {
            callback.accept(fName);
        }
    }

    static void hello2(String fName, String lName, Runnable callback) {
        System.out.println(fName);

        if (lName != null) {
            System.out.println(lName);
        } else {
            callback.run();
        }
    }

}
