package interm.Exceptionhanding;


class Test {
    Test(){
        System.out.println("hello from test");
    }
}

public class ClassNotFoundExcep {

    public static void main(String[] args) {
        try{ 
            Class<?> myClass =  Class.forName("Test");  // Class1 is not defined 
            System.out.println("class exist");
        } 
        catch(ClassNotFoundException e){ 
            //System.out.println(e.getMessage()); 
           System.out.println("Class Not Found..."); 
        } 
    }
}
