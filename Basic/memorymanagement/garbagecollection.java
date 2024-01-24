package memorymanagement;

public class garbagecollection {

        int a, b;

        public void setData(int c, int d) {
            c = a;
            b = d;
        }

        public void showData() {
            System.out.println("Value of a " + a);
            System.out.println("Value of b " + b);
        }

        public static void main(String[] args) {
            garbagecollection s1 = new garbagecollection();
            garbagecollection s2 = new garbagecollection();
            s1.setData(1, 2);
            s2.setData(5, 6);
            s1.showData();
            s2.showData();
            garbagecollection s3;
            s3=s2;
            s3.showData();
            s2=null;
            s3.showData();
           // s2.showData();
            // s3=null;
            // s3.showData();
        }
    
}
