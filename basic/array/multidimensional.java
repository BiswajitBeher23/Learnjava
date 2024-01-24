package Basic.array;

/**
 * multidimensional
 */
public class multidimensional {

    public static void main(String[] args) {
        int [][] twoD = { {1,2,3,4}, {3,4,5,6}};

        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println(twoD[i][j] + " ");
            }
            System.out.println();
        }

      
    }
}