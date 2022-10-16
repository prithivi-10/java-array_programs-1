import java.util.* ;
import java.lang.*;

public class varags_discount {
    static void discount(int ...disc) {
        if(disc.length==0) {
            System.out.println("Sorry you don't have any discount");
        }
        int total=0;
        for(int i=0;i<disc.length;i++) {
            total+=disc[i];
        }
        if(total >500 && total<=1000) {
            System.out.println("The amount after the discount is: "+total*0.9);
        }
        else if(total >=1001 && total <=2000) {
            System.out.println("The amount after the discount is: "+total*0.85);
        }
        else if(total>2001) { 
            System.out.println("The amount after the discount is: "+total*0.8);

        }
    }
    public static void main(String ...args ) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to calculate the discount in varags:");
        System.out.println("--------------------------------------------");
        System.out.println();

        discount();
        discount(200,400);
        discount(123,7654,3456);
        discount(100000,3346);
        System.out.println();



    }
}