package HelloWorld.src.com.rahul;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector list = new Vector();
        String arr[] = new String[3];
        arr[0] = "C++";
        arr[1] = "C";
        arr[2] = "Java";
        int lengthOfArray = arr.length;
        for (String value : arr) {
            list.addElement(value);
        }
        list.insertElementAt("Python", 0);
        String new_arr[] = new String[lengthOfArray + 1];
        list.copyInto(new_arr);
        System.out.println("list of languages:");
        for (int i = 0; i < new_arr.length; i++) {
            System.out.println(new_arr[i]);
        }
    }
}
