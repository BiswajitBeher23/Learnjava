package practicejava.pattern;

/**
 * numbertrianglepattern
 */
public class numbertrianglepattern {

    public static void trianglePattern(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print space
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop to print star
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            // print new line for each row
            System.out.println();
        }
    }
 
    public static void NumberincreasingPyramid(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }
 
            // print new line for each row
            System.out.println();
        }
    }

    public static void NumberincreasingreversePyramid(int n)
    {
        int i, j;
        // outer loop to handle number of rows
        for (i = n; i >= 1; i--) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing column values upto the row
                // value.
                System.out.print(j + " ");
            }
 
            // print new line for each row
            System.out.println();
        }
    }
    
    public static void NumberchangingPyramid(int n)
    {
        int i, j;
        int num = 1;
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // printing value of num in each iteration.
                System.out.print(num + " ");
                // increasing the value of num.
                num++;
            }
 
            // printing new line for each row
            System.out.println();
        }
    }
    
    public static void PalindromeTrianglePattern(int n)
    {
        int i, j;
 
        // outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
 
            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
 
            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
 
            // printing new line for each row
            System.out.println();
        }
    }
    
    public static void ReversenumberTriangle(int n)
    {
        int i, j;
        // outer loop to handle rows
        for (i = 1; i <= n; i++) {
 
            // inner loop to print spaces.
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
 
            // inner loop to print value of j.
            for (j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
 
            // printing new line for each row
            System.out.println();
        }
    }
    
    public static void printPascal(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
 
            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {
 
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
    
    public static void ZeroOneTriangle(int n)
    {
        int i, j;
        //outer loop to handle number of rows
        for (i = 1; i <= n; i++) {
            //inner loop to handle number of columns
            for (j = 1; j <= i; j++) {
                // if the sum of (i+j) is even then print 1
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                // otherwise print 0
                else {
                    System.out.print(0 + " ");
                }
            }
 
            //printing new line for each row
            System.out.println();
        }
    }
    
    // Driver Function
    public static void main(String args[])
    {
        int n = 6;
        System.out.println("number triangle pattern");
        trianglePattern(n);
        System.out.println("Number increasing pyramid");
        NumberincreasingPyramid(n);
        System.out.println("Number increasing reverse pyramid");
        NumberincreasingreversePyramid(n);
        System.out.println("Number changing pyramid");
        NumberchangingPyramid(n);
        System.out.println("Number pallindrome triangle");
        PalindromeTrianglePattern(n);
        System.out.println("Reverse number triangle");
        ReversenumberTriangle(n);
        System.out.println("Pascal's triangle");
        printPascal(n);
        System.err.println("Zero one triangle");
        ZeroOneTriangle(n);
    }
}