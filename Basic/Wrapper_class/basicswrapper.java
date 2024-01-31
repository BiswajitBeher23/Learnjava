package Wrapper_class;

//import java.util.*;

public class basicswrapper {
    
    public static void main(String[] args) {
        int x = 5;
        float y = 34.4f;
        long z = 6000;

        Integer intobj = x;
        Float floatobj = y;
        Long longobj = z;

        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(longobj);

        Float floatwrap = Float.valueOf(y);

        int floatint = floatwrap.intValue();

        System.out.println(floatint);

        Integer convertbin = Integer.valueOf("101", 2);

        System.out.println(convertbin);
    }
}
