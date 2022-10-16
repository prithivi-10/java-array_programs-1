import java.lang.*;
import java.util.*;

public class varags_max {

    static int max(int ...a) {
        if(a.length==0) {
            return Integer.MIN_VALUE;
        }
        int max=a[0];
        for(int i=0;i<a.length;i++) {
            if( a[i]>max) {
                max=a[i];
            }
        }
        return max;
    }
    public static void main(String args[]) {
        Scanner  sc=new Scanner(System.in);

        System.out.println("Program to find the max number in variable arguments:");
        System.out.println("=====================================================");
        System.out.println();

        System.out.println(max());
        System.out.println(max(10,20,30));
        System.out.println(max(1,4,5,8,6,3,5,7,5));
        System.out.println(max(23,765,345,876,456,8765,3));

        System.out.println();
    }
}