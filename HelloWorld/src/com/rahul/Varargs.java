package com.rahul;
// this is same as *args in python
class Abc{
    public int add(int ... i){ //{1,2,34,5} it will take the values as array
        // (int ... i) is called variable length argument
        int sum =0;
        for(int n :i){
            sum += n;
        }
        return sum;
    }
}
public class Varargs {
    public static void main(String[] args) {
        Abc obj = new Abc();
        System.out.println(obj.add(1,2,34,5));
    }
}
