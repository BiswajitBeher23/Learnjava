package Abstract_Interface.Interface;

import java.util.*;

/**
 * Innersquare
 */
interface squarelogic {

    int calculate(int x);
}

interface circlelogic {
    double cal(double y);
}


public class square  {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();

            squarelogic s = (int x) -> x * x;

            circlelogic area = (double y) -> 3.14 * y * y;

            int ans = s.calculate(a);
            double answer = area.cal(a);
            System.out.println(ans + " " + answer);
        }
    }
}
