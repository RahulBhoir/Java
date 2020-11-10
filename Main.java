package com.rahul;

import java.awt.*;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        int age = 30;

        //  L for telling the compiler that it is a long type
        //  underscore for readability
        long number = 30_478_459_134L;

        Date now = new Date();
        System.out.println(now);

        // reference type
        byte p = 1;
        byte q = p;
        p = 3;
        System.out.println(q);

        System.out.println("reference type");
        Point point1 = new Point(1, 2);
        Point point2 = point1;
        System.out.println(point2);
        point1.x = 4;
        System.out.println(point2);

        // String
        String message = "hello world";
        message += "!!";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.replace("!!", "##"));
        // string will not change after replace because string is immutable
        System.out.println(message);
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("ell"));
        System.out.println(message.indexOf("a")); // this will be -1
    }
}
