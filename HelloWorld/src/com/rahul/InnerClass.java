package HelloWorld.src.com.rahul;

//Inner class has 3 type:
//member class
//static class
//anonymous class
class Outer {
    int j;

    // It can be static or non static
    static class Inner {
        public void show() {
            System.out.println("inner class display");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.j = 3;

        // to use Inner class we have to use the Outer Class
        // in order to create object of Inner class we have to use object of Outer class

        // for non static class(member class)
//        Outer.Inner in = obj.new Inner();
//        in.show();

        // static inner class
        Outer.Inner in = new Outer.Inner();
        in.show();

    }
}
