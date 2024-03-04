public class swapping {
    public static void main(String[] args) {
      test t1 = new test();
      t1.swap(9, 19);       
    }
    
}


class test{
    void swap(int x,int y){
        // int temp;
        // temp = x;
        // x=y;
        // y=temp;
        // x= x+y;
        // y=x-y;
        // x=x-y;
        // x= x^y;
        // y=x^y;
        // x=x^y;
        x= x*y;
        y=x/y;
        x=x/y;
        System.out.println("After swapping x & y:"+x+" "+y);
    }
}


