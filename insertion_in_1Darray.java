import java.util.*;

public class insertion_in_1Darray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to insert an element at position:");
        System.out.println("-----------------------------------------");

        System.out.println("Enter the size of an array:");
        int num=sc.nextInt();

        int prithivi [] = new  int[num+1];
        System.out.printf("Enter the %d elements of an array:\n",num);

        for(int i=0;i<num;i++) {
            prithivi[i]=sc.nextInt();
        }

        System.out.println("The elements in the array are:");
        for(int x:prithivi) {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Enter the element to be inserted:");
        int elem=sc.nextInt();

        System.out.println("Enter the position of the array to get insserted:");
        int pos=sc.nextInt();

        for(int i=num-1;i>=pos-1;i--) {
            prithivi[i+1]=prithivi[i];
        }
        prithivi[pos-1]=elem;

        System.out.println("Elements after insertion in an array:");
        for(int x:prithivi) {
            System.out.print(x+" ");
        }


    }

}