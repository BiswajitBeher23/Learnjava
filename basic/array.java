package basic;

/**
 * array
 */
public class array {

  public static void main(String[] args) {
    int array[] = new int[7];
    for (int count = 0; count < 7; count++) {
      array[count] = count + 1;
    }
    for (int count = 0; count < 7; count++) {
      System.out.println("array["+count+"] = "+array[count]);
    }
  }
}

