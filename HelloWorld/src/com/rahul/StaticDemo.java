package com.rahul;

// class is loaded only once
class Emp {
    // Non static variables are not same for all the objects
    int eid;
    int salary;
    // if a var is going to be same for the entire program than make it static
    // static variables are same for all the objects
    static String ceo;

    // static block is used to initialize static variables
    // and is executed when we load a class
    // static block will be executed before the constructor as class is loaded first
    // cannot use non static variables in static block
    static {
        ceo = "rahul";
        System.out.println("in static");
    }

    // executed when an object is created
    public Emp() {
        eid = 1;
        salary = 3000;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class StaticDemo {

    int i = 3;

    public static void main(String[] args) {
//        i =7; // error
        // this will give an error because i is not a static variable
        // and main block is static
        // to use i in main block we have to declare static int i =3;
        Emp sonu = new Emp();
        Emp nimo = new Emp();
        sonu.eid = 2;
        sonu.salary = 8000;
        // if a variable is static then use Class name
        // to initialize or change the variable value
        Emp.ceo = "";
        sonu.show();
        nimo.show();


    }
}
