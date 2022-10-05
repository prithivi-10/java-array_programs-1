import java.util.*;
public class display_element {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();

        int prithiv[]= new int[n];

        System.out.printf("Enter the %d elements:\n",n);

        for(int i=0;i<prithiv.length;i++) {
            prithiv[i]=sc.nextInt();
        }

        System.out.println("The elements in the arrays are:");
        for(int i:prithiv) {
            System.out.print(i+" ");
        }
    }

}