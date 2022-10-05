import java.util.Scanner;

public class sum_of_elements {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the size of an array");
        int size=scan.nextInt();

        int raj[] = new int[size];

        System.out.printf("Enter %d elements:\n",size);
        for(int i=0;i<raj.length;i++) {
            raj[i]=scan.nextInt();
        }

        int arr_sum=0;

        System.out.println("The sum of the array elements are:");
        for(int x:raj) {
            arr_sum=arr_sum+x;
        }

        System.out.println(arr_sum);


    }
    
 


}