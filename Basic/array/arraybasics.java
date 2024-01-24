package array;

public class arraybasics {
    
    public static void main(String[] args) {
        
        String[] biswa;
        /*
        int[] biswa;
        float[] biswa;
        double[] biswa;
        char[] biswa;
        byte[] biswa;
        short[] biswa;
        long[] biswa;
        boolen[] biswa;
        object[] biswa;
        Employee[] biswa;
         * 
         */

        biswa = new String[5];

        biswa[0] = "Apple";
        biswa[1] = "Guava";
        biswa[2] = "Orange";
        biswa[3] = "Mango";
        biswa[4] = "Papaya";

        for (int i = 0; i < biswa.length; i++) {
            System.out.println("fruits list index "+ i + " : " +biswa[i]);
        }
    }
}
