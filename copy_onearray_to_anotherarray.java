import java.util.*;

public class copy_onearray_to_anotherarray {

    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Program to copy from one array to another array:");
        System.out.println("------------------------------------------------");

        System.out.println("Enter the size of an array:");
        int size=sc.nextInt();

        int prithivi[] = new int[size];

        int professional[] = new int[size];

        System.out.printf("Enter the %d elements:\n",size);

        for(int i=0;i<size;i++ ) {
            prithivi[i]= sc.nextInt();
        }

        System.out.println("Elements in prithivi[]:");

        for(int x:prithivi) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Elements in professional[] before copying:");
        for(int x:professional) {
            System.out.print(x+" ");
        }
        System.out.println();

        for(int i=0;i<size;i++) {
           professional=prithivi;
     //    professional[i]=prithivi[i];       ????? this can also be used for copying the elements ?????
        }

        System.out.println("Elements in professional[] after copying:");
        for(int x:professional) {
            System.out.print(x+" ");
        }

 

    }
}