import java.util.*;

public class increase_array_size {

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Program to increse the size of an array:");
        System.out.println("----------------------------------------");

        int array1[] = new int [5];
        int array2[] = new int [50];

        System.out.println("Enter the elements for array1:");
        for(int i=0;i<array1.length;i++ ) {
            array1[i]=sc.nextInt();
        }

        System.out.println("Elements in array1:");
        for(int x:array1) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println();

       System.out.println("Size of array1 before increasing: "+array1.length);
       System.out.println("The elements are: ");
       for(int x:array1) {
          System.out.print(x+" ");
       }
       System.out.println();

        for(int i=0;i<array1.length;i++) {
            array2[i]=array1[i];
        }
        array1=array2;
        System.out.println();

        System.out.println("Size of array1 after incresing: "+array1.length);

        System.out.println("The elements are: ");

        for(int x:array1) {
            System.out.print(x+" ");
        }


    }
}