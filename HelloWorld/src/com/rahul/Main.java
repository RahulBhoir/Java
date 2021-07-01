package HelloWorld.src.com.rahul;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class Calc {
    int num1;
    int num2;
    int result;

    // constructor has
    // 1. same name as class
    // 2. does not return any value
    // 3. will be called automatically when the object is created
    public Calc() {
        System.out.println("constructor started");
        num1 = 1;
        num2 = 3;
    }

    // constructor overloading
    // this is same as method overloading
    // we can have multiple constructors but they should have different parameters
    public Calc(int num1) {
        System.out.println("constructor started");
        // this keyword is used to tell the difference between instance var and local var
        // only use when instance and local var have same name
        // number1 is local variavble and num1 is instance variable
        this.num1 = num1;
    }

    public Calc(double n) {
        System.out.println("constructor started");
        num1 = (int) n;
    }
}

public class Main {
//    main method is public because it should be used from anywhere
//    and it is static because as it's the starting point of the code
//    it will not have a obj associated with it, but still it should be executed
//    for that the main method should be a class level method therefore static
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");
        int age = 30;

        //  L for telling the compiler that it is a long type
        //  underscore for readability
        long number = 30_478_459_134L;

        Date now = new Date();
        System.out.println("today is "+now);

        // reference type
        System.out.println("reference type");
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
        System.out.println("////////////////////////////String////////////////////////////");
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
        System.out.println("escape sequences");
        System.out.println("Hello \"Rahul\"");

        // Arrays
        System.out.println("Arrays");
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
        System.out.println("Multi dimensional array");
        int[][] twoDimension = new int[2][3];
        twoDimension[0][0] = 1;
        // use deepToString for multi dimensional array
        System.out.println(Arrays.deepToString(twoDimension));

        // jagged array: length of every array is not same
        int[][] jag = {
                {1,2,3},
                {4,5},
                {6,7,8}
        };
        for (int[] ints : jag) {
            for (int anInt : ints) {
                System.out.print(anInt);

            }
            System.out.println();
        }
        // array of objects
//        System.out.println("array of objects");
//        Calc[] asd = new Calc[4];
//        asd[1].num1 = 1;
//        asd[1].num2 = 2;
//        System.out.println(asd[1].num1 + asd[1].num2);
//        System.out.println(Arrays.toString(asd));

        // constant
        // final is use to make a var constant, we cannot change the value after making it final
        // use capital letters to represent a constant pi should be written as PI
        System.out.println("constant");
        final float PI = 3.14F;

        // without casting
        System.out.println("without casting");
        int answer = 10 / 3;
        System.out.println(answer);

        // with casting
        System.out.println("with casting");
        double answerWithDecimal = (double) 10 / (double) 3;
        System.out.println(answerWithDecimal);

        // implicit casting
        System.out.println("implicit casting");
        // byte > short > int > long > float > double
        short z = 1;
        int o = z + 2;
        System.out.println(o);

        // explicit casting
        System.out.println("explicit casting");
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
        System.out.println("Math class");
        System.out.println(Math.round(1.1));
        System.out.println(Math.ceil(1.1));
        System.out.println(Math.floor(1.1));
        System.out.println(Math.max(1, 3));
        System.out.println(Math.min(4, 10));
        System.out.println(Math.random()); // between 0 and 1
        System.out.println(Math.random() * 100); // between 0 and 100 (type = double)
        System.out.println((int) (Math.random() * 100)); // between 0 and 100 (type = integer)

        // number formatting
        System.out.println("number formatting");
        String result = NumberFormat.getCurrencyInstance().format(112443.547);
        System.out.println(result);
        result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);

        // input using Scanner
        System.out.println("input using Scanner");
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
        System.out.println("ternary operator");
        int income = 100_00;
        String className = income < 100_000 ? "Economy" : "First";
        System.out.println(className);

        // switch
        System.out.println("switch");
        String role = "user";
        switch (role) {
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
        System.out.println("for loop");
        int[] array = {1, 2, 3};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // for each
        System.out.println("for each loop");
        for (int num : array)
            System.out.println(num);

        //while loop
        System.out.println("while loop");
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }

        // do while loop
        System.out.println("do while loop");
        int j = 0;
        do {
            System.out.println(array[j]);
            j++;
        } while (j < 0);

        // constructor
        System.out.println("constructor");
        Calc obj = new Calc(7.5); // Calc() is the default constructor for allocating space for the object
        System.out.println("value set by constructor:" + obj.num1);



    }
}
