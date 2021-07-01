package HelloWorld.src.com.rahul;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int i = 100;
        long l = 30L;
        float f = 2.0f;
        double d = 3.0;

//////////////////////////// Converting primitive types to Object number using constructor method /////////////////////

//        Integer intVal = new Integer(i) //deprecated
        Integer intVal = i;
        Float floatVal = new Float(f);
//        same for long and double

///////////////////////////////  Converting object to primitive types using typeValue() method ////////////////////////
        int newInt = intVal.intValue();
        float newFloat = floatVal.floatValue();

///////////////////////////////////////  Number to String /////////////////////////////////////////////////
        String str;
        str = Integer.toString(newInt);
        str = Float.toString(newFloat);

////////////////////////////////  String object to Numeric object using valueOf ////////////////////////////////////
        float value = Float.valueOf(str);

////////////////////////////////// Numeric object to primitive object using parsing methods //////////////////////
        str = "123";
        String str1 = "12.3";
        int val = Integer.parseInt(str);
        float va = Float.parseFloat(str1);
    }
}
