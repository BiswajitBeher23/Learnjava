package Basic.String;

import java.util.Objects;
//import org.apache.commons.lang3.StringUtils;

public class str_intermediate {
    // compare two Strings -11 types

    // custom method to compare
    public static int comparetwostring(String stringOne, String stringTwo) {
        int lengtghOfStringone = stringOne.length();
        int lengtghOfStringtwo = stringTwo.length();
        int minoflength = Math.min(lengtghOfStringone, lengtghOfStringtwo);

        for (int i = 0; i < minoflength; i++) {
            char stringOnecharvalue = stringOne.charAt(i);
            char stringTwocharvalue = stringTwo.charAt(i);
            if (stringOnecharvalue != stringTwocharvalue) {
                return stringOnecharvalue - stringTwocharvalue;
            }
        }
        if (lengtghOfStringone != lengtghOfStringtwo) {
            return lengtghOfStringone - lengtghOfStringtwo;
        } else {

            return 0;
        }
    }

    public static void main(String[] args) {

        String str_one = "java";
        String str_two = "java";
        // Method 1: String equals() method
        System.out.println(str_one.equals(str_two));
        // Method 2: Objects equals() method
        System.out.println(Objects.equals(str_one, str_two));
        // Method 3: String compareTo() method
        String str_three = "Java";
        System.out.println(str_one.compareTo(str_three));
        // Method 4: StringUtils equals() method
        // System.out.println(StringUtils.equals(str_one, str_two));
        // System.out.println(StringUtils.equalsAny(str_one, str_two));
        // Method 6: Using == operator
        System.out.println(str_one == str_two);
        // Method 7: Creating a custom method to Compare two Strings in Java
        System.out.println(comparetwostring(str_one, str_two));

    }
}
