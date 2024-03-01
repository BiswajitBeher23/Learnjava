
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        System.out.println("List one");
        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(20);
        arrlist.add(55);
        arrlist.add(45);
        arrlist.add(2, 78);
        arrlist.add(23);

        // prints all the elements available in list
        System.out.println("List two");
        ArrayList<Integer> arrlist2 = new ArrayList<Integer>(5);

        arrlist2.add(20);
        arrlist2.add(33);
        arrlist2.add(48);
        arrlist2.add(58);
        arrlist2.add(85);
        arrlist2.add(65);

        // prints all the elements available in list
        for (Integer number : arrlist2) {
            System.out.println("Number = " + number);
        }

        System.out.println("combine list");
        // combine two list into one
        arrlist.addAll(arrlist2);

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

        // another combine list
        // System.out.println("Anothercombine list");
        // combine two list into one
        // arrlist.addAll(2,arrlist2);

        // for (Integer number : arrlist) {
        // System.out.println("Number = " + number);
        // }

        System.out.println("updated List one");
        // to clear the list
        arrlist.clear();

        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

    }
}