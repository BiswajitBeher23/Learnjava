package Basic.String;

public class str_basic {

    public static void main(String[] args) {

        String str1 = "Biswajit";
        String str2 = " Behera";

        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        System.out.println(str4.length());
        System.out.println(str4.indexOf('B'));

        char letter = 'B';
        int count = 0;

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("the letter" + letter + " appears :" + count + " times in the string");

        String str_Sample = "biswAjit";
        System.out.println("Compare To 'BISWAJIT'  is : " + str_Sample.compareTo("biswaJIt"));
        System.out.println("Compare To 'BISWAJIT'  is : " + str_Sample.compareToIgnoreCase("biswaJIt"));
        // str_Sample = "b";
        // System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        // str_Sample = "b";
        // System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));

        // String contains
        System.out.println("Compare To 'BISWAJIT'  is : " + str_Sample.contains("wA"));
        // String endswith()
        System.out.println("Compare To 'BISWAJIT'  is : " + str_Sample.endsWith("it"));
        // Java String replace(), replaceAll() and replaceFirst()
        String sample_str = "Java is so easy to learn";
        System.out.println("Replacing string after :" + sample_str.replace("J", "j"));
        System.out.println("Replacing string after :" + sample_str.replaceAll("a+", "b"));
        System.out.println("Replacing string after :" + sample_str.replaceAll("e+", "E"));
        System.out.println("Replacing string after :" + sample_str.replaceFirst("s+", "S"));
        System.out.println("Replacing string after :" + sample_str.toLowerCase());
        System.out.println("Replacing string after :" + sample_str.toUpperCase());
        // Convert String to Integer
        // String to Integer using Integer.parseInt()
        // String to Integer using Integer.valueOf()
        String sampleint = "200";
        int exampleint = Integer.parseInt(sampleint);
        System.out.println(sampleint);
        System.out.println(exampleint);

        System.out.println(exampleint/4);

    }
}
