package basic.String;

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
        int count =0;
        
        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("the letter" + letter + " appears :" + count + " times in the string");
    }
}
