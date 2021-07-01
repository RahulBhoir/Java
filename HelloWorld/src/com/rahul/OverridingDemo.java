package HelloWorld.src.com.rahul;

class P{
    public void display(){
        System.out.println("in P");
    }
}
class Q extends P{
    public void display(){
        System.out.println("in Q");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.display();
    }
}
