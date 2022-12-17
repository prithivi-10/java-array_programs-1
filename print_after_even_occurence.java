import java.util.*;
public class print_after_even_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Java program to print all the elements after the first occurence of even number:");
        System.out.println("--------------------------------------------------------------------------------\n");

        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();

        int arr[]=new int [size];

        System.out.println("Enter the array elements:");
        for(int i=0;i<arr.length;i++)  {
            System.out.print("Element for "+(i+1)+"=");
            arr[i]=sc.nextInt();
        }

        System.out.println("The ented elements are:");
        System.out.println(Arrays.toString(arr));


        System.out.println("The resultant array looks likes as:");

        //condition:
        boolean viper=false;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                viper=true;
            }
            if(viper==true) {
                System.out.print(arr[i]+" ");
            }

        }
       
    }
}