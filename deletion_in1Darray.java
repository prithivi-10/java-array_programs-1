import java.util.*;

public class deletion_in1Darray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to delete an element at position:");
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

        System.out.println("Enter the position of an element to get deleted:");
        int pos=sc.nextInt();

        for(int i=pos-1;i<num;i++) {
            prithivi[i]=prithivi[i+1];
        }

        System.out.println("Elements after insertion in an array:");
        for(int x:prithivi) {
            System.out.print(x+" ");
        }


    }

}