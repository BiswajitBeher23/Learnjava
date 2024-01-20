package basic.cmdlineargs;

/**
 * this Keyword in Java is a reference variable that refers to the current object.
 * One of the use of this keyword in Java is to refer current class instance variable
 * It can be used to invoke or initiate current class constructor
 * It can be passed as an argument in the method call
 * this pointer in Java can be passed as argument in the constructor call
 * this operator in Java can be used to return the current class instance
 * this in Java is a reference to the current object, whose method is being called upon.
 * You can use “this” keyword to avoid naming conflicts in the method/constructor of your instance/object.
 * */
public class thiskeyword {
        int a,b;

        public void setData(int a, int b) {
            this.a=a;
            this.b=b;
        }
        public void showData(){
            System.out.println("Value of a "+a);
            System.out.println("Value of b "+b);
        }

        public static void main(String[] args) {
            thiskeyword obj = new thiskeyword();
            obj.setData(2,3);
            obj.showData();
        }

}
