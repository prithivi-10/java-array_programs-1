import java.lang.*;
import java.util.*;

public class varags_total {
    static int sum(int ...k) {
        if(k.length==0) {
            return 0;
        }
        int total=0;
        for(int i=0;i<k.length;i++) {
           
            total+=k[i];
        }
        return total;
    
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to find the sum of the elements in varags:");
        System.out.println("==================================================");
        System.out.println();

        System.out.println(sum());
        System.out.println(sum(1,2,6,5,4,5,76));
        System.out.println(sum(123,654,234,654));
        System.out.println(sum(1,2,3,4,5));
        System.out.println();


    }
}