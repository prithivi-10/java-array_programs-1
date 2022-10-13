// import java.util.Arrays;
import java.util.*;

public class sort_withoutMethod {
   
    public static void main(String args [ ]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program to sort the array:");
        System.out.println("");
        int arr[] = new int[5];
        int temp;

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
     System.out.println("The sorted elements are:");

     for(int i=0;i<arr.length;i++) {
        for(int j=i+1;j<arr.length;j++) {
            if(arr[i]>arr[j]) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
     }
        
        for(int i:arr) {
            System.out.print(i+" ");
        }

    }
} 