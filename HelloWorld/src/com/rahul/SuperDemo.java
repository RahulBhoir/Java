package HelloWorld.src.com.rahul;
// when we create the object of class E with its own constructor
// it will also call the default constructor of class D
// to call parametrized constructor use the super() method
class D {
    public D() {
        System.out.println("in D");
    }

    public D(int i) {
        System.out.println("in D int");
    }
    public D(float i) {
        System.out.println("in D float");
    }
}

class E extends D{
    public E() {
        // value is specified to call the parametrized constructor of D
        super((float) 7.6);
        System.out.println("in E");
    }

    public E(int i) {
        // i is specified to call the parametrized constructor of D
        super(i);
        System.out.println("in E int");
    }
}

public class SuperDemo {
    public static void main(String[] args) {

        E obj = new E();
    }
}
