import java.util.*;

public class copy_reverse_order {

    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Program to copy from one array to another array in reverse order:");
        System.out.println("-----------------------------------------------------------------");

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

        for(int i=0;i<prithivi.length;i++) {
            professional[i]=prithivi[prithivi.length-i-1];
        }

        System.out.println("Elements in professional[] after copying:");
        for(int x:professional) {
            System.out.print(x+" ");
        }

 

    }
}