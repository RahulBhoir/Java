package com.rahul;
// A -> B   single inheritance
// A -> B -> C   multilevel inheritance

// Super, Base, Parent
class A{
    public void add(int i, int j){
        System.out.println(i+j);
    }
}

// Sub, Derived, Child
class B extends A{
    public void sub(int i, int j){
        System.out.println(i-j);
    }
}

class C extends B{
    public void multi(int i, int j){
        System.out.println(i*j);
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {

        C obj = new C();
        obj.add(2,3);
        obj.sub(4,2);
        obj.multi(4,5);
    }
}
