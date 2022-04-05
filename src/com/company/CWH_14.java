package com.company;

import java.util.Locale;

public class CWH_14 {
    public static void main(String[] args) {
    String name ="kool";
    String value = name.toUpperCase();
        System.out.println(value);
        System.out.println(name.substring(1,3));
        System.out.println(name.replace('k', 'c'));
        System.out.println(name.replace("k","sp"));
        System.out.println(name.startsWith("k"));
        System.out.println(name.endsWith("ol"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("l"));
        System.out.println(name + 781);
        System.out.println(name.equals("kool"));
        System.out.println(name.equalsIgnoreCase("KOOL"));
    }
}
