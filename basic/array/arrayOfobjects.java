package basic.array;

/**
 * arrayOfobjects
 */
public class arrayOfobjects {

    public static void main(String[] args) {
        Account obj[] = new Account[2];

        obj[0]= new Account();
        obj[1]= new Account();

        obj[0].setData(2,3);
        obj[1].setData(5,7);
        System.out.println("For Element 0");
        obj[0].showData();
        System.out.println("For element 1");
        obj[1].showData();
        
    }
}
class Account{
    int a,b;
    public void setData(int c,int d){
        a=c;
        b=d;
    }
    public void showData(){
        System.out.println("Value of a="+a);
        System.out.println("Value of b="+b);
    }
}