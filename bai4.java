package week_02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Collections;
import java.util.Random;
public class bai4 {
    public static void main(String[] args) {
        // packages java.lang
    	// class String
        String s = "Hello World";
        System.out.println(s.length());
        // class Math
        System.out.println(Math.max(2,8));
        // class Integer
        Integer i = 50;
        System.out.println(i.intValue());
        // class System
        System.out.println(System.getProperty("java.version"));
        // class Object
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1.equals(o2));
        // packages java.util
        // class ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        System.out.println(list);
        // class HashMap
        HashMap<String, Integer> HM = new HashMap<>();
        HM.put("Zero", 0);
        System.out.println(HM);
        // class HashSet
        HashSet<String> HS = new HashSet<>();
        HS.add("Hello");
        HS.add("Viet");
        HS.add("Nam");
        System.out.println(HS);
        // class Collections
        ArrayList<String> AL = new ArrayList<>();
        AL.add("Hello");
        AL.add("Viet");
        AL.add("Nam");
        Collections.reverse(AL);
        System.out.println(AL);
        // class Random
        Random r = new Random();
        System.out.println(r.nextInt(50));
    }
}

