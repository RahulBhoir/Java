package com.rahul;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
        String message = " hello world";
        message += "!!  ";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        System.out.println(message.replace("!!", "##"));
        // string will not change after replace because string is immutable
        System.out.println(message);
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("ell"));
        System.out.println(message.indexOf("a")); // this will be -1
        System.out.println(message.trim());

        // escape sequences
        System.out.println("Hello \"Rahul\"");

        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[2] = 34;
        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] newNumbers = {1, 2, 3, 0, 5, 4};
        System.out.println(newNumbers.length);
        System.out.println(Arrays.toString(newNumbers));
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));
        System.out.println(newNumbers[3]);

        // M D array
        int[][] twoDimension = new int[2][3];
        twoDimension[0][0] = 1;
        // use deepToString for multi dimensional array
        System.out.println(Arrays.deepToString(twoDimension));

        // constant
        // final is use to make a var constant, we cannot change the value after making it final
        // use capital letters to represent a constant pi should be written as PI
        final float PI = 3.14F;

        // without casting
        int answer = 10 / 3;
        System.out.println(answer);

        // with casting
        double answerWithDecimal = (double) 10 / (double) 3;
        System.out.println(answerWithDecimal);

        // implicit casting
        // byte > short > int > long > float > double
        short z = 1;
        int o = z + 2;
        System.out.println(o);

        // explicit casting
        double a = 1.1;
        int b = (int) a + 2;
        System.out.println(b);

        // all this is done with compatible type only
        // for String to int the above 2 procedures are not valid
        // for that we have to use wrapper classes
        String name = "1";
        int sum = Integer.parseInt(name) + 2;
        System.out.println(sum);

        // Math class

        System.out.println(Math.round(1.1));
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.floor(1.1));
        System.out.println(Math.max(1, 3));
        System.out.println(Math.min(4, 10));
        System.out.println(Math.random()); // between 0 and 1
        System.out.println(Math.random() * 100); // between 0 and 100 double
        System.out.println((int) (Math.random() * 100)); // between 0 and 100 integer

        // number formatting
        String result = NumberFormat.getCurrencyInstance().format(112443.547);
        System.out.println(result);
        result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

        // input using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age:");
        byte ageNew = scanner.nextByte();
        System.out.println("Your age is " + ageNew);
        System.out.print("Enter your name:");
        String firstName = scanner.next();
        System.out.println("name is " + firstName);
        // if you enter "rahul bhoir", it will only read "rahul"
        // because "rahul" and "bhoir" are 2 token and .next() will read only the first token
        // to read "rahul bhoir" we have to use .nextLine()
        System.out.print("Enter your full name:");
        String fullName = scanner.nextLine().trim();
        System.out.println("Full name: " + fullName);

        // ternary operator
        int income = 100_00;
        String className = income < 100_000 ? "Economy" : "First";
        System.out.println(className);

        // switch
        String role = "user";
        switch (role){
            case "admin":
                System.out.println("You're an admin");
                break;
            case "user":
                System.out.println("You're a user");
                break;
            default:
                System.out.println("You're a guest");

        }
        // for loop
        int[] array = {1,2,3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // for each
        for(int num:array)
            System.out.println(num);
    }
}
