import java.util.Scanner;

public class largest_element {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the size of an array");
        int size=scan.nextInt();

        int raj[] = new int[size];

        System.out.printf("Enter %d elements:\n",size);
        for(int i=0;i<raj.length;i++) {
            raj[i]=scan.nextInt();
        }

        int max=raj[0];
        for(int x:raj) {
            if(max < x) {
                max=x;
            }
        }

        System.out.println("The largest elements in the array is: "+max);

       
    }     
}