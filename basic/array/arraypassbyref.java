package basic.array;

public class arraypassbyref {
 
    public static void passByref(String a[]){
        a[0] = "changed";
    }

    public static void main(String[] args) {
        String []b={"Apple", "Mango", "Guava"};
        System.out.println("before function call "+b[0]);
        arraypassbyref.passByref(b);
        System.out.println("After function call "+b[0]);
    }
}
