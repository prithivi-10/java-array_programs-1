import java.util.*;
public class output_without_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Java program to print the output without the unit digit is 2:");
		System.out.println("-------------------------------------------------------------\n");

		System.out.println("Enter the size of the array:");
		int k=sc.nextInt();

		int arr[]=new int [k];
		boolean op=true;

		System.out.println("Enter the "+k+" elements in the array:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}


		System.out.println("The resultant output will be as:");
		for(int i=0;i<arr.length;i++) {
			//arr[i]=sc.nextInt();
			int temp=arr[i]*2;
			if(temp%10!=2) {
				op=false;
				System.out.print(temp+" ");
			}
		}

		if(op) {
			System.out.println(-1);
		}
	}
}