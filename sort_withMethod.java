// import java.util.Arrays;
import java.util.*;

public class sort_withMethod {
   
    public static void main(String args [ ]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to sort the array:");
        System.out.println("");
        int arr[] = new int[5];

        System.out.println("Enter the elements for array:");

        for(int i=0;i<arr.length;i++) {
            System.out.printf("arr[%d]=",i);
            arr[i]=sc.nextInt();
        }

        System.out.println("The entered elements are:");
        for(int i:arr) {
            System.out.printf(i+" ");
        }

        System.out.println("");
     System.out.println("The sortede elements are:");
        Arrays.sort(arr);
        
        for(int i:arr) {
            System.out.print(i+" ");
        }

    }
} 