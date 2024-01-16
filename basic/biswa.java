package basic;

import java.util.Scanner;
class tipu{
    void test(){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
               int b = sc.nextInt();
                int c = a+b;
               int d = a-b;

               if(a%2==0 && b%2==0){
                System.out.println(c);
                

               }
               else{
                System.out.println(d);
               }
        }
    }
}

class biswa {

    public static void main(String[] args) {
        tipu obj = new tipu();
        obj. test();
       
       
    }
}