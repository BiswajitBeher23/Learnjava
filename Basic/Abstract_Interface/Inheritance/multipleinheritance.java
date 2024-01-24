package Basic.Abstract_Interface.Inheritance;

class A{
    void msg(){
        System.out.println("welcome to multiple inheritance");
    }
}
class B{
    void msg(){
        System.out.println("welcome");
    }
}
public class multipleinheritance extends A {
 
    multipleinheritance obj = new multipleinheritance();
  //  obj.msg();
}
