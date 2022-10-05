import java.util.Scanner;

public class search_element {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the size of an array");
        int size=scan.nextInt();

        int raj[] = new int[size];

        System.out.printf("Enter %d elements:\n",size);
        for(int i=0;i<raj.length;i++) {
            raj[i]=scan.nextInt();
        }

        System.out.println("Enter the element to be searched:");
        int search=scan.nextInt();

        for(int i=0;i<raj.length;i++) {
            if(search==raj[i]) {
                System.out.printf("The searching element is at index %d",i);
                System.exit(0);
            }
           
        }
        System.out.println("The searched element is not found in the array");
    }
}