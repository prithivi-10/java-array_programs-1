import java.util.Scanner;

public class second_largest {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter the size of an array");
        int size=scan.nextInt();

        int raj[] = new int[size];

        System.out.printf("Enter %d elements:\n",size);
        for(int i=0;i<raj.length;i++) {
            raj[i]=scan.nextInt();
        }

        System.out.println("The elements in the array are:");
        for(int x:raj){
            System.out.print(x+" ");
        }
        System.out.println();

        int max1=raj[0];
        int max2=raj[0];
        for(int i=0;i<raj.length;i++) {
            if(max1<raj[i]) {
                max2=max1;
                max1=raj[i];
            }
            else if(max2<raj[i]) {
                    max2=raj[i];
                }
            }

        System.out.println("The second largest element in the array is: "+max2);
    }
       

       
}     
